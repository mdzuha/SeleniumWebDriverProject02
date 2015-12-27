/**
 * 
 */
package com.paxotech.abercrombie.framework.scripts;
import java.util.*;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;
import javax.activation.*;

/**
 * @author Masihur
 *
 */
public class EmailSender {
	
	public static void main(String[] agrs){ 
		String[] to = {"marufrahman1349@gmail.com"};
		if(email
				("marufrahman1349@gmail.com",
						"Mm17-0985",
						"hello",
						to))System.out.println("email sent succeeded");
		else System.out.println("email can't sent");
	}
	public static boolean email(String from, String password, String text, String[] to){
	      // Recipient's email ID needs to be mentioned.
//	      String to = "thisismofi@gmail.com";

	      // Sender's email ID needs to be mentioned
//	      String from = "marufrahman1349@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "smtp.gmail.com";

	      // Get system properties
	      Properties properties = System.getProperties();
	      
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.host", host);
	      properties.put("mail.smtp.user", from);
	      properties.put("mail.smtp.password", password);
	      properties.put("mail.smtp.port", 587);
	      properties.put("mail.smtp.auth", "true");
	      
	      
	      // Setup mail server
//	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties, null);
	      MimeMessage message = new MimeMessage(session);
	      try{
	         // Create a default MimeMessage object.
	         

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         InternetAddress[] toAddress = new InternetAddress[to.length];
	         for (int i = 0; i<to.length; i++){
	        	 toAddress[i] = new InternetAddress(to[i]);
	         }
	         for (int i = 0; i<toAddress.length; i++){
	        	 message.addRecipient(RecipientType.TO, toAddress[i]);
	         }

	         // Set To: header field of the header.
//	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Greetings");

	         // Now set the actual message
	      // Create the message part 
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Fill the message
	         messageBodyPart.setText(text);
	         
	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = "C:/JavaDevelopmentEclipse/SeleniumWebDriverProject02/extent-report.zip";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName("Folder.zip");
	         multipart.addBodyPart(messageBodyPart);

	         // Send the complete message parts
	         message.setContent(multipart );
	         Transport transport = session.getTransport("smtp");
	         // Send message
//	         Transport.send(message);
	         transport.connect(host, from, password);
	         transport.sendMessage(message, message.getAllRecipients());
	         transport.close();
	         System.out.println("Sent message successfully....");
	        
	         return true;
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	      return false;
	      
	   }
	
}
