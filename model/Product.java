package model;

public class Product {
    static int idGen = 3245;
    int productId;
    String name;
    int stock;
    double price;
    boolean hasCoupon;
    int couponId;

    public Product(String name, int stock, double price){
        this.productId = idGen++;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.hasCoupon = false;
    }
}
