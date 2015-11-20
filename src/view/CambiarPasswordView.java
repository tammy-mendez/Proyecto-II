/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CambiarPasswordView.java
 *
 * Created on 21/07/2015, 05:33:20 PM
 */

package view;

import bean.AuditoriaSistema;
import bean.Correo;
import bean.Empleado;
import bean.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static view.LoginView.nombreUsuario;

/**
 *
 * @author Jorge
 */
public class CambiarPasswordView extends javax.swing.JFrame {
    private int longitud=6;
    private int lim=11;
    private char ch;
     List<Usuario> u;
    private int limite=45;
    private int codEmpl;
    private int cantidad=0;
    private String nombre;
    private String datos[]=new String[5];

    /** Creates new form CambiarPasswordView */
    public CambiarPasswordView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel1 = new javax.swing.JPanel();
        tf_codempl = new javax.swing.JTextField();
        lbl_actual = new javax.swing.JLabel();
        lbl_codempl = new javax.swing.JLabel();
        tf_actual = new javax.swing.JPasswordField();
        btn_aceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_nueva = new javax.swing.JPasswordField();
        tf_nueva2 = new javax.swing.JPasswordField();
        lbl_nueva = new javax.swing.JLabel();
        lbl_nueva2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_cambiar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambiar Contraseña");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tf_codempl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_codemplFocusLost(evt);
            }
        });
        tf_codempl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codemplKeyTyped(evt);
            }
        });

        lbl_actual.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_actual.setText("Contraseña Actual:");

        lbl_codempl.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_codempl.setText("Codigo Usuario:");

        tf_actual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_actualFocusLost(evt);
            }
        });
        tf_actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_actualKeyTyped(evt);
            }
        });

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_codempl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_actual))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(tf_codempl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(btn_aceptar)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codempl)
                    .addComponent(tf_codempl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_actual))
                .addGap(28, 28, 28)
                .addComponent(btn_aceptar)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tf_nueva.setEnabled(false);
        tf_nueva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nuevaFocusLost(evt);
            }
        });
        tf_nueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nuevaKeyTyped(evt);
            }
        });

        tf_nueva2.setEnabled(false);
        tf_nueva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nueva2ActionPerformed(evt);
            }
        });
        tf_nueva2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nueva2KeyTyped(evt);
            }
        });

        lbl_nueva.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nueva.setText("Nueva contraseña:");

        lbl_nueva2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nueva2.setText("Vuelva a escribir la contraseña:");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("longitud mínima de 6 caracteres");

        btn_cambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        btn_cambiar.setText("Cambiar");
        btn_cambiar.setEnabled(false);
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btn_cambiar)
                                .addGap(31, 31, 31))
                            .addComponent(lbl_nueva2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btn_cancelar)
                                .addGap(46, 46, 46))
                            .addComponent(tf_nueva2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl_nueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nueva)
                    .addComponent(tf_nueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nueva2)
                            .addComponent(tf_nueva2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cambiar)
                            .addComponent(btn_cancelar))
                        .addGap(19, 19, 19))))
        );

        jLabel1.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Proporcione su Código y Contraseña");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Escriba su nueva Contraseña");
        jLabel2.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nuevaKeyTyped
        // TODO add your handling code here:
        if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_nuevaKeyTyped

    private void tf_nueva2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nueva2KeyTyped
        // TODO add your handling code here:
        if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_nueva2KeyTyped

    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
        // TODO add your handling code here:
        if(tf_nueva.getText().length()==0 || tf_nueva2.getText().length()==0){
            JOptionPane.showMessageDialog(null,"No ha ingresado valor para la nueva contraseña", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(tf_nueva.getText().equals(tf_nueva2.getText())){
           
                entityManager.getTransaction().begin();
                Usuario usu =new Usuario();
                usu.setCodigoEmpleado(u.get(0).getCodigoEmpleado());
                usu.setPassword(tf_nueva.getText());
                usu.setIdRol(u.get(0).getIdRol());
                entityManager.merge(usu);
                //registramos los datos necesarios para la auditoria
                query=entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
                query.setParameter("codigoEmpleado", u.get(0).getCodigoEmpleado());
                List<Empleado> e = query.getResultList();
                nombre=e.get(0).getNombre();
                AuditoriaSistema as=new AuditoriaSistema();
                as.setAccion("Cambio su contraseña");
                as.setTabla("Ninguna");
                //trabajamos con la fecha
                Date fecha=new Date();
                DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                as.setFechaHora(formato.format(fecha));
                as.setUsuario(nombre);
                entityManager.persist(as);
                entityManager.getTransaction().commit();
                entityManager.close();
                datos[0]=e.get(0).getEmail();
                datos[1]="Modificación de Contraseña";
                datos[2]="Su nueva contraseña de acceso al sistema es:"+" "+"'"+usu.getPassword()+"'";
                 Correo c=new Correo();
                     if(c.enviarCorreo(datos)){
                         JOptionPane.showMessageDialog(null,"Modificacion Exitosa, su nueva contraseña fue enviada a su email", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                         this.dispose();
                         String args[]=new String[1];
                         args[0]="Ingreso al Sistema";
                         LoginView.main(args);
                         
                     }else{
                         JOptionPane.showMessageDialog(null,"Modificación Exitosa,su nueva contraseña no pudo ser enviada; verifique su dirrecion de email", "Error",JOptionPane.ERROR_MESSAGE);
                         this.dispose();
                     }       
        }
        else{
            JOptionPane.showMessageDialog(null,"Las Contraseñas no coiciden", "Error",JOptionPane.ERROR_MESSAGE);
            tf_nueva2.setText(null);
            cantidad++;
            if(cantidad==3){
               this.dispose();
               cantidad=0;
               String args[]=new String[1];
               args[0]="Ingreso al Sistema";
               LoginView.main(args);
            }
            return;
        }
    }//GEN-LAST:event_btn_cambiarActionPerformed

    private void tf_actualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_actualKeyTyped
        // TODO add your handling code here:
        if(tf_actual.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
    }//GEN-LAST:event_tf_actualKeyTyped

    private void tf_actualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_actualFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf_actualFocusLost

    private void tf_codemplKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codemplKeyTyped
        // TODO add your handling code here:
         if(tf_codempl.getText().length()==lim){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_codemplKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nueva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nueva2ActionPerformed

    private void tf_nuevaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nuevaFocusLost
        // TODO add your handling code here:
        if(tf_nueva.getText().length()<longitud){
            JOptionPane.showMessageDialog(null,"La contraseña debe tener 6 caracteres como mínimo", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_tf_nuevaFocusLost

    private void tf_codemplFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_codemplFocusLost
        // TODO add your handling code here:
        if(tf_codempl.getText().length()==0){
             JOptionPane.showMessageDialog(null,"No ha ingresado su codigo de usuario", "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_tf_codemplFocusLost

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
         if( tf_actual.getText().length()==0 || tf_codempl.getText().length()==0){
            JOptionPane.showMessageDialog(null,"No ha ingresado su contraseña actual", "Error",JOptionPane.ERROR_MESSAGE);
            return;

        }else{
            codEmpl=Integer.parseInt(tf_codempl.getText());
            query = entityManager.createNamedQuery( "Usuario.findByCodigoEmpleado");
            query.setParameter("codigoEmpleado",codEmpl);
             u = query.getResultList();
            if(u.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Código de empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                 tf_codempl.setText(null);
                 return;
            }else{
                if(u.get(0).getPassword().equals(tf_actual.getText())){
                    tf_actual.setEnabled(false);
                    tf_codempl.setEnabled(false);
                    btn_aceptar.setEnabled(false);
                    tf_nueva.setEnabled(true);
                    tf_nueva2.setEnabled(true);
                    btn_cambiar.setEnabled(true);
                    btn_cancelar.setEnabled(true);
                  }else{
                     JOptionPane.showMessageDialog(null,"Contraseña Incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
                     tf_actual.setText(null);
                     cantidad++;
                     if(cantidad==3){
                         this.setVisible(false);
                         cantidad=0;
                         String args[]=new String[1];
                         args[0]="Ingreso al Sistema";
                         LoginView.main(args);
                     }
                     return;
                }
             }
           }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CambiarPasswordView();
                frame.setVisible(true);
                frame.setTitle("Cambiar Contraseña");
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JButton btn_cancelar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_actual;
    private javax.swing.JLabel lbl_codempl;
    private javax.swing.JLabel lbl_nueva;
    private javax.swing.JLabel lbl_nueva2;
    private java.util.List<bean.Usuario> list;
    private javax.persistence.Query query;
    private javax.swing.JPasswordField tf_actual;
    private javax.swing.JTextField tf_codempl;
    private javax.swing.JPasswordField tf_nueva;
    private javax.swing.JPasswordField tf_nueva2;
    // End of variables declaration//GEN-END:variables

}
