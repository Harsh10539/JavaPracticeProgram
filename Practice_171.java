public class Practice_171 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public Node getIntersectionNode(Node head1,Node head2){
            while(head2!=null){
                Node tmp=head1;
                while(tmp!=null){
                    if(tmp==head2){
                        return head2;
                    }
                    tmp=tmp.next;
                }
                head2=head2.next;
            }
        return null;
    }
    public static void main(String[] args){
        Practice_171 p=new Practice_171();
        Node head1,head2;
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersectionPoint= p.getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        }else {
            System.out.print("Intersection Point: "+ intersectionPoint.data);
        }  
    }
}
