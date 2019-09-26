/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jkswfoa
 */
public class registrationClass {

    connection conn = new connection();

    public int register(String fname, String lname, String address, String contactNumber, String username, String pass) {
        int x = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = (Connection) DriverManager.getConnection(conn.url, conn.username, conn.password);
            String sql = "insert into tbllogin values(null,?,?,?,?,?,md5(?))";
            PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(sql);

            pstmt.setString(1, fname);
            pstmt.setString(2, lname);
            pstmt.setString(3, address);
            pstmt.setString(4, contactNumber);
            pstmt.setString(5, username);
            pstmt.setString(6, pass);

            x = pstmt.executeUpdate();


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(registrationClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public int confirmpassword(String password, String confirmpassword) {
        int x = 0;

        if (password.equals(confirmpassword)) {
            x = 1;
        } else {
            x = 0;
        }
        return x;
    }

    public int usernametest(String username) {
        int x = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = (Connection) DriverManager.getConnection(conn.url, conn.username, conn.password);

            String sql = "SELECT username FROM tbllogin WHERE username = ?;";
            PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(sql);

            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                x = 1;
            } else {
                x = 0;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(registrationClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        return x;
    }

}
