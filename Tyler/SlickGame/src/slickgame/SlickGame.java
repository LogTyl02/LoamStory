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
    public static final int     FPS             = 59; // -1 cuz it starts at 0
    public static final String  gameName        = "Loam - Pre-Alpha";
    
    
    /*
        List of Game States
    */
    public static final int     intro           = 0;
    public static final int     menu            = 1;
    public static final int     play            = 2;
    public static final int     win             = 3;
    public static final int     death           = 4;
    public static final int     sound_debug     = 8;
    public static final int     debug           = 9;
    
    public SlickGame(String gameName) {
        super(gameName);
        this.addState(new Intro(intro));
        this.addState(new Menu(menu));
        this.addState(new Play(play));
        this.addState(new Win(win));
        this.addState(new Death(death));
        this.addState(new Debug(debug));
        this.addState(new SoundDebug(sound_debug));
    }
    
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(intro).init(gc, this);
        this.getState(menu).init(gc, this);        // Add menu to the list of states
        this.getState(play).init(gc, this);        // Add play to the list of states
        this.getState(win).init(gc, this);         // Win!
        this.getState(death).init(gc, this);       // Lose!
        this.getState(sound_debug).init(gc, this); // Sound debug
        this.getState(debug).init(gc, this);       // Razzle Dazzle Root Beer
        this.enterState(intro);                    // The first screen is the intro
    }
    
    public static void main(String[] args) {
        AppGameContainer appgc;
        
        try {
            appgc = new AppGameContainer(new SlickGame(gameName));
            appgc.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
            appgc.setTargetFrameRate(FPS);
            appgc.start();
            
        } catch (SlickException e) {
            e.printStackTrace();
        } 
        
    }
    
}
