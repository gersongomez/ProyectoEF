/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

// import Imagenes.imagendefondo;
import modelo.Usuarios;

/**
AUTOR GERSON XD *
 */
public class MENU extends javax.swing.JFrame {

    Usuarios mod;
   // private BajasEmpleados formBajasEmpleado;
    // private ModificacionesEmpleados formModEmpleado;
    // private Mostrar mostrarN;
    // private AltasEmpleado formAltasEmpleado;
    // private ChequesEmpleados formChequesEmpleados;
    // private buscar BuscarE;

    public MENU() {
        initComponents();
    }

    MENU(Usuarios mod) {
        initComponents();
        //jDesktopPane1.setBorder(new imagendefondo());
        this.setExtendedState(MENU.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        this.mod = mod;

         if (mod.getIdTipo() == 1) {
            MANTENIMIENTO.setVisible(true);
            FUNCIONES.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
         if (mod.getIdTipo() == 2) {
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(true);
            jMenuItem5.setVisible(true);
            jMenuItem6.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
          if (mod.getIdTipo() == 3) {
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(true);
            jMenuItem5.setVisible(false);
            jMenuItem6.setVisible(true);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
           if (mod.getIdTipo() < 1||mod.getIdTipo() > 3){
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        FuncionUsuarioMantenimiento = new javax.swing.JMenuBar();
        MANTENIMIENTO = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        FUNCIONES = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        AYUDA = new javax.swing.JMenu();
        HERRAMIENTAS = new javax.swing.JMenu();
        SALIR = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        MANTENIMIENTO.setText("HERRAMIENTAS");

        jMenuItem7.setText("Buscar Empleado");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem7);

        jMenuItem1.setText("Altas de Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem1);

        jMenuItem2.setText("Bajas de Empleado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem2);

        jMenuItem3.setText("Modificaciones de Empleado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem3);

        FuncionUsuarioMantenimiento.add(MANTENIMIENTO);

        FUNCIONES.setText("FUNCIONES");

        jMenuItem5.setText("Cheque Empleado");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        FUNCIONES.add(jMenuItem5);

        jMenuItem6.setText("Mostrar Nomina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        FUNCIONES.add(jMenuItem6);

        FuncionUsuarioMantenimiento.add(FUNCIONES);

        AYUDA.setText("AYUDA");
        FuncionUsuarioMantenimiento.add(AYUDA);

        HERRAMIENTAS.setText("HERRAMIENTAS");
        FuncionUsuarioMantenimiento.add(HERRAMIENTAS);

        SALIR.setText("SALIR");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        SALIR.add(jMenuItem4);

        FuncionUsuarioMantenimiento.add(SALIR);

        setJMenuBar(FuncionUsuarioMantenimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       // formBajasEmpleado = new BajasEmpleados();
        // jDesktopPane1.add(formBajasEmpleado);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       // formModEmpleado = new ModificacionesEmpleados();
        // jDesktopPane1.add(formModEmpleado);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dispose();//Codigo  para  salir del Programa
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       // formChequesEmpleados = new ChequesEmpleados();
        // jDesktopPane1.add(formChequesEmpleados);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         //mostrarN = new Mostrar();
         //jDesktopPane1.add(mostrarN);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //formAltasEmpleado = new AltasEmpleado();
        // jDesktopPane1.add(formAltasEmpleado);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
       //   BuscarE = new buscar();
        // jDesktopPane1.add(BuscarE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AYUDA;
    private javax.swing.JMenu FUNCIONES;
    private javax.swing.JMenuBar FuncionUsuarioMantenimiento;
    private javax.swing.JMenu HERRAMIENTAS;
    private javax.swing.JMenu MANTENIMIENTO;
    private javax.swing.JMenu SALIR;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
