/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Banco;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir
 */
public class BancoCrear extends javax.swing.JFrame {

    /**
     * Creates new form BancoCrear
     */
    public BancoCrear() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cb_tipoEntidad = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        panel_crearRol = new javax.swing.JPanel();
        lbl_registrarRol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_nombre.setText("Nombre:");

        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        tf_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreFocusLost(evt);
            }
        });
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jLabel1.setText("Tipo de Entidad:");

        cb_tipoEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banco", "Financiera", "Cooperativa" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbl_nombre)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_tipoEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_tipoEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_crearRol.setBackground(new java.awt.Color(0, 153, 255));
        panel_crearRol.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarRol.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_registrarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarRol.setText("Registrar Entidad");

        javax.swing.GroupLayout panel_crearRolLayout = new javax.swing.GroupLayout(panel_crearRol);
        panel_crearRol.setLayout(panel_crearRolLayout);
        panel_crearRolLayout.setHorizontalGroup(
            panel_crearRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearRolLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbl_registrarRol)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        panel_crearRolLayout.setVerticalGroup(
            panel_crearRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_crearRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_crearRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_crearRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void tf_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_nombreFocusLost

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        int limite = 45;
        char ch = evt.getKeyChar();
        // TODO add your handling code here:
        if(tf_nombre.getText().length()==limite){
            getToolkit().beep();
            evt.consume(); //se le ignora

        }
        
        if(Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombreKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if (tf_nombre.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algun valor para el campo nombre", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager entityManager = fact.createEntityManager();
            //Query query=entityManager.createNamedQuery("Rol.findByNombre");
            //query.setParameter("nombre",tf_nombre.getText().toLowerCase());
            //List<Rol> rol= query.getResultList();
            /*if(rol.size()>=1){//comprueba si ya existe un rol con el mismo nombre
                JOptionPane.showMessageDialog(null,"Ya existe un rol con el mismo nombre", "Aviso",JOptionPane.ERROR_MESSAGE);
                tf_nombre.setText(null);
                return;
            }*/
            //else{
                int resp=  JOptionPane.showConfirmDialog(null,"Desea Registrar el Banco?", "Confirmar Creación",JOptionPane.YES_NO_OPTION );
                if (resp==JOptionPane.YES_OPTION){
                    entityManager.getTransaction().begin();
                    Banco r=new Banco();
                    r.setNombre(tf_nombre.getText());
                    r.setTipoEntidad(cb_tipoEntidad.getSelectedItem().toString().toLowerCase());
                    //es similar a un commit
                    //registramos los datos necesarios para la auditoria
                    AuditoriaSistema as=new AuditoriaSistema();
                    as.setAccion("Inserción");
                    as.setTabla("Banco");
                    as.setAntes(r.toString());
                    as.setDespues("No hay cambios");
                    //trabajamos con la fecha
                    Date fecha=new Date();
                    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    as.setFechaHora(formato.format(fecha));
                    as.setUsuario("vladimir");
                    //as.setUsuario(LoginView.nombreUsuario);
                    try{
                        entityManager.persist(r);
                        entityManager.flush();
                        entityManager.persist(as);
                        entityManager.getTransaction().commit();
                        JOptionPane.showMessageDialog(null,"Creación exitosa", 
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }catch(javax.persistence.PersistenceException e){
                        JOptionPane.showMessageDialog(null, "El Banco ya fue registrado");
                        tf_nombre.setText("");
                    }
                    
                    
                    entityManager.close();
                    
              //  }
            }
        }
        tf_nombre.setText("");
        //this.dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btn_guardar.doClick();
        } 
    }//GEN-LAST:event_tf_nombreKeyPressed


    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new BancoCrear();
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setTitle("Crear Banco");
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox cb_tipoEntidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_registrarRol;
    private javax.swing.JPanel panel_crearRol;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}