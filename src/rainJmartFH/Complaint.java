package rainJmartFH;


import java.io.File;
import java.util.Date;

/**
 * Write a description of class Complaint here.
 *
 * @author rain
 * @version
 */
public class Complaint extends Recognizable implements FileParser
{
    
    public int paymentId;
    public Date date;
    public String desc;
    
    
    public Complaint(int id, Payment payment, String desc, Date date)
    {
        super(id);
        this.id = id;
        this.date = date;
        this.desc = desc;
    }
    
    
    public Complaint(int id, int buyerId, int storeId, int paymentId, String desc, Date date)
    {
        super(id);
        this.id = id;
        this.date = date;
        this.desc = desc;
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


    
}
