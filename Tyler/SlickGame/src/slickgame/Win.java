package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Win extends BasicGameState {
    
    public Win(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Congrats, Dr. Balthazar White! A winrar is you!.", 50, 50);
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
    }
    
    public int getID() {
        return 2;
    }
    
}
