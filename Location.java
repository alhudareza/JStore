
/**
 * class location berguna untuk mendapatkan dan menset lokasi dari
 * setiap barang.yang membedakan class ini dengan class yang lain 
 * adalah adanya variable province,description dan city
 *
 * @author Alhuda Reza Mahara
 * @version 28-febuari-2019
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * @param parameter yang digunakan adalah city,province,description
     * Constructor yang digunakan pada class invoice berguna untuk mengassign nilai variabel local ke variabel global
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city=city;
        this.province=province;
        this.description=description;
    }

    /**
     * methode yang berguna untuk mengambil nilai province
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel province dan menggunakan tipe data String
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * methode yang berguna untuk mengambil nilai city
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel city dan menggunakan tipe data String
     */
    public String getCity()
    {
        return city;
    }
    /**
     * methode yang berguna untuk mengambil nilai description
     * @return dimana nilai yang sudah diambil tersebut direturn ke variabel description dan menggunakan tipe data String
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * methode yang berguna untuk menset nilai province
     * @param parameter yang digunakan pada method ini adalah province yang menggunakan tipe data String
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    /**
     * methode yang berguna untuk menset nilai city
     * @param parameter yang digunakan pada method ini adalah city yang menggunakan tipe data String
     */
    public void setCity(String city)
    {
        this.city=city;
    }
    /**
     * methode yang berguna untuk menset nilai description
     * @param parameter yang digunakan pada method ini adalah description yang menggunakan tipe data String
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    /**
     * methode yang berguna untuk menampilkan nilai province
     */
    public String toString()
    {
        System.out.println("LOCATION");
        System.out.println("PROVINSI" + province);
        System.out.println("KOTA" + city);
        System.out.println("Deskripsi" + description);
        return "";
        
    }
}
