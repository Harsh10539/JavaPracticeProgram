 public class Practice_145 {
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
            head=tail=newNode;
            return;
        }
        //Step 2 
        newNode.next = head;
        //Step 3=head=newHead
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void pP(){
        
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
        }
        Node newNode= new Node(data);
        Node tmp=head;
        int i=0;
        while(i<idx-1){
            tmp=tmp.next;
            i++;
        }
        newNode.next=tmp.next;
        tmp.next=newNode;
    }
    public void reverse(){
        Node prev=null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static boolean isCycle(){
        Node slow =head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow =head;
        Node fast =head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow =head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null; 
    }
    public static void main(String[] args){
        Practice_145 ll= new Practice_145();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        head.next.next.next=head;
        // l.add(1,9);
        // l.pP();
        // l.reverse();
        // l.pP();
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
