import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want
	 * to get out of the static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame hi = new JFrame();
	JLabel troll = new JLabel();
	JLabel trollol = new JLabel();

	private void createBook() {
		// 2. make the frame visible
		hi.setVisible(true);
		// 3. set the size of the frame
		hi.setSize(500, 500); // 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String no1 = "Barfingpeople.jpg";
		String no2 = "umadbruh.png";
		// 6. create a variable of type "JLabel" but don’t initialize it yet

		// 7. use the "loadImage..." methods below to initialize your JLabel
		troll = this.loadImageFromComputer(no1);
		trollol = this.loadImageFromComputer(no2);
		// 8. add your JLabel to the frame
		hi.add(troll);
		// 9. call the pack() method on the frame
		hi.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		hi.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");

		// 12. remove everything from the frame that was added earlier
		hi.remove(troll);
		hi.add(trollol);
		// 13. load a new image like before (this is more than one line of code)

		// 14. pack the frame
		hi.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
