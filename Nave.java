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
public class Nave extends Base {
    
    private boolean tiro;
    private double g = 0;
    private double incG = 0.2;
    GLUT glut = new GLUT(); 
    
//    public void mover_nave(boolean right, boolean left){
//        if(right && g <= 2)
//            g = g + incG;
//        else
//            if(left && g >= -2)
//                g = g - incG;
//    }


//    public void desenhar_nave(GL2 gl) {
//        gl.glPushMatrix();
//            gl.glColor3f(1, 1, 1);
//            gl.glTranslated(g, 0.5, 0);
//            gl.glScaled(2,0.75,2);
//            glut.glutWireCube(1);
//          gl.glPopMatrix();
//
//          gl.glPushMatrix();
//          gl.glTranslated(g, 0.5, 0);
//                gl.glScaled(0.5,0.5,0.5);
//                gl.glColor3f(0, 0, 1);
//                glut.glutWireCube(1);
//          gl.glPopMatrix();
//
//          gl.glPushMatrix();
//          gl.glTranslated(g, 0.5, 0);
//                gl.glScaled(0.25,0.25,0.25);
//                gl.glColor3f(1, 0, 1);
//                glut.glutWireCube(1);
//          gl.glPopMatrix();     
//    }    

}