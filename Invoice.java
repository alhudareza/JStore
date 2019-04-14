




/**
 * kelas invoice ini berfungsi untuk menset dan mendapatkan 
 * invoice dari setiap barang dengan yang membedakan dari kelas 
 * yang lain adalah adanya variable id,date dan total price
 * @Alhuda Reza Mahara
 * @version 28 febuari 2019
 */
import java.util.*;
import java.text.*;
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private Calendar date;
    protected int totalPrice;
    private ArrayList<Integer> item;
    //private int totalItem;
    private boolean isActive;
    private Costumer costumer;
    private static InvoiceStatus status;
    
    

    /**
     * @param parameter yang digunakan adalah id, Item, date dan totalprice
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
     public Invoice(ArrayList<Integer> item)
    {
        this.id = DatabaseInvoice.getLastInvoiceID() + 1;
        this.item = item;
        
        this.date = new GregorianCalendar();
    }

    /**
     * methode yang berguna untuk mengambil nilai id
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel id dan menggunakan tipe data integer
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
   /**
     * methode yang berguna untuk mengambil nilai date
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel date dan menggunakan tipe data String
     */
    public Calendar getDate()
    {
        // put your code here
        return date;
    }
    /**
     * methode yang berguna untuk mengambil nilai totalPrice
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel totalPrice dan menggunakan tipe data integer
     */
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    /**
     * methode yang berguna untuk mengambil nilai Item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel Item 
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    /*
    public int getTotalItem()
    {
        return totalItem;
    }
    */
    
    public abstract InvoiceStatus getInvoiceStatus();
    public abstract InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return true;
    }
    public Costumer getCostumer()
    {
        return costumer;
    }
    /*public abstract void setInvoiceStatus(InvoiceStatus status);
    /**
     * methode yang berguna untuk menset nilai id
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data integer
     */
    public void setId(int id)
    {
        // put your code here
         this.id = id;
    }
    /**
     * methode yang berguna untuk menset nilai date
     * @param parameter yang digunakan pada method ini adalah date yang menggunakan tipe data String
     */
    public void setDate(Calendar date)
    {
        // put your code here
         this.date = date;
    }
    /**
     * methode yang berguna untuk menset nilai totalPrice
     * @param parameter yang digunakan pada method ini adalah totalPrice yang menggunakan tipe data String
     */
    public void setTotalPrice(int totalPrice)
    {
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(id).getItem();
        for(int tempID : listItemID)
        {
            this.totalPrice = totalPrice + DatabaseItem.getItemFromID(tempID).getPrice();
        }
    }
    /**
     * methode yang berguna untuk menset nilai Item
     * @param parameter yang digunakan pada method ini adalah Item 
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    /*public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    */
    
    /**
     * methode yang berguna untuk menampilkan nila totalprice
     */
    
    public abstract String toString();
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    public void setCustomer(Costumer costumer)
    {
        this.costumer = costumer;
    } 
    
}