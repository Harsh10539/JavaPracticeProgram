public class Practice_82 {
   public static void main(String[] args){
    Student s1 = new Student();
    System.out.println(s1.name);
     s1.percentage(100, 100);
   } 
}
class Student{
    String name="Harsh Kumar";
    int age=26;
    void percentage(int math,int phy){
        int pre=(math+phy)/2;
        System.out.println(pre);
    }

}
