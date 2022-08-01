package Web;

import Dao.RegisterDAO;
import Model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    private static final long SerialVersionUID = 1L;

    public static RegisterDAO registerDAO;

    public void init() {
        registerDAO = new RegisterDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        registerUser(request, response);
    }

    public void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String fullname = request.getParameter("fullname");
        int role = 1;
        registerDAO.RegisterUser(new User(username, password, fullname, email, role));

        RequestDispatcher rd = request.getRequestDispatcher("register/register.jsp");
        rd.forward(request, response);
//        response.sendRedirect("login/login.jsp");
    }
}
