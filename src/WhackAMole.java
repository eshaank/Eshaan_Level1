import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	int molesWhacked = 0;
	Date timeAtStart = new Date();
	JPanel panel;
	int rand;
	public static void main(String[] args) {
  WhackAMole buttons = new WhackAMole();
buttons.ButtonCreate();

	}
	void ButtonCreate()
	{
	
	frame = new JFrame();
	 panel = new JPanel();
	 rand =  new Random().nextInt(40);
		for (int i = 0; i < 40; i++) {
			JButton hi = new JButton();
			if (i == rand) {
				hi.setText("MOLE!");
			}
			
			
			
	
		hi.addActionListener(this);
		frame.setVisible(true);
		panel.add(hi);
		frame.add(panel);
		frame.setSize(500, 500);
		
		
		}
		
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((double)molesWhacked /(timeAtEnd.getTime() - timeAtStart.getTime()) * 1000.00) + " moles per second.");
		}

	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton lol =	(JButton) e.getSource();
		if(lol.getText().equals("")){
			speak("Dork.");
		}
		else{
			molesWhacked++;
		}
		 if (molesWhacked == 10) {
			endGame(timeAtStart, molesWhacked);	
			}
		frame.dispose();
		
		ButtonCreate();
	}
}
