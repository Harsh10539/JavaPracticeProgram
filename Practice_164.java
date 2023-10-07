public class Practice_164 {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=null;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
    public static void main(String[] args){
        Practice_164 l= new Practice_164();
        l.addFirst(1);
        l.addFirst(2);
        System.out.println(l);
    }
}
