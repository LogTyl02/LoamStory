package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    Image forest;
    
    public Play(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        forest = new Image("res/art/background/darkforest.jpg");
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(forest, 0, 0);
        g.drawString("This is the darkness.", 50, 50);
        
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
        } else if (input.isKeyDown(Input.KEY_9)) {
            // Debug
            sbg.enterState(9);
        }
    }
    
    public int getID() {
        return 1;
    }
    
}
