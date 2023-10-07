public class Practice_144 {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=null;
            return;
        }
        //Step 2 
        newNode.next = head;
        //Step 3=head=newHead
        head=newNode;
    }
    public static void main(String[] args){
    Practice_144 l= new Practice_144();
        l.addFirst(1);
        l.addFirst(2);
        System.out.println(l);
    }
}
