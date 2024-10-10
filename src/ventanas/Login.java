
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import manejoarchivos.Banco;
import manejoarchivos.Cliente;
/**
 * Esta clase representa la vantana del inicio del cajero automatico 
 * Esta interfaz nos ermite ingrasar el nombre del ususario y su contraseña.
 * La clase al ingresar un usuario correcto podemos acceder a la pagina principal.
 * esta clase tambien nos da acceso al registro que nos permite agregar un nuevo usuario.
 */
public class Login extends javax.swing.JFrame {
    
    public static Banco banco;// Esta instancia contiene la informacion de los clientes y gestina operaciones que estan selacionas a susrespectivas clases.
    public static Cliente clienteActual;// Esta instancia representa al "Cliente" actual que esta iniciando su secion en el cajero automatico.
    /**
     * Esta clase crea una ventana de inicio de sesion, ademas carga las imagenes correspondientes y las propiedades predeterminadas de esta interfaz. 
     */
    public Login() {
        initComponents();
        banco = new Banco();
        setSize(400, 600);
        setResizable(false);
        setTitle("Login - Cajero Automatico PROTECH");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper= new ImageIcon("src/images/fondo_login.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo= new ImageIcon("src/images/logo_protech.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();      
    } 
    @Override
    /**
     * Este metodo sebreescribe getIconImage para esteblecer el icono de la aplicacion.
     * Este cambio se debe a un error en la carpeta de recursos. 
     * @return el icono de imagen predeterminado como icono de ventana
     */
    public Image getIconImage() {  //CAMBIAR DIRECCION DEL ICONO POR ERROR DE CARPETA DE RECURSOS
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo_protech.png"));
    return retValue;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Derechos_Autor = new javax.swing.JLabel();
        jLabel_Logo = new javax.swing.JLabel();
        jButton_Registrar = new javax.swing.JButton();
        jButton_Acceder = new javax.swing.JButton();
        jLabel_Subtitulo1 = new javax.swing.JLabel();
        jLabel_Subtitulo2 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jPasswordField_Pass = new javax.swing.JPasswordField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Derechos_Autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Derechos_Autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Derechos_Autor.setLabelFor(Derechos_Autor);
        Derechos_Autor.setText("ProTech2024 © ");
        Derechos_Autor.setToolTipText("");
        getContentPane().add(Derechos_Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 200));
        jLabel_Logo.getAccessibleContext().setAccessibleDescription("");

        jButton_Registrar.setBackground(new java.awt.Color(0, 51, 255));
        jButton_Registrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Registrar.setText("Registrar");
        jButton_Registrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 90, 30));

        jButton_Acceder.setBackground(new java.awt.Color(51, 153, 0));
        jButton_Acceder.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Acceder.setText("Acceder");
        jButton_Acceder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 150, 40));

        jLabel_Subtitulo1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Subtitulo1.setText("Nombre de usuario/ Username");
        getContentPane().add(jLabel_Subtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel_Subtitulo2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel_Subtitulo2.setText("Contraseña");
        getContentPane().add(jLabel_Subtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jTextField_User.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_User.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, 30));

        jPasswordField_Pass.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPasswordField_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jPasswordField_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 220, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Esta boton "Registrar" nos redirige a una pantalla para realizar el registro de un nuevo usuario.
 */
    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed
        new Registro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_RegistrarActionPerformed
/**
 * El voton "Acceder" nos dirige a la "Pantalla Principal" de la interfaz del "Cajero automatico".
 */
    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        String nombre = jTextField_User.getText();
        String contraseña = jPasswordField_Pass.getText();
        clienteActual = banco.autenticar(nombre, contraseña);
        if (clienteActual != null) {
            new PagPrincipal().setVisible(true);
            this.setVisible(false);
        } else {
        JOptionPane.showMessageDialog(null, "Credenciales inválidas.");
        }
    }//GEN-LAST:event_jButton_AccederActionPerformed

    /**
     * Metodo principal que ejecuta la inicializacion de la interfaz de Login.
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Derechos_Autor;
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Subtitulo1;
    private javax.swing.JLabel jLabel_Subtitulo2;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField jPasswordField_Pass;
    private javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}
