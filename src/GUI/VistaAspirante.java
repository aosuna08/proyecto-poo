package GUI;

import App.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class VistaAspirante extends javax.swing.JFrame {
    /**
     * Creates new form Agregar
     */
    public VistaAspirante() {
        initComponents();
        mostrarAspirantes();
    }

    // LOGICA PARA MOSTRAR TABLA ASPIRANTE, * NO MODIFICAR *
    // FALTA MOSTRAR NOMBRE DE SECCION Y NIVEL
    private void mostrarAspirantes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NO. INTERNO JUVENTUD");
        modelo.addColumn("APELLIDO PATERNO");
        modelo.addColumn("APELLIDO MATERNO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("FECHA DE NACIMIENTO");
        modelo.addColumn("CURP");
        modelo.addColumn("FECHA DE INGRESO");
        modelo.addColumn("FOTO");
        modelo.addColumn("NIVEL");
        modelo.addColumn("SECCION");

        tablaAspirantes.setModel(modelo);

        Conexion con = new Conexion();
        Connection conn = con.ConectarBD();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(
                    "SELECT " +
                    "    aspirante.numeroInternoJuventud, " +
                    "    aspirante.apellidoPaterno, " +
                    "    aspirante.apellidoMaterno, " +
                    "    aspirante.nombre, " +
                    "    aspirante.fechaNacimiento, " +
                    "    aspirante.CURP, " +
                    "    aspirante.fechaIngreso, " +
                    "    aspirante.foto, " +
                    "    nivel.categoria AS categoriaNivel, " +
                    "    seccion.categoria AS categoriaSeccion " +
                    "FROM aspirante " +
                    "JOIN nivel ON aspirante.Nivel_idNivel = nivel.idNivel " +
                    "JOIN seccion ON aspirante.Seccion_idSeccion = seccion.idSeccion"
                );

                while (rs.next()) {
                    modelo.addRow(new Object[] {
                        rs.getString("numeroInternoJuventud"),
                        rs.getString("apellidoPaterno"),
                        rs.getString("apellidoMaterno"),
                        rs.getString("nombre"),
                        rs.getString("fechaNacimiento"),
                        rs.getString("CURP"),
                        rs.getString("fechaIngreso"),
                        rs.getString("foto"),
                        rs.getString("categoriaNivel"),
                        rs.getString("categoriaSeccion"),
                    });
                }

            } catch (SQLException e) {
                System.out.println("Error al obtener datos: " + e.getMessage());
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        background = new javax.swing.JPanel();
        top1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        background1 = new javax.swing.JPanel();
        top2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAspirantes = new javax.swing.JTable();
        top = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(13, 33, 57));
        background.setForeground(new java.awt.Color(13, 33, 57));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top1.setBackground(new java.awt.Color(16, 40, 68));
        top1.setForeground(new java.awt.Color(16, 40, 68));
        top1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MENÚ");
        top1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 21, -1, -1));

        background1.setBackground(new java.awt.Color(13, 33, 57));
        background1.setForeground(new java.awt.Color(13, 33, 57));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top2.setBackground(new java.awt.Color(16, 40, 68));
        top2.setForeground(new java.awt.Color(16, 40, 68));
        top2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MENÚ");
        top2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 21, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CRUZ ROJA");
        top2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("TALLERES");
        top2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 60));

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("ASPIRANTE");
        top2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 60));

        jButton11.setBackground(new java.awt.Color(255, 51, 51));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("SALIR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        top2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 60));

        jButton12.setBackground(new java.awt.Color(255, 51, 51));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("INFORMES");
        top2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 60));

        background1.add(top2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        top1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.add(top1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        tablaAspirantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAspirantes);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 1200, 490));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 580));

        top.setBackground(new java.awt.Color(16, 40, 68));
        top.setForeground(new java.awt.Color(16, 40, 68));
        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MENÚ");
        top.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 21, -1, -1));

        jButton3.setBackground(new java.awt.Color(228, 17, 26));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("TALLERES");
        top.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 60));

        jButton4.setBackground(new java.awt.Color(228, 17, 26));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("MODIFICAR");
        top.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 60));

        jButton5.setBackground(new java.awt.Color(228, 17, 26));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("ASPIRANTE");
        top.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 60));

        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 270, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // SALIR DEL PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAspirante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAspirante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel background1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tablaAspirantes;
    private javax.swing.JPanel top;
    private javax.swing.JPanel top1;
    private javax.swing.JPanel top2;
    // End of variables declaration//GEN-END:variables
}
