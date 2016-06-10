import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class typingtutor implements KeyListener {
	JPanel lelz = new JPanel();
	JLabel lol = new JLabel();
	private char currentLetter = generateRandomLetter();
public static void main(String[] args)
{
typingtutor lel = new typingtutor();
lel.Frame();
	
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
void Frame(){
	JFrame hi = new JFrame();


	hi.setVisible(true);
	hi.setSize(500, 200);
	hi.setTitle("TYPE or DIE");
	hi.add(lelz);
	lelz.add(lol);
	lol.setText(currentLetter + "");
	lol.setFont(lol.getFont().deriveFont(28.0f));
	lol.setHorizontalAlignment(JLabel.CENTER);
	hi.addKeyListener(this);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if (e.getKeyChar() == currentLetter) {
		System.out.println("correct");
lelz.setBackground(Color.green);
	}
	else{
		lelz.setBackground(Color.RED);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	lol.setText(currentLetter + "");
	
}
}
