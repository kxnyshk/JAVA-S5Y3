public class Queue {
    
    static{
    
        System.out.println("This program implements Queue.\n");
    }
    public static void main(String[] args){
    
        queue1 q = new queue1();
        q.peek();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.peek();
        q.dequeue();
        q.dequeue();
        q.peek();
        q.show();
    }
}

class queue1{

    int n = 5;
    int[] queue =  new int[n];
    int front = 0;
    int rear = -1;

    void enqueue(int data){
        if(rear>=n-1){
            System.out.println("Queue overflow..\n");
        }
        else{
            System.out.println(data + " enqueued..\n");
            queue[rear+1] = data;
            ++rear;
        }
    }

    void dequeue(){
        if(queue[front]==0){
            System.out.println("Queue underflow..\n");
        }
        else{
            System.out.println("Dequeued..\n");
            queue[front] = 0;
            ++front;
        }
    }

    void peek(){
        if(rear==-1){
            System.out.println("Queue empty!\n");
        }
        else{
            System.out.println("Front --> " + queue[front]);
            System.out.println("Rear --> " + queue[rear] + "\n");
        }
    }

    void show(){
        System.out.println("Queue: ");
        for(int i=0; i<n; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("\n");
    }
}