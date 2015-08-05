    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Correo {

    public Correo() {
    }
    public boolean enviarCorreo(String [] args){
       Properties props =System.getProperties();
        //Properties props =new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(props,null);
        try {
// Se crea un mensaje vacío
            Message mensaje = new MimeMessage(sesion);
// Se rellenan los atributos y el contenido
// Asunto
            mensaje.setSubject(args[1]);
// Receptor del mensaje
            mensaje.addRecipient( Message.RecipientType.TO,
            new InternetAddress(args[0]));
// Cuerpo del mensaje
            mensaje.setText(args[2]);
// Se envía el mensaje
           Transport t=sesion.getTransport("smtp");
            t.connect("hmsystem.pol@gmail.com","HMSYSTEM123");
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
        } catch (MessagingException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

}
