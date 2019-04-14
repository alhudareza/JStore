import java.util.*;
/**
 * class databaseitem berguna untuk mendapatkan dan menset database item dari
 * setiap toko.yang membedakan class ini dengan class yang lain 
 * adalah adanya variable listitem dan Item
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;
    

    /**
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public DatabaseItem()
    {
        // initialise instance variables
        
       
    }
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
   /**
     * methode yang berguna untuk menset nilai item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel item
     * @param parameter yang digunakan pada method ini adalah item 
     */
    public boolean addItem(Item item)
    {
        boolean found = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getName() == item.getName() && temp.getStatus() == item.getStatus()
            && temp.getSupplier() == item.getSupplier()) 
            {
                return false;
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
       
        return true;
    }
    /**
     * methode yang berguna untuk mengambil nilai supplie
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel  supplier dan menggunakan tipe data boolean
     * @param parameter yang digunakan pada method ini adalah item 
     */
    public static boolean removeItem(int id)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                ITEM_DATABASE.remove(temp);
                return true;
            }
        }
        return false;
    }
    /**
     * methode yang berguna untuk mengambil nilai itemdatabase
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel listitem
     */
    public static Item getItemFromID(int id)
    {
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getSupplier() == supplier) 
            {
                list.add(temp);
                found = true;
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getCategory() == category) 
            {
                list.add(temp);
                found = true;
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean found = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getStatus() == status) 
            {
                list.add(temp);
                found = true;
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    /**
     * methode yang berguna untuk mengambil nilai item
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel item
     */
    
    
}
