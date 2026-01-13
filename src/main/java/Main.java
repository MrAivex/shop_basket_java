public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);
        Product headphones = new Product("Наушники", 5000.0);

        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        cart.printCart();

        System.out.println("Удаляем: Мышка\n");
        cart.removeProduct("Мышка");

        cart.printCart();

        System.out.println("=== Дополнительные тесты ===");

        cart.addProduct(headphones);
        cart.printCart();

        cart.removeProduct("Монитор");
        cart.printCart();

        cart.removeProduct("Ноутбук");
        cart.removeProduct("Клавиатура");
        cart.removeProduct("Наушники");
        cart.printCart();
    }
}
