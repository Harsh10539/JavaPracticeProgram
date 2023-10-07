import java.util.*;
public class Practice_189{
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
    public static Node lCA1(Node root,int n1,int n2){
        if(root==null||root.data==n1||root.data == n2){
            return root;
        }
        Node leftLCA=lCA1(root.left,n1,n2);
        Node rightLCA=lCA1(root.right,n1,n2);
        if(rightLCA==null){
            return leftLCA;
        }
        if(leftLCA==null){
            return rightLCA;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDis=lcaDist(root.left, n);
        int rightDis=lcaDist(root.right, n);
        if(leftDis==-1&&rightDis==-1){
            return -1;
        }else if(leftDis==-1){
            return rightDis+1;
        }else{
            return leftDis+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=lCA1(root, n1, n2);
        int dis1=lcaDist(lca,n1);
        int dis2=lcaDist(lca,n2);
        return dis1+dis2;
    }
    public static void main(String[] args){
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(minDist(root, 4, 6));
    }
}