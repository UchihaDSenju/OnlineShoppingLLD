package model;

public class User {
    static int idGen = 7342;
    private int userId;
    private String userName;
    private Type holder;
    
    private enum Type{
        CUSTOMER,
        ADMIN
    }


    public User(String userName, Type holder) {
        this.userId = idGen++;
        this.userName = userName;
        this.holder = holder;
    }


    public static int getIdGen() {
        return idGen;
    }


    public static void setIdGen(int idGen) {
        User.idGen = idGen;
    }


    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Type getHolder() {
        return holder;
    }


    public void setHolder(Type holder) {
        this.holder = holder;
    }
}
