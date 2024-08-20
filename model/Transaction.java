package model;

public class Transaction {
    private int productId;
    private int userId;
    private int quantity;
    private Status status;

    private enum Status{
        ORDERED,
        WISHLIST
    }

    public int getProductId() {
        return productId;
    }




    public void setProductId(int productId) {
        this.productId = productId;
    }




    public int getUserId() {
        return userId;
    }




    public void setUserId(int userId) {
        this.userId = userId;
    }




    public int getQuantity() {
        return quantity;
    }




    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




    public Status getStatus() {
        return status;
    }




    public void setStatus(Status status) {
        this.status = status;
    }
}
