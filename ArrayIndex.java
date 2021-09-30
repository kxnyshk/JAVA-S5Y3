public class ArrayIndex {
    
    static{
    
        System.out.println("Array idx where sum of the left half equals the right half.");
    }
    public static void main(String[] args){
    
        int[] array = {1,2,3,4,10,20,40};
        int n = array.length;
        int sum = sum(array, n);
        // System.out.println(sum);
        System.out.print("\nInput array: ");
        for(int num:array){
            System.out.print(num + " ");
        }

        int idx = Index(array, n, sum);
        if(idx<n){
            System.out.println("\n\nSum left of index '" + idx + "' equals its right.\n");
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
