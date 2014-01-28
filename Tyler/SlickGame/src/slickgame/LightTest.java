package slickgame;

import java.io.File;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import static org.lwjgl.opengl.GL11.*;
import org.newdawn.slick.*;
import org.newdawn.slick.particles.*;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.state.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL20.glUseProgram;

public class LightTest extends BasicGameState {
   public static final String VERTEX_SHADER_LOCATION = "res/shader/pixel_phong_lighting.vs";
   public static final String FRAGMENT_SHADER_LOCATION = "res/shader/pixel_phong_lighting.fs";
   private static int shaderProgram;
    
    
    static Image tile;
    Image s;
    Color tileColor = Color.darkGray;
    private ParticleSystem system;
    private ConfigurableEmitter emitter;
    float mx;
    float my;
    
    public LightTest(int state) {
        
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //setUpShaders();
        //setUpLighting();
        
        
        
        tile = new Image("res/art/tile/32grasstile.png");
        s = new Image("res/art/sprite/tree.png");
        
        
        
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
        //glUseProgram(shaderProgram);
        drawTiles();
        system.render();
        g.drawString(mx + " " + my, 150, 150);
            
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        
        Input input = gc.getInput();
        tileColor = Color.darkGray;
        system.update(delta);
        mx = input.getMouseX();
        my = input.getMouseY();
        glLight(GL_LIGHT0, GL_POSITION, asFloatBuffer(new float[]{ mx, my, 1.0f, 1.0f}));
        
        
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
    
    private static FloatBuffer asFloatBuffer(float[] values) {
        FloatBuffer buffer = BufferUtils.createFloatBuffer(values.length);
        buffer.put(values);
        buffer.flip();
        return buffer;
    }
    
    private static void setUpShaders() {
        shaderProgram = ShaderLoader.loadShaderPair(VERTEX_SHADER_LOCATION, FRAGMENT_SHADER_LOCATION);
    }
    
    private static void setUpLighting() {
        glShadeModel(GL_SMOOTH);
        //glEnable(GL_DEPTH_TEST);
        glEnable(GL_LIGHTING);
        glEnable(GL_LIGHT0);
        glLightModel(GL_LIGHT_MODEL_AMBIENT, asFloatBuffer(new float[]{0.05f, 0.05f, 0.05f, 1f}));
        glLight(GL_LIGHT0, GL_POSITION, asFloatBuffer(new float[]{0f, 0f, 0f, 1.0f}));
        glLight(GL_LIGHT0, GL_DIFFUSE, asFloatBuffer(new float[]{0.5f, 0.5f, 0.5f, 1.0f}));
        glEnable(GL_COLOR_MATERIAL);
        glColorMaterial(GL_FRONT, GL_DIFFUSE);
        
    }
    
    private static void drawTiles() {
        for (int i = 0; i <= SlickGame.HEIGHT; i += 32) {
            for (int j = 0; j <= SlickGame.WIDTH; j += 32) {
                tile.draw(j, i);
            }
        }
    }
}
