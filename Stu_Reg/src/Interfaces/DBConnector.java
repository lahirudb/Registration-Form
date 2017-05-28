/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import javax.swing.JOptionPane;
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru
 */
public class DBConnector {
    
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String url =  "jdbc:mysql://localhost:3306/stureg";
    static final String user = "root";
    static final String pwd = "";
    
    Connection con = null;
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        
        try{
        Class.forName(Driver);
        
        con = DriverManager.getConnection(url,user,pwd);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return con;
        //return url,user,pwd;
    }  
    
}
