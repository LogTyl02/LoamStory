package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Debug extends BasicGameState {
    Image tile;
    public Debug(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
        tile = new Image("res/art/tile/test.png");
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        g.drawString("Razzle Dazzle Root Beer!", 50, 50);
        
        // Draw some tiles
        /*
            Doing it this way comes with a huge FPS hit. It's running the loop every
            frame. Should use a loop to build a single image from the tiles and then lay
            that one image down.
        */
        for (int i = 0; i <= SlickGame.WIDTH; i += 30) {
            for (int j = 500; j >= 100; j -= 30) {
                tile.draw(i, j);
            }
        }
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
        return 9;
    }
    
}
