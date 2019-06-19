/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tiny
 */
public class DBConnect {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//Linh leader
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-0DAEBRL\\SQLEXPRESS:64344;databaseName=FlowerShop;","sa","123456");
//Tri loz
//          con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VPF0AQ3\\SQLEXPRESS:60383;databaseName=FlowerShop;","sa","123456")
//Thuan
//             con = DriverManager.getConnection("jdbc:sqlserver://JAKESNGUYEN\\SQLEXPRESS:58871;databaseName=FlowerShop;", "vietthuan","thuan1998");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
