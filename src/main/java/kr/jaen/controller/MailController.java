package kr.jaen.controller;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MailController {

    @Autowired
    private JavaMailSenderImpl mailSender;


    /*
    @Autowired
    private JavaMailSender javaMailSender;

    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        return javaMailSender;
    }
    */


    @GetMapping("/MailSendTest")
    public String MailSendTest(@RequestParam HashMap<String,String> param) {
        try {
            String from = "serim.jaen@androidjava.com";
            String to = "serim.jaen@androidjava.com";
            String subject = "SMTP 발송 테스트 진행";
            String htmlMessage = "<html><head></head><body><p style='font-size:30px'>MIME Message 테스트</p></body></html>";


            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeHelper = new MimeMessageHelper(mimeMessage , true , "UTF-8");

            mimeHelper.setFrom(from);
            mimeHelper.setTo(to);
            mimeHelper.setSubject(subject);


            mimeHelper.setText(htmlMessage , true);


            mailSender.send(mimeMessage);
            System.out.println("email 수신");

        } catch(Exception exception) {
            return exception.getMessage().toString();
        }
        return "SUCCESS";
    }
}
