
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import manejoarchivos.Banco;
import manejoarchivos.Cliente;
import static ventanas.Login.banco;
import static ventanas.Login.clienteActual;
/**
 *Esta clase crea una ventana de Depositar para el Cajero  Automatico
 */

public class Depositar extends javax.swing.JFrame {

   
    /**
     * Es el constructor que inicializa la interfaz de Deposito. 
     */
    public Depositar() {
        initComponents();
       
        setSize(400, 600);
        setResizable(false);
        setTitle("Depositar - Cajero Automatico PROTECH");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper= new ImageIcon("src/images/fondo_login.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo= new ImageIcon("src/images/logo_protech.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
        //Imagen de Depositar
        ImageIcon ImagDepositar= new ImageIcon("src/images/donar.png");
        Icon icono_depositar = new ImageIcon(ImagDepositar.getImage().getScaledInstance(jLabel_ImaDepositar.getWidth(), jLabel_ImaDepositar.getHeight(), Image.SCALE_DEFAULT));
        jLabel_ImaDepositar.setIcon(icono_depositar);
        this.repaint();
    }
    /**
     * Este metodo sebreescribe getIconImage para esteblecer el icono de la aplicacion.
     * Este cambio se debe a un error en la carpeta de recursos. 
     * @return el icono de imagen predeterminado como icono de ventana
     */
    @Override
    public Image getIconImage() {  //CAMBIAR DIRECCION DEL ICONO POR ERROR DE CARPETA DE RECURSOS
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_protech.png"));
    return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Subtitulo = new javax.swing.JLabel();
        Derechos_Autor = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_AccionDepositar = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        jLabel_ImaDepositar = new javax.swing.JLabel();
        jTextField_MontoDepositar = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_SaldoDepositar = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Subtitulo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Subtitulo.setText("Ingrese el monto");
        getContentPane().add(jLabel_Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Derechos_Autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Derechos_Autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Derechos_Autor.setText("ProTech2024 © ");
        Derechos_Autor.setToolTipText("");
        getContentPane().add(Derechos_Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 100));

        jButton_AccionDepositar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_AccionDepositar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_AccionDepositar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AccionDepositar.setText("Depositar");
        jButton_AccionDepositar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_AccionDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccionDepositarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AccionDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 150, 40));

        jButton_Volver.setBackground(new java.awt.Color(255, 51, 0));
        jButton_Volver.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Volver.setText("Volver");
        jButton_Volver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 40));
        getContentPane().add(jLabel_ImaDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jTextField_MontoDepositar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_MontoDepositar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextField_MontoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 50));

        jLabel_Titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel_Titulo.setText("DEPOSITAR");
        getContentPane().add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel_SaldoDepositar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_SaldoDepositar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_SaldoDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Esta accion tiene el objetivo de volver a la "Pagina Principal" de la interfaz 
     */
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        new PagPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_VolverActionPerformed
    /**
    * El jButton_AccionDepositarActionPerformed realiza la accion de depositar un monto en la cuenta del cliente,
    * los cambios realizados se guardan en el archivo txt creado previamente.
    */
    private void jButton_AccionDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccionDepositarActionPerformed
        double cantidad = Double.parseDouble(jTextField_MontoDepositar.getText());
        clienteActual.depositar(cantidad);
        jLabel_SaldoDepositar.setText("Saldo Actual: " + clienteActual.getSaldo());
        jTextField_MontoDepositar.setText("");
        banco.guardarClientes(); // Guardar cambios en el arc
    }//GEN-LAST:event_jButton_AccionDepositarActionPerformed

    /**
     * Metodo principal que ejecuta la inicializacion de la interfaz de Depositar.
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
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos_Autor;
    private javax.swing.JButton jButton_AccionDepositar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel_ImaDepositar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_SaldoDepositar;
    private javax.swing.JLabel jLabel_Subtitulo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField jTextField_MontoDepositar;
    // End of variables declaration//GEN-END:variables
}
