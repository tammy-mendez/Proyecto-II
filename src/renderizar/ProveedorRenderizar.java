/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renderizar;

import bean.Proveedor;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author tammy
 */
public class ProveedorRenderizar extends DefaultListCellRenderer {
      @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Proveedor ) 
        {

            Proveedor cps = (Proveedor) value; 
            setText(cps.getRazonSocial());
          
        }
        return this;
    }
    
    
}
