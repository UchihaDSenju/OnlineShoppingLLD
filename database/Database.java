package database;
import java.util.ArrayList;

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
    
}
