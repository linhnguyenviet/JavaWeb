/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiny
 */
public class Payment {
    
    int oID;
    String payType;
    String bank;
    String total;
    Date date;
    
    int sID;
    int recieptID;
    

    public Payment(int oID, String payType, String bank, String total, String ns, int sID) {
        this.oID = oID;
        this.payType = payType;
        this.bank = bank;
        this.total = total;
        this.date = date;
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        try {
            date=sd.parse(ns);
        } catch (ParseException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sID = sID;
    }

    public int getoID() {
        return oID;
    }

    public void setoID(int oID) {
        this.oID = oID;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public int getRecieptID() {
        return recieptID;
    }

    public void setRecieptID(int recieptID) {
        this.recieptID = recieptID;
    }

    
   
}
