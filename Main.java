import java.util.Scanner;

import commons.Screen;
import views.*;
class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Screen.startScreen(new SignInSignUp(sc));
        }
    }
}