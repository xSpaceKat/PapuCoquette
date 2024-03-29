/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

/**
 *
 * @author Berry
 */
public class JFormaPago extends javax.swing.JFrame {

    /**
     * Creates new form JFormaPago
     */
    public JFormaPago() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondoRosa = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        panFondoBlanco = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        btnPagar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoRosa.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtTitulo.setText("Forma de pago");

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        btnPagar.setBackground(new java.awt.Color(226, 183, 252));
        btnPagar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPagar.setText("Efectivo");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnPagar2.setBackground(new java.awt.Color(226, 183, 252));
        btnPagar2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPagar2.setText("Tarjeta");
        btnPagar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFondoBlancoLayout = new javax.swing.GroupLayout(panFondoBlanco);
        panFondoBlanco.setLayout(panFondoBlancoLayout);
        panFondoBlancoLayout.setHorizontalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoBlancoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnPagar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panFondoBlancoLayout.setVerticalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panFondoRosaLayout = new javax.swing.GroupLayout(panFondoRosa);
        panFondoRosa.setLayout(panFondoRosaLayout);
        panFondoRosaLayout.setHorizontalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addGroup(panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoRosaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFondoRosaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(txtTitulo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panFondoRosaLayout.setVerticalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addComponent(panFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondoRosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondoRosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        JCambio jc = new JCambio();
        jc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnPagar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnPagar2;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panFondoRosa;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
