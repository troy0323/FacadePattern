public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();


        Valet valetService = new Valet("YORT231");
        HouseKeeping houseKeepingService = new HouseKeeping(0323);
        Cart cartService = new Cart(2);

        frontDesk.requestService(valetService);
        frontDesk.requestService(houseKeepingService);
        frontDesk.requestService(cartService);
    }
}