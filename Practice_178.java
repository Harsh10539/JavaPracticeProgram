import java.util.*;
public class Practice_178 {
    public static void main(String[] args){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins=0;
        int ammount=590;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=ammount){
                while(coins[i]<=ammount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    ammount-=coins[i];
                }
            }
        }
        System.out.println(countOfCoins);
        for(int i=0;i<ans.size();i++){
        System.out.println(ans.get(i));
        }
    }
}
