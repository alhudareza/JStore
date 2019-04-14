import java.text.*;
import java.util.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.SELL;
    private static final InvoiceStatus INVOICE_STATUS =InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Costumer costumer;
    private boolean isActive;
    private SimpleDateFormat dateFormat = new SimpleDateFormat (" dd MM yyy");
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item,
    int installmentPeriod,Costumer costumer)
    {
        super(item);
        //this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.installmentPeriod=installmentPeriod;
        this.isActive=true;
    }

    public int getInstallmentPeriod()
    {
        return installmentPeriod;
        
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Costumer getCostumer()
    {
        return costumer;
    }
    
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice =(int)(1.02* (totalPrice/installmentPeriod));
    }
    
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice=installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
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
        System.out.println("Installment price = " + installmentPrice);
        System.out.println("Customer ID = " + costumer.getId());
        System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
    
}
