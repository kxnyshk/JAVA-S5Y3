import java.util.Scanner;

public class evenOdd {
    static{
    
        System.out.println("Checks if input integer is Even or Odd.");
    }
    public static void main(String[] args){
    
        System.out.print("\nEnter the integer: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        oddEven(n);

        System.out.print("Press 1 to re-run. 0 to exit. ");
            run();

        scan.close();
    }

    public static void oddEven(int i){

        if(i%2==0){

            System.out.println(i + " is even.\n");
        }
        else{
            System.out.println(i + " is odd.\n");
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
        scan.close();
    }
}
