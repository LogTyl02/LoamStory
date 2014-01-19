package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.awt.Font;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import org.newdawn.slick.font.effects.ColorEffect;

public class Menu extends BasicGameState {
    
    private static final String TITLE = "'Loam Story', or: 'Hunting for Mushrooms in All the Wrong Places'";
    private static final String START = "Traverse the darkness";
    private static final String QUIT  = "Escape to the light";
    private static String       MOUSE = "No mouse input detected.";
    Font awtFont;
    UnicodeFont unicodeFont;
    
    Image dragon;
    
    Image shroom;
    int shroomX = 55;
    int shroomY = 130;
    
    public Menu(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        setUpFonts();
        shroom = new Image("res/art/sprite/greenmushroom.png");
        dragon = new Image("res/art/sprite/reddragon.png");
    }
    
    /*
        Draw Menu Stuff!
    */
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
        g.setFont(unicodeFont);
        g.drawString(TITLE, 30, 100);
        g.drawString(MOUSE, 30, 600);
        g.drawString(START, 30, 800);
        g.drawString(QUIT, 300, 800);
        g.drawRect(30, 150, unicodeFont.getWidth(TITLE), 300);
        
        
        g.drawImage(dragon, 300, 0);
        shroom.draw(shroomX, shroomY, 0.5f);
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        
        
        if (input.isKeyDown(Input.KEY_A)) {
            shroomX -= 1;
        } else if (input.isKeyDown(Input.KEY_D)) {
            shroomX += 1;
        } else if (input.isKeyDown(Input.KEY_W)) {
            shroomY -= 1;
        } else if (input.isKeyDown(Input.KEY_S)) {
            shroomY += 1;
        }
        
        
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();
        MOUSE = "Mouse Position x: " + xPos + " y: " + yPos;
        
        if ((xPos > 30 && xPos < 250) && (yPos > 80 && yPos < 95)) {
            if (input.isMouseButtonDown(0)) {
               sbg.enterState(1);
            } else if ((xPos > 300 && xPos < 485) && (yPos > 80 && yPos < 95)) {
                if (input.isMouseButtonDown(0)) {
                    //sbg.closeRequested();
                }
            }
        }
        
    }
    
    public int getID() {
        return 0;
    }
    
    public void setUpFonts() throws SlickException {
        
        awtFont = new Font("Times New Roman", Font.PLAIN, 24);
        unicodeFont = new UnicodeFont(awtFont, 24, true, true);
        unicodeFont.addAsciiGlyphs();
        unicodeFont.addGlyphs(400, 600);
        unicodeFont.getEffects().add(new ColorEffect(java.awt.Color.PINK));
        unicodeFont.loadGlyphs();
        
    }
}
