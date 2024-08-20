package model;

public class Coupon {
    static int idGen = 132;
    private int couponId;
    private int discount;


    public Coupon(int discount) {
        this.couponId = idGen++;
        this.discount = discount;
    }


    public int getCouponId() {
        return couponId;
    }


    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }


    public int getDiscount() {
        return discount;
    }


    public void setDiscount(int discount) {
        this.discount = discount;
    }

    

    
}
