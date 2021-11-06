package rainJmartFH;


/**
 * Write a description of class Store here.
 *
 * @author rain
 * @version (a version number or a date)
 */
public class Store extends Serializable implements FileParser
{
    public String REGEX_PHONE;
    public String REGEX_NAME;
    public String nama;
    public String address;
    public String phoneNumber;

    /**
     * Constructor for objects of class Store
     */

    public Store(int accountId, String name, String address, String phoneNumber)
    {
        super(accountId);
        this.nama = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Store(Account account, String name, String address, String phoneNumber)
    {
        super(account.id);
        this.nama = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public boolean read(String content){
        return false;
    }
    public Object write(String content){
        return null;
    }
    public Object newInstance(String content){
        return null;
    }

    public String toString(){
        String s = "name: PT Madju Merdeka\naddress: Jl. Kukusan\nphoneNumber: 628777xxxx";
        return s;
    }

    public boolean validate(){
        return false;
    }

    
}
