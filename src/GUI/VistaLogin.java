
package GUI;

import App.Conexion;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class VistaLogin extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn=(Connection) con.ConectarBD();

int xMouse, yMouse;
    public VistaLogin() {
        initComponents();
       setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtPasswordLogin = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel3.setText("jLabel3");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 33, 57));
        jPanel3.setForeground(new java.awt.Color(13, 33, 57));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 40, 68));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(16, 40, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuarioLogin.setBackground(new java.awt.Color(10, 30, 54));
        txtUsuarioLogin.setForeground(new java.awt.Color(108, 119, 141));
        txtUsuarioLogin.setText("Usuario");
        txtUsuarioLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 170, 30));

        txtPasswordLogin.setBackground(new java.awt.Color(10, 30, 54));
        txtPasswordLogin.setForeground(new java.awt.Color(108, 119, 141));
        txtPasswordLogin.setText("Contraseña");
        txtPasswordLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 170, 30));

        btnLogin.setBackground(new java.awt.Color(228, 17, 26));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar sesion");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 170, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iniciar sesión ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 340, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRUZ ROJA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // PROTOTIPO DE NAVEGACION DE VENTANAS
       // this.dispose();
       // new Menu().setVisible(true);
       String usuario = txtUsuarioLogin.getText();
       String pass = txtPasswordLogin.getText();
       //validar
       if(!usuario.equals("")||!pass.equals("")){
           //contiene datos
           try{
               PreparedStatement ps=(PreparedStatement)cn.prepareStatement("SELECT * FROM usuario WHERE usuario = '"+ usuario +"' AND contrasenia = '"+ pass +"'");
               ResultSet rs = ps.executeQuery();
               if(rs.next()){
                   String usuarioN = rs.getString("usuario");
                   if(usuario.equalsIgnoreCase("admin")){
                       Menu m=new Menu();
                       dispose();
                       m.setVisible(true);
                       
                   }else {
                       JOptionPane.showMessageDialog(rootPane, "Usuario y contrasena incorrectos");
                   }
               }
           }catch (Exception e){
                JOptionPane.showMessageDialog(rootPane, "NO SE PUDO INICIAR SESION");

               
           }
       }else{
           JOptionPane.showMessageDialog(null, "DATOS EN BLANCO");
       }
       
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtPasswordLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables


}
