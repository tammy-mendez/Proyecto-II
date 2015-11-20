/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Proveedor;
import bean.Articulo;
import bean.AuditoriaSistema;
import bean.CategoriaArticulo;
import bean.DetalleOrdenCompra;
import bean.Empleado;
import bean.MovimientoStock;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.EventQueue;
import java.beans.Beans;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tammy
 */
public class MovimientoArticuloRegistrar extends javax.swing.JFrame {
    private char ch;
    private int resp;
  private int id, cantidadActual,fila;
  private String articulo;
  
    public MovimientoArticuloRegistrar() {
initComponents();     
tabla.setVisible(false);
inicializar();
llenarTablaArticulo();
tabla.setVisible(true);

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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM MovimientoStock m");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        articuloQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Articulo a");
        articuloList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(articuloQuery.getResultList());
        empleadoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        empleadoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(empleadoQuery.getResultList());
        jPanel3 = new javax.swing.JPanel();
        lbl_registrarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        cantidadMinimaLabel = new javax.swing.JLabel();
        tf_articulo = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        cantidadMinimaLabel1 = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btn_cancelar3 = new javax.swing.JButton();
        btn_guardar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbl_valor = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Extraer Articulo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nombre.setText("Articulo:");

        cantidadMinimaLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        cantidadMinimaLabel.setText("Cantidad:");

        tf_articulo.setEnabled(false);
        tf_articulo.addFocusListener(formListener);

        tf_cantidad.setEnabled(false);
        tf_cantidad.addFocusListener(formListener);
        tf_cantidad.addKeyListener(formListener);

        cantidadMinimaLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        cantidadMinimaLabel1.setText("Fecha Hora:");

        tf_fecha.setEnabled(false);
        tf_fecha.addActionListener(formListener);
        tf_fecha.addKeyListener(formListener);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(cantidadMinimaLabel))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cantidadMinimaLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaLabel)
                    .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadMinimaLabel1)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar3.setText("Cancelar");
        btn_cancelar3.addActionListener(formListener);

        btn_guardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar3.setText("Guardar");
        btn_guardar3.setEnabled(false);
        btn_guardar3.addActionListener(formListener);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_guardar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_cancelar3)
                .addGap(34, 34, 34))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_cancelar3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_guardar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, articuloList, tabla);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoArticulo}"));
        columnBinding.setColumnName("Codigo Articulo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cantidadStock}"));
        columnBinding.setColumnName("Cantidad Stock");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipo}"));
        columnBinding.setColumnName("Tipo");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tabla.addMouseListener(formListener);
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        tf_valor.addKeyListener(formListener);

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nombre", "Proveedor" }));
        list_filtros.addMouseListener(formListener);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(formListener);
        btn_buscar.addFocusListener(formListener);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        bindingGroup.bind();

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.KeyListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == tf_fecha) {
                MovimientoArticuloRegistrar.this.tf_fechaActionPerformed(evt);
            }
            else if (evt.getSource() == btn_cancelar3) {
                MovimientoArticuloRegistrar.this.btn_cancelar3ActionPerformed(evt);
            }
            else if (evt.getSource() == btn_guardar3) {
                MovimientoArticuloRegistrar.this.btn_guardar3ActionPerformed(evt);
            }
            else if (evt.getSource() == btn_buscar) {
                MovimientoArticuloRegistrar.this.btn_buscarActionPerformed(evt);
            }
        }

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (evt.getSource() == tf_articulo) {
                MovimientoArticuloRegistrar.this.tf_articuloFocusGained(evt);
            }
            else if (evt.getSource() == tf_cantidad) {
                MovimientoArticuloRegistrar.this.tf_cantidadFocusGained(evt);
            }
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (evt.getSource() == tf_articulo) {
                MovimientoArticuloRegistrar.this.tf_articuloFocusLost(evt);
            }
            else if (evt.getSource() == tf_cantidad) {
                MovimientoArticuloRegistrar.this.tf_cantidadFocusLost(evt);
            }
            else if (evt.getSource() == btn_buscar) {
                MovimientoArticuloRegistrar.this.btn_buscarFocusLost(evt);
            }
        }

        public void keyPressed(java.awt.event.KeyEvent evt) {
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == tf_cantidad) {
                MovimientoArticuloRegistrar.this.tf_cantidadKeyTyped(evt);
            }
            else if (evt.getSource() == tf_fecha) {
                MovimientoArticuloRegistrar.this.tf_fechaKeyTyped(evt);
            }
            else if (evt.getSource() == tf_valor) {
                MovimientoArticuloRegistrar.this.tf_valorKeyTyped(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == tabla) {
                MovimientoArticuloRegistrar.this.tablaMouseClicked(evt);
            }
            else if (evt.getSource() == list_filtros) {
                MovimientoArticuloRegistrar.this.list_filtrosMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelar3ActionPerformed

    private void btn_guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar3ActionPerformed
        // TODO add your handling code here:
      
       
      
            
                Articulo a=(Articulo) obtenerArticulo(tf_articulo.getText()) ;
               resp=  JOptionPane.showConfirmDialog(null,"Desea extraer el articulo?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
               if (resp==JOptionPane.YES_OPTION){

                  MovimientoStock mv = new MovimientoStock();
                  mv.setCodigoArticulo(a);
                  mv.setCantidad(Integer.parseInt(tf_cantidad.getText()));
                  mv.setFechaHora(tf_fecha.getText());
                  
                    entityManager.getTransaction().begin();
                    entityManager.persist(mv);
                    entityManager.flush();
                    registrarAuditoria("Creacion","Movimiento Stock",mv.toString(), "No hay cambios");
                    
                    //actualizar la cantidad en stock
                    Articulo art= obtenerArticulo(tf_articulo.getText());
                    String antes = art.toString();
                    art.setCodigoArticulo(a.getCodigoArticulo());
                    art.setCantidadStock(cantidadActual-Integer.parseInt(tf_cantidad.getText()));
                    art.setCantidadMaxima(a.getCantidadMaxima());
                    art.setCantidadMinima(a.getCantidadMinima());
                    art.setCodCategoria(a.getCodCategoria());
                    art.setPrecio(a.getPrecio());
                    art.setTipo(a.getTipo());
                    art.setCodigoProveedor(a.getCodigoProveedor());
                    art.setCosto(a.getCosto());
                    art.setNombre(a.getNombre());
                    //entityManager.getTransaction().begin();
                    entityManager.merge(art);
                    entityManager.flush();
                    registrarAuditoria("Modificacion Articulo","cantidad Stock",antes,art.toString());
                    
                    
                    
                    //verificar y generar en caso necesario orden compra
                  if (art.getCantidadStock()<=art.getCantidadMinima()){
                 
                   //genera detall de la orden de compra
                   DetalleOrdenCompra detalleOC= new DetalleOrdenCompra();
                   detalleOC.setCantidadPedida(art.getCantidadMaxima()-art.getCantidadStock());
                   detalleOC.setCodArticulo(art);
                   detalleOC.setCodProveedor(art.getCodigoProveedor());
                   detalleOC.setEstado("pendiente");
                   entityManager.persist(detalleOC);
                   entityManager.flush();
                   registrarAuditoria("Creacion","orden compra",detalleOC.toString(), "no hay cambios");
                    entityManager.getTransaction().commit();
                   // entityManager.close();
                    
                    JOptionPane.showMessageDialog(null,"Extraccion de Articulo Exitosa", "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    refrescar();
                    btn_guardar3.setEnabled(false);
                  }
               }
        
    }//GEN-LAST:event_btn_guardar3ActionPerformed

    private void tf_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadKeyTyped
        // TODO add your handling code here:
        int limite=4;
        if(tf_cantidad.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_tf_cantidadKeyTyped

    private void tf_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_articuloFocusLost
        // TODO add your handling code here:
       
              
    }//GEN-LAST:event_tf_articuloFocusLost

    private void tf_cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cantidadFocusLost
           
        
        if ( cantidadActual<(Integer.parseInt(tf_cantidad.getText()))){
                    
                    resp = JOptionPane.showConfirmDialog(null,"No se cuenta en stock actual con la cantidad solicitada, Desea extraer la cantidad con la que se cuenta actualmente en stock?", "Confirmar Modificación",JOptionPane.YES_NO_OPTION );
                    if (resp==JOptionPane.YES_OPTION){
                        tf_cantidad.setText(String.valueOf(cantidadActual));
                        tf_cantidad.setEnabled(false);
                    }
                    else{
                                tf_cantidad.requestFocus();
                     } 
         }
     
    }//GEN-LAST:event_tf_cantidadFocusLost

    private void tf_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_articuloFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_articuloFocusGained

    private void tf_cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cantidadFocusGained
       
    }//GEN-LAST:event_tf_cantidadFocusGained

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
         fila=tabla.getSelectedRow();
         articulo=(String)tabla.getValueAt(fila, 1);
         btn_guardar3.setEnabled(true);
         //validar que tenga stock 
       
         cantidadActual =(Integer)tabla.getValueAt(fila, 2);

                if (cantidadActual<=0 ){
                    
                   JOptionPane.showMessageDialog(null,"No se cuenta en stock actual con la cantidad solicitada, seleccione otro articulo", "Error",JOptionPane.ERROR_MESSAGE);
                   return;
                }
                else{
                    tf_articulo.setText(articulo);
                    tf_cantidad.setEnabled(true);
                   
                    
                }
    }//GEN-LAST:event_tablaMouseClicked

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if(list_filtros.getSelectedItem()=="Nombre" ){
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }else{
            if(list_filtros.getSelectedItem()=="Código"){
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
            if(list_filtros.getSelectedItem()=="Código"){
                id=Integer.parseInt(tf_valor.getText());
                articuloQuery=entityManager.createNamedQuery( "Articulo.findByCodigoArticulo");
                articuloQuery.setParameter("codigoArticulo", id);
                List<Articulo> a=articuloQuery.getResultList();
                if (a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                articuloList.clear();
                articuloList.addAll(a);

            }
            else if (list_filtros.getSelectedItem()=="Proveedor"){
                articuloQuery = entityManager.createNativeQuery( "SELECT * FROM articulo a "
                    + "INNER JOIN proveedor p "
                    + "on a.codigoProveedor = p.codigoProveedor "
                    + "WHERE p.razonSocial LIKE "
                    //SELECT p FROM Proveedor p WHERE p.razonSocial
                    +"'%"+tf_valor.getText()+"%'", Articulo.class);
                List<Articulo> ar = articuloQuery.getResultList();
                if (ar.size()==0){
                    JOptionPane.showMessageDialog(null," Nombre Proveedor Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                articuloList.clear();
                articuloList.addAll(ar);
            }

            if(list_filtros.getSelectedItem()=="Nombre"){
                articuloQuery = entityManager.createNativeQuery( "SELECT * FROM articulo WHERE nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Articulo.class);
                List<Articulo> a=articuloQuery.getResultList();
                if (a.size()==0){
                    JOptionPane.showMessageDialog(null,"Nombre de articulo inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                articuloList.clear();
                articuloList.addAll(a);

            }

        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void tf_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_fechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fechaKeyTyped

    private void tf_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fechaActionPerformed
                       
private void registrarAuditoria(String accion, String entidad,String antes, String despues){
            AuditoriaSistema as=new AuditoriaSistema();
            Date fecha=new Date();
            DateFormat formato=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            as.setAccion(accion);
            as.setTabla(entidad);
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            as.setAntes(antes);
            as.setDespues(despues);
            entityManager.persist(as);
            entityManager.flush();
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bean.Articulo> articuloList;
    private javax.persistence.Query articuloQuery;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar3;
    private javax.swing.JButton btn_guardar3;
    private javax.swing.JLabel cantidadMinimaLabel;
    private javax.swing.JLabel cantidadMinimaLabel1;
    private java.util.List<bean.Empleado> empleadoList;
    private javax.persistence.Query empleadoQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_registrarC;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.MovimientoStock> list;
    private javax.swing.JComboBox list_filtros;
    private javax.persistence.Query query;
    private static javax.swing.JTable tabla;
    public javax.swing.JTextField tf_articulo;
    private javax.swing.JTextField tf_cantidad;
    public static javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(MovimientoArticuloRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimientoArticuloRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimientoArticuloRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimientoArticuloRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new MovimientoArticuloRegistrar();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Registrar Extraccion de Articulo");
                
            }
        });
    }
 
        
    private void inicializar(){
         Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    tf_fecha.setText(formato.format(fecha));
        
    }
     private Articulo obtenerArticulo(String nombre){
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
        EntityManager ema = fact.createEntityManager();
        Query query = ema.createNamedQuery("Articulo.findByNombre");
        query.setParameter("nombre", tf_articulo.getText());
        List<Articulo> a = query.getResultList();
        Articulo nom = null;
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
     
    
     
      public void refrescar(){
          articuloQuery=entityManager.createNativeQuery("select * from articulo " +
                                                        "where tipo='Insumo'", Articulo.class);
                List<Articulo> a=articuloQuery.getResultList();
               
                articuloList.clear();
                articuloList.addAll(a);
                tf_articulo.setText(null);
                tf_cantidad.setText(null);
                tf_articulo.setEnabled(false);
                tf_cantidad.setEnabled(false);

     }
      public void llenarTablaArticulo(){
         articuloQuery=entityManager.createNativeQuery("select * from articulo " +
                                                        "where tipo='Insumo'", Articulo.class);
                List<Articulo> a=articuloQuery.getResultList();
               
                articuloList.clear();
                articuloList.addAll(a);
      }
}
