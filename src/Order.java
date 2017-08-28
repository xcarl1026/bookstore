/*Name: Carlos Diaz
Course: CNT 4714 - Fall 2017
Assignment title: Program 1 - Event-driven Programming
Date: Sunday Septembet 10, 2017 
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
    
    public float getuserSubtotal(){
        return this.userSubTotal;
    }
    
    public void setuserSubTotal(float userSubTotal){
        this.userSubTotal = userSubTotal;
    }
}
