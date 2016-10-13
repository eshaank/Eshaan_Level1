import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		GUI hi = new GUI();
		hi.gui();
	}

	void gui() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setSize(100, 100);
		button2.setSize(100, 100);
		frame.pack();
	}

}
