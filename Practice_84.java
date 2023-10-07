public class Practice_84 {
    public static void main(String[] args){
        BankAcc b= new BankAcc();
        System.out.println(b.username="Harsh");
        b.setPassword("xyz");
    }
}
class BankAcc{
    public String username;
    private String password="abc";
    void setPassword(String newp){
        password=newp;
        System.out.println(password);
    }
    
}
