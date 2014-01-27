package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Death extends BasicGameState {
    Image death;
    //Color c = Color.pink;
    
    public Death(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        death = new Image("res/art/background/you_are_dead.jpg");
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("You are dead.", 50, 50);
        death.draw(0, 0);
        //g.setBackground(c);
        
        
        
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
    
        
        //c = c.darker(2f);
    }
    
    public int getID() {
        return 4;
    }
    
}
