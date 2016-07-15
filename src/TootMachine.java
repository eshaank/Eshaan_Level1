import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener{ 
	public static void main(String[] args) {
		 TootMachine fart = new TootMachine();
		 fart.poop();
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
 

  void poop(){
	  frame.add(panel);
	  frame.setSize(500, 500);
	  frame.setVisible(true);
	  panel.setVisible(true);
	  button.setVisible(true);
	  
	  panel.add(button);
	  button.setText("I farted");
	  button.addActionListener(this);
	  
	  panel.add(button2);
	  button2.setText("Nic farted");
	  button2.addActionListener(this);
	  
	  panel.add(button3);
	  button3.setText("Hi");  
	  button3.addActionListener(this);
  }
  private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource() == button) {
	playSound("Bean Fart-SoundBible.com-215806729.wav");
}	
if (e.getSource() == button2) {
	playSound("Silly_Farts-Joe-1473367952.wav");
}
if (e.getSource() == button2) {
	playSound("Girls Farting-SoundBible.com-1056721802.wav");
}
}
}

