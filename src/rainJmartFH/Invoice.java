package rainJmartFH;


import java.util.Date;

/**
 * Write a description of class Invoice here.
 *
 * @author rain
 * @version (a version number or a date)
 */
abstract class Invoice extends Recognizable implements FileParser
{
    
    public Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating = Rating.NONE;
    public Status status = Status.WAITING_CONFIRMATION;

    
    protected Invoice(int id, int buyerId, int productId , Date date)
    {
        super(id);
        this.complaintId = id;
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = date;
        
    }


    public boolean read(String content){
        return false;
    }

    abstract double getTotalPay();
    
    enum Status{
        WAITING_CONFIRMATION, CANCELLED, ON_PROGRESS, ON_DELIVERY, COMPLAINT,
        FINISHED, FAILED
    }
    
    enum Rating{
        NONE, BAD, NEUTRAL, GOOD
    }
}
