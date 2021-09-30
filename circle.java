import java.util.Scanner;

public class circle {
    static{
    
        System.out.println("Displays area of a circle.");
    }
    public static void main(String[] args){
    
        System.out.print("\nEnter the radius: ");
        Scanner scan = new Scanner(System.in);
        Double r = scan.nextDouble();

        area(r);

        System.out.print("Press 1 to re-run. 0 to exit. ");
            run();

        scan.close();
    }

    public static void area(Double radi){

        if(radi>0){

            Double area;
            area = Math.PI*Math.pow(radi, 2);

            System.out.println("Area: " + String.format("%.2f",area) + "\n");
        }
        
        else{

            System.out.println("Invalid input. [r>0]");
        }
    }

    public static void run(){

        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        scan.close();

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
