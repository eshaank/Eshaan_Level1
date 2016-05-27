import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class sensitivekeyboard extends KeyAdapter{
	JFrame lol = new JFrame();
		public static void main(String[] args) {
			sensitivekeyboard hi = new sensitivekeyboard();
			hi.ouch();
			
		}
	void ouch(){
		
		
	lol.setVisible(true);
	lol.addKeyListener(this);
	}
	
	
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

public void keyPressed(KeyEvent e){
	
	speak("Ow.");
}



}

// Copyright Wintriss Technical Schools 2014

