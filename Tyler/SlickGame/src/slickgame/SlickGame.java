package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class SlickGame extends StateBasedGame {
    /*
        Constants and Similar Wizardly Things
    */
    public static final int     WIDTH           = 1440;
    public static final int     HEIGHT          = 900;
    public static final boolean FULLSCREEN      = false;
    public static final String  gameName        = "Loam Story - Pre-Alpha";
    
    /*
        List of Game States
    */
    public static final int     menu            = 0;
    public static final int     play            = 1;
    public static final int     win             = 2;
    public static final int     death           = 3;
    public static final int     debug           = 9;
    
    public SlickGame(String gameName) {
        super(gameName);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
        this.addState(new Win(win));
        this.addState(new Death(death));
        this.addState(new Debug(debug));
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc, this); // Add menu to the list of states
        this.getState(play).init(gc, this); // Add play to the list of states
        this.getState(win).init(gc, this);  // Win!
        this.getState(death).init(gc, this); // Lose!
        this.getState(debug).init(gc, this); // Razzle Dazzle Root Beer
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
