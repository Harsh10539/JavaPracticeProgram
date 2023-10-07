import java.util.Stack;

public class Practice_153 {
    public static int maxWater(int[] heigth){
        Stack<Integer> stack = new Stack<>();
        int n=heigth.length;
        int ans=0;
        for(int i=0;i<n;i++){
            while((!stack.isEmpty())&&(heigth[stack.peek()]<heigth[i])){
                int pop_height=heigth[stack.peek()];
                stack.pop();
                if(stack.isEmpty())
                    break;
                int distance=i-stack.peek()-1;
                int min_height=Math.min(heigth[stack.peek()],heigth[i])-pop_height;
                ans+=distance*min_height;
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={7,0,4,2,5,0,6,4,0,5};
        System.out.println(maxWater(arr));
    }
}
 