/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


import bean.Articulo;
import bean.AuditoriaSistema;
import bean.CategoriaArticulo;
import bean.DetalleOrdenCompra;
import bean.OrdenCompra;
import bean.Proveedor;
import java.awt.EventQueue;
import java.awt.Image;
import java.beans.Beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author tammy
 */
public class OrdenDeCompraVizualizar extends javax.swing.JFrame {
  int fila;
    int codigo;
    String descripcion, proveedor, fecha;
    int codArt;
    int cant;
     private char ch;
    private int id,i;
    private int resp;
    public static int categoria;
  
    /**
     * Creates new form OCVisualizar
     */
    public OrdenDeCompraVizualizar() {
        initComponents();
        masterTableDetalle.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        informerecepcionQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT i FROM Informerecepcion i");
        informerecepcionList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : informerecepcionQuery.getResultList();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT o FROM OrdenCompra o");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        detalleOrdenCompraQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DetalleOrdenCompra d");
        detalleOrdenCompraList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : detalleOrdenCompraQuery.getResultList();
        panel_BuscarPS = new javax.swing.JPanel();
        lbl_BuscarPS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_valor = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        masterScrollPane1 = new javax.swing.JScrollPane();
        masterTableDetalle = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_BuscarPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarPS.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarPS.setText("Ordenes de Compra");

        javax.swing.GroupLayout panel_BuscarPSLayout = new javax.swing.GroupLayout(panel_BuscarPS);
        panel_BuscarPS.setLayout(panel_BuscarPSLayout);
        panel_BuscarPSLayout.setHorizontalGroup(
            panel_BuscarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarPSLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lbl_BuscarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BuscarPSLayout.setVerticalGroup(
            panel_BuscarPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarPSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_BuscarPS)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Proveedor", "Articulo" }));
        list_filtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_filtrosMouseClicked(evt);
            }
        });
        list_filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_filtrosActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_buscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codOrden}"));
        columnBinding.setColumnName("Cod Orden");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codProveedor.razonSocial}"));
        columnBinding.setColumnName("Proveedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fecha}"));
        columnBinding.setColumnName("Fecha");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        masterScrollPane.setViewportView(masterTable);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_imprimir.setText("Imprimir");
        btn_imprimir.setEnabled(false);
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btn_imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_imprimir)
                    .addComponent(btn_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        masterTableDetalle.setEnabled(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detalleOrdenCompraList, masterTableDetalle);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codArticulo.nombre}"));
        columnBinding.setColumnName("Articulo");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadPedida}"));
        columnBinding.setColumnName("Cantidad Pedida");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadRecibida}"));
        columnBinding.setColumnName("Cantidad Recibida");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTableDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableDetalleMouseClicked(evt);
            }
        });
        masterScrollPane1.setViewportView(masterTableDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_BuscarPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(masterScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(masterScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_BuscarPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masterScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if(list_filtros.getSelectedItem()=="Proveedor" ){
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
            if(list_filtros.getSelectedItem()=="Articulo" ){
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }}else{
            if(list_filtros.getSelectedItem()=="Codigo"){
                ch=evt.getKeyChar();
                if(!Character.isDigit(ch)){
                    getToolkit().beep();
                    evt.consume();
                }

            }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void list_filtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_filtrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_list_filtrosMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if(list_filtros.getSelectedItem()=="Codigo"){
               //System.out.print("anda=");
                id=Integer.parseInt(tf_valor.getText());
                query=entityManager.createNamedQuery( "OrdenCompra.findByCodOrden");
                query.setParameter("codOrden", id);
                List<OrdenCompra> oc=query.getResultList();
                if (oc.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de orden de compra inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(oc);

            }
            else if (list_filtros.getSelectedItem()=="Proveedor"){
                query = entityManager.createNativeQuery( "SELECT * FROM orden_compra oc"
                         + " INNER JOIN proveedor p "
                  //  + "proveedor p "
                    + " on oc.cod_proveedor=p.codigoProveedor "
                    + " WHERE p.razonSocial LIKE "
                    //SELECT p FROM Proveedor p WHERE p.razonSocial
                    +"'%"+tf_valor.getText()+"%'", OrdenCompra.class);
                List<OrdenCompra> ar = query.getResultList();
                if (ar.size()==0){
                    JOptionPane.showMessageDialog(null," No existen Ordenes de Compra para el Proveedor", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ar);
            }
            else if (list_filtros.getSelectedItem()=="Articulo"){
                query = entityManager.createNativeQuery( "select * from orden_compra oc"
                         + " join detalle_orden_compra doc "
                    + " on oc.cod_orden=doc.cod_orden "
                    + " join articulo a "   
                    +" on a.codigoArticulo=doc.cod_articulo "
                    + " WHERE a.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", OrdenCompra.class);
                List<OrdenCompra> ar = query.getResultList();
                if (ar.size()==0){
                    JOptionPane.showMessageDialog(null," No existen Ordenes de Compra para el Articulo", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ar);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
       masterTableDetalle.setVisible(false);
        btn_imprimir.setEnabled(true);
        fila=masterTable.getSelectedRow();
        codigo=(Integer) masterTable.getValueAt(fila, 0);
        proveedor= (String) masterTable.getValueAt(fila, 1);
        fecha = (String) masterTable.getValueAt(fila, 2);
        OrdenCompra oc = obtenerOrden(codigo);
        detalle_oc(oc);
       
    }//GEN-LAST:event_masterTableMouseClicked

    private void list_filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_filtrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_filtrosActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void masterTableDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableDetalleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_masterTableDetalleMouseClicked

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        // TODO add your handling code here:
        OrdenCompra o= obtenerOrden(codigo);
        imprimir(o.getCodOrden());
    }//GEN-LAST:event_btn_imprimirActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenDeCompraVizualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenDeCompraVizualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenDeCompraVizualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenDeCompraVizualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new OrdenDeCompraVizualizar();
                frame.setVisible(true);
                frame.setTitle("Orden Compra");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    
    }
  /*private void iniciarcombo() {
       //To change body of generated methods, choose Tools | Templates.
        query=entityManager.createNamedQuery("SELECT codigoProveedor1 FROM tabla_orden_compra tc "
                    + "INNER JOIN articulo a "
                    + "on a.codigoArticulo = tc.codigo_articulo "
                    + "WHERE tc.codigo_articulo LIKE "
                        //SELECT p FROM Proveedor p WHERE p.razonSocial
                    +"'%"+codArt+"%'", TablaOrdenCompra.class);
                List<TablaOrdenCompra> ar = query.getResultList();
       //ar.get()
      .addItem(query.getResultList());
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_imprimir;
    private java.util.List<bean.DetalleOrdenCompra> detalleOrdenCompraList;
    private javax.persistence.Query detalleOrdenCompraQuery;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<bean.Informerecepcion> informerecepcionList;
    private javax.persistence.Query informerecepcionQuery;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_BuscarPS;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.OrdenCompra> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JScrollPane masterScrollPane1;
    public static javax.swing.JTable masterTable;
    public static javax.swing.JTable masterTableDetalle;
    private javax.swing.JPanel panel_BuscarPS;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public  void detalle_oc(OrdenCompra cod){
                //id=Integer.parseInt(tf_valor.getText());
                detalleOrdenCompraQuery=entityManager.createNamedQuery( "DetalleOrdenCompra.findByCodOrden");
                detalleOrdenCompraQuery.setParameter("codOrden", cod);
                List<DetalleOrdenCompra> oc=detalleOrdenCompraQuery.getResultList();
                if (oc.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de orden de compra inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                detalleOrdenCompraList.clear();
                detalleOrdenCompraList.addAll(oc);
                masterTableDetalle.setVisible(true);
        
    } 

    private void imprimir(int codigo) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.print(codigo);
        query= entityManager.createNamedQuery("OrdenCompra.findByCodOrden");
        query.setParameter("codOrden", codigo);
        List<OrdenCompra>fact=query.getResultList();
         if(fact.isEmpty()){
             JOptionPane.showMessageDialog(null,"No se encuentra", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                   return;
                   
         }
         else{
              try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "1234");
            HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
           // Map parametros=new HashMap();
            par.put("CodigoOrden",codigo );
            JasperPrint jp = JasperFillManager.fillReport("C:/proyecto/src/reportes/OrdenCompra_1.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Orden de Compra");
         //    Image icon = new ImageIcon(getClass().getResource("C:\Users\pc\Documents\NetBeansProjects\Proyecto-II\src\imagenes\logo1.png").getImage();
           //  jv.setIconImage(icon);
            jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         }
    }
    private OrdenCompra obtenerOrden(int codigo){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("OrdenCompra.findByCodOrden");
        query.setParameter("codOrden", codigo);
        List<OrdenCompra> a = query.getResultList();
        OrdenCompra nom = null;
        try{
            nom = a.get(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println("Algo pasó");
        }
        
        ema.close();
        return nom;
    }
}
