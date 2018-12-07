/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import com.jogamp.opengl.util.gl2.GLUT;
import javax.media.opengl.GL2;

/**
 *
 * @author EU
 */
public class Tiro {
    
    GLUT glut = new GLUT();
    private double vel_tiro;
    private double g;
    
    
    public void desenhar_tiro(GL2 gl) {
      gl.glPushMatrix();
       gl.glTranslated(g, 0.5, vel_tiro);
       gl.glScaled(0.25,0.25,0.25);
       gl.glColor3f(1, 0, 1);
       glut.glutWireCube(1);
      gl.glPopMatrix();
    }
    
    
    public void atirar(){
        
         vel_tiro = vel_tiro - 0.2;
    }
    
}
