package service;
import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items)  {
            total += item.getAmount() * item.getPrice();
            // Применил foreach для циклов
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for  (Food item : items)  {
            double discount = item.getDiscount();
            double priceAfterDiscount = item.getPrice() * (1 - discount / 100);
            total += item.getAmount() * priceAfterDiscount;
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}