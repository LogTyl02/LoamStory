package loam;

public class Mushroom {
    private int BLUE = 0;
    private int RED = 1;
    private int GOLD = 2; 
    private int color;
    
    public Mushroom(int color) {
        this.color = color;
    }
    
    public int mushroomColor() {
        return this.color;
    }
}
