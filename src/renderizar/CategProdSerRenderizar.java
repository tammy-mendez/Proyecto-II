/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renderizar;

import bean.CategHabitacion;
import bean.CategoriaProdSer;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Jorge
 */
public class CategProdSerRenderizar extends DefaultListCellRenderer {
      @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof CategoriaProdSer) 
        {

            CategoriaProdSer cps = (CategoriaProdSer) value; 
            setText(cps.getNombre());
          
        }
        return this;
    }
    
    
}
