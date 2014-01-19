package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    boolean quit = false;
    Image forest;
    SpriteSheet koro;
    Image k;
    Animation koroAnim, movingUp, movingDown, movingLeft, movingRight;
    int[] duration = {200, 200}; // Duration of each frame in the animation
    float koroPosX = 0;
    float koroPosY = 0;
    float shiftX   = koroPosX + SlickGame.WIDTH / 2;  // Attempting to keep the sprite in the middle, and move the map underneath
    float shiftY   = koroPosY + SlickGame.HEIGHT / 2;
    
    
    
    public Play(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        forest = new Image("res/art/background/darkforest.jpg");
        
        koro = new SpriteSheet("res/art/sprite/korosprite.png", 30, 28);
        koroAnim = new Animation(koro, 100);
        koroAnim.setAutoUpdate(true);
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(forest, 0, 0);
        g.drawString("This is the darkness.", 50, 50);
        koroAnim.draw(600, 600);
        
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
        } else if (input.isKeyDown(Input.KEY_ESCAPE)) {
            quit = true;
        }
    }
    
    public int getID() {
        return 1;
    }
    
}
