package Pkg;

/**
 * Created by gimy on 11/9/2016.
 */
public class CountedItem extends PurchaseItem {

    private int quantity;

    public CountedItem(String n, double u, int q) {

        super(n, u);
        this.quantity = q;
    }

    public int getQuantity(){return this.quantity;}

    @Override
    public double getPrice() {
        return super.getUnitPrice() * this.quantity;
    }

    @Override
    public String toString() {
        String info = "\t\t\t::Counted Item::\n\nName : " + super.getName() + "\nQuantity : " + this.getQuantity() + "\nPrice : " + this.getPrice();
        return info;
    }
}
