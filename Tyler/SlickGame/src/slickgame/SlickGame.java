package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class SlickGame extends StateBasedGame {
    public static final int     WIDTH           = 1440;
    public static final int     HEIGHT          = 900;
    public static final boolean FULLSCREEN      = false;
    public static final String  gameName        = "Loam Story - Pre-Alpha";
    public static final int     menu            = 0;
    public static final int     play            = 1;
    
    public SlickGame(String gameName) {
        super(gameName);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc, this); // Add menu to the list of states
        this.getState(play).init(gc, this); // Add play to the list of states
        this.enterState(menu);              // The first screen is the main menu
    }
    
    public static void main(String[] args) {
        AppGameContainer appgc;
        
        try {
            appgc = new AppGameContainer(new SlickGame(gameName));
            appgc.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
            appgc.start();
            
        } catch (SlickException e) {
            e.printStackTrace();
        } 
        
    }
    
}
