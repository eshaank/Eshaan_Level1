import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamAlot implements ActionListener {
	static final String FAKE_USERNAME = "anonymous..spammer.person";
	static final String FAKE_PASSWORD = "onion614";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JTextField text = new JTextField();

	public static void main(String[] args) {
		spamAlot hi = new spamAlot();
		hi.user();
	}

	void user() {
		frame.setVisible(true);
		frame.setSize(400, 75);
		button.setText("GOOD");
		button1.setText("BAD");
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.add(panel);
		panel.add(text);
		text.setText("Email or Phone number");

		if (sendSpam("sgkansagara@gmail.com", "I Know Where U Live :D",
				"I stalk u in ur sleep. :) Love, Anonymous Team :D")) {
			text.setBackground(Color.GREEN);
		} else {
			text.setBackground(Color.RED);
		}

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	String sendTextMessage(String phoneNumber, String message) {
		if (sendSpam(phoneNumber + "@tmomail.net", "", message))
			return "T-Mobile";
		if (sendSpam(phoneNumber + "@vmobl.com", "", message))
			return "Virgin Mobile";
		if (sendSpam(phoneNumber + "@cingularme.com", "", message))
			return "Cingular";
		if (sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message))
			return "Sprint";
		if (sendSpam(phoneNumber + "@vtext.com", "", message))
			return "Verizon";
		if (sendSpam(phoneNumber + "@messaging.nextel.com", "", message))
			return "Nextel";
		return "FAIL!";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			if (sendSpam(text.getText(), "You Just Won a Prize!", "Click here to claim your prize")) {
				text.setBackground(Color.GREEN);
			}
		}

		else if (e.getSource() == button1) {
			if (sendSpam(text.getText(), "I Know Where U Live :D",
					"I stalk u in ur sleep. :) Love, Anonymous Person :D")) {
				text.setBackground(Color.RED);
			}

		}

	}
}
