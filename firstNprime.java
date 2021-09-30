import java.util.Scanner;

public class firstNprime {
    static{
    
        System.out.println("Displays the first N primes.");
    }
    public static void main(String[] args){
    
        System.out.print("\nPrint first ___ primes: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n>=1){

            int count = 0;
            int temp = 0;
            System.out.println("\nFirst " + n + " primes:");
            
            for(int i=2; count<n; i++){

                for(int j=2; j<i-1; j++){

                    if(i%j==0){

                        temp = temp + 1;
                    }
                }

                if(temp==0){

                    System.out.println(i);
                        count++;
                }

                else{
                    
                    temp = 0;
                }
            }

            System.out.println("\nPress 1 to re-run. 0 to exit.");
                run();
        }

        else{

            System.out.println("Enter a valid input. [N>=1]");
            System.out.println("Press 1 to re-run. 0 to exit.");
                run();
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
