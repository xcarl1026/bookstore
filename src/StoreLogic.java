
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Diaz
 */
public class StoreLogic {
     private Scanner line;
     private static ArrayList<Book> bookList;
     private Gui gui;
     private String orderQuantityField;
     private int totalBookAmount;
     private int totalBookAmount_counter;
     private Order userOrder;
    
    public StoreLogic(Gui gui) throws IOException{
        //Grab the gui
        this.gui = gui;
        openFile();
        bookList = readFile();
        
        //System.out.println(bookList.get(1).bID);
        
    }

    //OPen the file and set it up to read it
    public void openFile(){
    try{
        line = new Scanner(new File("inventory.txt"));
        line.useDelimiter(",|"+ System.getProperty("line.separator"));
    }
    catch(Exception e){
        System.out.println("Could not find file");
    }
}
    //Read the file into a List to refer when searching for BookID
    public ArrayList<Book> readFile(){
        bookList = new ArrayList<>();
        while(line.hasNext()){
            int id = Integer.parseInt(line.next());
            String name = line.next();
            float price = Float.parseFloat(line.next());   
            Book curBook = new Book();
            curBook.setbID(id);
            curBook.setbName(name);
            curBook.setbPrice(price);
            bookList.add(curBook);
            System.out.println(curBook.bID+curBook.bName+curBook.bPrice);
            //System.out.println(id + " " + record + " " + price);
            //break;
        }
        return bookList;
    }
    
    //BookID lookup method
    public Book lookBookID(int bookID){
        for(Book book:bookList){
            if(book.getbID() == bookID)
                return book;
        }
        return new Book();
    }
    //Pull up book info and set discounts for information field.
    public void pullUpBookInfo(Book book, int userQuantity, Order order){
        float discount = order.getuserDiscount();
        //String.format("%.0f", discount);
        if(userQuantity<=4){
            order.setuserDiscount(0);
            order.setuserSubTotal(book.bPrice);
            float totalBooksPrice = book.bPrice * userQuantity;
            //System.out.println(totalBooksPrice);
            gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" "+Float.toString(book.bPrice)+" "+userQuantity+" %"+String.format("%.0f", discount)+String.format(" $%.2f", totalBooksPrice));
        }
       // gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" "+Float.toString(book.bPrice));
        
    }
    
    //Logic that will process the order when process item button is clicked
    public void processOrder(){
        Order userOrder = new Order();
        String orderQuantityField = gui.getNumItemsIn().getText();
        int bookID = 0;
        int userQuantity = 0;
        //Get Number of items in the order and convert it to Integer
        if(gui.getNumItemsIn().getText().isEmpty() || gui.getBookIDIn().getText().isEmpty() || gui.getitemQuantityIn().getText().isEmpty() ){
             JOptionPane.showMessageDialog(null, "Please make sure the required fields are filled.");
             return;
        }else{
            try{    
            totalBookAmount = Integer.parseInt(orderQuantityField);
            bookID = Integer.parseInt(gui.getBookIDIn().getText());
            userQuantity = Integer.parseInt(gui.getitemQuantityIn().getText());
            //System.out.println(totalBookAmount);
            //System.out.println(bookID);
            //System.out.println(userQuantity);
            }catch(NumberFormatException not){
                //System.out.println("not a number");
                JOptionPane.showMessageDialog(null, "Please enter integers only.");
                return;
            }
        }
        
        userOrder.setuserBook(lookBookID(bookID));
        userOrder.setuserQuantity(userQuantity);
        
        if(userOrder.getuserBook().bID == 0){
            JOptionPane.showMessageDialog(null, "Book ID "+bookID+" is not on file.");
        }else{
        pullUpBookInfo(userOrder.getuserBook(), userOrder.getuserQuantity(), userOrder);
        }
        System.out.println(userOrder.getuserBook().bID);
        System.out.println(userOrder.getuserQuantity());
        
               
        
        //int totalOrderQuantityField = Integer.parseInt(orderQuantityField.getText());
        //System.out.println(totalOrderQuantityField);
        
        
        
    }
}
