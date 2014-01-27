package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.awt.Font;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.particles.*;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Menu extends BasicGameState {
    
    private static final String TITLE = "'Loam Story', or: 'Hunting for Mushrooms in All the Wrong Places'";
    private static final String START = "1. Traverse the darkness";
    private static final String QUIT  = "2. Escape to the light"; // Non functional atm
    private static String       MOUSE = "No mouse input detected.";
    private static String       STATES = "Press: 0. For Menu 1. For Play 2. For Win 3. For Death 9. For Debug";
    private static String       CURSOR = "-->";
    Font awtFont;
    UnicodeFont unicodeFont;
    Image fog1;
    Image fog2;
    private static float fog1x = -1200;
    private static float fog2x = 0;
    private static float fogy = 400;
    private static int cursorPosY = 100;
    FadeOutTransition fade;
    
    
    public Menu(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        setUpFonts();
        fog1 = new Image("/res/art/fog001.png");
        fog2 = new Image("/res/art/fog002.png");
        fade = new FadeOutTransition(Color.white, 5);
        
    }
    
    /*
        Draw Menu Stuff!
    */
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
        g.setFont(unicodeFont);
       
        g.drawRect(50, 100, SlickGame.WIDTH - 100, SlickGame.HEIGHT - 400);
        fog1.draw(fog1x, fogy);
        fog2.draw(fog2x, fogy);
        unicodeFont.drawString(60, cursorPosY, CURSOR);
        unicodeFont.drawString(100, 100, START);
        unicodeFont.drawString(100, 125, QUIT);
        
        
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        if (fog2x >= -1950 + SlickGame.WIDTH) {
            fog2x -= 0.1f;
        } else fog2x += 0.1f;
        fog1x += 0.1f;
        
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
        } else if (input.isKeyDown(Input.KEY_S)) {
            cursorPosY = 125;
        } else if (input.isKeyDown(Input.KEY_W)) {
            cursorPosY = 100;
        } else if (input.isKeyDown(Input.KEY_F)) {
            fade.init(sbg.getState(1), sbg.getState(2));
        }
    }
    
    public int getID() {
        return 1;
    }
    
    public void setUpFonts() throws SlickException {
        
        //awtFont = new Font("Comic Sans", Font.PLAIN, 18);
        unicodeFont = new UnicodeFont("/res/text/TlwgTypewriter-Bold.ttf", 18, true, false);
        unicodeFont.addAsciiGlyphs();
        unicodeFont.addGlyphs(400, 600);
        unicodeFont.getEffects().add(new ColorEffect(java.awt.Color.WHITE));
        unicodeFont.loadGlyphs();
        
    }
}
