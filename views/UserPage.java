package views;

import java.util.Scanner;

import commons.Screen;

public class UserPage extends Screen{

    public UserPage(Scanner sc){
        super(sc);
    }

    @Override
    public void runScreenLoop() {
        print("User Page");
    }
    
}
