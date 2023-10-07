public class Practice_91 {
    public static void main(String[] args){
        Horse h = new Horse();
        // h.eat();
        // h.walk();
        System.out.println(h.color);
        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        System.out.println(ch.color);
    }
}
abstract class Animals{
    String color;
    Animals(){
        color="brown";
    }
    void eat(){
        System.out.println("Animal Eat");
    }
    abstract void walk();
}
class Horse extends Animals{
    void changeColor(){
        color="darkbrown";
   }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animals{
    void changeColor(){
        color="black";
   }
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}
