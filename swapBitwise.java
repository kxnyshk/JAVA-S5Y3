import java.util.Scanner;

public class swapBitwise {
    
    static{
        System.out.println("This JAVA program swaps two values using a Bitwise (^) operator.\n");
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int x = scan.nextInt();

        System.out.println("\nEnter the second value:");
        int y = scan.nextInt();

        System.out.println("\nBefore swapping: x = " + x + " | y = " + y);

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("\nAfter swapping: x = " + x + "  | y = " + y + "\n");        
    }
}
