import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class myOwnProject extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 300;
	final int frameHeight = 275;

	myOwnProject() throws Exception {
		maze = ImageIO.read(getClass().getResource("GreenMaze0.2.png"));
		new Robot().mouseMove(60, 300);
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		System.out.println(mouseColor);
		int line = -16738816;
		if (mouseColor == -16738816) {
			JOptionPane.showMessageDialog(null, "You Died");
			System.exit(0);
		}
		if (mouseColor == -8257410) {
			JOptionPane.showMessageDialog(null, "You Win!!");
			scare();
			System.exit(0);
		}
	}

	private void scare() {
		// 7. find a scary sound and put it in the "default package" where you
		// put your maze picture. You can find a sound on freesound.org. Log in
		// as leagueofamazing/code4life.
		 AudioClip sound =
		 JApplet.newAudioClip(getClass().getResource("76415__robinhood76__01142-applause-42-crowd-long-waiting.wav"));
		// 8. play the scary sound. Hint: type "sound" and then a period.
sound.play();
		// 9. drop an image into your default package, and use the
		// showScaryImage method to scare your victim!

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new myOwnProject());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Eshaan's Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		// TODO Auto-generated method stub

	}

}
