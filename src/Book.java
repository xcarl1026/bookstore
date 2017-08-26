/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Diaz
 */
public class Book {
    
    private String bInfo;
    int bID;
    String bName;
    float bPrice;
    
    public Book(){
        setbInfo("That ID does not exist in inventory.");
    }
    
       
    public String getbInfo() {
        return bInfo;
    }

    public void setbInfo(String bInfo) {
        this.bInfo = bInfo;
    }

    public float getbPrice() {
        return bPrice;
    }

    public void setbPrice(float bPrice) {
        this.bPrice = bPrice;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
