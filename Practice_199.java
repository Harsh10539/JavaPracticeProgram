class Practice_199 {
    static class Node {
    int data;
    Node left, right;
    }
    static Node newNode(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.left = null;
    newNode.right = null;
    return (newNode);
    }
    static Node deleteLeaves(Node root, int x){
    if (root == null)
    return null;
    root.left = deleteLeaves(root.left, x);
    root.right = deleteLeaves(root.right, x);
    if (root.data == x && root.left == null && root.right == null) {
    return null;
    }
    return root;
    }
    static void inorder(Node root){
        if (root == null)
        return;
        inorder(root.left);
        System.out.print(root.data + " ");
inorder(root.right);
}
public static void main(String[] args){
Node root = newNode(10);
root.left = newNode(3);
root.right = newNode(10);
root.left.left = newNode(3);
root.left.right = newNode(1);
root.right.right = newNode(3);
root.right.right.left = newNode(3);
root.right.right.right = newNode(3);
deleteLeaves(root, 3);
System.out.print("Inorder traversal after deletion : ");
inorder(root);
}
}