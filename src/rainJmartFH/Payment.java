package rainJmartFH;


import java.util.Date;

/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Payment extends Invoice implements Transactor
{
    
    public int productId;
    public Shipment shipment;
    public int productCount;

    public Payment(int id, int buyerId, int productId, int productCount, Shipment shipment, Date date)
    {
        super(id, buyerId, productId, date);
        this.id = id;
        this.buyerId = buyerId;
        this.shipment = shipment;
    }


    public boolean validate(){
        return false;
    }
    public Invoice perform(){
        return null;
    }


    @Override
    public Object write(String content) {
        return null;
    }

    @Override
    public Object newInstance(String content) {
        return null;
    }

    @Override
    double getTotalPay() {
        return 0;
    }
}
