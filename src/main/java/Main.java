public class Main {
    public static void main(String[] args) {
        // Создаем корзину
        Cart cart = new Cart();

        // Создаем товары
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);
        Product headphones = new Product("Наушники", 5000.0);

        // Добавляем товары в корзину
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Показываем корзину
        cart.printCart();

        // Удаляем товар
        System.out.println("Удаляем: Мышка\n");
        cart.removeProduct("Мышка");

        // Снова показываем корзину
        cart.printCart();

        // Дополнительные тесты
        System.out.println("=== Дополнительные тесты ===");

        // Добавляем еще товар
        cart.addProduct(headphones);
        cart.printCart();

        // Пытаемся удалить несуществующий товар
        cart.removeProduct("Монитор");
        cart.printCart();

        // Очищаем корзину
        cart.removeProduct("Ноутбук");
        cart.removeProduct("Клавиатура");
        cart.removeProduct("Наушники");
        cart.printCart();
    }
}