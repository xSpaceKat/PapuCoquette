package presentacion;

/**
 *
 * @author Berry
 */
public class FormEfectivo extends javax.swing.JFrame {

    /**
     * Creates new form JCambio
     */
    public FormEfectivo() {
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
        txtTitulo1 = new javax.swing.JLabel();
        txtTitulo2 = new javax.swing.JLabel();
        txtTitulo3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoRosa.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtTitulo.setText("Cambio");

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo1.setText("¿Con cuánto va a pagar?");

        txtTitulo2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo2.setText("Cantidad");

        txtTitulo3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo3.setText("Cambio $0.0");

        cantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(226, 183, 252));
        btnPagar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPagar.setText("Finalizar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(226, 183, 252));
        botonCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFondoBlancoLayout = new javax.swing.GroupLayout(panFondoBlanco);
        panFondoBlanco.setLayout(panFondoBlancoLayout);
        panFondoBlancoLayout.setHorizontalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoBlancoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTitulo1)
                    .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panFondoBlancoLayout.createSequentialGroup()
                            .addComponent(txtTitulo2)
                            .addGap(18, 18, 18)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTitulo3)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panFondoBlancoLayout.setVerticalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo1)
                .addGap(18, 18, 18)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo2)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panFondoRosaLayout = new javax.swing.GroupLayout(panFondoRosa);
        panFondoRosa.setLayout(panFondoRosaLayout);
        panFondoRosaLayout.setHorizontalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoRosaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(149, 149, 149))
        );
        panFondoRosaLayout.setVerticalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addComponent(panFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    }//GEN-LAST:event_btnPagarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
//        JMenuPrincipal jmp = new JMenuPrincipal();
//        jmp.setVisible(true);
//        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panFondoRosa;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JLabel txtTitulo2;
    private javax.swing.JLabel txtTitulo3;
    // End of variables declaration//GEN-END:variables
}
