package views;

import java.util.Scanner;

import commons.Screen;

public class UserPage extends Screen{

    private String name;
    public UserPage(Scanner sc, String name){
        super(sc);
        this.name = name;
    }

    @Override
    public void runScreenLoop() {
        println("Hello Buddy\n");
        println("Welecome" + name);
    }
    
}
