/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redneuronalxor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class FrameRedNeuronalXOR extends javax.swing.JFrame {

    /**
     * Creates new form FrameRedNeuronalXOR
     */
    RedNeuronalXOR XOR = new RedNeuronalXOR();
    public int valorX1 = 0;
    public int valorX2 = 0;

    public FrameRedNeuronalXOR() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLTitulo1 = new javax.swing.JLabel();
        jLTitulo2 = new javax.swing.JLabel();
        jLValores = new javax.swing.JLabel();
        jCBX1 = new javax.swing.JComboBox<>();
        jCBX2 = new javax.swing.JComboBox<>();
        jLX1 = new javax.swing.JLabel();
        jLX2 = new javax.swing.JLabel();
        jLY = new javax.swing.JLabel();
        jLResultado = new javax.swing.JLabel();
        jBEntrenar = new javax.swing.JButton();
        jBCalcular = new javax.swing.JButton();
        jLOpciones = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jLObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservaciones = new javax.swing.JTextArea();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLTitulo1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo1.setText("Redes Neuronales");

        jLTitulo2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLTitulo2.setText("Compuerta XOR");

        jLValores.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLValores.setText("Valores");

        jCBX1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        jCBX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBX1ActionPerformed(evt);
            }
        });

        jCBX2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        jLX1.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLX1.setText("X1");

        jLX2.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLX2.setText("X2");

        jLY.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLY.setText("Y");

        jLResultado.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jBEntrenar.setText("Entrenar");
        jBEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrenarActionPerformed(evt);
            }
        });

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jLOpciones.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLOpciones.setText("Opciones");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLObservaciones.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLObservaciones.setText("Observaciones");

        jTextAreaObservaciones.setColumns(20);
        jTextAreaObservaciones.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLTitulo2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLValores)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLX1)
                                        .addComponent(jLX2))
                                    .addComponent(jLY))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCBX1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBX2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(jLTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jBEntrenar)
                                .addGap(18, 18, 18)
                                .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLOpciones)
                            .addComponent(jLObservaciones))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLValores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLX1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLX2))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLY, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrenar)
                    .addComponent(jBCalcular)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrenarActionPerformed
        // TODO add your handling code here:
        XOR.setLog("");

        try {
            XOR.entrenarXOR();
        } catch (IOException ex) {
            Logger.getLogger(FrameRedNeuronalXOR.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextAreaObservaciones.setText(XOR.getLog());

        jBCalcular.setEnabled(true);
        jBLimpiar.setEnabled(true);
        jBEntrenar.setEnabled(false);

    }//GEN-LAST:event_jBEntrenarActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        String r1 = (String) jCBX1.getSelectedItem();
        String r2 = (String) jCBX2.getSelectedItem();
        int X1 = Integer.parseInt(r1);
        int X2 = Integer.parseInt(r2);
        int resultadoCalculo;

        resultadoCalculo = XOR.calcular(X1, X2);
        jLResultado.setText("" + resultadoCalculo);

    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        jBEntrenar.setEnabled(true);
        jBCalcular.setEnabled(true);
        jBLimpiar.setEnabled(true);
        XOR.setLog("");
        jLResultado.setText("");
        jTextAreaObservaciones.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jCBX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBX1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRedNeuronalXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRedNeuronalXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRedNeuronalXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRedNeuronalXOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRedNeuronalXOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBEntrenar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBX1;
    private javax.swing.JComboBox<String> jCBX2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLObservaciones;
    private javax.swing.JLabel jLOpciones;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLValores;
    private javax.swing.JLabel jLX1;
    private javax.swing.JLabel jLX2;
    private javax.swing.JLabel jLY;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaObservaciones;
    // End of variables declaration//GEN-END:variables
}
