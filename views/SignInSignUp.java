package views;

import java.util.*;

import commons.Screen;

public class SignInSignUp extends Screen{

    public SignInSignUp(Scanner sc){
        super(sc);
    }

    @Override
    public void runScreenLoop() {
        while(true){
            println("Welecome to Online Shopping");
            println("1)Login\n2)Signup");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    print("uName: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    print("password");
                    String password = sc.nextLine();
                    if(controller.checkLogin(userId, password)){
                        moveToScreen(new UserPage(sc));
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
