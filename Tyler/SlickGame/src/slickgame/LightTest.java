package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class LightTest extends BasicGameState {
   
    Image tile;
    Color tileColor = Color.darkGray;
    
    public LightTest(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        tile = new Image("res/art/tile/test.png");
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        tile.draw(50, 50, tileColor);
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        tileColor = Color.darkGray;
        
        
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
        } else if (input.isKeyDown(Input.KEY_Y)) {
            tileColor = tileColor.brighter();
        }
    }
    
    public int getID() {
        return 10;
    }
    
}
