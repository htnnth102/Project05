package Dao;

import Model.Login;
import Util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    public boolean validateLogin(Login lg) {
        boolean check = false;
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from user");
            while (rs.next()) {
                if (rs.getString("username") == lg.getUsername() && rs.getString("password") == lg.getPassword()) {
                    check = true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return check;
    }
}
