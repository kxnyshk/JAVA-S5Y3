import java.util.Scanner;

public class nPrime {
    
    static{
    
        System.out.println("This program prints you out the prime numbers until N, based on your input.");
    }
    public static void main(String[] args){
    
        System.out.println("Printing primes until... ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n>=2){

            int temp = 0;
            System.out.println("<---------->");
            System.out.println("Primes until " + n + ":");

            for(int i=2; i<=n; i++){
                
                for(int j=2; j<=i-1; j++){

                    if(i%j==0){

                        temp = temp + 1;
                    }
                }

                if(temp==0){
                    System.out.println(i);
                }

                else{
                    temp = 0;
                }
            }

            System.out.println("Press 1 to re-run. 0 to exit.");
                run();
        }

        else{

            System.out.println("Enter a valid entry. [N>=2]");
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
