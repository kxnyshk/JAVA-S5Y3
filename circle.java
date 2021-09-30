package sem5Y3;

import java.util.Scanner;

public class circle {
    static{
    
        System.out.println("This program calculates the area of a circle, given it's radii as an user input.");
    }
    public static void main(String[] args){
    
        System.out.println("Enter the radius:");
        Scanner scan = new Scanner(System.in);
        Double r = scan.nextDouble();

        area(r);

        System.out.println("Press 1 to re-run. 0 to exit.");
            run();

        scan.close();
    }

    public static void area(Double radi){

        if(radi>0){

            Double area;
            area = Math.PI*Math.pow(radi, 2);

            System.out.println("Area: " + area);
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
