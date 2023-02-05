class Point{
//Properties / Attributes
    int x;
    int y;
//Constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
//Methods
    public int increamentX(){
        x += 1;
        return x;
    }
    public int increamentY(){
        y += 1;
        return y;
    }
    public int doubleX(){
        x *= 2;
        return x;
    }
    public int doubleY(){
        y *= 2;
        return y;
    }
    //Method for equality
    
}

public class Main{
    public static void main(String[] args) {
        
    }
}