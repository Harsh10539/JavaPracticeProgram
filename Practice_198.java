import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        }
    }
class Practice_198{
    Node root;
    void mirror(){
        root = mirror(root);
        }
    Node mirror(Node node){
        if (node == null)
            return node;
        /* do the subtrees */
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        /* swap the left and right pointers */
        node.left = right;
        node.right = left;
        return node;
        }
    void inOrder(){
        inOrder(root);  
        }
    void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
public static void main(String args[]){
    Practice_198 tree = new Practice_198();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    System.out.println("Inorder traversal of input tree is :");
    tree.inOrder();
    System.out.println("");
    tree.mirror();
    System.out.println("Inorder traversal of binary tree is : ");
    tree.inOrder();
    }
}