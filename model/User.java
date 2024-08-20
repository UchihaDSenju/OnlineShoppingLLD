package model;

import commons.Enums.Type;

public class User {
    static int idGen = 7342;
    private int userId;
    private String userName;
    private String name;
    private String password;
    private Type holder;


    public User(String userName, String name, String password, Type holder) {
        this.userId = idGen++;
        this.userName = userName;
        this.name = name;
        this.password = password;
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


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
