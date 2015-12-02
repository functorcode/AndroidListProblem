package juned.listproblem.app;

/**
 * Created by juned on 12/2/15.
 */
public class DbItem {
    private String item_name;
    private Double price;
    private Boolean has_price;

    public DbItem(String item_name,Double price,Boolean has_price )
    {
        this.item_name=item_name;
        this.price=price;
        this.has_price=has_price;
    }
    public  String getItemName()
    {
        return  this.item_name;
    }
    public  Double getPrice()
    {
        return  this.price;

    }

    public  Boolean getHasPrice()
    {
        return  this.has_price;
    }



}
