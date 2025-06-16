import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;
//добавил импорт используемых в коде классов

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50,Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        // Использовал константы для цвета яблок

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        System.out.printf("Общая сумма товаров без скидки: %.2f\n", cart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f\n", cart.getTotalWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f\n", cart.getTotalVegetarianWithoutDiscount());
        // использовал метод printf для форматирования вывода
    }
}