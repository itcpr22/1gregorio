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
public class loginClass {
      connection conn = new connection();
    
    String fname = "";
    
    public int login(String username, String password){
        int x = 0;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = (Connection) DriverManager.getConnection(conn.url, conn.username, conn.password);
            
            String sql = "select * from tbllogin where username = ? AND pass = MD5(?);";
            PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(sql);
            
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                x = 1;
                fname = rs.getString("fname");
            }else{
                x = 0;
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(loginClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    }
}
