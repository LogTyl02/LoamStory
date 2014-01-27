package loam;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Loam extends StateBasedGame {

    public static final int  WIDTH = 800;
    public static final int  HEIGHT = 600;
    public static final int FPS = 59;
    public static final boolean FULLSCREEN = false;
    public static final String gameName = "Loam";
    
    public Loam(String gameName) {
        super(gameName);
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
        
    }
    
    public static void main(String[] args) {
        AppGameContainer appgc;
        
        Mushroom shroom = new Mushroom(0);
        System.out.println(shroom.mushroomColor());
        System.out.println(World.mushArray);
        
        try {
            appgc = new AppGameContainer(new Loam(gameName));
            appgc.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
            appgc.setTargetFrameRate(FPS);
            appgc.start();
            
        } catch (SlickException e) {
            e.printStackTrace();
        } 
    }
    
}
