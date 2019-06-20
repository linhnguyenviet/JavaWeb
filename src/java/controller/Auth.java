/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDAO;
import model.Customer;

/**
 *
 * @author Tiny
 */
public class Auth {

    public static boolean authenticate(String email, String password) {

        CustomerDAO cu = new CustomerDAO();
        Customer cus;
        cus = cu.login(email, password);

            try {
                if (cus.getEmail().equalsIgnoreCase(email)&& cus.getPassword().equals(password)) {
                    return true;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        return false;
    }
    
}