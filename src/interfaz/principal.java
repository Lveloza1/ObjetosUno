package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccionario;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdMixto.setEnabled(false);
        cmdLimpiar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNumerador3 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdMixto = new javax.swing.JButton();
        txtMixto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtNumeradorM = new javax.swing.JTextField();
        txtDenominadorM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Ejercicio 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 10, 110, 30));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 70, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 20));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División", " " }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 70, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 70, 20));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 70, 30));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 60, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 60, 20));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 60, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 80, 30));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 80, 30));

        cmdMixto.setText("Mixto");
        cmdMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 80, 30));

        txtMixto.setEditable(false);
        txtMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 30, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 60, 20));

        txtNumeradorM.setEditable(false);
        jPanel1.add(txtNumeradorM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 60, 30));

        txtDenominadorM.setEditable(false);
        jPanel1.add(txtDenominadorM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El numerador 1", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El numerador 2", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            txtNumerador2.selectAll();
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El denominador 1", "error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El denominador 2", "error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            txtDenominador2.selectAll();
        } else {

            int op, n1, n2, d1, d2;
            Fraccionario f1, f2, f3 = null;
            op = cmbOperacion.getSelectedIndex();
            n1 = Integer.parseInt(txtNumerador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            try {
                f1 = new Fraccionario(n1, d1);
                f2 = new Fraccionario(n2, d2);

                switch (op) {
                    case 0:
                        f3 = f1.sumar(f2);

                        break;
                    case 1:
                        f3 = f1.restar(f2);

                        break;
                    case 2:
                        f3 = f1.multiplicar(f2);

                        break;
                    case 3:
                        f3 = f1.dividir(f2);
                        break;

                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());
            } catch (DenominadorCeroException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            cmdCalcular.setEnabled(true);
            cmdMixto.setEnabled(true);
            cmdLimpiar.setEnabled(true);
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtMixto.setText("");
        txtNumeradorM.setText("");
        txtDenominadorM.setText("");
        txtNumerador1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        cmdCalcular.setEnabled(true);
        cmdMixto.setEnabled(false);
        cmdLimpiar.setEnabled(true);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMixtoActionPerformed
        int num3, den3, mix, nm, dm;
        if (txtNumerador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe obtenerse un resultado de operación", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
        } else if (txtDenominador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe tenerse un resultado de operación", "error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
        } else {
            String ent, num, den;

            num3 = Integer.parseInt(txtNumerador3.getText());
            den3 = Integer.parseInt(txtDenominador3.getText());
            if (num3 < den3) {
                JOptionPane.showMessageDialog(this, "No puede convertirse a mixto. El numerador 3 no debe ser menor al denominador 3", "error", JOptionPane.ERROR_MESSAGE);
                txtNumerador1.requestFocusInWindow();
                txtNumerador1.selectAll();

            } else {
                mix = (num3 / den3);
                nm = (num3 % den3);

                ent = String.valueOf(mix);
                txtMixto.setText(ent);

                num = String.valueOf(nm);
                txtNumeradorM.setText(num);

                den = String.valueOf(den3);
                txtDenominadorM.setText(den);

            }
        }
    }//GEN-LAST:event_cmdMixtoActionPerformed

    private void txtMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMixtoActionPerformed

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominador2KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominadorM;
    private javax.swing.JTextField txtMixto;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumeradorM;
    // End of variables declaration//GEN-END:variables
}
