package GUI;

import App.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class VistaAgregarAspirante extends javax.swing.JFrame {
    public VistaAgregarAspirante() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TfNombre = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnEditar = new javax.swing.JButton();
        TfApellidoP = new javax.swing.JTextField();
        TfCURP = new javax.swing.JTextField();
        TfApellidoM = new javax.swing.JTextField();
        TfFechaIn = new javax.swing.JTextField();
        TfNoInJuv = new javax.swing.JTextField();
        TfFechaNacimiento = new javax.swing.JTextField();
        CbSeccion = new javax.swing.JComboBox<>();
        CbNivel = new javax.swing.JComboBox<>();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 7, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR ASPIRANTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 80));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Nombre ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 156, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 189, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 222, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("CURP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Sección");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 278, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Nivel ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 312, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Num Int Juventud ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 340, -1, -1));

        TfNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, -1));

        BtnCancelar.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        BtnGuardar.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de Ingreso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel11.setText("Foto");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 181, -1, -1));

        BtnEditar.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 287, -1, -1));

        TfApellidoP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfApellidoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfApellidoPActionPerformed(evt);
            }
        });
        getContentPane().add(TfApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 119, -1));

        TfCURP.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfCURP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfCURP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfCURP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfCURPActionPerformed(evt);
            }
        });
        getContentPane().add(TfCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 119, -1));

        TfApellidoM.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfApellidoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfApellidoM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfApellidoMActionPerformed(evt);
            }
        });
        getContentPane().add(TfApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 119, -1));

        TfFechaIn.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfFechaIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfFechaIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfFechaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaInActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 119, -1));

        TfNoInJuv.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfNoInJuv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfNoInJuv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfNoInJuv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNoInJuvActionPerformed(evt);
            }
        });
        getContentPane().add(TfNoInJuv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 119, -1));

        TfFechaNacimiento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TfFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TfFechaNacimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TfFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaNacimientoActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 119, -1));

        CbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13-16", "17+" }));
        getContentPane().add(CbSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 120, -1));

        CbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASPIRANTE", "BASICO", "MONITOR", "TECNICO" }));
        getContentPane().add(CbNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private VistaAspirante vistaPadre; // Agrega esta variable

    public VistaAgregarAspirante(VistaAspirante vistaPadre) {
        initComponents();
        this.vistaPadre = vistaPadre;
    }
    
    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void TfFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaNacimientoActionPerformed

    private void TfNoInJuvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNoInJuvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNoInJuvActionPerformed

    private void TfFechaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaInActionPerformed

    private void TfApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfApellidoMActionPerformed

    private void TfCURPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfCURPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfCURPActionPerformed

    private void TfApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfApellidoPActionPerformed

    private void TfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombreActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        String nombre = TfNombre.getText();
        String apellidoP = TfApellidoP.getText();
        String apellidoM = TfApellidoM.getText();
        String curp = TfCURP.getText();
        String noJuventud = TfNoInJuv.getText();
        String fechaNac = TfFechaNacimiento.getText();
        String fechaIngreso = TfFechaIn.getText();
        String seccionSeleccionada = CbSeccion.getSelectedItem().toString();
        String nivelSeleccionado = CbNivel.getSelectedItem().toString();

        int idSeccion, idNivel;

        // Validar campos obligatorios
        if (nombre.isEmpty() || apellidoP.isEmpty() || curp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos obligatorios.");
            return;
        }

        Conexion con = new Conexion();
        Connection conn = con.ConectarBD();

        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo conectar a la base de datos.");
            return;
        }

        try {
             // Obtener idSeccion
            PreparedStatement psSeccion = conn.prepareStatement("SELECT idSeccion FROM seccion WHERE categoria = ?");
            psSeccion.setString(1, seccionSeleccionada);
            ResultSet rsSeccion = psSeccion.executeQuery();
            idSeccion = rsSeccion.next() ? rsSeccion.getInt("idSeccion") : -1;

            // Obtener idNivel
            PreparedStatement psNivel = conn.prepareStatement("SELECT idNivel FROM nivel WHERE categoria = ?");
            psNivel.setString(1, nivelSeleccionado);
            ResultSet rsNivel = psNivel.executeQuery();
            idNivel = rsNivel.next() ? rsNivel.getInt("idNivel") : -1;

            if (idSeccion == -1 || idNivel == -1) {
                JOptionPane.showMessageDialog(null, "Nivel o Sección no válidos.");
                return;
            }
            
            String sql = "INSERT INTO aspirante (nombre, apellidoPaterno, apellidoMaterno, CURP, Seccion_idSeccion, Nivel_idNivel, numeroInternoJuventud, fechaNacimiento, fechaIngreso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
            ps.setString(4, curp);
            ps.setInt(5, idSeccion);
            ps.setInt(6, idNivel);
            ps.setString(7, noJuventud);
            ps.setString(8, fechaNac);
            ps.setString(9, fechaIngreso);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
            vistaPadre.mostrarAspirantes();
            this.dispose(); // Cierra la ventana
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAgregarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarAspirante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> CbNivel;
    private javax.swing.JComboBox<String> CbSeccion;
    private javax.swing.JTextField TfApellidoM;
    private javax.swing.JTextField TfApellidoP;
    private javax.swing.JTextField TfCURP;
    private javax.swing.JTextField TfFechaIn;
    private javax.swing.JTextField TfFechaNacimiento;
    private javax.swing.JTextField TfNoInJuv;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
