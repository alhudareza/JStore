import java.util.*;
//import java.text.*;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    private static ArrayList<Integer> listItem = new ArrayList<Integer>();
    
    
    /**
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        
    }

    
    public void orderNewItem(Item item)
    {
       listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }
    
    
    public void orderSecondItem(Item item)
    {
         listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);

    }
    
    public void orderRefurbishedItem(Item item)
    {
         listItem.add(item.getId());
        Invoice order = new Buy_Paid(listItem);
        DatabaseInvoice.addInvoice(order);
    }
    
     public void sellItemPaid(Item item,Costumer costumer)
    {
        listItem.add(item.getId());
        Invoice sellPaid = new Sell_Paid(listItem, costumer);
        DatabaseInvoice.addInvoice(sellPaid);
    }
    
 
    public void sellItemUnpaid(Item item,Costumer costumer)
    {
           listItem.add(item.getId());
        Invoice sellUnpaid = new Sell_Unpaid(listItem, costumer);
        DatabaseInvoice.addInvoice(sellUnpaid);
    }
    
    public void sellItemInstallment(Item item,Costumer costumer,int
    installmentPeriod)
    {
        listItem.add(item.getId());
        Invoice sellInstall = new Sell_Installment(listItem, installmentPeriod, costumer);
        DatabaseInvoice.addInvoice(sellInstall);
    }
     public static boolean finishTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        invoice.setIsActive(false);
        System.out.println("isActive : " + invoice.getIsActive());
        return true;
    }
    public static boolean cancelTransaction(Invoice invoice)
    {
        invoice = DatabaseInvoice.getInvoice(invoice.getId());
        if(invoice == null)
        {
            return false;
        }
        DatabaseInvoice.removeInvoice(invoice.getId());
        return true;
    }
}
    