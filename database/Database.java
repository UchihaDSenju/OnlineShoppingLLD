package database;
import java.util.ArrayList;

import commons.Enums.Type;
import model.*;
public class Database {

    private static volatile Database databaseInstance = null;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product> transactions = new ArrayList<>();
    private ArrayList<Product> coupons = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    private Database(){}

    public static Database getDatabaseInstance(){
        if(databaseInstance == null){
            databaseInstance = new Database();
        }
        return databaseInstance;
    }

    // Read
    public User getUser(int userId){
        for(User user : users){
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }
    // Write
    public boolean createAccount(String uName, String name, String password){
        users.add(new User(name, Type.CUSTOMER));
        return true;
    }
    
}
