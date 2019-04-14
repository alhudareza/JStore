import java.util.*;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    //private Costumer[] listInvoice;
     private static ArrayList<Invoice> INVOICE_DATABASE=new ArrayList<Invoice>();
     private static int LAST_INVOICE_ID = 0;
    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        return true;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static Invoice getInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public static Invoice getActiveOrder(Costumer costumer)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if((temp.getInvoiceStatus() == InvoiceStatus.Unpaid || 
            temp.getInvoiceStatus() == InvoiceStatus.Installment) && 
            temp.getIsActive() == true) 
            {
                return temp;
            }
        }
        return null;
    }
        
    /**
     * Method untuk menghapus supplier dari list
     *
     */
    public static boolean removeInvoice(int id)
    {
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getIsActive() == true) 
                {
                    temp.setIsActive(false);
                    INVOICE_DATABASE.remove(temp);
                    return true;
                }
            }
        }
        return false;
    }
}