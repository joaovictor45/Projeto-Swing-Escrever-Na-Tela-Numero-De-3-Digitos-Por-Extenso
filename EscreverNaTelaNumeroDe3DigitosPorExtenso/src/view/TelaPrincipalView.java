package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.ControllerConverterNumero;
import java.awt.Color;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author João Victor
 */
public class TelaPrincipalView extends javax.swing.JFrame {

    private final ControllerConverterNumero controller;

    public TelaPrincipalView() {
        initComponents();
        controller = new ControllerConverterNumero(this);
        this.setLocationRelativeTo(null);//Centraliza o frame
        this.getjLabel1TextoTelaPrincipal().setForeground(Color.white);
    }

    public JLabel getjLabel1TextoTelaPrincipal() {
        return jLabel1TextoTelaPrincipal;
    }

    public void setjLabel1TextoTelaPrincipal(JLabel jLabel1TextoTelaPrincipal) {
        this.jLabel1TextoTelaPrincipal = jLabel1TextoTelaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1TextoTelaPrincipal = new javax.swing.JLabel();
        jButton1Escrever = new javax.swing.JButton();
        jTextField1NumeroDigitado = new javax.swing.JTextField();
        jLabel2TemaFundo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1TextoTelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1TextoTelaPrincipal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1TextoTelaPrincipal.setText("Digite um número inteiro : ");
        getContentPane().add(jLabel1TextoTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 40));

        jButton1Escrever.setText("Clique aqui para escrever");
        jButton1Escrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EscreverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Escrever, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jTextField1NumeroDigitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField1NumeroDigitadoMouseReleased(evt);
            }
        });
        jTextField1NumeroDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NumeroDigitadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1NumeroDigitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 180, 30));

        jLabel2TemaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/image_content_32110712_20181028181406.jpg"))); // NOI18N
        jLabel2TemaFundo.setText("jLabel2");
        getContentPane().add(jLabel2TemaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1NumeroDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NumeroDigitadoActionPerformed
    }//GEN-LAST:event_jTextField1NumeroDigitadoActionPerformed

    private void jButton1EscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EscreverActionPerformed

        try {
            controller.Converter();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um número inteiro");
        }


    }//GEN-LAST:event_jButton1EscreverActionPerformed

    private void jTextField1NumeroDigitadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1NumeroDigitadoMouseReleased

    }//GEN-LAST:event_jTextField1NumeroDigitadoMouseReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalView().setVisible(true);
                

            }

        });
    }

    public JButton getjButton1Escrever() {
        return jButton1Escrever;
    }

    public void setjButton1Escrever(JButton jButton1Escrever) {
        this.jButton1Escrever = jButton1Escrever;
    }

    public JLabel getjLabel1() {
        return jLabel1TextoTelaPrincipal;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1TextoTelaPrincipal = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2TemaFundo;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2TemaFundo = jLabel2;
    }

    public JTextField getjTextField1NumeroDigitado() {
        return jTextField1NumeroDigitado;
    }

    public void setjTextField1NumeroDigitado(JTextField jTextField1NumeroDigitado) {
        this.jTextField1NumeroDigitado = jTextField1NumeroDigitado;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Escrever;
    private javax.swing.JLabel jLabel1TextoTelaPrincipal;
    private javax.swing.JLabel jLabel2TemaFundo;
    private javax.swing.JTextField jTextField1NumeroDigitado;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
