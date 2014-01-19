package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Death extends BasicGameState {
    Image forest;
    
    public Death(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("You are dead.", 50, 50);
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
    }
    
    public int getID() {
        return 3;
    }
    
}
