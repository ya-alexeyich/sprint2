package model;
import model.constants.Colour;
import model.constants.Discount;


public class Apple extends Food {
    private final String colour;
    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;
    }


    @Override
    public double getDiscount(){
        return colour.equals(Colour.RED) ? Discount.RED_APPLE_DISCOUNT : Discount.NON_DISCOUNT;
        // применил тернарный оператор условия в формате x?a:b, использовал константы для величины скидок

    }
}
