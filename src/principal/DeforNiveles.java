package principal;
import principal.flDeforestacion.DefoN1P1;
import principal.flDeforestacion.DefoN2P1;
import principal.flDeforestacion.DefoN3P1;

public class DeforNiveles extends javax.swing.JDialog {

    
    public DeforNiveles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnivel3D = new javax.swing.JButton();
        btnivel2D = new javax.swing.JButton();
        btnivel1D = new javax.swing.JButton();
        btnAtrasD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Doppio One", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoge Nivel de Dificultad de Juego ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/defo.gif"))); // NOI18N

        btnivel3D.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel3D.setForeground(new java.awt.Color(0, 0, 0));
        btnivel3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel3D.setText("NIVEL A");
        btnivel3D.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel3D.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel3D.setRolloverEnabled(true);
        btnivel3D.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel3DActionPerformed(evt);
            }
        });

        btnivel2D.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel2D.setForeground(new java.awt.Color(0, 0, 0));
        btnivel2D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel2D.setText("NIVEL M");
        btnivel2D.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel2D.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel2D.setRolloverEnabled(true);
        btnivel2D.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel2DActionPerformed(evt);
            }
        });

        btnivel1D.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel1D.setForeground(new java.awt.Color(0, 0, 0));
        btnivel1D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel1D.setText("NIVEL B");
        btnivel1D.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel1D.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel1D.setRolloverEnabled(true);
        btnivel1D.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel1DActionPerformed(evt);
            }
        });

        btnAtrasD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAtrasD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back32.png"))); // NOI18N
        btnAtrasD.setText("REGRESAR");
        btnAtrasD.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtrasD.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back32.png"))); // NOI18N
        btnAtrasD.setRolloverEnabled(true);
        btnAtrasD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back48.png"))); // NOI18N
        btnAtrasD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnivel1D, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnivel2D, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnivel3D, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnivel1D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnivel2D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnivel3D)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtrasD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnivel2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel2DActionPerformed
        this.hide();
        DefoN2P1 dialog = new DefoN2P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnivel2DActionPerformed

    private void btnAtrasDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasDActionPerformed
        Categorias cate = new Categorias();
        cate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasDActionPerformed

    private void btnivel1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel1DActionPerformed
        this.hide();
        DefoN1P1 dialog = new DefoN1P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnivel1DActionPerformed

    private void btnivel3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel3DActionPerformed
        this.hide();
        DefoN3P1 dialog = new DefoN3P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnivel3DActionPerformed

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
            java.util.logging.Logger.getLogger(DeforNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeforNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeforNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeforNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeforNiveles dialog = new DeforNiveles(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasD;
    private javax.swing.JButton btnivel1D;
    private javax.swing.JButton btnivel2D;
    private javax.swing.JButton btnivel3D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
