import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
public class clicks {
static	int count = 0;
	public static void main(String[] args) {
	
		JFrame box = new JFrame();
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setVisible(true);
		box.setSize(500, 500);
		box.setTitle("Clicks");
		JButton button = new JButton();
	    box.add(button);
	    button.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		count++;
	    	    if (new Random().nextInt(10) == 5) {
	    			JOptionPane.showMessageDialog(null, "You Died. Your score is " + count);
	    			count = 0;
	    		}
	    	    
	    	}
	    });

	}
}
