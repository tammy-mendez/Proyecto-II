/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.AuditoriaSistema;
import bean.Rol;
import bean.Usuario;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Jorge
 */
public class MenuRecepcionista extends javax.swing.JFrame {
     public static int opcion=0;
     String set_look = "com.sun.java.swing.plaf.metal.MetalLookAndFeel";
    

    /**
     * Creates new form MenuRecepcionista
     */
    public MenuRecepcionista() {
        initComponents();
        generarMenuRolOpciones(obtenerRolesUsuario(LoginView.idUsuario));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cliente = new javax.swing.JMenu();
        mItem_crearC = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mItem_editarC = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mItem_eliminarC = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mItem_buscarC = new javax.swing.JMenuItem();
        menu_reserva = new javax.swing.JMenu();
        mItem_registrarReserva = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mItem_editarReserva = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mItem_eliminarReserva = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mItem_buscarReserva2 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mItem_contrato = new javax.swing.JMenuItem();
        menu_presupuesto = new javax.swing.JMenu();
        mItem_generarPre = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mItem_confirmarPre = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mItem_eliminarPres = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItem_buscarPre = new javax.swing.JMenuItem();
        menu_consumo = new javax.swing.JMenu();
        mItem_registrarConsumo2 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mItem_modificarConsumo = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mItem_eliminarConsumo = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mItem_buscarConsumo = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mItem_resumenConsumo = new javax.swing.JMenuItem();
        menu_factura = new javax.swing.JMenu();
        mItem_generarFactura = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mItem_buscarFactura = new javax.swing.JMenuItem();
        menu_roles = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campana2.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));

        menu_cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aluno.png"))); // NOI18N
        menu_cliente.setText(" Clientes");
        menu_cliente.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });

        mItem_crearC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-student.png"))); // NOI18N
        mItem_crearC.setText("Registrar Cliente");
        mItem_crearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_crearCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_crearC);
        menu_cliente.add(jSeparator6);

        mItem_editarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarusuario.png"))); // NOI18N
        mItem_editarC.setText("Editar Cliente");
        mItem_editarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_editarC);
        menu_cliente.add(jSeparator5);

        mItem_eliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        mItem_eliminarC.setText("Eliminar Cliente");
        mItem_eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_eliminarC);
        menu_cliente.add(jSeparator4);

        mItem_buscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarC.setText("Buscar Cliente");
        mItem_buscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarCActionPerformed(evt);
            }
        });
        menu_cliente.add(mItem_buscarC);

        jMenuBar1.add(menu_cliente);

        menu_reserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_reserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva1.png"))); // NOI18N
        menu_reserva.setText(" Reservas");
        menu_reserva.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_reserva.setMaximumSize(new java.awt.Dimension(125, 32800));
        menu_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_reservaActionPerformed(evt);
            }
        });

        mItem_registrarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mItem_registrarReserva.setText("Registrar Reserva");
        mItem_registrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_registrarReservaActionPerformed(evt);
            }
        });
        menu_reserva.add(mItem_registrarReserva);
        menu_reserva.add(jSeparator9);

        mItem_editarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        mItem_editarReserva.setText("Editar Reserva");
        mItem_editarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_editarReservaActionPerformed(evt);
            }
        });
        menu_reserva.add(mItem_editarReserva);
        menu_reserva.add(jSeparator10);

        mItem_eliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        mItem_eliminarReserva.setText("Eliminar Reserva");
        mItem_eliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarReservaActionPerformed(evt);
            }
        });
        menu_reserva.add(mItem_eliminarReserva);
        menu_reserva.add(jSeparator8);

        mItem_buscarReserva2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarReserva2.setText("Buscar Reserva");
        mItem_buscarReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarReserva2ActionPerformed(evt);
            }
        });
        menu_reserva.add(mItem_buscarReserva2);
        menu_reserva.add(jSeparator7);

        mItem_contrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        mItem_contrato.setText("Generar Contrato de Reserva");
        mItem_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_contratoActionPerformed(evt);
            }
        });
        menu_reserva.add(mItem_contrato);

        jMenuBar1.add(menu_reserva);

        menu_presupuesto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_presupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        menu_presupuesto.setText("Presupuesto");
        menu_presupuesto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_presupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_presupuestoMouseClicked(evt);
            }
        });

        mItem_generarPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        mItem_generarPre.setText("Generar Presupuesto");
        mItem_generarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_generarPreActionPerformed(evt);
            }
        });
        menu_presupuesto.add(mItem_generarPre);
        menu_presupuesto.add(jSeparator3);

        mItem_confirmarPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        mItem_confirmarPre.setText("Confirmar Presupuesto");
        mItem_confirmarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_confirmarPreActionPerformed(evt);
            }
        });
        menu_presupuesto.add(mItem_confirmarPre);
        menu_presupuesto.add(jSeparator2);

        mItem_eliminarPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        mItem_eliminarPres.setText("Eliminar Presupuesto");
        mItem_eliminarPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarPresActionPerformed(evt);
            }
        });
        menu_presupuesto.add(mItem_eliminarPres);
        menu_presupuesto.add(jSeparator1);

        mItem_buscarPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarPre.setText("Buscar Presupuesto");
        mItem_buscarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarPreActionPerformed(evt);
            }
        });
        menu_presupuesto.add(mItem_buscarPre);

        jMenuBar1.add(menu_presupuesto);

        menu_consumo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_consumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caixa.png"))); // NOI18N
        menu_consumo.setText("Consumos");
        menu_consumo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        mItem_registrarConsumo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        mItem_registrarConsumo2.setText("Registrar Consumo");
        mItem_registrarConsumo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_registrarConsumo2ActionPerformed(evt);
            }
        });
        menu_consumo.add(mItem_registrarConsumo2);
        menu_consumo.add(jSeparator13);

        mItem_modificarConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refrescar.png"))); // NOI18N
        mItem_modificarConsumo.setText("Modificar Consumo");
        mItem_modificarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_modificarConsumoActionPerformed(evt);
            }
        });
        menu_consumo.add(mItem_modificarConsumo);
        menu_consumo.add(jSeparator14);

        mItem_eliminarConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurero.gif"))); // NOI18N
        mItem_eliminarConsumo.setText("Eliminar Consumo");
        mItem_eliminarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_eliminarConsumoActionPerformed(evt);
            }
        });
        menu_consumo.add(mItem_eliminarConsumo);
        menu_consumo.add(jSeparator12);

        mItem_buscarConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarConsumo.setText("Buscar Consumo");
        mItem_buscarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarConsumoActionPerformed(evt);
            }
        });
        menu_consumo.add(mItem_buscarConsumo);
        menu_consumo.add(jSeparator11);

        mItem_resumenConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        mItem_resumenConsumo.setText("Resumen de Consumo");
        mItem_resumenConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_resumenConsumoActionPerformed(evt);
            }
        });
        menu_consumo.add(mItem_resumenConsumo);

        jMenuBar1.add(menu_consumo);

        menu_factura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura3.png"))); // NOI18N
        menu_factura.setText("Facturas de Cobro");
        menu_factura.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_facturaMouseClicked(evt);
            }
        });

        mItem_generarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/table.png"))); // NOI18N
        mItem_generarFactura.setText("Generar Factura");
        mItem_generarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_generarFacturaActionPerformed(evt);
            }
        });
        menu_factura.add(mItem_generarFactura);
        menu_factura.add(jSeparator15);

        mItem_buscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        mItem_buscarFactura.setText("Buscar Facturas");
        mItem_buscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItem_buscarFacturaActionPerformed(evt);
            }
        });
        menu_factura.add(mItem_buscarFactura);

        jMenuBar1.add(menu_factura);

        menu_roles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_roles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventana2.png"))); // NOI18N
        menu_roles.setText("Roles");
        menu_roles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuBar1.add(menu_roles);

        menu_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        menu_salir.setText("Cerrar Sesión");
        menu_salir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(589, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void mItem_crearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_crearCActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Cliente";
        ClienteCreate.main(args);
    }//GEN-LAST:event_mItem_crearCActionPerformed

    private void mItem_eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarCActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Eliminar Cliente";
        ClienteEliminar.main(args);
    }//GEN-LAST:event_mItem_eliminarCActionPerformed

    private void mItem_editarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarCActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Editar Cliente";
        ClienteEdit.main(args);
    }//GEN-LAST:event_mItem_editarCActionPerformed

    private void mItem_buscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarCActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Buscar Cliente";
        ClienteBuscar.main(args);
    }//GEN-LAST:event_mItem_buscarCActionPerformed

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        // TODO add your handling code here:
           EntityManagerFactory fact=Persistence.createEntityManagerFactory("proyectoPU");
            EntityManager ema= fact.createEntityManager();
            ema.getTransaction().begin();
            //registramos los datos necesarios para la auditoria
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Cerro Sesion");
            as.setTabla("Ninguna");
            //trabajamos con la fecha
            Date fecha=new Date();
            DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            ema.persist(as);
            ema.getTransaction().commit();
            ema.close();
            this.dispose();
            String args[]=new String[1];
            args[0]="Ingreso al sistema";
            LoginView.main(args);
                                  
    }//GEN-LAST:event_menu_salirMouseClicked

    private void mItem_registrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_registrarReservaActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Reserva";
        CrearReserva.main(args);
        
    }//GEN-LAST:event_mItem_registrarReservaActionPerformed

    private void menu_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_reservaActionPerformed
        // TODO add your handling code here:
        JFrame frame=new ConsumoResumen();
        frame.setVisible(true);
        frame.setTitle("Lista de Reservas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_menu_reservaActionPerformed

    private void mItem_editarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_editarReservaActionPerformed
        // TODO add your handling code here:
       
        String args[] = new String[1];
        args[0] = "Modificar Reserva";
        ReservaEditar.main(args);
    }//GEN-LAST:event_mItem_editarReservaActionPerformed

    private void mItem_eliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarReservaActionPerformed
        // TODO add your handling code here:
        String args[] = new String[1];
        args[0] = "Eliminar Reserva";
        ReservaEliminar.main(args);
    }//GEN-LAST:event_mItem_eliminarReservaActionPerformed

    private void mItem_buscarReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarReserva2ActionPerformed
        // TODO add your handling code here:
        opcion = 3;
        String args[] = new String[1];
        args[0] = "Buscar Reserva";
        BuscarReserva.main(args);
    }//GEN-LAST:event_mItem_buscarReserva2ActionPerformed

    private void mItem_registrarConsumo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_registrarConsumo2ActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Registrar Consumo de Producto/Servicio";
        ConsumoPSCreate.main(args);
    }//GEN-LAST:event_mItem_registrarConsumo2ActionPerformed

    private void mItem_modificarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_modificarConsumoActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Modificar Consumo de Producto/Servicio";
        ConsumoPSEdit.main(args);
    }//GEN-LAST:event_mItem_modificarConsumoActionPerformed

    private void mItem_eliminarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarConsumoActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Elimiar Consumo de Producto/Servicio";
        ConsumoPSEliminar.main(args);
    }//GEN-LAST:event_mItem_eliminarConsumoActionPerformed

    private void mItem_buscarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarConsumoActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Buscar Consumo de Producto/Servicio";
        BuscarConsumoPS.main(args);
    }//GEN-LAST:event_mItem_buscarConsumoActionPerformed

    private void menu_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_facturaMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_facturaMouseClicked

    private void mItem_generarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_generarFacturaActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Generar Factura de Cobro";
        ConsumoFactura.main(args);
    }//GEN-LAST:event_mItem_generarFacturaActionPerformed

    private void mItem_buscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarFacturaActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Buscar Factura de Cobro";
        BuscarFacturaCobro.main(args);
    }//GEN-LAST:event_mItem_buscarFacturaActionPerformed

    private void menu_presupuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_presupuestoMouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_menu_presupuestoMouseClicked

    private void mItem_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_contratoActionPerformed
        // TODO add your handling code here:
        opcion = 1;
        String args[] = new String[1];
        args[0] = "Buscar Reserva";
        BuscarReserva.main(args);
    }//GEN-LAST:event_mItem_contratoActionPerformed

    private void mItem_generarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_generarPreActionPerformed
        // TODO add your handling code here:
        String args[]=new String[1];
        args[0]="Generar Presupuesto";
        Presupuestar.main(args);
    }//GEN-LAST:event_mItem_generarPreActionPerformed

    private void mItem_eliminarPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_eliminarPresActionPerformed
        // TODO add your handling code here:
        
         String args[]=new String[1];
        args[0]="Eliminar Presupuesto";
        EliminarPresupuesto.main(args);
    }//GEN-LAST:event_mItem_eliminarPresActionPerformed

    private void mItem_confirmarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_confirmarPreActionPerformed
        // TODO add your handling code here
         String args[]=new String[1];
        args[0]="Buscar Presupuesto";
        ConfirmarPresupuesto.main(args);
    }//GEN-LAST:event_mItem_confirmarPreActionPerformed

    private void mItem_buscarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_buscarPreActionPerformed
        // TODO add your handling code here:
       
         String args[]=new String[1];
        args[0]="Buscar Presupuesto";
        BuscarPresupuesto.main(args);
    }//GEN-LAST:event_mItem_buscarPreActionPerformed

    private void mItem_resumenConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItem_resumenConsumoActionPerformed
        // TODO add your handling code here:
         String args[]=new String[1];
        args[0]="Resumen de consumo del cliente";
        ConsumoResumen.main(args);
    }//GEN-LAST:event_mItem_resumenConsumoActionPerformed
    public void lookandfeel()
    {
        try
        {
        //La variable set look tiene que estar definida arriba como una variable String
        UIManager.setLookAndFeel(set_look);
        SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception error)
        {
        JOptionPane.showMessageDialog(null, error);
        } 
    }
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
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new MenuRecepcionista();
                frame.setTitle("Menu Recepcionista");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem mItem_buscarC;
    private javax.swing.JMenuItem mItem_buscarConsumo;
    private javax.swing.JMenuItem mItem_buscarFactura;
    private javax.swing.JMenuItem mItem_buscarPre;
    private javax.swing.JMenuItem mItem_buscarReserva2;
    private javax.swing.JMenuItem mItem_confirmarPre;
    private javax.swing.JMenuItem mItem_contrato;
    private javax.swing.JMenuItem mItem_crearC;
    private javax.swing.JMenuItem mItem_editarC;
    private javax.swing.JMenuItem mItem_editarReserva;
    private javax.swing.JMenuItem mItem_eliminarC;
    private javax.swing.JMenuItem mItem_eliminarConsumo;
    private javax.swing.JMenuItem mItem_eliminarPres;
    private javax.swing.JMenuItem mItem_eliminarReserva;
    private javax.swing.JMenuItem mItem_generarFactura;
    private javax.swing.JMenuItem mItem_generarPre;
    private javax.swing.JMenuItem mItem_modificarConsumo;
    private javax.swing.JMenuItem mItem_registrarConsumo2;
    private javax.swing.JMenuItem mItem_registrarReserva;
    private javax.swing.JMenuItem mItem_resumenConsumo;
    private javax.swing.JMenu menu_cliente;
    private javax.swing.JMenu menu_consumo;
    private javax.swing.JMenu menu_factura;
    private javax.swing.JMenu menu_presupuesto;
    private javax.swing.JMenu menu_reserva;
    private javax.swing.JMenu menu_roles;
    private javax.swing.JMenu menu_salir;
    // End of variables declaration//GEN-END:variables
    private void generarMenuRolOpciones(Collection<Rol> nombreRoles){
        if(nombreRoles.size() > 1){
            for(final Rol rol : nombreRoles){
                javax.swing.JMenuItem menuItem = new javax.swing.JMenuItem();
                menuItem.setText(rol.getNombre());
                //creación de acctionlisteners para los menus
                menuItem.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        switch (rol.getNombre()) {
                            case "Administrador del Sistema":
                                {
                                    String args[] = new String[1];
                                    args[0] = "Administrador del Sistema";
                                    view.MenuAdminSist.main(args);
                                    dispose();
                                    break;
                                }
                            case "Administrador del Hotel":
                                {
                                    String args[] = new String[1];
                                    args[0] = "Administrador del Hotel";
                                    ViewAdmHotel.MenuAdminHotel.main(args);
                                    dispose();
                                    break;
                                }
                            default:
                                JOptionPane.showMessageDialog(null, "Sin permisos para "
                                        + "esta operación", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }
                });
                if(!menuItem.getText().equals("Recepcionista")){
                    menu_roles.add(menuItem);
                }
            }
        }else{
            menu_roles.setEnabled(false);
        }
        
    }
     private Collection<Rol> obtenerRolesUsuario(int codigoUsuario){
         EntityManagerFactory fact = Persistence.createEntityManagerFactory("proyectoPU");
         EntityManager ema = fact.createEntityManager();
         Query query = ema.createNamedQuery("Usuario.findByCodigoEmpleado");
         query.setParameter("codigoEmpleado", codigoUsuario);
         Usuario usu = (Usuario)query.getSingleResult();
         return usu.getRolCollection();
     }
}
