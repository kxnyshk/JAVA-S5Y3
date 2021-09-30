public class ArrayIndex {
    
    static{
    
        System.out.println("This program finds out the array index where the sum of left half of the array equals the right half.");
    }
    public static void main(String[] args){
    
        int[] array = {1,2,3,4,10,20,40,90};
        int n = array.length;
        int sum = sum(array, n);
        // System.out.println(sum);
        System.out.println("\nInput array: ");
        for(int num:array){
            System.out.print(num + " ");
        }

        int idx = Index(array, n, sum);
        if(idx<n){
            System.out.println("\n\nSum to the left of Array Index --> " + idx + " equals to its right.\n");
        }
    }

    public static int Index(int[] array, int n, int sum) {
        
        int i;
        int left = 0;
        int right = sum;
        boolean found = false;
        
        for(i=0; i<n; i++){
            left += array[i];
            right -=array[i];
            if(left == right){
                found = true;
                break;
            }
        }

        if(found==false){
            System.out.println("\n\nNo suitable Array Index found.\n");
        }
        return i;
    }
    
    public static int sum(int[] array, int n) {
        
        int sum=0;
        for(int i=0; i<n; i++){
            sum += array[i];
        }
        return sum;
    }
}
