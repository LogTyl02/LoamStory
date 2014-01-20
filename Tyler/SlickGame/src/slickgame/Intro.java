package slickgame;

import java.util.HashSet;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Intro extends BasicGameState {
    Image presents;
    float time;
    
    public Intro(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        time = 0;
        presents = new Image("res/art/background/intro/presents.png");
        presents.setAlpha(0);
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        g.clear();
        presents.draw(0, 0);
        g.drawString("Timer: " + time, 30, 30);
        g.drawString("Press Enter to skip", 30, 80);
        
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
            Input input = gc.getInput();
        
            
            
            time += 0.01f;
            if (time < 180) {
            presents.setAlpha(presents.getAlpha() + 0.0001f);
            }
            
            if (time > 200) {
                presents.setAlpha(presents.getAlpha() - 0.001f);
            }
            
            if (input.isKeyDown(Input.KEY_ENTER)) {
                sbg.enterState(1);
            }
    }
    
    public int getID() {
        return 0;
    }
    
}
