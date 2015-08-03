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
            mensaje.setSubject("Recordatorio de contraseña");
// Receptor del mensaje
            mensaje.addRecipient( Message.RecipientType.TO,
            new InternetAddress(args[2]));
// Cuerpo del mensaje
            mensaje.setText("HM System le recuerda su contraseña de acceso al sistema :"+" "+"'"+args[3]+"'");
// Se envía el mensaje
           Transport t=sesion.getTransport("smtp");
            t.connect(args[0],args[1]);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            return true;
        } catch (MessagingException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

  /* public static void main (String [] args) {
// Se comprueba que el número de argumentos es el correcto
        
// Se obtienen el from y el to recibidos como parámetros
      
// Se obtienen las propiedades del sistema y se establece el servidor SMTP
        Properties props =System.getProperties();
        //Properties props =new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.user", "jorgebe1993@gmail.com");
        props.setProperty("mail.smtp.password", "daggeorge5");
// Se obtiene una sesión con las propiedades anteriormente definidas
        Session sesion = Session.getDefaultInstance(props,null);
// Capturar las excepciones
        try {
// Se crea un mensaje vacío
            Message mensaje = new MimeMessage(sesion);
// Se rellenan los atributos y el contenido
// Asunto
            mensaje.setSubject("Recordatorio de contraseña");
// Emisor del mensaje
          //  mensaje.setFrom(new InternetAddress("jorgebe1993@gmail.com"));
// Receptor del mensaje
            mensaje.addRecipient( Message.RecipientType.TO,
            new InternetAddress(args[2]));
// Cuerpo del mensaje
            mensaje.setText("HM System le recuerda su contraseña de acceso al sistema:"+args[3]);
// Se envía el mensaje
           Transport t=sesion.getTransport("smtp");
            t.connect(args[0],args[1]);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
            JOptionPane.showMessageDialog(null,"Su contrasenha fue enviada exitosamente a su email", "Aviso",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (MessagingException e) {
            System.err.println(e.getMessage());
             JOptionPane.showMessageDialog(null,"Dirección de correo invalida", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }*/

}
