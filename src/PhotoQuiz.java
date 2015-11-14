
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

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		String image = "https://theashleysrealityroundup.files.wordpress.com/2010/11/eyebrow.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component Image;
		// 3. use the "createImage()" method below to initialize your Component
		Image = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(Image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String host = JOptionPane.showInputDialog("What show does this man host?");
		// 7. print "CORRECT" if the user gave the right answer
		if (host.equals("Amazing Race")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The corret answer is the AmazingRace");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(Image);
		// 10. find another image and create it (might take more than one line of code)
		String starwars = "http://static-kanlo4.kanlo.com.br/product/34593/484592_kotobukiya_r2-d2_c-3po_artfx_01.png";
		// 11. add the second image to the quiz window
		Component Starwars;
		// 12. pack the quiz window
		Starwars = createImage(starwars);
		// 13. ask another question
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
		String test = JOptionPane.showInputDialog("Who is this kid? What show is he from? Format: ____ from _______ (IDK if you don't know)");
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
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
