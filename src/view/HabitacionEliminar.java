/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Habitacion;
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
public class HabitacionEliminar extends javax.swing.JFrame {
    private int resp;

    /**
     * Creates new form HabitacionEliminar
     */
    public HabitacionEliminar() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Habitacion h");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_eliminarHabitacion = new javax.swing.JPanel();
        lbl_eliminarHabitacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_numeroHabit = new javax.swing.JLabel();
        tf_numeroHabit = new javax.swing.JTextField();
        lbl_categoria = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_categoria = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_eliminarHabitacion.setBackground(new java.awt.Color(0, 153, 255));
        panel_eliminarHabitacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_eliminarHabitacion.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_eliminarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarHabitacion.setText("Eliminar Habitación");

        javax.swing.GroupLayout panel_eliminarHabitacionLayout = new javax.swing.GroupLayout(panel_eliminarHabitacion);
        panel_eliminarHabitacion.setLayout(panel_eliminarHabitacionLayout);
        panel_eliminarHabitacionLayout.setHorizontalGroup(
            panel_eliminarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarHabitacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_eliminarHabitacion)
                .addGap(101, 101, 101))
        );
        panel_eliminarHabitacionLayout.setVerticalGroup(
            panel_eliminarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_eliminarHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_eliminarHabitacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_numeroHabit.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_numeroHabit.setText("Número de Habitación:");

        tf_numeroHabit.setEnabled(false);
        tf_numeroHabit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_numeroHabitKeyTyped(evt);
            }
        });

        lbl_categoria.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_categoria.setText("Nombre de Categoría:");

        lbl_codigo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_codigo.setText("Código de Categoría:");

        tf_codigo.setEnabled(false);

        tf_categoria.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_numeroHabit)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(tf_numeroHabit, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_numeroHabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_numeroHabit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_eliminarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_eliminarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_numeroHabitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_numeroHabitKeyTyped

    }//GEN-LAST:event_tf_numeroHabitKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
            // TODO add your handling code here:
            String valor;
            int n=HabitacionBuscar.numero;
            Date fecha1=new Date();
            String fecha2;
            DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
            fecha2=formato1.format(fecha1);
            //para verificar que no se elimine una habitacion que tiene reservas asignadas
            query = entityManager.createNativeQuery( "SELECT * FROM habitacion h "
                    + "INNER JOIN reserva r "
                    + "on h.numero = r.numHabitacion "
                    + "WHERE (r.checkIn>="
                    +"'"+fecha2+"'"
                    +"OR r.checkOut>="
                    +"'"+fecha2+"')"
                    +"AND h.numero="
                    +n, Habitacion.class);
            List<Habitacion> ha=query.getResultList();
            if(ha.size()!=0){
                JOptionPane.showMessageDialog(null, "Esta habitación tiene reservas asignadas, si elimima perderá dichas reservas","Aviso",JOptionPane.INFORMATION_MESSAGE );
                resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
                  if(resp==JOptionPane.YES_OPTION){
                    entityManager.getTransaction().begin();
                    Habitacion h=entityManager.find(Habitacion.class,Integer.parseInt(tf_numeroHabit.getText()) );
                    valor=h.toString();//guardamos el objeto antes de eliminar
                    entityManager.remove(h);
                    //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Eliminación");
                    as.setTabla("Habitacion");
                    as.setAntes(valor);
                    as.setDespues("No hay cambios");
                    //trabajamos con la fecha
                    Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora((formato.format(fecha)));
                    as.setUsuario("nadie");
                    entityManager.persist(as);
                    entityManager.getTransaction().commit();
                    entityManager.close();
                    JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                }
                
            }
            else{
                  resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
                  if(resp==JOptionPane.YES_OPTION){
                    entityManager.getTransaction().begin();
                    Habitacion h=entityManager.find(Habitacion.class,Integer.parseInt(tf_numeroHabit.getText()) );
                    valor=h.toString();//guardamos el objeto antes de eliminar
                    entityManager.remove(h);
                    //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Eliminación");
                    as.setTabla("Habitacion");
                    as.setAntes(valor);
                    as.setDespues("No hay cambios");
                    //trabajamos con la fecha
                    Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora((formato.format(fecha)));
                    as.setUsuario("nadie");
                    entityManager.persist(as);
                    entityManager.getTransaction().commit();
                    entityManager.close();
                    JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
                }
                
            }
            
            this.dispose();
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HabitacionEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new HabitacionBuscar();
                frame.setVisible(true);
                frame.setTitle("Buscar Habitacion");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_eliminarHabitacion;
    private javax.swing.JLabel lbl_numeroHabit;
    private java.util.List<bean.Habitacion> list;
    private javax.swing.JPanel panel_eliminarHabitacion;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_categoria;
    public static javax.swing.JTextField tf_codigo;
    public static javax.swing.JTextField tf_numeroHabit;
    // End of variables declaration//GEN-END:variables
}