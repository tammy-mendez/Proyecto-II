/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.CategHabitacion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CategHabitEdit extends javax.swing.JFrame {
    private char ch;
    private int resp;

    /**
     * Creates new form CategHabitEdt
     */
    public CategHabitEdit() {
        initComponents();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT ch FROM CategHabitacion ch");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_EditarCH = new javax.swing.JPanel();
        lbl_editarCH = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_codigo = new javax.swing.JTextField();
        lbl_costo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        tf_costo = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_EditarCH.setBackground(new java.awt.Color(0, 153, 255));
        panel_EditarCH.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_editarCH.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        lbl_editarCH.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editarCH.setText("Editar Categoría de Habitación");

        javax.swing.GroupLayout panel_EditarCHLayout = new javax.swing.GroupLayout(panel_EditarCH);
        panel_EditarCH.setLayout(panel_EditarCHLayout);
        panel_EditarCHLayout.setHorizontalGroup(
            panel_EditarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarCHLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_editarCH)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel_EditarCHLayout.setVerticalGroup(
            panel_EditarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_editarCH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigo.setEnabled(false);

        lbl_costo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_costo.setText("Costo por noche:");

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_codigo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_codigo.setText("Código de Categoría:");

        tf_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_costo)
                            .addComponent(lbl_nombre))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costo)
                    .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excluded.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_EditarCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_EditarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String antes;
        String despues;
        int codigo;
         if (tf_nombre.getText().length()==0 || tf_costo.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Algún campo com valor nulo", "Advertencia",JOptionPane.ERROR_MESSAGE);
                return;
             }else{
                    query=entityManager.createNamedQuery("CategHabitacion.findByNombre");
                    query.setParameter("nombre", tf_nombre.getText().toLowerCase());
                    List<CategHabitacion> ch= query.getResultList();
                    if(ch.size()!=0){
                        codigo=ch.get(0).getCodigoCategoria();
                         if(Integer.parseInt(tf_codigo.getText())!=codigo){//pregunta si esta intentando cambiar por un nombre ya existente
                            JOptionPane.showMessageDialog(null,"Ya existe una categoría con el mismo nombre", "Error",JOptionPane.ERROR_MESSAGE);
                            tf_nombre.setText(null);
                            return;
                         }
                    }
                        resp=  JOptionPane.showConfirmDialog(null,"Desea Guardar los cambios?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
                    if (resp==JOptionPane.YES_OPTION){
                        query=entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
                        query.setParameter("codigoCategoria",Integer.parseInt(tf_codigo.getText()));
                        List<CategHabitacion> c=query.getResultList();
                        antes=c.get(0).toString();
                        CategHabitacion ca=new CategHabitacion();
                        ca.setCodigoCategoria(Integer.parseInt(tf_codigo.getText()));
                        ca.setNombre(tf_nombre.getText());
                        ca.setCostoxnoche(Integer.parseInt(tf_costo.getText()));
                        entityManager.getTransaction().begin();
                        entityManager.merge(ca);
                        entityManager.flush();
                        //despues de los cambios
                        despues=ca.toString();
                        //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Modificación");
                        as.setTabla("Categoría de Habitación");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora(formato.format(fecha));    
                        as.setUsuario(LoginView.nombreUsuario);
                        as.setAntes(antes);
                        as.setDespues(despues);
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                        entityManager.close();
                        JOptionPane.showMessageDialog(null, "Modificación Exitosa");
                        
                    }
                }
                this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreFocusLost
    
        
    }//GEN-LAST:event_tf_nombreFocusLost

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
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategHabitEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CategHabitEdit();
                frame.setVisible(false);
                frame.setTitle("Editar Categoría de Habitación");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_editarCH;
    private javax.swing.JLabel lbl_nombre;
    private java.util.List<bean.CategHabitacion> list;
    private javax.swing.JPanel panel_EditarCH;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_codigo;
    public static javax.swing.JTextField tf_costo;
    public static javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}