/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renderizar;

import bean.Actividad;
import bean.Lugar;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Jorge
 */
public class ActividadListRenderizar extends DefaultListCellRenderer  {
     @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
     boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Actividad) //Si el valor es una instancia de Departamento
        {

            Actividad a = (Actividad) value; //asigno el valor del funcionario
            setText(a.getNombre()); //asignamos en nuestro caso el valor de la descripción de la unidad
        }
        return this;
    }
    
}
