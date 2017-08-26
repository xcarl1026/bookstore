/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Diaz
 */
public class Order {
    private Book userBook;
    private int userQuantity;
    private float userDiscount;
    private float userSubTotal;
    
    public Book getuserBook(){
        return this.userBook;
    }
    
    public void setuserBook(Book userBook){
        this.userBook = userBook;
    }
    
    public int getuserQuantity(){
        return this.userQuantity;
    }
    
    public void setuserQuantity(int userQuantity){
        this.userQuantity = userQuantity;
    }
    
    public float getuserDiscount(){
        return this.userDiscount;
    }
    
    public void setuserDiscount (float userDiscount){
        this.userDiscount = userDiscount;
    }
    
    public float getuserSubetotal(){
        return this.userSubTotal;
    }
    
    public void setuserSubTotal(float userSubTotal){
        this.userSubTotal = userSubTotal;
    }
}
