/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.CategoriaArticulo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tammy
 */
public class CategArticuloCreate extends javax.swing.JFrame {
    private char ch;
    private int resp;

    /**
     * Creates new form CategPSCreate
     */
    public CategArticuloCreate() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM CategoriaArticulo c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_crearCPS = new javax.swing.JPanel();
        lbl_crearCPS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombreCateg = new javax.swing.JLabel();
        tf_nombreCateg = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_crearCPS.setBackground(new java.awt.Color(0, 153, 255));
        panel_crearCPS.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_crearCPS.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        lbl_crearCPS.setForeground(new java.awt.Color(255, 255, 255));
        lbl_crearCPS.setText("Crear Categoría de Articulo");

        javax.swing.GroupLayout panel_crearCPSLayout = new javax.swing.GroupLayout(panel_crearCPS);
        panel_crearCPS.setLayout(panel_crearCPSLayout);
        panel_crearCPSLayout.setHorizontalGroup(
            panel_crearCPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearCPSLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_crearCPS)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panel_crearCPSLayout.setVerticalGroup(
            panel_crearCPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearCPSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_crearCPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nombreCateg.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_nombreCateg.setText("Nombre de categoría:");

        tf_nombreCateg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreCategFocusLost(evt);
            }
        });
        tf_nombreCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreCategKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_nombreCateg)
                .addGap(18, 18, 18)
                .addComponent(tf_nombreCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreCateg)
                    .addComponent(tf_nombreCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
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
                .addGap(23, 23, 23)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_crearCPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_crearCPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreCategKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreCategKeyTyped
        // TODO add your handling code here:
        int limite=45;
        if(tf_nombreCateg.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombreCategKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if (tf_nombreCateg.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Ingrese algun valor para el campo nombre", "Error",JOptionPane.ERROR_MESSAGE);
               
                tf_nombreCateg.setText(null);
                tf_nombreCateg.requestFocus();
         }else{
                //comprobar si ya existe una categoria con el mismo nombre
                query=entityManager.createNamedQuery("CategoriaArticulo.findByDescripcion");
                query.setParameter("descripcion", tf_nombreCateg.getText().toLowerCase());
                List<CategoriaArticulo> c=query.getResultList();
                if(c.size()!=0){
                    JOptionPane.showMessageDialog(null,"Ya existe una categoría con el mismo nombre", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_nombreCateg.setText(null);
                    tf_nombreCateg.requestFocus();
              }
                else{
               
       
              resp=  JOptionPane.showConfirmDialog(null,"Desea Registrar una nueva Categoría de Articulo?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
              if (resp==JOptionPane.YES_OPTION){
                        CategoriaArticulo ca=new CategoriaArticulo();
                        ca.setDescripcion(tf_nombreCateg.getText().toLowerCase());
                        entityManager.getTransaction().begin();
                        entityManager.persist(ca);
                        entityManager.flush();
                         //registramos los datos necesarios para la auditoria
                        AuditoriaSistema as=new AuditoriaSistema();
                        as.setAccion("Inserción");
                        as.setTabla("Categoría de Articulo");
                        as.setAntes(ca.toString());
                        as.setDespues("No hay cambios");
                        //trabajamos con la fecha
                        Date fecha=new Date();
                        DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                        as.setFechaHora(formato.format(fecha));
                        as.setUsuario("nadie");  
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                       // entityManager.close();
                        JOptionPane.showMessageDialog(null,"Creación exitosa", "Confirmación",JOptionPane.INFORMATION_MESSAGE); 
              }
                }
        }
        tf_nombreCateg.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nombreCategFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreCategFocusLost
       
       
    }//GEN-LAST:event_tf_nombreCategFocusLost

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
            java.util.logging.Logger.getLogger(CategArticuloCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategArticuloCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategArticuloCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategArticuloCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CategArticuloCreate();
                frame.setVisible(true);
                frame.setTitle("Crear Categoría Articulo");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_crearCPS;
    private javax.swing.JLabel lbl_nombreCateg;
    private java.util.List<bean.CategoriaArticulo> list;
    private javax.swing.JPanel panel_crearCPS;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_nombreCateg;
    // End of variables declaration//GEN-END:variables
}
