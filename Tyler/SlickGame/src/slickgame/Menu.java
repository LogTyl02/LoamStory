package slickgame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.awt.Font;
import static org.lwjgl.opengl.GL11.*;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.opengl.*;

import static org.newdawn.slick.opengl.renderer.SGL.GL_BLEND;
public class Menu extends BasicGameState {
    
    private static final String TITLE = "'Loam Story', or: 'Hunting for Mushrooms in All the Wrong Places'";
    private static final String START = "Traverse the darkness...";
    Font awtFont;
    UnicodeFont unicodeFont;
    
    
    
    public Menu(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        setUpFonts();
    }
    
    /*
        Draw Menu Stuff!
    */
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
        g.setFont(unicodeFont);
        g.drawString(TITLE, 30, 100);
        g.drawRect(30, 150, unicodeFont.getWidth(TITLE), 300);
        
        Image dragon = new Image("res/art/sprite/reddragon.png");
        g.drawImage(dragon, 300, 0);
        
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
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
