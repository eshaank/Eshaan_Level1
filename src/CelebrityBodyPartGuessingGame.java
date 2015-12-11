import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebrityBodyPartGuessingGame {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Eshaan_Level1/src/images.jpg";
	String secondImage = "/Users/league/Desktop/Eshaan_Level1/src/Adam+Savage+Pacific+Rim+Premieres+LA+MQNwR-gKkbLl.jpg";
	String thirdImage = "/Users/league/Desktop/Eshaan_Level1/src/CARRIE FISHER.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(50, 50);
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer
String han = JOptionPane.showInputDialog("Who is this pseron (don't forget caps)");
		
if (han.equals("Harrison Ford")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "You're correct.Your score is now " + score);
}
else {
	JOptionPane.showMessageDialog(null, "Your're wrong");
}
showNextImage();
window.setSize(500, 75);
String adam = JOptionPane.showInputDialog("Who is this pseron");

if (adam.equals("Adam Savage")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "You're correct. Your score is now " + score);
}
else {
	JOptionPane.showMessageDialog(null, "Your're wrong");
}

showNextImage();
window.setSize(400, 400);
String leia = JOptionPane.showInputDialog("Who is this person");

if (leia.equals("Carrie Fisher")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "You're correct. Your score is now " + score);
}
else {
	JOptionPane.showMessageDialog(null, "Your're wrong " + score);
}
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebrityBodyPartGuessingGame quiz = new CelebrityBodyPartGuessingGame();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}



