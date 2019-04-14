
/**
 * kelas supplier ini berfungsi untuk menset dan mendapatkan nilai
 * supplier dari setiap barang dengan yang membedakan dari kelas 
 * yang lain adalah adanya variable id,name ,email dan phonenumber
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */



public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * @param parameter yang digunakan adalah id, name, email, phone number dan location
     * Constructor yang digunakan pada class supplier
     */
    public Supplier(int id, String name, String email,String phoneNumber,
    Location location)
    {
        // initialise instance variables
        //id = 0;
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
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
     * methode yang berguna untuk mengambil nilai naem
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel name dan menggunakan tipe data String
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    /**
     * methode yang berguna untuk mengambil nilai email
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel email dan menggunakan tipe data String
     */
    public String getEmail()
    {
        // put your code here
        return email;
    }
    
    /**
     * methode yang berguna untuk mengambil nilai phoneNumber
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel phoneNumber dan menggunakan tipe data String
     */
    public String getPhoneNumber()
    {
        // put your code here
        return phoneNumber;
    }
    
    //public String getCity()
    //{
        // put your code here
    //    return "";
    //}
    /**
     * methode yang berguna untuk mengambil nilai phoneNumber
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel phoneNumber 
     */
    public Location getLocation()
    {
        return location;
    }
    /**
     * methode yang berguna untuk menset nilai id
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data integer
     */
    public void setId(int id)
    {
        // put your code here
        this.id=id;
    }
    /**
     * methode yang berguna untuk menset nilai name
     * @param parameter yang digunakan pada method ini adalah name yang menggunakan tipe data String
     */
    public void setName(String name)
    {
        // put your code here
        this.name=name;
    }
    /**
     * methode yang berguna untuk menset nilai email
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data String
     */
    public void setEmail(String email)
    {
        // put your code here
        this.email=email;
    }
    /**
     * methode yang berguna untuk menset nilai phoneNumber
     * @param parameter yang digunakan pada method ini adalah id yang menggunakan tipe data String
     */
    public void setphoneNumber(String phoneNumber)
    {
        // put your code here
        this.phoneNumber=phoneNumber;
    }
    
    
    public void setLocation(Location location)
    {
        //memasukan nilai dari variabel local location kevariabel global
        this.location=location;
    }
    public String toString()
    {
        //menampilkan variabel name
        System.out.println("SUPPLIER");
        System.out.println("ID" + id);
        System.out.println("NAMA" + name);
        System.out.println("EMAIL" + email);
        System.out.println("NOMOR TELFON" + phoneNumber);
        System.out.println("Lokasi" + location.getCity());
        return "";
    }
}
