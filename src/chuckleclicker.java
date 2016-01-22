import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	public static void main(String[] args) {
		chuckleclicker cc = new chuckleclicker();
		cc.makeButtons();
	}
	JButton leftButton = new JButton();

	JButton rightButton = new JButton();
	void makeButtons() {
		
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();

		frame.setVisible(true);

		frame.setSize(500, 500);

		frame.add(panel);

		panel.add(leftButton);

		leftButton.setText("Joke");
		leftButton.addActionListener(this);

		panel.add(rightButton);

		rightButton.setText("Punchline");
		rightButton.addActionListener(this);

		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		{
			System.out.println(arg0);
			if (buttonPressed.equals (leftButton)) {
				leftButton.setText("hi");
			}
			if (buttonPressed.equals (rightButton)) {
				rightButton.setText("hi");
			}
		}
	}
}
