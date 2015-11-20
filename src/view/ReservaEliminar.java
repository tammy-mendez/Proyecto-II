/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Reserva;
import bean.Rol;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static view.RolEliminar.tf_identi;

/**
 *
 * @author Vladimir
 */
public class ReservaEliminar extends javax.swing.JFrame {
    public static Reserva reserva;
    private int resp;
    /**
     * Creates new form ReservaEliminar
     */
    public ReservaEliminar() {
        initComponents();
        inicializarReserva();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_cantidadPersonas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_montoAbonado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jc_checkin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jc_checkout = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_montoTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_precioCategoria = new javax.swing.JTextField();
        tf_numeroHabitacion = new javax.swing.JTextField();
        tf_categoriaHabitacion = new javax.swing.JTextField();
        tf_cedulaCliente = new javax.swing.JTextField();
        panel_CrearReserva = new javax.swing.JPanel();
        lbl_BuscarRol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_elimnar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Cédula Cliente:");

        jLabel3.setText("Cant Personas:");

        tf_cantidadPersonas.setEnabled(false);
        tf_cantidadPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadPersonasKeyTyped(evt);
            }
        });

        jLabel4.setText("Monto Abonado:");

        tf_montoAbonado.setText("0");
        tf_montoAbonado.setEnabled(false);
        tf_montoAbonado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_montoAbonadoFocusLost(evt);
            }
        });
        tf_montoAbonado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_montoAbonadoKeyTyped(evt);
            }
        });

        jLabel1.setText("Check In:");

        jc_checkin.setEnabled(false);

        jLabel5.setText("Check Out:");

        jc_checkout.setEnabled(false);
        jc_checkout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jc_checkoutFocusLost(evt);
            }
        });

        jLabel6.setText("Categoría Hab:");

        jLabel7.setText("N° Habitación:");

        jLabel8.setText("Monto Total:");

        tf_montoTotal.setEnabled(false);

        jLabel11.setText("Precio de Cat:");

        tf_precioCategoria.setEnabled(false);

        tf_numeroHabitacion.setEnabled(false);
        tf_numeroHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_numeroHabitacionFocusLost(evt);
            }
        });

        tf_categoriaHabitacion.setEnabled(false);

        tf_cedulaCliente.setEnabled(false);
        tf_cedulaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cedulaClienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc_checkin, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jc_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_categoriaHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(tf_precioCategoria)
                            .addComponent(tf_numeroHabitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_montoAbonado, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(tf_cantidadPersonas)
                            .addComponent(tf_montoTotal)
                            .addComponent(tf_cedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_cedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_montoAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jc_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jc_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_categoriaHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_precioCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_numeroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        panel_CrearReserva.setBackground(new java.awt.Color(0, 153, 255));
        panel_CrearReserva.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Eliminar Reserva");

        javax.swing.GroupLayout panel_CrearReservaLayout = new javax.swing.GroupLayout(panel_CrearReserva);
        panel_CrearReserva.setLayout(panel_CrearReservaLayout);
        panel_CrearReservaLayout.setHorizontalGroup(
            panel_CrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CrearReservaLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lbl_BuscarRol)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        panel_CrearReservaLayout.setVerticalGroup(
            panel_CrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CrearReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_BuscarRol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_elimnar.setText("Eliminar");
        btn_elimnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimnarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_elimnar)
                .addGap(77, 77, 77)
                .addComponent(btn_cancelar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_elimnar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel_CrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_CrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cantidadPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadPersonasKeyTyped

    }//GEN-LAST:event_tf_cantidadPersonasKeyTyped

    private void tf_montoAbonadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_montoAbonadoFocusLost
        // TODO add your handling code here
        tf_montoAbonado.setText("0");
    }//GEN-LAST:event_tf_montoAbonadoFocusLost

    private void tf_montoAbonadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_montoAbonadoKeyTyped

    }//GEN-LAST:event_tf_montoAbonadoKeyTyped

    private void jc_checkoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jc_checkoutFocusLost

    }//GEN-LAST:event_jc_checkoutFocusLost

    private void tf_numeroHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_numeroHabitacionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numeroHabitacionFocusLost

    private void tf_cedulaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cedulaClienteFocusLost

    }//GEN-LAST:event_tf_cedulaClienteFocusLost

    private void btn_elimnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimnarActionPerformed
            String valor;
            Date fecha1=new Date();
            String fecha2;
            DateFormat formato1=new SimpleDateFormat("yyyy-MM-dd");
            fecha2=formato1.format(fecha1);
            EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema= fact.createEntityManager();
            Query query ;
            int codigo=reserva.getCodigoReserva();
         //verificamos si el consumo corresponde a un reserva vigente que aun no ha sido cancelada
            query=ema.createNativeQuery("SELECT * FROM  reserva r "
                    + "WHERE (r.checkIn<="
                    +"'"+fecha2+"' "
                    +"AND r.checkOut>="
                    +"'"+fecha2+"') "
                    +"AND r.codigoReserva="
                    +codigo,Reserva.class);
            List<Reserva> p=query.getResultList();
            if(!p.isEmpty()){
                JOptionPane.showMessageDialog(null, "Esta reserva aún sigue vigente","Error",JOptionPane.ERROR_MESSAGE );
                this.dispose();
                return;
            }
        resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
        if(resp==JOptionPane.YES_OPTION){

            ema.getTransaction().begin();
            Reserva reservaFind=ema.find(Reserva.class, reserva.getCodigoReserva() );
            valor=reservaFind.toString();//guardamos el objeto antes de eliminar
            ema.remove(reservaFind);
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Eliminación");
            as.setTabla("Reserva");
            Date fecha=new Date();
            DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            as.setAntes(valor);
            as.setDespues("No hay modificaciones");
            ema.persist(as);
            ema.getTransaction().commit();
            ema.close();
            JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
        }
        this.dispose();
    }//GEN-LAST:event_btn_elimnarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new ReservaEliminar();
                frame.setVisible(true);
                frame.setTitle("Reserva Eliminar");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_elimnar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static com.toedter.calendar.JDateChooser jc_checkin;
    public static com.toedter.calendar.JDateChooser jc_checkout;
    private javax.swing.JLabel lbl_BuscarRol;
    private javax.swing.JPanel panel_CrearReserva;
    public static javax.swing.JTextField tf_cantidadPersonas;
    public static javax.swing.JTextField tf_categoriaHabitacion;
    public static javax.swing.JTextField tf_cedulaCliente;
    public static javax.swing.JTextField tf_montoAbonado;
    public static javax.swing.JTextField tf_montoTotal;
    public static javax.swing.JTextField tf_numeroHabitacion;
    public static javax.swing.JTextField tf_precioCategoria;
    // End of variables declaration//GEN-END:variables

    private void inicializarReserva(){
        tf_cedulaCliente.setText(reserva.getCodigoCliente().getCedula());
        tf_cantidadPersonas.setText(Integer.toString(reserva.getCantPersonas()));
        tf_montoAbonado.setText(Integer.toString(reserva.getMontoAbonado()));
        tf_montoTotal.setText(Integer.toString(reserva.getMontoTotal()));
        tf_numeroHabitacion.setText(Integer.toString(reserva.getNumHabitacion().getNumero()));
        tf_precioCategoria.setText(Integer.toString(reserva.getNumHabitacion().getCodigoCategoria().getCostoxnoche()));
        tf_categoriaHabitacion.setText(reserva.getNumHabitacion().getCodigoCategoria().getNombre());
        
        jc_checkin.setDate(reserva.getCheckIn());
        jc_checkout.setDate(reserva.getCheckOut());
    }
}
