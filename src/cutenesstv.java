import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenesstv implements ActionListener {
	public static void main(String[] args) {
		cutenesstv hai = new cutenesstv();
		hai.whatEver();
	}

	void whatEver() {
		JButton hi = new JButton();
		JButton lol = new JButton();
		JButton troll = new JButton();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(troll);
		troll.setText("troll");
		troll.addActionListener(this);
		panel.add(lol);
		lol.setText("lol");
		lol.addActionListener(this);
		panel.add(hi);
		hi.setText("hi");
		hi.addActionListener(this);
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
