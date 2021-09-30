public class Stacks {
    
    static{
    
        System.out.println("This program implements Stack.");
    }
    public static void main(String[] args){
    
        Stack1 stack = new Stack1();
        stack.show();
        stack.pop();
        stack.peek();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.show();
    }
}

class Stack1{
    
    int n = 5;
    int[] stack = new int[n];
    int top = 0;

    void push(int data){
        if(top>=n){
            System.out.println("Stack overflow..\n");
            --top;
        }
        else{
            stack[top++] = data;
            System.out.println(data + " pushed.\n");
        }
    }

    void pop(){
        if(top==0){
            System.out.println("Stack Underflow!\n");
        }
        else if(top>0 && top<n-1){
            int temp = top-1;
            System.out.println(stack[temp] + " popped..\n");
            stack[temp] = 0;
            --top;
        }
        else if(top==n-1){
            System.out.println(stack[top] + " popped..\n");
            stack[top] = 0;
        }
    }

    void peek(){
        if(top==0){
            System.out.println("Stack empty!\n");
        }
        else{
            int temp = top;
            while(stack[temp]==0){
                temp--;
            }
            System.out.println("Top --> " + stack[temp] + "\n");
        }
    }

    void show(){
        System.out.println("Stack:");
        for(int i=n-1; i>=0; i--){
            System.out.println(stack[i]);
        }
        System.out.print("\n");
    }
}

// int n = 5;
//     int[] stack = new int[n];
//     int top = 0;

//     void push(int data){
//         if(top>=n){
//             System.out.println("Stack overflow..\n");
//             --top;
//         }
//         else{
//             stack[top+] = data;
//             System.out.println(data + " pushed..\n");
//         }
//     }

//     void pop(){
//         int temp = stack[top];
//         stack[top--] = 0;
//         System.out.println(temp + " popped..\n");
//     }

//     void peek(){
//         System.out.println("Top --> " + stack[top] + "\n");
//     }

//     void show(){
//         System.out.println("Stack:");
//         for(int i=n-1; i>=0; i--){
//             System.out.println(stack[i]);
//         }
//         System.out.print("\n");
//     }
