package Pkg;

/**
 * Created by gimy on 11/9/2016.
 */
public class WeighedItem extends PurchaseItem {

    private double weight;

    public WeighedItem(String n, double u, double w) {

        super(n, u);
        this.weight = w;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return super.getUnitPrice() * this.weight;
    }

    @Override
    public String toString() {
        String info = "\t\t\t::Weighted Item::\n\nName : " + super.getName() + "\nWeight : " + this.getWeight() + "\nPrice : " + this.getPrice();
        return info;
    }
}
