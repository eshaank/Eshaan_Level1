import java.awt.Color;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton();
public static void main(String[] args) {
	
	CutenessTV cute = new CutenessTV();
	cute.run();

}
public void run(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 500);

	frame.setVisible(true);

	panel.add(leftButton);
	leftButton.setText("Click me!");

	panel.add(rightButton);
	rightButton.setText("Click me!");

	panel.add(middleButton);
	middleButton.setText("Click me!");
	middleButton.addActionListener(this);
	middleButton.setForeground(Color.MAGENTA);

	leftButton.addActionListener(this);
	leftButton.setForeground(Color.ORANGE);
	rightButton.addActionListener(this);
	rightButton.setForeground(Color.BLUE);
	panel.add(leftButton);
	panel.add(rightButton);

	frame.pack();
	
	frame.setTitle("Demanding Buttons");
}

void showDucks() {
	playVideo("EpiGS-3PDU8");
}

void showFrog() {
	playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
	playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
