package controller;
import database.*;
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


    public boolean checkLogin(int userId, String password){
        if(db.getUser(userId) != null) return true;
        return false;
    }

    public boolean signUpUser(String uName, String name, String password){
        return db.createAccount(uName, name, password);
    }

}
