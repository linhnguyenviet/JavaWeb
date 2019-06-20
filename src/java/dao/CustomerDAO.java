/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
public class CustomerDAO {
    public boolean checkEmail(String email) {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM Customer WHERE Email = '" + email + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connection.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean checkPhone(String phone) {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM Customer WHERE Phone = '" + phone + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connection.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // phương thức thêm tài khoản
    public boolean insertUser(Customer u) {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO Customer (cId, cName, Email, Password, Phone, Address, Place) VALUES('" + u.getcID() + "',N'" + u.getcName() + "','" + u.getEmail()+"',N'" + u.getPassword()+"','" + u.getPhone()+"',N'" + u.getAddress()+"',N'" + u.getAddress()+"')";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int sizeOfCustomer(){
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM Customer";
        int count = 0;
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            
            while(rs.next()){
                count++;
            }
            rs.close();
            s.close();
            return count;
        } catch (SQLException e) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return count;
    }
    
    public Customer login(String email, String password) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from Customer where Email = '" + email + "' and Password = '" + password + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Customer u = new Customer();
                u.setcID(rs.getInt("cID"));
                u.setcName("cName");
                u.setEmail(rs.getString("Email"));
                u.setPassword(rs.getString("Password"));
                u.setPhone(rs.getString("Phone"));
                u.setAddress(rs.getString("Address"));
                u.setPlace(rs.getString("Place"));
                con.close();
                return u;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String getNameLogin(String email){
        Connection con = DBConnect.getConnection();
        String sql = "select * from Customer where Email = '" + email + "'";
        PreparedStatement ps;
        String name = null;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name = rs.getString("cName");
                con.close();
                return name;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Customer> getAll(){
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM Customer WHERE cID = 1 ";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            ArrayList<Customer> cList = new ArrayList<Customer>();
            
            while(rs.next()){
                cList.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7)));
            }
            
            stmt.close();
            con.close();
            return cList;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
