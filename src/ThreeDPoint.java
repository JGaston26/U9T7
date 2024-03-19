public class ThreeDPoint extends Point{
    private String name;
    private int z;

    public ThreeDPoint(String name, int x, int y, int z){
        super(name,x,y);
        this.z = z;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof ThreeDPoint)){
            return false;
        }
        ThreeDPoint other = (ThreeDPoint) obj;
        if(super.equals(other) && this.z == other.z){
            return true;
        }
        return false;
    }
}
