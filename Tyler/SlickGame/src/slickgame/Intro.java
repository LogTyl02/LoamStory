package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Intro extends BasicGameState {
    Image presents;
    Image loam;
    float time;
    float loamAlpha;
    float presentsAlpha;
    
    public Intro(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        time = 0;
        presents = new Image("res/art/background/intro/presents.png");
        loam = new Image("res/art/background/intro/loam.png");
        presents.setAlpha(0);
        loam.setAlpha(0);
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        g.clear();
        presents.draw(0, 0);
        loam.draw(0,0);
        g.drawString("Timer: " + time, 30, 30);
        g.drawString("Press Enter to skip", 30, 80);
        
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
            presentsAlpha = presents.getAlpha();
            loamAlpha     = loam.getAlpha();
            Input input = gc.getInput();
        
            
            
            time += 0.1f;
            if (time > 10 && time < 20) {
            presents.setAlpha(presentsAlpha + 0.008f);
            }
            
            if (time > 50) {
                presents.setAlpha(presentsAlpha - 0.008f);
            }
            
            if (time > 70) {
                loam.setAlpha(loamAlpha + 0.005f);
            }
            
            if (time > 105) {
                loam.setAlpha(loamAlpha - 0.01f);
            }
            
            if (time > 150) {
                sbg.enterState(1);
            }
            
            if (input.isKeyDown(Input.KEY_ENTER)) {
                sbg.enterState(1);
                
            }
    }
    
    public int getID() {
        return 0;
    }
    
}
