package wildflyswarm.mail;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@ApplicationScoped
@Path("/")
public class MailSender {

  @Resource(mappedName = "java:jboss/mail/default")
//  @Resource(mappedName = "java:jboss/mail/my-mail-session")
  private Session session;

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String send(Mail mail) throws Exception {
    Message message = new MimeMessage(session);

    message.setFrom();
    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail.getTo(), false));
    message.setSubject(mail.getSubject());
    message.setSentDate(new Date());
    message.setContent(mail.getContent(), "text/html; charset=UTF-8");

    Transport.send(message);

    return String.format("{\"your_mail\": \"%s\"}", mail);
  }

}