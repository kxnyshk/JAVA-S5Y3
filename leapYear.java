import java.util.Scanner;

public class leapYear {
    static{
    
        System.out.println("Checks for Leap year.");
    }
    public static void main(String[] args){
    
        System.out.print("\nEnter the year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(year>=1){

            checkLeap(year);
            System.out.print("Press 1 to re-run. 0 to exit. ");
                run();
        }

        else{

            System.out.println("Enter valid input. [Post 1 Anno Domini]");
            System.out.print("Press 1 to re-run. 0 to exit. ");
                run();
        }
        scan.close();
    }

    public static void checkLeap(int n){

        if(n%4==0){
            if(n%100==0){
                if(n%400==0){

                    System.out.println(n + " is a leap year.\n");
                }

                else{

                    System.out.println(n + " is not a leap year.\n");
                }
            }

            else{

                System.out.println(n + " is a leap year.\n");
            }
        }

        else{
            System.out.println(n + " is not a leap year.\n");
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
