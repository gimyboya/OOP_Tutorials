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

    @Override
    public double getPrice() {
        return super.getUnitPrice() * this.quantity;
    }
}
