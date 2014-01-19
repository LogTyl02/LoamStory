package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    boolean quit = false;
    Image forest;
    Image tree;
    SpriteSheet koro;
    Image k;
    Animation koroAnim, movingUp, movingDown, movingLeft, movingRight;
    int[] duration = {200, 200}; // Duration of each frame in the animation
    float koroPosX = 500;
    float koroPosY = 500;
    float shiftX   = koroPosX + SlickGame.WIDTH / 2;  // Attempting to keep the sprite in the middle, and move the map underneath
    float shiftY   = koroPosY + SlickGame.HEIGHT / 2;
    
    
    
    public Play(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        forest = new Image("res/art/background/darkforest.jpg");
        tree = new Image("res/art/sprite/tree.png");
        
        koro = new SpriteSheet("res/art/sprite/8366.png", 30, 30);
        koroAnim = new Animation(koro, 100);
        koroAnim.setAutoUpdate(true);
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(forest, 0, 0);
        g.drawImage(tree, 200, 100);
        g.drawString("This is the darkness.", 50, 50);
        koroAnim.draw(koroPosX, koroPosY, 300, 300);
        
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
        } else if (input.isKeyDown(Input.KEY_W)) {
            koroPosY -= 1;
        } else if (input.isKeyDown(Input.KEY_S)) {
            koroPosY += 1;
        } else if (input.isKeyDown(Input.KEY_A)) {
            koroPosX -= 1;
        } else if (input.isKeyDown(Input.KEY_D)) {
            koroPosX += 1;
        }
    }
    
    public int getID() {
        return 1;
    }
    
}
