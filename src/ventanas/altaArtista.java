/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import circo.Artistas;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class altaArtista extends javax.swing.JFrame {

    /**
     * Creates new form altaArtista
     */
    public altaArtista() {
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

        horasTrabajoTXT = new javax.swing.JTextField();
        vestuarioTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        seguridadTXT = new javax.swing.JTextField();
        tipoShowTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();
        numeroEmpleadoTXT = new javax.swing.JTextField();
        aceptarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horasTrabajoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(horasTrabajoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 100, 30));

        vestuarioTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(vestuarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 270, 30));

        nombreTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 270, 30));

        seguridadTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(seguridadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 270, 30));

        tipoShowTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(tipoShowTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 270, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Tipo de show:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Número de empleado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Descripción de vestuario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Horas de trabajo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Medidas de seguridad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        volverBtn.setBackground(new java.awt.Color(255, 51, 51));
        volverBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 270, 60));

        numeroEmpleadoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
        getContentPane().add(numeroEmpleadoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 100, 30));

        aceptarBtn.setBackground(new java.awt.Color(255, 51, 51));
        aceptarBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        aceptarBtn.setForeground(new java.awt.Color(255, 255, 255));
        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 270, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegArt.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 1080, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Seguro que desea volver? Se perderan los datos no guardados", "Volver", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_volverBtnActionPerformed

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        try{
            String nombre = nombreTXT.getText(),
                   tipoShow = tipoShowTXT.getText(),
                   seguridad = seguridadTXT.getText(),
                   vestuario = vestuarioTXT.getText();
            
            int horasTrabajo = Integer.parseInt( horasTrabajoTXT.getText() ),
                numeroEmpleado = Integer.parseInt( numeroEmpleadoTXT.getText() );
            
        
            main.artistas.add( new Artistas( nombre, horasTrabajo, numeroEmpleado, tipoShow, vestuario, seguridad) );
            JOptionPane.showMessageDialog(rootPane, "Artista registrado correctamente");
            this.dispose();
            
        }catch(InputMismatchException e){
            JOptionPane.showMessageDialog(rootPane, "Se introdujeron datos invalidos, intentelo de nuevo");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Se introdujeron datos invalidos, intentelo de nuevo");
        }
    }//GEN-LAST:event_aceptarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(altaArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaArtista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaArtista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField horasTrabajoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField numeroEmpleadoTXT;
    private javax.swing.JTextField seguridadTXT;
    private javax.swing.JTextField tipoShowTXT;
    private javax.swing.JTextField vestuarioTXT;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
