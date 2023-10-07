public class Practice_154 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue (int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        //Empty Check
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;//that's why front can not exceed;
        }
        //Add function
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        //Remove function
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];

            //last element deleted
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;            
            }
            return result;
        }
        // Peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args){
        Queue Q = new Queue(3);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        System.out.println(Q.remove());
        Q.add(4);
        System.out.println(Q.remove());
        Q.add(5);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}

