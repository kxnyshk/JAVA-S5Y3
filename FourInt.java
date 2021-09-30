import java.util.Random;

public class FourInt {
    
    static{
    
        System.out.println("This program displays out the average of the array.");
    }
    public static void main(String[] args){
    
        Random randNum = new Random();

        int n = 4;
        int sum = 0;
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = randNum.nextInt(100)+1;   // genrate and stores random numbers (1-100) in the array
            sum += array[i];
        }
        
        System.out.println("\nArray: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        double avg = (double) sum/n;
        System.out.println("\n\nAverage: " + avg + "\n");

    }
}
