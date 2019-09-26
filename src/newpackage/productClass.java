/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jkswfoa
 */
public class productClass {
      connection con = new connection();
    public int addProduct(String productName, int quantity, Object price){
        int r = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url,con.username,con.password);
            
            String sql = "insert into tblproduct values(null,?,?,?);";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
            
            String np = price.toString();
            float newprice = Float.parseFloat(np);
                    
            pstmt.setString(1, productName);
            pstmt.setInt(2, quantity);
            pstmt.setFloat(3, newprice);
            
            r = pstmt.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
}
