/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import circo.Merch;
import java.util.InputMismatchException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author lalit
 */
public class altaMerch extends javax.swing.JFrame {

    /**
     * Creates new form AltaMerch
     */
    public altaMerch() {
        initComponents();
        ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(noRbtn);
        grupoRadios.add(siRbtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        siRbtn = new javax.swing.JRadioButton();
        noRbtn = new javax.swing.JRadioButton();
        tipoMerchTXT = new javax.swing.JTextField();
        precioTXT = new javax.swing.JTextField();
        materialTXT = new javax.swing.JTextField();
        colorTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        aceptarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Tipo de mercancia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Color:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Material:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Necesita empacado?:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Precio de venta:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        siRbtn.setBackground(new java.awt.Color(255, 51, 51));
        siRbtn.setFont(new java.awt.Font("Circus", 1, 24)); // NOI18N
        siRbtn.setForeground(new java.awt.Color(204, 0, 0));
        siRbtn.setText("SI");
        siRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siRbtnActionPerformed(evt);
            }
        });
        getContentPane().add(siRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        noRbtn.setBackground(new java.awt.Color(255, 51, 51));
        noRbtn.setFont(new java.awt.Font("Circus", 1, 24)); // NOI18N
        noRbtn.setForeground(new java.awt.Color(204, 0, 0));
        noRbtn.setText("NO");
        noRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRbtnActionPerformed(evt);
            }
        });
        getContentPane().add(noRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        tipoMerchTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMerchTXTActionPerformed(evt);
            }
        });
        getContentPane().add(tipoMerchTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 250, 30));

        precioTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTXTActionPerformed(evt);
            }
        });
        getContentPane().add(precioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 270, 30));

        materialTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTXTActionPerformed(evt);
            }
        });
        getContentPane().add(materialTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 270, 30));

        colorTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTXTActionPerformed(evt);
            }
        });
        getContentPane().add(colorTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 270, 30));

        nombreTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTXTActionPerformed(evt);
            }
        });
        getContentPane().add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 270, 30));

        aceptarBtn.setBackground(new java.awt.Color(255, 51, 51));
        aceptarBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        aceptarBtn.setForeground(new java.awt.Color(255, 255, 255));
        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 270, 60));

        volverBtn.setBackground(new java.awt.Color(255, 51, 51));
        volverBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regMerch.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1080, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoMerchTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoMerchTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoMerchTXTActionPerformed

    private void precioTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTXTActionPerformed

    private void materialTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTXTActionPerformed

    private void colorTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTXTActionPerformed

    private void nombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTXTActionPerformed

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        try{
            String tipoMerch = tipoMerchTXT.getText(),
                   nombre = nombreTXT.getText(),
                   color = colorTXT.getText(),
                   material = materialTXT.getText();
            
            double precio = Double.parseDouble( precioTXT.getText() );
            boolean empacado = ( siRbtn.isSelected() );
            
            main.merch.add( new Merch(main.idProducto, tipoMerch, nombre, precio, color, material, empacado) );
            main.idProducto++;
            JOptionPane.showMessageDialog(rootPane, "Merch registrada correctamente");
            this.dispose();
            
        }catch(InputMismatchException e){
            JOptionPane.showMessageDialog(rootPane, "Se introdujeron datos invalidos, intentelo de nuevo");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Se introdujeron datos invalidos, intentelo de nuevo");
        }
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Seguro que desea volver? Se perderan los datos no guardados", "Volver", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_volverBtnActionPerformed

    private void siRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siRbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siRbtnActionPerformed

    private void noRbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noRbtnActionPerformed

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
            java.util.logging.Logger.getLogger(altaMerch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaMerch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaMerch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaMerch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaMerch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField colorTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField materialTXT;
    private javax.swing.JRadioButton noRbtn;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField precioTXT;
    private javax.swing.JRadioButton siRbtn;
    private javax.swing.JTextField tipoMerchTXT;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
