public class Practice_217 {
    static class Node{
        Node Children[]=new Node[26];
        boolean eow=false;
        Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0; level<word.length(); level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx] = new Node();
            }
            curr =curr.Children[idx];
        }
        curr.eow=true;
    }
    public static void search(String key){
        Node curr=root;
        for(int level=0; level<key.length(); level++){
            int idx=key.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx] = new Node();
            }
            curr =curr.Children[idx];
        }
        curr.eow=true;
    }
    public static void main(String[] args){
        String[] words={"the","a","there","their","any","three"};
        for(int i=0;i<words.length;i++){
        insert(words[i]);
        }
    }    
}
