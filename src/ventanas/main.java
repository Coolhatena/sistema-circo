/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import circo.Alimentos;
import circo.Artistas;
import circo.Insumo;
import circo.Merch;
import circo.Trabajadores;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class main extends javax.swing.JFrame {
    static ArrayList<Trabajadores> trabajadores = new ArrayList<>();
    static ArrayList<Artistas> artistas = new ArrayList<>();
    
    static ArrayList<Alimentos> alimentos = new ArrayList<>();
    static ArrayList<Merch> merch = new ArrayList<>();
    static ArrayList<Insumo> insumos = new ArrayList<>();
    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaArticulosBtn = new javax.swing.JButton();
        altaArticuloBtn = new javax.swing.JButton();
        altaEmpleadoBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        ListaEmpleadoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaArticulosBtn.setBackground(new java.awt.Color(255, 51, 51));
        listaArticulosBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        listaArticulosBtn.setForeground(new java.awt.Color(255, 255, 255));
        listaArticulosBtn.setText("Listar Articulos");
        listaArticulosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaArticulosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(listaArticulosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 340, 80));

        altaArticuloBtn.setBackground(new java.awt.Color(255, 51, 51));
        altaArticuloBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        altaArticuloBtn.setForeground(new java.awt.Color(255, 255, 255));
        altaArticuloBtn.setText("Registrar Articulo");
        altaArticuloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaArticuloBtnActionPerformed(evt);
            }
        });
        getContentPane().add(altaArticuloBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 340, 80));

        altaEmpleadoBtn.setBackground(new java.awt.Color(255, 51, 51));
        altaEmpleadoBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        altaEmpleadoBtn.setForeground(new java.awt.Color(255, 255, 255));
        altaEmpleadoBtn.setText("Registrar empleado");
        altaEmpleadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEmpleadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(altaEmpleadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 350, 80));

        salirBtn.setBackground(new java.awt.Color(255, 51, 51));
        salirBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 255, 255));
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 230, 70));

        ListaEmpleadoBtn.setBackground(new java.awt.Color(255, 51, 51));
        ListaEmpleadoBtn.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        ListaEmpleadoBtn.setForeground(new java.awt.Color(255, 255, 255));
        ListaEmpleadoBtn.setText("Listar empleados");
        ListaEmpleadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEmpleadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ListaEmpleadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 350, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaArticulosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaArticulosBtnActionPerformed
        listaArticulos ventana = new listaArticulos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_listaArticulosBtnActionPerformed

    private void altaArticuloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaArticuloBtnActionPerformed
        altaArticulo ventana = new altaArticulo();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_altaArticuloBtnActionPerformed

    private void altaEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEmpleadoBtnActionPerformed
        altaEmpleado ventana = new altaEmpleado();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_altaEmpleadoBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_salirBtnActionPerformed

    private void ListaEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEmpleadoBtnActionPerformed
        listaEmpleados ventana = new listaEmpleados();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListaEmpleadoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListaEmpleadoBtn;
    private javax.swing.JButton altaArticuloBtn;
    private javax.swing.JButton altaEmpleadoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listaArticulosBtn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
