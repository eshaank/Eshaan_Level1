import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This game uses the Makey Makey to see if you can match the pictures of food
 * to the correct utensil. There are utensils (including metal chopsticks!) in
 * one of the blue drawers.
 * 
 * Learn how to hook up the Makey Makey here: http://makeymakey.com/howto.php
 * 
 */
public class EatME extends KeyAdapter {

	JFrame jFrame;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int correctUtensilCode;
int score = 0;
	private void makeAlbum() {
		// 1. Find 4 images of foods eaten by different utensils and put them in
		// your default package
		// 2. Connect the images to the UP, DOWN, LEFT, and RIGHT keys like
		// this...
		images.put(new Integer(KeyEvent.VK_UP), "Farfalle_Pasta.JPG");
		images.put(new Integer(KeyEvent.VK_LEFT), "7-scoop-ice-cream-cone.jpg"); 
		images.put(new Integer(KeyEvent.VK_RIGHT), "imgres.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "imgres-1.jpg");

		// 3. Call the method to show an image
		showImage();
	}

	private void showImage() {
		// 4. Initialize your jFrame to a new JFrame() (jFrame already exists)
		jFrame = new JFrame();
		// 5. Set the JFrame to visible
		jFrame.setVisible(true);
		jFrame.add(getNextRandomImage());
		
		// 6. Pack the frame
		jFrame.pack();
		// 7. Add a KeyListener to the frame
		jFrame.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		int whichKeyPressed = e.getKeyCode();
		// 8. Print out the key that was pressed
		System.out.println(whichKeyPressed);
		// 9. Print the correctUtensilCode
		System.out.println(correctUtensilCode);
		// 10. If they match, tell the user they were correct
		if (whichKeyPressed == correctUtensilCode) {
			score+=1;
			JOptionPane.showMessageDialog(null, "You're correct. Your score is now " + score);
			showImage();
		}
		// 11. Otherwise, tell the user that they should learn some manners
		else {
			JOptionPane.showMessageDialog(null, "Learn some manners people! Your score " + score);
			System.exit(0);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		// 14. Make a variable for the number of tries and limit it to
		int tries = 3;
		// 10.[requires code in different places]

		// 15. Make a variable to track the score and tell the user at the end.
		
		// [requires code in different places]
	}

	private Component getNextRandomImage() {
		String[] fileNames = images.values().toArray(new String[0]);
		int randomness = new Random().nextInt(fileNames.length);
		String randomFile = fileNames[randomness];
		System.out.println("loading image " + randomness + ": " + randomFile);

		this.correctUtensilCode = getHashMapKey(randomFile);
		return loadImage(randomFile);

	}

	private Integer getHashMapKey(String randomFile) {
		for (Integer key : images.keySet()) {
			if (images.get(key).equals(randomFile)) {
				return key;
			}
		}
		return null;
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new EatME().makeAlbum();
	}
}

/**
 * 17. [Optional] Add a timer. ~~~ Declare the Start at the top~~~Date
 * timeAtStart; ~~~ Set it where the code starts running ~~~ timeAtStart= new
 * Date();
 * 
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 * 
 **/
