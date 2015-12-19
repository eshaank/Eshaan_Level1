import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class simonays extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame lol = new JFrame();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		images.put(new Integer(KeyEvent.VK_DOWN), "downarrow.jpg");
		images.put(new Integer(KeyEvent.VK_UP), "uparrow.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "rightarrow.jpg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "leftarrow.jpg");
		JOptionPane.showMessageDialog(null, "Press the matching key when 'Simon says' otherwise press a different key");
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		int score = 0;
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		// increase their score
		if (keyCode == imageIndex && simonSays == 0) {
			score+=1;
			System.out.println("+1");
		}
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't
		// say..." increase their score
		if (keyCode != imageIndex && keyCode != 1) {
			score+=1;
			System.out.println("++1");
		if (keyCode == 1) {
			score+=0;
		}
		}
		// 19. Use the speak method to tell the user if they were correct or not
		tries += 1;

		if (tries >= 11) {
			System.exit(0);
		}
		lol.dispose();
		showImage();
	}

	private void showImage() {
		lol = new JFrame();
		lol.setVisible(true);
		lol.add(getNextRandomImage());
		lol.setName("Simon Says");

		lol.setSize(500, 500);

		lol.addKeyListener(this);
		int simonSays = new Random().nextInt(2);
		if (simonSays == 0) {
			speak("Simon Says press this key");
		}
		if (simonSays == 1) {
			speak("Press this key");
		}
		// Hint: use the simonSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new simonays().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
