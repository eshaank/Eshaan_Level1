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
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class myOwnProject extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 300;
	final int frameHeight = 275;
	Date end;
	Date start;
	
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
			end = new Date();
			scare();
			JOptionPane.showMessageDialog(null, "You Win!! You took " + getDateDiff(start, end, TimeUnit.SECONDS) + "seconds");
			System.exit(0);
		}
	}

	private void scare() {
		 AudioClip sound =
		 JApplet.newAudioClip(getClass().getResource("76415__robinhood76__01142-applause-42-crowd-long-waiting.wav"));
sound.play();
		

	}

	private void sCare() {
		 AudioClip sound =
		 JApplet.newAudioClip(getClass().getResource("146434__copyc4t__dundundunnn.wav"));
sound.play();
		

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
//		  start = new Date();
	        
	       // display time and date using toString()
		SwingUtilities.invokeLater(new myOwnProject());
	}

	@Override
	public void run() {
		 start = new Date();
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
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit){
		long diffinmillies=date2.getTime()-date1.getTime();
		return timeUnit.convert(diffinmillies, TimeUnit.MILLISECONDS);
	}
	

}
