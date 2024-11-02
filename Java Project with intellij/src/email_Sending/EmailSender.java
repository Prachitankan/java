package email_Sending;

import java.util.List;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    public static void main(String[] args) {
        final String username = "your-email@gmail.com"; // replace with your email
        final String password = "your-email-password"; // replace with your email password

        List<String> recipients = List.of(
                "recipient1@example.com",
                "recipient2@example.com",
                "recipient3@example.com"
        );

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            for (String recipient : recipients) {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
                message.setSubject("Test Email");
                message.setText("Hello, this is a test email!");

                Transport.send(message);

                System.out.println("Email sent successfully to " + recipient);
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
