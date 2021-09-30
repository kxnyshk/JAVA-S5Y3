import java.util.Scanner;

public class multiplyDoubles {
    static{
    
        System.out.println("Product of 2 doubles.");
    }
    public static void main(String[] args){
    
        System.out.print("\nEnter the two doubles: ");
        Scanner scan = new Scanner(System.in);
        Double d1 = scan.nextDouble();
        Double d2 = scan.nextDouble();

        prod(d1, d2);
        
        System.out.print("Press 1 to re-run. 0 to exit. ");
            run();

        scan.close();
    }

    public static void prod(Double n, Double m){

        Double prod = n*m;
        System.out.println("Product: " + prod + "\n");
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
