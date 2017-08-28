/*Name: Carlos Diaz
Course: CNT 4714 - Fall 2017
Assignment title: Program 1 - Event-driven Programming
Date: Sunday Septembet 10, 2017 
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class StoreLogic {
     private Scanner line;
     private static ArrayList<Book> bookList;
     private Gui gui;
     private String orderQuantityField;
     private int totalOrder;
     private int totalOrder_counter = 1;
     private int viewCounter = 0;
     private Order tempOrder = new Order();
     private Invoice invoice = new Invoice();
     private String taxdisp = "6%";
     private float taxRate = 0.06f;
     private String outputFile = "transactions.txt";
    
    public StoreLogic(Gui gui) throws IOException{
        //Grab the gui
        this.gui = gui;
        openFile();
        bookList = readFile();
      
        
        
        //System.out.println(bookList.get(1).bID);
        
    }

    //Open the file and set it up to read it
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
           // System.out.println(curBook.bID+curBook.bName+curBook.bPrice);
            //System.out.println(id + " " + record + " " + price);
            //break;
        }
        line.close();
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
            order.setuserDiscount(discount);
            order.setuserSubTotal(book.bPrice * userQuantity);
            //float totalBooksPrice = book.bPrice * userQuantity;
           // System.out.println(order.getuserSubtotal());
            gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" $"+Float.toString(book.bPrice)+" "+userQuantity+" %"+String.format("%.0f", discount)+String.format(" $%.2f", order.getuserSubtotal()));
           // gui.getsubTotalField().setText(String.format(" $%.2f", order.getuserSubtotal()));
           // gui.getsubTotalLabel().setText("Order Subtotal for "+userQuantity+" item(s):");
        }else if(userQuantity >=5 && userQuantity <= 9){
            discount = (float) 0.1;
            float displaydisc = discount *100;
            order.setuserDiscount(discount);
            order.setuserSubTotal((book.bPrice * userQuantity) - book.bPrice * userQuantity * discount);
            //float totalBooksPrice = book.bPrice * userQuantity;
            //System.out.println(totalBooksPrice);
            gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" $"+Float.toString(book.bPrice)+" "+userQuantity+" %"+String.format("%.0f", displaydisc)+String.format(" $%.2f", order.getuserSubtotal()));
            //gui.getsubTotalField().setText(String.format(" $%.2f", order.getuserSubtotal()));
           // gui.getsubTotalLabel().setText("Order Subtotal for "+userQuantity+" item(s):");
        }else if(userQuantity >=10 && userQuantity <= 14){
            discount = (float) 0.15;
            float displaydisc = discount *100;
            order.setuserDiscount(discount);
            order.setuserSubTotal((book.bPrice * userQuantity) - book.bPrice * userQuantity * discount);
            //float totalBooksPrice = book.bPrice * userQuantity;
            //System.out.println(totalBooksPrice);
            gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" $"+Float.toString(book.bPrice)+" "+userQuantity+" %"+String.format("%.0f", displaydisc)+String.format(" $%.2f", order.getuserSubtotal()));
       // gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" "+Float.toString(book.bPrice));
           // gui.getsubTotalField().setText(String.format(" $%.2f", order.getuserSubtotal()));
            //gui.getsubTotalLabel().setText("Order Subtotal for "+userQuantity+" item(s):");
        }else if(userQuantity >=15){
            discount = (float) 0.2;
            float displaydisc = discount *100;
            order.setuserDiscount(discount);
            order.setuserSubTotal((book.bPrice * userQuantity) - book.bPrice * userQuantity * discount);
            //float totalBooksPrice = book.bPrice * userQuantity;
            //System.out.println(totalBooksPrice);
            gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" $"+Float.toString(book.bPrice)+" "+userQuantity+" %"+String.format("%.0f", displaydisc)+String.format(" $%.2f", order.getuserSubtotal()));
       // gui.getitemInfoOut().setText(Integer.toString(book.bID)+" "+book.bName+" "+Float.toString(book.bPrice));
            //gui.getsubTotalField().setText(String.format(" $%.2f", order.getuserSubtotal()));
            //gui.getsubTotalLabel().setText("Order Subtotal for "+userQuantity+" item(s):");
        }
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
            totalOrder = Integer.parseInt(orderQuantityField);
            bookID = Integer.parseInt(gui.getBookIDIn().getText());
            userQuantity = Integer.parseInt(gui.getitemQuantityIn().getText());
            //System.out.println(totalOrder);
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
            return;
        }else{
        pullUpBookInfo(userOrder.getuserBook(), userOrder.getuserQuantity(), userOrder);
        }
       // System.out.println(userOrder.getuserBook().bID);
       // System.out.println(userOrder.getuserQuantity());
        //Order tempOrder = new Order();
        tempOrder = userOrder;
                 
       // System.out.println(totalOrder);
        gui.getprocessBut().setEnabled(false);
        gui.getconfirmBut().setEnabled(true);
        
        gui.getNumItemsIn().setEnabled(false);
        //gui.getitemInfoOut().setEnabled(false);
        
        
    }
    
    public void confirmOrder(){
        invoice.getorderList().add(tempOrder);
        invoice.setorderSubTotal(invoice.getorderSubTotal() + tempOrder.getuserSubtotal());  
        float invoiceSubTotal =   invoice.getorderSubTotal();  
       // System.out.println(tempOrder.getuserSubtotal()+"YOOOOOOOOO");
        
        int orderUnits = tempOrder.getuserQuantity();
        invoice.setorderUnits(orderUnits + invoice.getorderUnits());
       // System.out.println(invoice.getorderUnits()+"LOOOK");
        
        gui.getsubTotalField().setText(String.format(" $%.2f", invoiceSubTotal));
        gui.getsubTotalLabel().setText("Order Subtotal for "+invoice.getorderUnits()+" item(s):");
        //invoice.setorderUnits(totalOrder);
        JOptionPane.showMessageDialog(null, "Item #"+totalOrder_counter+" has been accepted.");
        gui.getconfirmBut().setEnabled(false);
        if(totalOrder_counter < totalOrder){
            gui.getprocessBut().setEnabled(true);
            gui.getprocessBut().setText("Process item #"+(totalOrder_counter+1));
            gui.getconfirmBut().setText("Confirm item #"+(totalOrder_counter+1));
            gui.setBookIDLabel(totalOrder_counter+1);
            gui.setitemInfoLabel(totalOrder_counter+1);
            gui.setitemQuantityLabel(totalOrder_counter+1);
            
        }else{
            gui.getfinishOrderBut().setEnabled(true);
        }
        totalOrder_counter++;
        //System.out.println(totalOrder+" "+totalOrder_counter);
        gui.getviewOrderBut().setEnabled(true);
        gui.getBookIDIn().setText("");
        gui.getitemQuantityIn().setText("");
        
        
       // System.out.println(invoice.getorderUnits());
    }
    
    public void viewOrder(){
        int i = 1;
        String dialog = "";
        String dTemp = null;
        ArrayList<Order> orderList = invoice.getorderList();
        Iterator<Order> it = orderList.iterator();
        while(it.hasNext()){
            Order order = it.next();
            float discount = order.getuserDiscount() * 100;
            Book book = order.getuserBook();
            dTemp = Integer.toString(i)+". "+book.getbID()+" "+book.bName+" "+book.bPrice+" "+order.getuserQuantity()+" %"+String.format("%.0f",discount)+" $"+String.format("%.2f", order.getuserSubtotal())+"\n";
           // System.out.println(dTemp);
            //System.out.println(discount);
            //System.out.println(order.getuserSubtotal());
            i++;
            dialog = dialog+dTemp;
        }
        
        JOptionPane.showMessageDialog(null, dialog);
    }
    
    public void newOrder(){
        totalOrder = 0;
        totalOrder_counter = 1;
        gui.setBookIDLabel(totalOrder_counter);
        gui.setitemQuantityLabel(totalOrder_counter);
        gui.setitemInfoLabel(totalOrder_counter);
        gui.getsubTotalLabel().setText("Order Subtotal for 0 item(s):");
        gui.getBookIDIn().setText("");
        gui.getitemQuantityIn().setText("");
        gui.getitemInfoOut().setText("");
        gui.getNumItemsIn().setText("");
        gui.getsubTotalField().setText("");
        gui.getprocessBut().setEnabled(true);
        gui.getprocessBut().setText("Process item #"+totalOrder_counter);
        gui.getconfirmBut().setText("Confirm item #"+totalOrder_counter);
        invoice.setorderSubTotal(0);
        
        ArrayList<Order> orderList = invoice.getorderList();
        Iterator<Order> it = orderList.iterator();
        if(orderList.isEmpty()){
            gui.getNumItemsIn().setEnabled(true);
            gui.getviewOrderBut().setEnabled(false);
            return;
        }else{
            orderList.clear();
        }
        invoice.setorderUnits(0);
        gui.getNumItemsIn().setEnabled(true);
        gui.getviewOrderBut().setEnabled(false);
    }
    
    public void finishOrder() throws IOException{
        invoice.setDate();
        String dialog = "Date: ";
        int i = 1;
        dialog = dialog + invoice.getorderTimeStamp()+"\n\n";
        dialog = dialog + "Number of line items: " + invoice.getorderUnits() + "\n\n";
        dialog = dialog + "Item# / ID / Title / Price / Quantity / Discount % / Subtotal: \n\n";
        
        ArrayList<Order> orderList = invoice.getorderList();
        Iterator<Order> it = orderList.iterator();
        while(it.hasNext()){
            Order order = it.next();
            float discount = order.getuserDiscount() * 100;
            Book book = order.getuserBook();
            dialog = dialog + Integer.toString(i)+". "+book.getbID()+" "+book.bName+" "+book.bPrice+" "+order.getuserQuantity()+" %"+String.format("%.0f",discount)+" $"+String.format("%.2f", order.getuserSubtotal())+"\n";
            i++;
        }
        
        dialog = dialog + "Order SubTotal: " + String.format("%.02f", invoice.getorderSubTotal()) + "\n\n";
        dialog = dialog + "Tax Rate: " + taxdisp + "\n\n";
        invoice.setTaxAmount(invoice.getorderSubTotal()*taxRate);
        dialog = dialog + "Tax Amount: $"+ String.format("%.02f", invoice.getTaxAmount()) + "\n\n";
        invoice.setorderTotal(invoice.getTaxAmount()+invoice.getorderSubTotal());
        dialog = dialog + "Order Total: $" + String.format("%.02f", invoice.getorderTotal()) + "\n\n";
        dialog = dialog + "Thank you for shopping.";
        
        JOptionPane.showMessageDialog(null, dialog);
        gui.getviewOrderBut().setEnabled(false);
        gui.getfinishOrderBut().setEnabled(false);
        writeOutput();
        
    }
    
    public void writeOutput() throws IOException{
        FileWriter checkOutputLoc = null;
        BufferedWriter fileOutput = null;
        
        try{
            checkOutputLoc = new FileWriter(outputFile, true);
            
        }catch(IOException e){
            System.out.println("Can't write here.");
            JOptionPane error = new JOptionPane("There was an error writing to the file.", JOptionPane.ERROR);
        }
        
        fileOutput = new BufferedWriter(checkOutputLoc);
        
        ArrayList<Order> orderList = invoice.getorderList();
        Iterator<Order> it = orderList.iterator();
        String dialog = "";
        while(it.hasNext()){
            Order order = it.next();
            float discount = order.getuserDiscount();
            Book book = order.getuserBook();
            dialog = invoice.getTransaction()+", "+book.getbID()+" "+book.bName+" "+book.bPrice+" "+order.getuserQuantity()+" "+String.format("%.0f",discount)+" "+String.format("%.2f", order.getuserSubtotal())+", "+invoice.getorderTimeStamp();
            fileOutput.write(dialog);
            fileOutput.newLine();
            
        }
        
        try{
            fileOutput.close();
            checkOutputLoc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
}
