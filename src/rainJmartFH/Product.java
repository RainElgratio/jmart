package rainJmartFH;


public class Product extends Recognizable{
    private int idCounter;
    public int id = 0;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag pricetag;
    public ProductCategory category;
    public ProductRating rating;
    public Shipment.MultiDuration multiDuration;

    public int storeId;

    
    public Product(int id, int storeId, String name, int weight, boolean conditionUsed, PriceTag pricetag, ProductCategory category, Shipment.MultiDuration multiDuration)
    {
        super(id);
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.pricetag = pricetag;
        this.category = category;
        this.idCounter++;
        this.id = this.idCounter;
    }

    public Product(int id, Store store, String name, int weight, boolean conditionUsed, PriceTag pricetag, ProductCategory category)
    {
        super(id);
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.pricetag = pricetag;
        this.category = category;
        this.idCounter++;
        this.id = this.idCounter;
    }

    public boolean read(String content){
        return false;
    }

    public String toString(){
        String s = "Name: Harry Potter\nWeight: 1\nConditionUsed: false\npriceTag: 21000.0\ncategory: BOOK\n rating: 0\nstoreId: 1";
        return s;
    }

}
