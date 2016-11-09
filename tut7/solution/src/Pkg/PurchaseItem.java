package Pkg;

/**
 * Created by gimy on 11/9/2016.
 */
public abstract class PurchaseItem {

    private String name;
    private double unitPrice;
    private double price;

    public PurchaseItem(String n, double u){
        this.name = n;
        this.unitPrice = u;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public abstract double getPrice();

    public String getName() {
        return name;
    }
}
