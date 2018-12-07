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
public class Inimigo extends Base  {
    
     private double poszinimmigo=-15;
     private double incG=0.02;
     GLUT glut = new GLUT();
     int x;
     int cor;
    
    
    
    
    public void mover(){
        
          poszinimmigo=poszinimmigo+incG;
    }
    
    public void desenhar_inimigo(GL2 gl) {
            
       gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        gl.glTranslated(x, 0.5, poszinimmigo);
        gl.glScaled(1,0.75,1);
        glut.glutWireCube(1);
       gl.glPopMatrix();
     
      gl.glPushMatrix();
       gl.glTranslated(x, 0.5, poszinimmigo);
       gl.glScaled(0.5,0.5,0.5);
       gl.glColor3f(1, cor, cor);
       glut.glutWireCube(1);
      gl.glPopMatrix();
    }

}
