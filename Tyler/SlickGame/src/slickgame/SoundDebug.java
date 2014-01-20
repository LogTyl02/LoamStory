package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class SoundDebug extends BasicGameState {
    private Music music;    // Constant, like background music
    private Sound sound;    // For sound effects
    
    public SoundDebug(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        music = new Music("res/audio/music/spook.wav");
        sound = new Sound("res/audio/fx/thump.wav");
        music.loop();
        sound.play();
     
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        g.drawString("Sound Debug!", 50, 50);
        
     
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
        Input input = gc.getInput();
        
        if (input.isKeyDown(Input.KEY_0)) {
            // Menu
            sbg.enterState(0);
        } else if (input.isKeyDown(Input.KEY_1)) {
            sbg.enterState(1);
        } else if (input.isKeyDown(Input.KEY_2)) {
            sbg.enterState(2);
        } else if (input.isKeyDown(Input.KEY_3)) {
            sbg.enterState(3);
        } else if (input.isKeyDown(Input.KEY_8)) {
            sbg.enterState(8);
        } else if (input.isKeyDown(Input.KEY_9)) {
            // Debug
            sbg.enterState(9);
        }
        
        if (input.isKeyDown(Input.KEY_SPACE)) {
            sound.play();
        }
    }
    
    public int getID() {
        return 8;
    }
    
}
