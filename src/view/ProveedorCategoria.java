/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Articulo;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import bean.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pc
 */
public class ProveedorCategoria extends javax.swing.JDialog {

    /**
     * Creates new form Proveedor
     */
    int fila;
    boolean select;
    String proveedor;
   int valor, cont=0;
    public ProveedorCategoria(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        
        valor= OrdenDeCompra.categoria;
       // String valor= "lapiz de papel";
        initComponents();
        //llenarTabla();
        inicializarLista(valor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Proveedor p");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        btn_aceptar = new javax.swing.JButton();
        panel_crearCPS = new javax.swing.JPanel();
        lbl_crearCPS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setEnabled(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        panel_crearCPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_crearCPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_crearCPS.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        lbl_crearCPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_crearCPS.setText("Seleccionar Proveedor");

        javax.swing.GroupLayout panel_crearCPSLayout = new javax.swing.GroupLayout(panel_crearCPS);
        panel_crearCPS.setLayout(panel_crearCPSLayout);
        panel_crearCPSLayout.setHorizontalGroup(
            panel_crearCPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearCPSLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_crearCPS)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panel_crearCPSLayout.setVerticalGroup(
            panel_crearCPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_crearCPSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_crearCPS)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_aceptar))
                    .addComponent(panel_crearCPS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(panel_crearCPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        
        OrdenDeCompra.tf_proveedor.setText(proveedor);
        dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
         fila=tabla.getSelectedRow();
         select= (Boolean) tabla.getValueAt(fila,1);
               // codigo=(Integer) masterTable.getValueAt(fila, 0);
         if (select==true ){
             cont++;
         }
         if (select==false ){
                   JOptionPane.showMessageDialog(null,"No selecciono proveedor alguno", "Error",JOptionPane.ERROR_MESSAGE);
                   return;
         }
         if (cont>1 ){
                   JOptionPane.showMessageDialog(null,"Seleccione solo un proveedor", "Error",JOptionPane.ERROR_MESSAGE);
                   cont=0;
                  dispose();
              
         }
         else{
              proveedor= (String)tabla.getValueAt(fila, 0);
              btn_aceptar.setEnabled(true);
         }
         

       // System.out.print("prov :"+ proveedor+" selec: "+select);
        
    
    }//GEN-LAST:event_tablaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProveedorCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProveedorCategoria dialog = new ProveedorCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                 dialog.setLocationRelativeTo(null);
               // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_crearCPS;
    private java.util.List<bean.Proveedor> list;
    private javax.swing.JPanel panel_crearCPS;
    private javax.persistence.Query query;
    private static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void inicializarLista(int cat){
      /*  EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNativeQuery( "select * from proveedor p " 
                +"join articulo a " 
                +"on a.cod_Categoria= p.codigoCategoria " 
                +"where a.nombre= "
                + OrdenCompraModificar.tf_articulo.getText(), ProveedorCategoria.class);
        List<Proveedor> art = query.getResultList();
        Iterator <Proveedor> it = art.iterator();
        while (it.hasNext()){
           // tabla.addItem(it.next().getNombre());
            tabla.add(it.next().getRazonSocial(), 1);
          }
        ema.close();*/
        query= entityManager.createNativeQuery("select * from proveedor p"
                + " join categoria_articulo ca "
                + " on p.codigoCategoria=ca.cod_categoria "
                + " where p.codigoCategoria= "
                + cat, Proveedor.class);
        
         /* query = entityManager.createNativeQuery("select * from proveedor p " 
"                +" join articulo a " 
"                + " on a.cod_Categoria= p.codigoCategoria " 
"                +" where a.nombre LIKE "
                  +"'%"+OrdenCompraModificar.tf_articulo.getText()+"%'", ProveedorCategoria.class);*/
                List<Proveedor> p=query.getResultList();
               /* if (p.size()==0){
                    JOptionPane.showMessageDialog(null,"Tipo de ProveedorCategoria inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }*/
               // list.clear();
              //  list.add(p);
              // List<Articulo> art = query.getResultList();
             DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        String[] fila = new String[1];
    
        Iterator <Proveedor> it = p.iterator();
        while (it.hasNext()){
           //tabla.add(it.next().getRazonSocial());
              fila[0] = String.valueOf(it.next().getRazonSocial());
        dtm.addRow(fila);
         //  combo.addItem(it.next().getRazonSocial());
           
        
          }
             tabla.setModel(dtm);
   // obtenerValor();
             
    }

    
}

