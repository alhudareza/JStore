import java.text.*;
import java.util.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Costumer costumer; 
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat ("dd MMM yyy");
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item
    ,Costumer costumer)
    {
        super(item);
        this.isActive=false;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return this.INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return this.INVOICE_TYPE;
    }
    public Costumer getCostumer()
    {
        return costumer;
    }
    
    public void setCostumer(Costumer costumer)
    {
        this.costumer = costumer;
    }
    
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int tempID : listItemID)
        {
            System.out.println("Item = " + 
            DatabaseItem.getItemFromID(tempID).getName());
            System.out.println("Price = " + 
            DatabaseItem.getItemFromID(tempID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(tempID).getSupplier().getName());
        }
        System.out.println("Buy date = " + dateFormat.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Customer ID = " + costumer.getId());
        System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Sell success.");
        return "";
    }
    
}
