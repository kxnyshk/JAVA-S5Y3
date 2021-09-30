import java.util.Scanner;

public class charToascii {
    
    static{
        System.out.println("This program prints the ASCII value of the desired char you want to see.\n");
    }
    public static void main(String[] args){

        System.out.println("Enter the char:");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            
            int ascii = c;

            System.out.println("\nChar: " + c);
            System.out.println("ASCII value: " + ascii);

            System.out.println("\nPress 1 to re-run. 0 to exit.");
            run();
        }

        else{

            System.out.println("Enter only a valid char.");
            System.out.println("Press 1 for syntax. 0 to exit.");

            press();
        }

        
    }

    public static void press(){

        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        if(key==1){
            System.out.println("Valid syntax: 'a-z' OR 'A-Z'.");
            main(null);
        }

        else if(key==0){
            return;
        }

        else{
            System.out.println("Only enter 1 or 0.");
            press();
        }
    }

    public static void run(){

        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        if(key==1){
            main(null);
        }

        else if(key==0){
            return;
        }

        else{
            System.out.println("Only enter 1 or 0.");
            run();
        }
        
    }
}
