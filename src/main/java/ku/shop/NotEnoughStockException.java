package ku.shop;

public class NotEnoughStockException extends Exception {
    public NotEnoughStockException(String message) {
        super(message);
    }
}
