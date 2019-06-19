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
public class Flower {
    public Flower(int fID, String fName, long price, String category, String img) {
        this.fID = fID;
        this.fName = fName;
        this.price = price;
        this.category = category;
        this.img = img;
    }
    int fID;
    String fName;
    long price;
    String category;
    String img ;
    public Flower() {
    }

    public Flower(int fID, String fName, long price, String category) {
        this.fID = fID;
        this.fName = fName;
        this.price = price;
        this.category = category;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public int getfID() {
        return fID;
    }

    public void setfID(int fID) {
        this.fID = fID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
