package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class CreateCharacter extends BasicGameState {
    private static String in = "Butts";
    
    public CreateCharacter(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Enter your name: ", 50, 200);
        g.drawString(in, 50, 220);
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        in = in + "a";
        
        if (input.isKeyDown(Input.KEY_0)) {
            // Menu
            sbg.enterState(0);
        } else if (input.isKeyDown(Input.KEY_1)) {
            sbg.enterState(1);
        } else if (input.isKeyDown(Input.KEY_2)) {
            sbg.enterState(2);
        } else if (input.isKeyDown(Input.KEY_3)) {
            sbg.enterState(3);
        } else if (input.isKeyDown(Input.KEY_4)) {
            sbg.enterState(4);
        } else if (input.isKeyDown(Input.KEY_5)) {
            sbg.enterState(5);
        } else if (input.isKeyDown(Input.KEY_8)) {
            sbg.enterState(8);
        } else if (input.isKeyDown(Input.KEY_9)) {
            // Debug
            sbg.enterState(9);
        }
    }
    
    public int getID() {
        return 5;
    }
    
}
