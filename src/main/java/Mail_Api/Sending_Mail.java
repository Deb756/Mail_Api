package Mail_Api;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Sending_Mail {
	public static void main(String[] args) throws MessagingException {
		
//		setting Properties
		Properties p = new Properties();
//		host
		p.setProperty("mail.smtp.host", "smtp.gmail.com");
		p.setProperty("mail.smtp.port", "465");
		p.setProperty("mail.smtp.ssl.enable", "true");
		p.setProperty("mail.smtp.auth", "true");
		
		
//		create session
		Session session = Session.getInstance(p, new Authenticator() {
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new javax.mail.PasswordAuthentication("debabratasenapati2021@gmail.com", "znyz sdwg ypnq nnve");
			}
		});
		
		session.setDebug(true);
		
//		write ur massage
		
		MimeMessage massage = new MimeMessage(session);
		
		massage.setFrom("debabratasenapati2021@gmail.com");
		massage.addRecipient(RecipientType.TO, new InternetAddress("mishraashutosh98611@gmail.com"));
		massage.setSubject("Information For Mail-Api");
		massage.setText("Hey Debabrata Senapati"
				+ "Mail api has 4 steps "
				+ "1 - set prop"
				+ "2 - create session"
				+ "3 - MimeMassge class"
				+ "4- send mail "
				+ "Thank You Mate :)");
		
//		send massage
		Transport.send(massage);
		
		System.out.println("send successfully brother-----");
		
		
		
	}
}
