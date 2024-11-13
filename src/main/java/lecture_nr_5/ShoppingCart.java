package lecture_nr_5;

public class ShoppingCart {

    Product[] productsInCart;

    public ShoppingCart(Product... productsInCart) {
        this.productsInCart = productsInCart;
    }

    public float getShoppingCartTotal(){
        float sum = 0;
        for(int i = 0; i != productsInCart.length; i++){
            sum += productsInCart[i].calculateSum();
        }
        return sum;
    }
}
