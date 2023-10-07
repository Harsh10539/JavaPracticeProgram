import java.net.Inet4Address;
import java.util.*;
public class Practice_201 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right= delete(root.right, val);
        }else if(root.data>val){
            root.left= delete(root.left, val);
        }else{//voila case
            if(root.left==null && root.right==null){
                return null;
            }if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            return root;
        }
        return root;
    }
    public static void printRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data <=k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }else if(root.data < k1 ){
            printRange(root.left, k1, k2);
        }else{
            printRange(root.right, k1, k2);
        }
    }
    public static void RTL(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }
        RTL(root.left,path);
        RTL(root.right,path);
        path.remove(path.size()-1);

    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        int values[]={8,5,3,1,4,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        // inOrder(root);
        // System.out.println();
        // System.out.println(search(root, 7));
        // root=delete(root, 1);
        // inOrder(root);
        // System.out.println();
        // printRange(root, 6, 12);
        RTL(root,new ArrayList<>());
    }    
}
