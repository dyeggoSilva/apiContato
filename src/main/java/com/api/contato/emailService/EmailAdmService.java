package com.api.contato.emailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailAdmService {
    @Autowired
    private JavaMailSender javaMailSender;

    private String remetente = "dyeggo0102@gmail.com";

    //função criada para enviar um email de notificação para o ADM
    private String enviarEmailADM(String nome){
        String mensagem = nome +" acabou de mandar uma mensagem para você";

        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(remetente);
            simpleMailMessage.setSubject("NOVA MENSAGEM NO PORTFÓLIO");
            simpleMailMessage.setTo(remetente);
            simpleMailMessage.setText(mensagem);
            javaMailSender.send(simpleMailMessage);
            return "Email enviado.";
        }catch (Exception e){
            return "erro ao enviar o email.";
        }

    }

    //função criada para enviar um email de notificação para o cliente
    public String enviarEmailCliente(String destinatario, String nome){
        String primeitoNome[];
        primeitoNome = nome.split(" ");

        String assunto = "DY Technology - EMAIL DE CONFIRMAÇÃO";
        String mensagem = "Olá " + primeitoNome[0]+", tudo joia?" + "\n \n" + "É um prazer receber sua mensagem, vou dar uma olhadinha nela e em breve entro em contato com você.";

        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(remetente);
            simpleMailMessage.setSubject(assunto);
            simpleMailMessage.setTo(destinatario);
            simpleMailMessage.setText(mensagem);
            javaMailSender.send(simpleMailMessage);
            enviarEmailADM(primeitoNome[0]);
            return "Email enviado.";
        }catch (Exception e){
            return "erro ao enviar o email.";
        }

    }


}
