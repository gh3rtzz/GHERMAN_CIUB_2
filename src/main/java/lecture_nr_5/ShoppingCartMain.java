package lecture_nr_5;

public class ShoppingCartMain {

    public static void main(String[] args) {

        Product p1 = new Product("Strawberry", 110f, 2);
        Product p2 = new Product("Milk", 22f, 1);
        Product p3 = new Product("Avocado", 40.5f, 3);
        Product p4 = new Product("Beef", 107.43f, 2);

        ShoppingCart sc1 = new ShoppingCart(p1, p2, p3, p4);
        ShoppingCart sc2 = new ShoppingCart(p2, p4);

        float sum = 0;
        for(int i = 0; i != sc1.productsInCart.length; i++){

            sum += sc1.productsInCart[i].price * sc1.productsInCart[i].quantity;
        }

        System.out.println(sum);

        System.out.println(sc2.getShoppingCartTotal());
    }
}
