import java.util.*;
public class Practice_182 {
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
    // public static int height(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int lh=height(root.left);
    //         int rh=height(root.right);
    //         return Math.max(lh, rh)+1;
    //     }
    //     public static int count(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int lc=count(root.left);
    //         int rc=count(root.right);
    //         return lc+rc+1;
    //     }
    //     public static int sum(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int leftSum=sum(root.left);
    //         int rightSum=sum(root.right);
    //         return leftSum+rightSum+root.data;
    //     }
    //     public static int diameter(Node root){
    //         if(root==null){
    //             return 0;
    //         }
    //         int ldia=diameter(root.left);
    //         int lh=height(root.left);
    //         int rdia=diameter(root.right);
    //         int rh=height(root.right);
    //         int h=(lh+rh+1);
    //         return Math.max(ldia, Math.max(rdia, h));
    //     }
    //     static class Info{
    //         int diam;
    //         int ht;
    //         public Info(int diam,int ht){
    //             this.diam=diam;
    //             this.ht=ht;
    //         }
    //     }
    //     public static Info diameter1(Node root){
    //         if(root==null){
    //             return new Info(0, 0);
    //         }
    //         Info leftInfo=diameter1(root.left);
    //         Info rightInfo=diameter1(root.right);
    //         int finaldiam=Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
    //         int height=Math.max(leftInfo.ht,rightInfo.ht)+1;
    //         return new Info(finaldiam,height);
    //     }
    //         public static boolean isIdentical(Node root,Node subRoot){
    //             if(root == null && subRoot == null){
    //                 return true;
    //             }else if(root == null||subRoot==null||root.data!=subRoot.data){
    //                 return false;
    //             }
    //             if(!isIdentical(root.left, subRoot.left)){
    //                 return false;
    //             }
    //             if(!isIdentical(root.right, subRoot.right)){
    //                 return false;
    //             }
    //             return true;
    // }
    //         public static boolean isSubTree(Node root,Node subRoot){
    //             if(root==null){
    //                 return false;
    //             }
    //             if(root.data==subRoot.data){
    //                 if(isIdentical(root,subRoot)){
    //                     return true;
    //                 }
    //             }
    //             // boolean leftAns=isSubTree(root.left, subRoot);
    //             // boolean rightAns=isSubTree(root.right, subRoot);
    //             return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
    //         }
    public static void main(String[] args){
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        // Node subRoot= new Node(2);
        // subRoot.left=new Node(4);
        // subRoot.right=new Node(5);
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter1(root).diam);
        // System.out.println(diameter1(root).ht);
        // System.out.println(isSubTree(root, subRoot));
}
}