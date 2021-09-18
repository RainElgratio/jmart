package rainJmartFH;


public class Jmart{
    public static void main(String[] args){
        System.out.print("program berjalan");
    }
    
    int getPromo(){
        return 0;
    }
    
    String getCustomer(){
        return "oop";
    }
    
    float getDiscountPercentage(int before, int after){
        float percentage;
        
        if(before < after){
            return 0;
        }
        else{
            percentage = 100 - ((after/before) * 100);
            return percentage;
        }
    }
    
    int getDiscountedPrice(int price, float discountPercentage){
        int result = price * (discountPercentage/100);
        
        if(discountPercentage > 100){
            return 0;
        }
        else{
            return result;
        }
    }
    
    int getOriginalPrice(int discountedprice, float discountPercentage){
        return discountedPrice/(1 - discountPercentage);
    }
    
    float getCommissionMultyplier(){
        return 0.05;
    }
    
    int getAdjustedPrice(int price){
        return (price*0.05) + price;
    }
    
    int getAdminFee(int price){
        return price*0.05;
    }
}
        
        if(discountPercentage > 100){
            return 0;
        }
        else{
            return result;
        }
    }
}
