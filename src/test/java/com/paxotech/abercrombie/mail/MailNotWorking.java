/**
 * 
 */
package com.paxotech.abercrombie.mail;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author Masihur
 *
 */
public class MailNotWorking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mail();

	}
	public static boolean mail() {

		final String username = "marufrahman1349@gmail.com";
		final String password = "Mm17-0985";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication(username, password);
		    }
		  });

		try {

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress("marufrahman1349@gmail.com"));
		    message.setRecipients(Message.RecipientType.TO,
		        InternetAddress.parse("marufrahman1349@gmail.com"));
		    message.setSubject("Testing Subject");
		    message.setText("Dear Mail Crawler,"
		        + "\n\n No spam to my email, please!");

		    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  

		    String filename = "C:/JavaDevelopmentEclipse/SeleniumWebDriverProject02/extent-report.zip";
		    FileDataSource source = new FileDataSource(filename);  
		    messageBodyPart2.setDataHandler(new DataHandler(source));  
		    messageBodyPart2.setFileName(filename);  



		    Multipart multipart = new MimeMultipart();  
//		    multipart.addBodyPart(messageBodyPart1);  
		    multipart.addBodyPart(messageBodyPart2);  

		     message.setContent(multipart );  


		    Transport.send(message);

		    System.out.println("Done");
		    return true;

		} 
		catch (MessagingException e) {
		    throw new RuntimeException(e);
		}
	
	}

}
