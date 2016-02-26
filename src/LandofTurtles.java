import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandofTurtles {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		/* 1. Get the panel to show */
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		
		
		/* 4. Put 50 Turtles on the beach. */
		for (int i = 0; i < 51; i++) {
			Turtle john = new Turtle();
			panel.addTurtle(john);
			
			john.setX(250 + i * 10);
			
		}

	}
}
