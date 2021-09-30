import java.util.Scanner;

public class strToChar {
    
    static{
        System.out.println("This JAVA program converts String to Char.\n");
    }
    public static void main(String[] args){

        System.out.println("Enter string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int length = str.length();

        System.out.print("\n");
        for(int i=0; i<length; i++){
            char c = str.charAt(i);
            System.out.println("Char at " + i + ": " + c);
        }
        System.out.print("\n");
    }
}
