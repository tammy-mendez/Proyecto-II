/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Proveedor;
import bean.AuditoriaSistema;
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
public class ProveedorEliminar extends javax.swing.JFrame {
    
    private int resp;
 private char ch;
  

    /**
     * Creates new form ProveedoreEdit
     */
    public ProveedorEliminar() {
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Proveedor p");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        panel_editarC = new javax.swing.JPanel();
        lbl_EditarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_telef = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_ruc = new javax.swing.JLabel();
        tf_ruc = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_telef = new javax.swing.JLabel();
        tf_razon = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_tipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_categoria = new javax.swing.JTextField();
        lbl_telef1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_editarC.setBackground(new java.awt.Color(0, 153, 255));
        panel_editarC.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_EditarC.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_EditarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EditarC.setText("Eliminar Proveedor");

        javax.swing.GroupLayout panel_editarCLayout = new javax.swing.GroupLayout(panel_editarC);
        panel_editarC.setLayout(panel_editarCLayout);
        panel_editarCLayout.setHorizontalGroup(
            panel_editarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_editarCLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(lbl_EditarC)
                .addGap(163, 163, 163))
        );
        panel_editarCLayout.setVerticalGroup(
            panel_editarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_EditarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        tf_telef.setEnabled(false);
        tf_telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telefKeyTyped(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_apellido.setText("Tipo:");

        tf_email.setEnabled(false);
        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_emailKeyTyped(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_direccion.setText("Dirección:");

        lbl_cedula.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_cedula.setText("Cedula:");

        lbl_ruc.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_ruc.setText("RUC:");

        tf_ruc.setEnabled(false);
        tf_ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_rucActionPerformed(evt);
            }
        });
        tf_ruc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_rucFocusLost(evt);
            }
        });
        tf_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_rucKeyTyped(evt);
            }
        });

        tf_cedula.setEnabled(false);
        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });
        tf_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cedulaFocusLost(evt);
            }
        });
        tf_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cedulaKeyTyped(evt);
            }
        });

        lbl_email.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_email.setText("Email:");

        tf_direccion.setEnabled(false);
        tf_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_direccionKeyTyped(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_nombre.setText("Razon Social:");

        lbl_telef.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_telef.setText("Teléfono:");

        tf_razon.setEnabled(false);
        tf_razon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_razonActionPerformed(evt);
            }
        });
        tf_razon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_razonKeyTyped(evt);
            }
        });

        lbl_codigo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_codigo.setText("Código:");

        tf_codigo.setEditable(false);
        tf_codigo.setEnabled(false);
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        tf_tipo.setEnabled(false);
        tf_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tipoActionPerformed(evt);
            }
        });
        tf_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_tipoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("'N': Natural o 'J': Juridico");

        tf_categoria.setEnabled(false);

        lbl_telef1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_telef1.setText("Categoria Proveedor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_codigo)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ruc)
                                    .addComponent(lbl_cedula)))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tf_ruc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_nombre)
                                .addGap(18, 18, 18)
                                .addComponent(tf_razon, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_telef1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellido)
                    .addComponent(lbl_direccion)
                    .addComponent(lbl_email)
                    .addComponent(lbl_telef, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(tf_direccion)
                        .addComponent(tf_telef))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cedula))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ruc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre)
                    .addComponent(tf_telef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telef1)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
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

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(btn_eliminar)
                .addGap(34, 34, 34)
                .addComponent(btn_cancelar)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_editarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_editarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefKeyTyped
       
    }//GEN-LAST:event_tf_telefKeyTyped

    private void tf_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyTyped
       
    }//GEN-LAST:event_tf_emailKeyTyped

    private void tf_rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_rucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_rucActionPerformed

    private void tf_rucFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_rucFocusLost
          
    }//GEN-LAST:event_tf_rucFocusLost

    private void tf_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_rucKeyTyped

       
    }//GEN-LAST:event_tf_rucKeyTyped

    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void tf_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cedulaFocusLost
       
    }//GEN-LAST:event_tf_cedulaFocusLost

    private void tf_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cedulaKeyTyped
       
    }//GEN-LAST:event_tf_cedulaKeyTyped

    private void tf_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_direccionKeyTyped
         
    }//GEN-LAST:event_tf_direccionKeyTyped

    private void tf_razonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_razonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_razonActionPerformed

    private void tf_razonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_razonKeyTyped
        
    }//GEN-LAST:event_tf_razonKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tipoActionPerformed

    private void tf_tipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_tipoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_tipoKeyTyped

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        String valor;
        int cod= Integer.parseInt(tf_codigo.getText());
         query=entityManager.createNativeQuery("select * from proveedor p" 
                +" inner join tabla_orden_compra oc on " 
                +" p.codigoProveedor=oc.codigo_proveedor"
                    + " WHERE p.codigoProveedor="
                    +cod, Proveedor.class);
            List<Proveedor> prov1=query.getResultList();
            
       query=entityManager.createNativeQuery("select * from proveedor p" 
                +" inner join factura_pago f on " 
                +" p.codigoProveedor=f.cod_proveedor"
                    + " WHERE p.codigoProveedor="
                    +cod, Proveedor.class);
            List<Proveedor> prov2=query.getResultList();
       
            
        query=entityManager.createNativeQuery("select * from proveedor p" 
                +" inner join articulo a on " 
                +" a.codigoProveedor=p.codigoProveedor"
                    + " WHERE a.codigoProveedor="
                    +cod,Proveedor.class);
            List<Proveedor> prov3=query.getResultList();
            
            if(!prov1.isEmpty() ||!prov2.isEmpty()||!prov3.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Este proveedor posee posee aun movimientos, no puede eliminar","Error",JOptionPane.ERROR_MESSAGE );
                this.dispose();
                return;
            }
        else{   
        resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
        if(resp==JOptionPane.YES_OPTION){
            entityManager.getTransaction().begin();
            Proveedor p=entityManager.find(Proveedor.class,Integer.parseInt(tf_codigo.getText()) );
            valor=p.toString();//guardamos el objeto antes de eliminar
            entityManager.remove(p);
            //registramos los datos necesarios para la auditoria
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Eliminación");
            as.setTabla("Proveedor");
            as.setAntes(valor);
            as.setDespues("No hay cambios");
            //trabajamos con la fecha
            Date fecha=new Date();
            DateFormat formato=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            as.setFechaHora((formato.format(fecha)));
            as.setUsuario(LoginView.nombreUsuario);
            entityManager.persist(as);
            entityManager.getTransaction().commit();
            entityManager.close();
            JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
            this.setVisible(false);
        }else{
            this.setVisible(false);
        }}
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
            java.util.logging.Logger.getLogger(ProveedorEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new ProveedorEliminar();
                frame.setVisible(true);
                frame.setTitle("Eliminar Proveedor");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_EditarC;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_ruc;
    private javax.swing.JLabel lbl_telef;
    private javax.swing.JLabel lbl_telef1;
    private java.util.List<bean.Proveedor> list;
    private javax.swing.JPanel panel_editarC;
    private javax.persistence.Query query;
    public static javax.swing.JTextField tf_categoria;
    public static javax.swing.JTextField tf_cedula;
    public static javax.swing.JTextField tf_codigo;
    public static javax.swing.JTextField tf_direccion;
    public static javax.swing.JTextField tf_email;
    public static javax.swing.JTextField tf_razon;
    public static javax.swing.JTextField tf_ruc;
    public static javax.swing.JTextField tf_telef;
    public static javax.swing.JTextField tf_tipo;
    // End of variables declaration//GEN-END:variables
}
