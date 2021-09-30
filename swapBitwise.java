package sem5Y3;

import java.util.Scanner;

public class swapBitwise {
    
    static{
        System.out.println("This JAVA program swaps two values using a Bitwise (^) operator.");
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int x = scan.nextInt();

        System.out.println("Enter the second value:");
        int y = scan.nextInt();

        System.out.println("Before swapping the values: x = " + x + " | y = " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After swapping the values: x = " + x + " | y = " + y);        
    }
}
