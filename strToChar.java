package sem5Y3;

import java.util.Scanner;

public class strToChar {
    
    static{
        System.out.println("This JAVA program converts a String to Char.");
    }
    public static void main(String[] args){

        System.out.println("Enter string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int length = str.length();

        for(int i=0; i<length; i++){

            char c = str.charAt(i);
            System.out.println("Char at " + i + ": " + c);
        }
    }
}
