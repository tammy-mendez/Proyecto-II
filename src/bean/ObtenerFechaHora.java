/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class ObtenerFechaHora {
    public static void main ( String args[] ) {
       String valor="Hola";
       String valor2="Chau";
       float difH;
       float difM;
       float horasT;
       float div;
       String x;
       System.out.println(valor+"\n"+valor2);
       Date fecha1 = new Date ();
       DateFormat formato=new SimpleDateFormat("dd-MM-yyyyy" );
       DecimalFormat decimal= new DecimalFormat("0.0");
//NumberFormat nf = NumberFormat.getInstance();		
 // nf.setMaximumFractionDigits(1);
/*  Date fecha1 = new Date ();
  DateFormat formato=new SimpleDateFormat("dd-MM-yyyyy" );
  DateFormat formato1=new SimpleDateFormat("HH:mm");
  // dif=as.get(0).getHoraSalida().getHours()-as.get(0).getHoraEntrada().getHours();

  System.out.println(fecha1.toString());
        try {
            // Segun la versión utilizada de Java, los dos siguientes
            // metodos pueden estar deprecated
            difH=formato1.parse(formato1.format(fecha1)).getHours()-8;
            System.out.println("Hora 1:"+" "+formato1.parse(formato1.format(fecha1)).getHours());
            System.out.println("Hora 2: 8");
            System.out.println("Diferencia hora:"+" "+difH);
            difM=formato1.parse(formato1.format(fecha1)).getMinutes()-33;
            System.out.println("Minuto 1:"+" "+formato1.parse(formato1.format(fecha1)).getMinutes());
            System.out.println("Minuto 2: 00");
            System.out.println("Diferencia Minutos:"+" "+difM);
            
            div=(float) (difM/60.0);
            System.out.println(div);
           horasT=horasT=difH+div;
           x=decimal.format(horasT);
           x=x.replaceAll(",",".");
          float horasTT=Float.parseFloat(x);
            System.out.println("Horas trabajadas:"+" "+horasTT);
        } catch (ParseException ex) {
            Logger.getLogger(ObtenerFechaHora.class.getName()).log(Level.SEVERE, null, ex);
        }
  System.out.println(formato.format(fecha1));
  System.out.println(fecha1.toLocaleString());
  System.out.println(fecha1.toGMTString());
  Calendar cal1 = Calendar.getInstance();
    System.out.println(""+cal1.get(Calendar.DATE)+"/"+cal1.get(Calendar.MONTH)
    +"/"+cal1.get(Calendar.YEAR)+" "+cal1.get(Calendar.HOUR)
    +":"+cal1.get(Calendar.MINUTE)+":"+cal1.get(Calendar.SECOND)
    +":"+cal1.get(Calendar.MILLISECOND));*/
    
 Calendar fechaInicial = new GregorianCalendar();
 Calendar fechaFinal= new GregorianCalendar(2015,10,11);
 
     int diffDays= 1;
        try {
            fechaInicial.setTime(formato.parse(formato.format(fecha1)));
        } catch (ParseException ex) {
            Logger.getLogger(ObtenerFechaHora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("fecha prueba"+" "+fechaInicial.getTime());
        fechaInicial.add(Calendar.DAY_OF_YEAR,1);
        System.out.println("fecha prueba suma"+" "+fechaInicial.getTime());
    //mientras la fecha inicial sea menor o igual que la fecha final se cuentan los dias
     while ( !fechaInicial.equals(fechaFinal)) {
          if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                diffDays++;

            }
         fechaInicial.add(Calendar.DATE, 1);
         }

        System.out.println(diffDays);

    }

}
