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


    public boolean checkLogin(String uName, String password){
        return true;
    }
}
