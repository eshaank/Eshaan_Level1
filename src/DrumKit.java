
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
   JLabel hai;
   JLabel tehee;
	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame lol = new JFrame();
		// 2. Make the frame visible
		lol.setVisible(true);
		// 3. Set the size of the frame
		lol.setSize(1000, 1000);
		// 4. Set the title of the frame
		lol.setTitle("Drum Kit");
		// 5. Make a JPanel and initialize it.
		JPanel troll = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		lol.add(troll);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".

		// 8. Put the name of your image in a String variable.
		String snare = "750-MT1465_detail1.jpg";
		drumLabelWithImage = createLabelImage(snare);
		troll.add(drumLabelWithImage);
		troll.setLayout(new GridLayout());
		lol.pack();
		drumLabelWithImage.addMouseListener(this);

		String bass = "images.jpg";
		hai = createLabelImage(bass);
		troll.add(hai);
		troll.setLayout(new GridLayout());
		lol.pack();
		hai.addMouseListener(this);
		
		String hihat = "Products6012-1200x1200-730486.jpg";
		tehee = createLabelImage(hihat);
		troll.add(tehee);
		troll.setLayout(new GridLayout());
		lol.pack();
		tehee.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouseClicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". There are some sounds here:
		// http://bit.ly/drum-sounds or you can also get them from freesound.org

		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound.
		String sound3 = "44946__sascha-burghard__hihat-cl-c3000b-10";
		String sound2 = "208871__adammusic18__bass-drum-kick.wav";
		String sound = "270156__theriavirra__04c-snare-smooth-cymbals-snares.wav";
		if (drumLabelWithImage.equals(drumClicked)) {
			playSound(sound);
		}
		else if (hai.equals(drumClicked)) {
			playSound(sound2);
		}
		else if(tehee.equals(drumClicked)){
			playSound(sound3);
		}
		// 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
