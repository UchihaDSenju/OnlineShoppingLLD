package commons;

import java.util.Scanner;
import controller.*;

public abstract class Screen {
    protected Scanner sc;
    protected Controller controller = Controller.getControllerInstance();

    public Screen(Scanner sc){
        this.sc = sc;
    }

    protected void print(String s){
        System.out.print(s);
    }

    protected void println(String s){
        System.out.println(s);
    }

    public static void startScreen(Screen screen){
        screen.runScreenLoop();
    }

    protected void moveToScreen(Screen screen){
        screen.runScreenLoop();
    }

    public abstract void runScreenLoop();
}
