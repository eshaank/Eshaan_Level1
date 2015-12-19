import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton();
	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	int counter = 0;

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		panel.add(leftButton);
		leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
		panel.add(rightButton);
		rightButton.setText("Click me!");

		panel.add(middleButton);
		middleButton.setText("Click me!");
		middleButton.addActionListener(this);
		middleButton.setForeground(Color.MAGENTA);
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		leftButton.setForeground(Color.ORANGE);
		rightButton.addActionListener(this);
		rightButton.setForeground(Color.BLUE);
		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println(arg0);
		counter++;
		if (buttonPressed == leftButton) {
			rightButton.setText("No, click me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click me!");
			leftButton.setPreferredSize(SMALL);
		}
		if (buttonPressed == rightButton) {
			leftButton.setText("No, click me!");
			rightButton.setPreferredSize(SMALL);
			rightButton.setText("Click me!");
			leftButton.setPreferredSize(BIG);
		}
		if (counter == 10) {
			middleButton.setText("No! Just Click me already!");
			middleButton.setPreferredSize(BIG);
			rightButton.setPreferredSize(SMALL);
			rightButton.setText("Click Me.");
			leftButton.setPreferredSize(SMALL);
			leftButton.setText("Click Me.");
		}
		if (buttonPressed == middleButton) {
			
           System.exit(0);
		}

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
