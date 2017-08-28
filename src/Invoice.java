/*Name: Carlos Diaz
Course: CNT 4714 - Fall 2017
Assignment title: Program 1 - Event-driven Programming
Date: Sunday Septembet 10, 2017 
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private float taxAmount = 0;
    private float orderTotal = 0;
    private String orderTimeStamp; 
    private String transaction;
    
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
    
    public void setTransaction(String transaction){
        this.transaction = transaction;
    }
    
    public String getTransaction(){
        return this.transaction;
    }
    public int getnumTransactions(){
        return numTransactions;
    }
    
    public void setDate(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd h:mm:ss a");
        
        this.orderTimeStamp = dateFormat.format(date);
        
        dateFormat = new SimpleDateFormat("yyMMddHHmmss");
        
        this.transaction = dateFormat.format(date);
    }
    
    public void setTaxAmount(float taxAmount){
        this.taxAmount = taxAmount;
              
    }
    
    public float getTaxAmount(){
        return this.taxAmount;
    }
    
}
