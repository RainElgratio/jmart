package rainJmartFH;


public class Jmart{
    public static void main(String[] args){
        System.out.print("program berjalan");
    }
    
    public int getPromo(){
        return 0;
    }
    
    public String getCustomer(){
        return "oop";
    }
    
    public float getDiscountPercentage(int before, int after){
        float percentage;
        
        if(before < after){
            return 0;
        }
        else{
            percentage = 100 - ((after/before) * 100);
            return percentage;
        }
    }
    
    public int getDiscountedPrice(int price, float discountPercentage){
        float result = price * (discountPercentage/100);
        
        if(discountPercentage > 100){
            return 0;
        }
        else{
            return result;
        }
    }
    
    public int getOriginalPrice(int discountedPrice, float discountPercentage){
        return discountedPrice/(1 - discountPercentage);
    }
    
    public float getCommissionMultyplier(){
        return 0.05;
    }
    
    public int getAdjustedPrice(int price){
        return (price*0.05) + price;
    }
    
    public int getAdminFee(int price){
        return price*0.05;
    }
}
