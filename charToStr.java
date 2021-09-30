import java.util.Scanner;

public class charToStr {
    
    static{
        System.out.println("This JAVA program converts Char to a String.\n");
    }
    public static void main(String[] args){

        System.out.println("Enter char:");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        System.out.print("\n");
        String str = Character.toString(c);
        System.out.println("Converting char to string... " + "' " + str + " '\n");
    }
}
