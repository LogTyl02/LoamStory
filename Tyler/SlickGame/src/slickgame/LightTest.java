package slickgame;

import java.io.File;
import org.newdawn.slick.*;
import org.newdawn.slick.particles.*;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.state.*;

public class LightTest extends BasicGameState {
   
    Image tile;
    Color tileColor = Color.darkGray;
    private ParticleSystem system;
    private ConfigurableEmitter emitter;
    
    public LightTest(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        tile = new Image("res/art/tile/test.png");
        
        
        
        try {
            Image particle = new Image("res/art/particle/test_particle.png", false);
            system = new ParticleSystem(particle, 1500);
            File xmlFile = new File("res/art/particle/test_emitter.xml");
            ConfigurableEmitter emitter = ParticleIO.loadEmitter(xmlFile);
            emitter.setPosition(300, 300);
            system.addEmitter(emitter);
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
        system.setBlendingMode(ParticleSystem.BLEND_ADDITIVE);
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        tile.draw(50, 50, tileColor);
        system.render();
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        tileColor = Color.darkGray;
        system.update(delta);
        
        
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
        } else if (input.isKeyDown(Input.KEY_Y)) {
            tileColor = tileColor.brighter();
        }
    }
    
    public int getID() {
        return 10;
    }
    
}
