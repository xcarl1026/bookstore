
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Diaz
 */
public class Invoice {
    private ArrayList<Order> orderList;
    private int orderUnits = 0;
    private float orderSubTotal = 0;
    private int numTransactions;
    private float orderTotal = 0;
    private String orderTimeStamp; 
    
    public Invoice(){
        this.orderList = new ArrayList<Order>();
    }
    
    public ArrayList<Order> getorderList(){
        return this.orderList;
    }
    public int getorderUnits(){
        return this.orderUnits;
    }
    
    public void setorderUnits(int orderUnits){
        this.orderUnits = orderUnits;
    }
    
    public float getorderSubTotal(){
         return orderSubTotal;
    }
    
   public void setorderSubTotal(float orderSubTotal){
       this.orderSubTotal = orderSubTotal;
   }
    
    public float getorderTotal(){
        return orderTotal;
    }
    
    public void setorderTotal(float orderTotal){
        this.orderTotal = orderTotal;
    }
    
    public String getorderTimeStamp(){
        return orderTimeStamp;
    }
    
    public void setorderTimeStamp(String orderTimeStamp){
        this.orderTimeStamp = orderTimeStamp;
    }
    
    public void setnumTransactions(int numTransactions){
        this.numTransactions = numTransactions;
    }
    
    public int getnumTransactions(){
        return numTransactions;
    }
    
}
