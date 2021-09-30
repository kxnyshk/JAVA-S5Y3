package sem5Y3;

import java.util.Scanner;

public class charToStr {
    
    static{
        System.out.println("This JAVA program converts a Char to a String.");
    }
    public static void main(String[] args){

        System.out.println("Enter char:");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        String str = Character.toString(c);
        System.out.println("Converting char to string... " + "' " + str + " '");
    }
}
