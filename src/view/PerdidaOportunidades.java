/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jorge
 */
public class PerdidaOportunidades extends javax.swing.JFrame {

    /**
     * Creates new form PerdidaOportunidades
     */
    public PerdidaOportunidades() {
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

        panel_BuscarRol = new javax.swing.JPanel();
        lbl_BuscarRol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_hasta = new javax.swing.JLabel();
        lbl_fechaDesde = new javax.swing.JLabel();
        ch_desde = new com.toedter.calendar.JDateChooser();
        ch_hasta = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_BuscarRol.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarRol.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarRol.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        lbl_BuscarRol.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarRol.setText("Generar Informe de Pérdida de  Oportunidades");

        javax.swing.GroupLayout panel_BuscarRolLayout = new javax.swing.GroupLayout(panel_BuscarRol);
        panel_BuscarRol.setLayout(panel_BuscarRolLayout);
        panel_BuscarRolLayout.setHorizontalGroup(
            panel_BuscarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarRolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_BuscarRol)
                .addGap(33, 33, 33))
        );
        panel_BuscarRolLayout.setVerticalGroup(
            panel_BuscarRolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarRolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_BuscarRol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_hasta.setText("Hasta:");

        lbl_fechaDesde.setText("Desde:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_fechaDesde)
                .addGap(18, 18, 18)
                .addComponent(ch_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lbl_hasta)
                .addGap(26, 26, 26)
                .addComponent(ch_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hasta)
                    .addComponent(lbl_fechaDesde)
                    .addComponent(ch_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_generar)
                .addGap(60, 60, 60)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_BuscarRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel_BuscarRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        if(ch_hasta.getDate()==null || ch_desde.getDate()==null){
            JOptionPane.showMessageDialog(null,"Especifique alguna fecha para generar el informe", "Error",JOptionPane.ERROR_MESSAGE);
             return;
        }
          if(ch_hasta.getDate().before(ch_desde.getDate())|| ch_desde.getDate().after(ch_hasta.getDate())){
             JOptionPane.showMessageDialog(null,"Rango de Fechas Inválidas", "Error",JOptionPane.ERROR_MESSAGE);
             return;
         }
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
          String desde=format.format(ch_desde.getDate());
          String hasta=format.format(ch_hasta.getDate());
         
           try
              {
                   Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                    HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                    par.put("FechaDesde",desde );
                     par.put("FechaHasta",hasta );
                     par.put("CantDias", cantidadDias());
                    JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/perdidasOportunidades.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                    JasperViewer jv = new JasperViewer(jp,false);
                    jv.setVisible(true);
                    jv.setTitle("Informe de Pérdidas de  Oportunidades");
                    Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                    jv.setIconImage(icon);
                    jv.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:3
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    private long cantidadDias(){
         final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
         long cantidadDias = (ch_hasta.getDate().getTime() - ch_desde.getDate().getTime())/MILLSECS_PER_DAY;
           System.out.println("Fecha calculada"+" "+cantidadDias);
          return  cantidadDias;
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
            java.util.logging.Logger.getLogger(PerdidaOportunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerdidaOportunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerdidaOportunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerdidaOportunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new PerdidaOportunidades();
                frame.setVisible(true);
                frame.setTitle("Generar Informe de  Pérdidas de Oportunidades");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_generar;
    private com.toedter.calendar.JDateChooser ch_desde;
    private com.toedter.calendar.JDateChooser ch_hasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_BuscarRol;
    private javax.swing.JLabel lbl_fechaDesde;
    private javax.swing.JLabel lbl_hasta;
    private javax.swing.JPanel panel_BuscarRol;
    // End of variables declaration//GEN-END:variables
}
