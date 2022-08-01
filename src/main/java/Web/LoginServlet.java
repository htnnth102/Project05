package Web;

import Dao.LoginDAO;
import Model.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private static final long SerialVersionUID = 1L;

    public static LoginDAO loginDAO;

    public void init() {
        loginDAO = new LoginDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        loginUser(request, response);
    }
    private void loginUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (loginDAO.validateLogin(new Login(username, password))) {
            RequestDispatcher rd = request.getRequestDispatcher("login/login.jsp");
            rd.forward(request, response);
        } else {
            response.getWriter().append("Vui long dang nhap lai");

        }

    }
}
