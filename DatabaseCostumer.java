import java.util.*;
/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCostumer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Costumer> CUSTOMER_DATABASE = new ArrayList<Costumer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCostumer
     */
    public DatabaseCostumer()
    {
        // initialise instance variables
        
    }

    public static ArrayList<Costumer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    public static boolean addCustomer(Costumer costumer)
    {
        boolean found = false;
        for(Costumer temp : CUSTOMER_DATABASE)
        {
            if(temp.getName() == costumer.getName() && temp.getEmail() 
            == costumer.getEmail())
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(costumer);
        LAST_CUSTOMER_ID = costumer.getId();
        return true;
    }
    public static Costumer getCustomer(int id)
    {
        for(Costumer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                return temp;
            }
        }
        return null;
    }
    public static boolean removeCustomer(int id)
    {
        for(Costumer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        return false;
    }
}
