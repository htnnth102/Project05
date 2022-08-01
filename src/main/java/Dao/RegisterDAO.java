package Dao;

import Model.User;
import Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
    public void RegisterUser(User u) {
        String insert_new_sql = "insert into user( username, password, email, role) values (?,?,?,?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pr = con.prepareStatement(insert_new_sql);
            pr.setString(1, u.getUsername());
            pr.setString(2, u.getPassword());
            pr.setString(3, u.getEmail());
            pr.setInt(4, u.getRole());
            pr.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
