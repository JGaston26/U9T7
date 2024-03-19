public class Point {
    private String name;
    private int x;
    private int y;

    public Point(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Point)){
            return false;
        }
        Point other = (Point) obj;
        if(x == other.x && y == other.y){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
       return  "Name: " + name + " X: " + x + " Y: " + y;
    }
}
