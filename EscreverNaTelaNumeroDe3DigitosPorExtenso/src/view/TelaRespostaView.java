/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author João Victor
 */
public class TelaRespostaView extends javax.swing.JFrame {

    /**
     * Creates new form TelaRespostaView
     */
    public TelaRespostaView(String s) {
        initComponents();
        this.getjLabel2TextoRespostaFinal().setText(s);
        this.setLocationRelativeTo(null);//Centraliza o frame

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1TextoMenuResposta = new javax.swing.JLabel();
        jLabel2TextoRespostaFinal = new javax.swing.JLabel();
        jButton1DigitarOutroNumero = new javax.swing.JButton();
        jButton2FecharPrograma = new javax.swing.JButton();
        jLabel3TemaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1TextoMenuResposta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1TextoMenuResposta.setText("Você digitou o número : ");
        getContentPane().add(jLabel1TextoMenuResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 220, 70));

        jLabel2TextoRespostaFinal.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2TextoRespostaFinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2TextoRespostaFinal.setText("0");
        jLabel2TextoRespostaFinal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel2TextoRespostaFinalComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel2TextoRespostaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 330, -1));

        jButton1DigitarOutroNumero.setText("Digitar outro número");
        jButton1DigitarOutroNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DigitarOutroNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1DigitarOutroNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jButton2FecharPrograma.setText("Fechar aplicação");
        jButton2FecharPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2FecharProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2FecharPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel3TemaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/5a0c40915a997e1c2cea116a (1).png"))); // NOI18N
        jLabel3TemaFundo.setText("jLabel3");
        getContentPane().add(jLabel3TemaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 0, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2FecharProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2FecharProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2FecharProgramaActionPerformed

    private void jButton1DigitarOutroNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DigitarOutroNumeroActionPerformed
        this.setVisible(false);


    }//GEN-LAST:event_jButton1DigitarOutroNumeroActionPerformed

    private void jLabel2TextoRespostaFinalComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2TextoRespostaFinalComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2TextoRespostaFinalComponentHidden

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
            java.util.logging.Logger.getLogger(TelaRespostaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRespostaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRespostaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRespostaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new TelaRespostaView().setVisible(true);
            }
        });
    }

    public JButton getjButton1DigitarOutroNumero() {
        return jButton1DigitarOutroNumero;
    }

    public void setjButton1DigitarOutroNumero(JButton jButton1DigitarOutroNumero) {
        this.jButton1DigitarOutroNumero = jButton1DigitarOutroNumero;
    }

    public JButton getjButton2FecharPrograma() {
        return jButton2FecharPrograma;
    }

    public void setjButton2FecharPrograma(JButton jButton2FecharPrograma) {
        this.jButton2FecharPrograma = jButton2FecharPrograma;
    }

    public JLabel getjLabel1TextoMenuResposta() {
        return jLabel1TextoMenuResposta;
    }

    public void setjLabel1TextoMenuResposta(JLabel jLabel1TextoMenuResposta) {
        this.jLabel1TextoMenuResposta = jLabel1TextoMenuResposta;
    }

    public JLabel getjLabel2TextoRespostaFinal() {
        return jLabel2TextoRespostaFinal;
    }

    public void setjLabel2TextoRespostaFinal(JLabel jLabel2TextoRespostaFinal) {
        this.jLabel2TextoRespostaFinal = jLabel2TextoRespostaFinal;
    }

    public JLabel getjLabel3TemaFundo() {
        return jLabel3TemaFundo;
    }

    public void setjLabel3TemaFundo(JLabel jLabel3TemaFundo) {
        this.jLabel3TemaFundo = jLabel3TemaFundo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1DigitarOutroNumero;
    private javax.swing.JButton jButton2FecharPrograma;
    private javax.swing.JLabel jLabel1TextoMenuResposta;
    private javax.swing.JLabel jLabel2TextoRespostaFinal;
    private javax.swing.JLabel jLabel3TemaFundo;
    // End of variables declaration//GEN-END:variables
}