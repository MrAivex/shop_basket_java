public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product naushniki = new Product("Наушники BOSE", 30000.0);
        Product kovrik = new Product("Коврик для мыши", 1200.0);
        Product culler = new Product("Куллер", 300.0);
        Product Claviatura = new Product("Клавиатура", 3000.0);

        cart.addProduct(naushniki);
        cart.addProduct(kovrik);
        cart.addProduct(culler);

        cart.printCart();

        System.out.println("Удаляем: Наушники BOSE\n");
        cart.removeProduct("Наушники BOSE");

        cart.printCart();

        cart.addProduct(Claviatura);
        cart.printCart();

        cart.removeProduct("Коврик для мыши");
        cart.printCart();

        cart.removeProduct("Куллер");
        cart.removeProduct("Клавиатура");
        cart.printCart();
    }
}
