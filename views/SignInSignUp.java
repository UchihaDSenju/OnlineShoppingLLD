package views;

import java.util.*;

import commons.Screen;
import model.*;

public class SignInSignUp extends Screen{

    public SignInSignUp(Scanner sc){
        super(sc);
    }

    @Override
    public void runScreenLoop() {
        println("Welecome to Online Shopping");
        while(true){
            println("1)Login\n2)Signup");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    print("uName: ");
                    String userName = sc.nextLine();
                    print("password");
                    String password = sc.nextLine();
                    User user = controller.checkLogin(userName, password);
                    if(user!=null){
                        moveToScreen(new UserPage(sc, user.getName()));
                    }
                    else{
                        System.out.println("Enter correct credentials");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    println("Enter correct option");
            }
        }
    }
    
}
