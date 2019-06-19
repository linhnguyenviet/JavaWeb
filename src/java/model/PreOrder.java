/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tiny
 */
public class PreOrder {
    int fID;
    
    int quantity;
    int total;
    
    int oID;

    public PreOrder(int fID, int quantity, int total, int oID) {
        this.fID = fID;
        this.quantity = quantity;
        this.total = total;
        this.oID = oID;
    }

    public int getfID() {
        return fID;
    }

    public void setfID(int fID) {
        this.fID = fID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getoID() {
        return oID;
    }

    public void setoID(int oID) {
        this.oID = oID;
    }
    
    
    
}
