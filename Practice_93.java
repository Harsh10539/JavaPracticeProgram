public class Practice_93 {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left,diagonal in all direction");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left,Diagonal by one side");
    }
}