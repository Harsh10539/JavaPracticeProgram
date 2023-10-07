public class Practice_85 {
    public static void main(String[] args){
        Pen1 p = new Pen1();
        p.setColor("Pink");
        System.out.println(p.getColor());
        // p.setTip(5);
        // System.out.println(p.getTip());
    }
}
class Pen1{
    private String color;
    //private int tip;
    String getColor(){
        return color;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
}