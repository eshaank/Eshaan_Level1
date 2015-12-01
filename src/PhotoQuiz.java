
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		String image = "https://theashleysrealityroundup.files.wordpress.com/2010/11/eyebrow.jpg";
		Component Image;
		Image = createImage(image);
		quizWindow.add(Image);
		quizWindow.pack();
		String host = JOptionPane.showInputDialog("What show does this man host?");
		if (host.equals("Amazing Race")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The corret answer is the AmazingRace");
		}
		quizWindow.remove(Image);
		String starwars = "http://static-kanlo4.kanlo.com.br/product/34593/484592_kotobukiya_r2-d2_c-3po_artfx_01.png";
		Component Starwars;
		Starwars = createImage(starwars);
		quizWindow.add(Starwars);
		quizWindow.pack();
		String coolness = JOptionPane.showInputDialog("Which one is cooler? R2D2 or C3PO?");
		if (coolness.equals("R2D2")) {
			JOptionPane.showMessageDialog(null, "Yes! Obviously R2D2 is cooler than that lame piece of annoying junk!");
		} else {
			JOptionPane.showMessageDialog(null,
					"Bro, get an education in Star Wars! U think that piece of whatever is better than R2D2? U don't deserve to play this game anymore.");
			System.exit(1);
		}
		quizWindow.remove(Starwars);
		String johnny = "http://vignette3.wikia.nocookie.net/johnnytest/images/1/1e/Johnny_large.png/revision/latest?cb=20120319144326";
		Component Johnny;
		Johnny = createImage(johnny);
		quizWindow.add(Johnny);
		quizWindow.pack();
		String test = JOptionPane.showInputDialog(
				"Who is this kid? What show is he from? Format: ____ from _______ (IDK if you don't know)");
		if (test.equals("Johnny Test from Johnny Test")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect! This person is Johnny Test from Johnny Test");
		}
		quizWindow.remove(Johnny);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
