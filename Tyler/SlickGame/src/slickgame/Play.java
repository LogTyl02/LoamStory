package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    boolean quit = false;
    Image forest;
    Image tree;
    Image doctor;
    int[] duration = {200, 200}; // Duration of each frame in the animation
    float doctorPosX = 500;
    float doctorPosY = 500;
    float shiftX   = doctorPosX + SlickGame.WIDTH / 2;  // Attempting to keep the sprite in the middle, and move the map underneath
    float shiftY   = doctorPosY + SlickGame.HEIGHT / 2;
  
            
    
    
    
    public Play(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        forest = new Image("res/art/background/darkforest.jpg");
        tree = new Image("res/art/sprite/tree.png");
        doctor = new Image("res/art/sprite/doc.png");
        
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(forest, 0, 0);
        g.drawImage(tree, 200, 100);
        g.drawImage(doctor, doctorPosX, doctorPosY);
        
        
        
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
        
    
        } else if (input.isKeyDown(Input.KEY_ESCAPE)) {
            quit = true;
        } else if (input.isKeyDown(Input.KEY_W)) {
            doctorPosY -= 3;
        } else if (input.isKeyDown(Input.KEY_S)) {
            doctorPosY += 3;
        } else if (input.isKeyDown(Input.KEY_A)) {
            doctorPosX -= 3;
        } else if (input.isKeyDown(Input.KEY_D)) {
            doctorPosX += 3;
        }
    }
    
    public int getID() {
        return 2;
    }
    
}
