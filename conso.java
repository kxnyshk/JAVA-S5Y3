import java.util.Scanner;

public class conso {
    
    static{
        System.out.println("Checks the input to be vowel or consonant.");
    }
    public static void main(String[] args){
        
        System.out.println("\nEnter the char:");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);

        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            switch(c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':{
                    System.out.println("Char: " + c + " is a vowel.\n");
                        break;
                }
                default:{
                    System.out.println("Char: " + c + " is a consonant.\n");
                        break;
                }
            }

            System.out.println("Press 1 to re-run. 0 to exit.");
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
