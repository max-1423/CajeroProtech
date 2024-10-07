
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import manejoarchivos.Banco;
import manejoarchivos.Cliente;
import static ventanas.Login.clienteActual;
import java.text.DecimalFormat;

/**
 * Esta "PagPrincipal" nos presenta las opciones "Ver Saldo, Depositar, Retirar y Convertir"para interactuar con la cuenta del usuario
 */
public class PagPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PagPrincipal
     */
    
    public PagPrincipal() {
        initComponents();
        setSize(400, 600);
        setResizable(false);
        setTitle("Pagina Principal - Cajero Automatico PROTECH");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper= new ImageIcon("src/images/fondo_login.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo= new ImageIcon("src/images/logo_protech.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
        //Imagen de saldo
        ImageIcon imagSaldo= new ImageIcon("src/images/ahorro.png");
        Icon icono_saldo = new ImageIcon(imagSaldo.getImage().getScaledInstance(jLabel_ImaSaldo.getWidth(), jLabel_ImaSaldo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_ImaSaldo.setIcon(icono_saldo);
        this.repaint();
        
        //Imagen de Depositar
        ImageIcon ImagDepositar = new ImageIcon("src/images/donar.png");
        Image imgDepositar = ImagDepositar.getImage().getScaledInstance(jLabel_ImaDepositar.getWidth(), jLabel_ImaDepositar.getHeight(), Image.SCALE_DEFAULT);
        Icon icono_depositar = new ImageIcon(imgDepositar);
        jLabel_ImaDepositar.setIcon(icono_depositar);
        this.repaint();
        
        //Imagen de Retirar
        ImageIcon imagRetirar= new ImageIcon("src/images/dinero_soporte.png");
        Icon icono_retirar = new ImageIcon(imagRetirar.getImage().getScaledInstance(jLabel_ImaRetirar.getWidth(), jLabel_ImaRetirar.getHeight(), Image.SCALE_DEFAULT));
        jLabel_ImaRetirar.setIcon(icono_retirar);
        this.repaint();
        
        //Imagen de Abonar
        ImageIcon imagAbonar= new ImageIcon("src/images/cambio.png");
        Icon icono_abonar = new ImageIcon(imagAbonar.getImage().getScaledInstance(jLabel_ImaConvMon.getWidth(), jLabel_ImaConvMon.getHeight(), Image.SCALE_DEFAULT));
        jLabel_ImaConvMon.setIcon(icono_abonar);
        this.repaint();
        
    }

    
    @Override
    public Image getIconImage() {  //CAMBIAR DIRECCION DEL ICONO POR ERROR DE CARPETA DE RECURSOS
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_protech.png"));
    return retValue;
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Logo = new javax.swing.JLabel();
        Derechos_Autor = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jButton_TerminarPrograma = new javax.swing.JButton();
        jButton_ConvertirMoneda = new javax.swing.JButton();
        jButton_VerSaldo = new javax.swing.JButton();
        jButton_Depositar = new javax.swing.JButton();
        jButton_Retirar = new javax.swing.JButton();
        jLabel_ImaDepositar = new javax.swing.JLabel();
        jLabel_ImaConvMon = new javax.swing.JLabel();
        jLabel_ImaSaldo = new javax.swing.JLabel();
        jLabel_ImaRetirar = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 100));

        Derechos_Autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Derechos_Autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Derechos_Autor.setText("ProTech2024 © ");
        Derechos_Autor.setToolTipText("");
        getContentPane().add(Derechos_Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jLabel_Titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_Titulo.setText("PAGINA PRINCIPAL");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jButton_TerminarPrograma.setBackground(new java.awt.Color(255, 51, 0));
        jButton_TerminarPrograma.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton_TerminarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        jButton_TerminarPrograma.setText("Cerrar Sesion y Salir");
        jButton_TerminarPrograma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_TerminarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TerminarProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_TerminarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 40));

        jButton_ConvertirMoneda.setBackground(new java.awt.Color(0, 0, 0));
        jButton_ConvertirMoneda.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton_ConvertirMoneda.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ConvertirMoneda.setText("Convertir Moneda");
        jButton_ConvertirMoneda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_ConvertirMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConvertirMonedaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ConvertirMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, 40));

        jButton_VerSaldo.setBackground(new java.awt.Color(0, 0, 0));
        jButton_VerSaldo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_VerSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_VerSaldo.setText("Ver Saldo");
        jButton_VerSaldo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_VerSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VerSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_VerSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 40));

        jButton_Depositar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Depositar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Depositar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Depositar.setText("Depositar");
        jButton_Depositar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DepositarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 40));

        jButton_Retirar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Retirar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Retirar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Retirar.setText("Retirar");
        jButton_Retirar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RetirarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 150, 40));
        getContentPane().add(jLabel_ImaDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 50));
        getContentPane().add(jLabel_ImaConvMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 50, 50));
        getContentPane().add(jLabel_ImaSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 50));
        getContentPane().add(jLabel_ImaRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 50, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TerminarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TerminarProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_TerminarProgramaActionPerformed
/**
 * Este boton nos permite convertir el saldo y el tipo de divisa a otra con el cambio de saldo respectivo. 
 */
    private void jButton_ConvertirMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConvertirMonedaActionPerformed
        new ConvMoneda().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_ConvertirMonedaActionPerformed
/**
 * Este boton nos permite consultar cual es el "saldo" actual de nuestra cuenta mediante un mensaje de dialogo.
 */
    private void jButton_VerSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VerSaldoActionPerformed
        DecimalFormat df = new DecimalFormat("#.##");
        String valorFormateado = df.format(clienteActual.getSaldo());
        JOptionPane.showMessageDialog(null, "Saldo Actual: " + valorFormateado + " " + clienteActual.getMoneda());
    }//GEN-LAST:event_jButton_VerSaldoActionPerformed
/**
 * Este boton nos permite realizar un deposito a la cuenta del usuario. 
 */
    private void jButton_DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DepositarActionPerformed
        new Depositar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_DepositarActionPerformed
/**
 * Esre boton nos permite realizar un retiro a la cuenta del usuario 
 */
    private void jButton_RetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RetirarActionPerformed
        new Retirar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_RetirarActionPerformed

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
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos_Autor;
    private javax.swing.JButton jButton_ConvertirMoneda;
    private javax.swing.JButton jButton_Depositar;
    private javax.swing.JButton jButton_Retirar;
    private javax.swing.JButton jButton_TerminarPrograma;
    private javax.swing.JButton jButton_VerSaldo;
    private javax.swing.JLabel jLabel_ImaConvMon;
    private javax.swing.JLabel jLabel_ImaDepositar;
    private javax.swing.JLabel jLabel_ImaRetirar;
    private javax.swing.JLabel jLabel_ImaSaldo;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
