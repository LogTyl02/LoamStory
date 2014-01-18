/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState {
    
    public Play(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("This is the darkness.", 50, 50);
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
    }
    
    public int getID() {
        return 1;
    }
    
}
