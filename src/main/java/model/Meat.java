package model;
import model.constants.Discount;

public class Meat extends Food {
    public Meat(int amount, double price){
        super(amount, price, false);

    }
    @Override
    public double getDiscount(){
        return Discount.NON_DISCOUNT;
        // Использовал константу для дефолтного размера скидки.
    }
}
