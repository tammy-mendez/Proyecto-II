/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renderizar;

import bean.Reserva;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Jorge
 */
public class ReservaRenderizar extends DefaultListCellRenderer{
      @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
        boolean isSelected, boolean cellHasFocus) {
       /* Date fecha1=new Date();
         String fecha2;
         DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
         fecha2=formato1.format(fecha1);*/
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Reserva) //Si el valor es una instancia de Departamento
        {
            /*EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema= fact.createEntityManager();
            ema.getTransaction().begin();
            Query q=ema.createNativeQuery("SELECT * FROM reserva r "
                    + "WHERE (r.checkIn<="
                    +"'"+fecha2+"' "
                    +"AND r.checkOut>="
                    +"'"+fecha2+"')", Reserva.class);
            List<Reserva> r=q.getResultList();*/
           Reserva r = (Reserva) value; //asigno el valor del funcionario
           setText(r.getCodigoReserva().toString()); //asignamos en nuestro caso el valor de la descripción de la unidad
        }
        return this;
    }
    
}
