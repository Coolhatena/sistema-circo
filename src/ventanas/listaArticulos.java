/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Font;

/**
 *
 * @author lalit
 */
public class listaArticulos extends javax.swing.JFrame {
    
    String texto = "";
    
    /**
     * Creates new form listaProductos
     */
    public listaArticulos() {
        initComponents();
        setTexto();
        lista.setText(texto);
        Font font = lista.getFont();
        float size = font.getSize() + 15.0f;
        lista.setFont( font.deriveFont(size) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista.setColumns(20);
        lista.setRows(5);
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 710, 320));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Circus", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ListadoProd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(listaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaArticulos().setVisible(true);
            }
        });
    }
    
    public void setTexto(){
        if(main.alimentos.size() != 0){
            texto+="Alimentos:\n";
            for (int i = 0; i < main.alimentos.size(); i++) {
                texto += main.alimentos.get(i).Datos();
            }
        }
        
        if (main.merch.size() != 0) {
            texto+="\nMerch:\n";
            for (int i = 0; i < main.merch.size(); i++) {
                texto += main.merch.get(i).Datos();
            }
        }
        
        if (main.insumos.size() != 0) {
            texto+="\nInsumos:\n";
            for (int i = 0; i < main.insumos.size(); i++) {
                texto += main.insumos.get(i).Datos();
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lista;
    // End of variables declaration//GEN-END:variables
}
