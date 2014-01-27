package mushroomtest;


public class Tile {
    public static String GRASS = "Grass";
    public static String DIRT  = "Dirt";
    private String ROCK  = "Rock";
    private String WATER = "Water";
    private String TREE  = "Tree";
    private static boolean containsMushroom;
    public static String material = GRASS;
    
    
    public Tile(String material, boolean containsMushroom) {
        this.material = material;
        this.containsMushroom = containsMushroom;
    }
    
    public boolean hasMushroom() {
        return this.containsMushroom;
    }
}
