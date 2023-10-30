public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void executeService() {
        requestCart(numberOfCarts);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service is handling a request for " + numberOfCarts + " cart(s).");
    }
}

