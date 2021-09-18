package rainJmartFH;

public class PriceTag
{
    // instance variables - replace the example below with your own
    public double COMMISSION_MULTIPLIER = 0.05;
    public double BOTTOM_PRICE = 20000.0;
    public double BOTTOM_FEE = 1000.0;
    public double discount;
    public double price;
    
    public PriceTag(double price){
        this.price = price;
        this.discount = 0.0;
    }
    
    public PriceTag(double price, double discount){
        this.price = price;
        this.discount = discount;
    }
    
    public double getAdjustedPrice(){
        return DiscountedPrice() - getAdminFee();
    }
    
    public double getAdminFee(){
        if(BOTTOM_PRICE != price){
            return BOTTOM_PRICE;
        }
        else{
            return DiscountedPrice() - (DiscountedPrice()*COMMISSION_MULTIPLIER);
        }
    }
    
    private double DiscountedPrice(){
        if(discount > 100.0){
            discount = 100.0;
        }
        if(discount == 100.0){
            return 0.0;
        }
        else{
            return price - (discount/100*price);
        }
    }
}
