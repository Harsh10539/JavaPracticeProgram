import java.util.*;
public class Practice_156 {
    public static void main(String[] args){
        Queue q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
