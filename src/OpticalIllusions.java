
// Copyright Wintriss Technical Schools 2013
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpticalIllusions extends MouseAdapter {

	/* We’re going to make a slideshow of cool optical illusions. */

	// 1. Make a Frame variable and initialize it using "new Frame()"
	JFrame frame = new JFrame();
	JLabel hi;
	private void makeAlbum() {

		frame.setVisible(true);

		frame.setSize(500, 500);
//		String llamahead = "funny-optical-illusions.jpg";
		String something = "dice.jpg";
		hi = loadImageFromComputer(something);
		frame.add(hi);
		frame.pack();
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("hi");
		// 12. remove everything from the frame (the image will not disappear
		frame.remove(hi);
		
		// until step 14)111
		// 13. load a new image like before (this is more than one line of code)
		

		String llamahead = "Stairs_Optical_Illusions.jpg";
	hi	= loadImageFromComputer(llamahead);
		 frame.add(hi);
		 
		frame.pack();
		frame.addMouseListener(this);
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	public JLabel loadImageFromTheInternet(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new OpticalIllusions().makeAlbum();
	}
}
