package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Win extends BasicGameState {
    
    public Win(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawLine(SlickGame.WIDTH / 2, 0, SlickGame.WIDTH / 2, SlickGame.HEIGHT);
        g.drawLine(0, SlickGame.HEIGHT / 2, SlickGame.WIDTH, SlickGame.HEIGHT / 2);
        g.drawLine(0, 0, SlickGame.WIDTH, SlickGame.HEIGHT);
        g.drawLine(SlickGame.WIDTH, 0, 0, SlickGame.HEIGHT);
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
        return 3;
    }
    
}
