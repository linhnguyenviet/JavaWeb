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
import java.util.ArrayList;
import model.Flower;
import dao.DBConnect;
import model.Flower;


/**
 *
 * @author HP
 */
public class FlowerDAO {
    
public ArrayList<Flower> getListCategory() throws ClassNotFoundException, SQLException {
       
        ArrayList<Flower> list = new ArrayList<>();
        try {
            Connection con = new DBConnect().getConnection();
            String sql = "SELECT * FROM Flower";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Flower flower = new Flower(rs.getInt(1),rs.getString(2),
                Long.parseLong(rs.getString(3)),rs.getString(4),rs.getString(5));
                list.add(flower);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

public ArrayList<Flower> getListFlowerByPages(int firstResult, int maxResult) throws SQLException, ClassNotFoundException {
        Connection con = new DBConnect().getConnection();
        String sql = "SELECT * FROM Flower WHERE fID BETWEEN ? AND ?;";
        PreparedStatement ps = (PreparedStatement) con.prepareCall(sql);
        ps.setInt(1,firstResult);
        ps.setInt(2,maxResult);
        ResultSet rs = ps.executeQuery();
        ArrayList<Flower> list = new ArrayList<>();
        while (rs.next()) {
            Flower flower = new Flower(rs.getInt(1),rs.getString(2),Long.parseLong(rs.getString(3)),
            rs.getString(4),rs.getString(5));
            list.add(flower);
        }
         con.close();
        return list;
}

public int countPages() throws SQLException, ClassNotFoundException {
        Connection con = new DBConnect().getConnection();
        String sql = "SELECT * FROM Flower";
        PreparedStatement ps = (PreparedStatement) con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        int count =0; 
        while (rs.next()) {
            count++;
        }
         con.close();
        return count;
}

public Flower getFlowerDetail(String id) throws ClassNotFoundException, SQLException {
       
      
        try {
            Connection con = new DBConnect().getConnection();
            String sql = "SELECT * FROM Flower where fID="+id;
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Flower flower = new Flower(rs.getInt(1),rs.getString(2),
                Long.parseLong(rs.getString(3)),rs.getString(4),rs.getString(5));
                return flower;
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
