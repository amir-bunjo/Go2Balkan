package ba.go2balkan.services.implementations;

import ba.go2balkan.services.interfaces.EmailService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender javaMailSender;

    public EmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmailMessageForSettingNewPassword(String username){

        javaMailSender.send(new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
                message.setFrom("miroslav01yt@gmail.com");
                message.setTo(username);
                message.setSubject("Go2Balkan - Set New Password");
                message.setText("<img src='cid:mailImage'><br><br><p style=\"font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif\">Click <a href=\"http://localhost:4200/someurl.com\">here</a> to set new password.</p>>", true);
                message.addInline("mailImage", new ClassPathResource("static/images/mailImg.jpg"));
//                message.addAttachment("myDocument.pdf", new ClassPathResource("doc/myDocument.pdf"));
            }
        });
    }
}
