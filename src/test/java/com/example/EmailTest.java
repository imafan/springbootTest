package com.example;

import freemarker.template.Configuration;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by imafan on 2017-09-11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest extends TestCase {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    Configuration freemarkerConfiguration;

    @Test
    public void test() throws Exception{
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("imafan1989@163.com");
        message.setTo("358462953@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);

    }


    @Test
    public void test2() throws Exception{

        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("imafan1989@163.com");
        helper.setTo("358462953@qq.com");
        helper.setSubject("主题：模板邮件");
        Map<String, Object> model = new HashMap<String,Object>();
        model.put("username", "didi");
//        String text = VelocityEngineUtils.mergeTemplateIntoString(
//                velocityEngine, "template.vm", "UTF-8", model);

        String text = FreeMarkerTemplateUtils.processTemplateIntoString(freemarkerConfiguration.getTemplate("email/test.html"), model);
        helper.setText(text, true);
        mailSender.send(mimeMessage);


    }
}