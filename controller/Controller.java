package controller;
import database.*;
import model.*;
public class Controller {
    private static volatile Controller controllerInstance = null;
    private Database db = Database.getDatabaseInstance();

    private Controller(){}

    public static Controller getControllerInstance(){
        if(controllerInstance == null){
            controllerInstance = new Controller();
        }

        return controllerInstance;
    }


    public User checkLogin(String userName, String password){
        User user = db.getUser(userName);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public boolean signUpUser(String uName, String name, String password){
        return db.createAccount(uName, name, password);
    }

}
