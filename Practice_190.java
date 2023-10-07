public class Practice_190{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // public static int kAncestor(Node root,int n,int k){
    //     if(root==null){
    //         return -1;
    //     }
    //     if(root.data==n){
    //         return 0;
    //     }
    //     int leftDis=kAncestor(root.left, n, k);
    //     int rightDis=kAncestor(root.right, n, k);
    //     if(leftDis==-1 && rightDis ==-1){
    //         return -1;
    //     }
    //     int max=Math.max(leftDis,rightDis);
    //     if(max+1==k){
    //         System.out.println(root.data);
    //     }
    //     return max+1;
    // }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }
    public static void preOrder(Node root){
        if(root==null){   
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // kAncestor(root, 5, 1);
        
        transform(root);
        preOrder(root);
    }
}