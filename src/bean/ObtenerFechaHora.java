/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jorge
 */
public class ObtenerFechaHora {
    public static void main ( String args[] ) {

  Date fecha1 = new Date ();
  DateFormat formato=new SimpleDateFormat("dd-MM-yyyyy" );
  DateFormat formato1=new SimpleDateFormat("HH:mm:ss ");

  System.out.println(fecha1.toString());

  // Segun la versión utilizada de Java, los dos siguientes
  // metodos pueden estar deprecated
   System.out.println(formato1.format(fecha1));
  System.out.println(formato.format(fecha1));
  System.out.println(fecha1.toLocaleString());
  System.out.println(fecha1.toGMTString());

  Calendar cal1 = Calendar.getInstance();
    System.out.println(""+cal1.get(Calendar.DATE)+"/"+cal1.get(Calendar.MONTH)
    +"/"+cal1.get(Calendar.YEAR)+" "+cal1.get(Calendar.HOUR)
    +":"+cal1.get(Calendar.MINUTE)+":"+cal1.get(Calendar.SECOND)
    +":"+cal1.get(Calendar.MILLISECOND));

 }

}
