/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author natas
 */
public class JMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JMenuPrincipal
     */
    public JMenuPrincipal() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panFondo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        panOpciones = new javax.swing.JPanel();
        panConos = new javax.swing.JPanel();
        panImgCono = new javax.swing.JPanel();
        txtConos = new javax.swing.JLabel();
        panVasos = new javax.swing.JPanel();
        panImgVasos = new javax.swing.JPanel();
        txtVasos = new javax.swing.JLabel();
        panBebidas = new javax.swing.JPanel();
        panImgBebidas = new javax.swing.JPanel();
        txtBebidas = new javax.swing.JLabel();
        PanTicket = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabTicket = new javax.swing.JTable();
        panHeaderCarito = new javax.swing.JPanel();
        txtHeaderPapuCarrito = new javax.swing.JLabel();
        txtCobro = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondo.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTitulo.setText("Papu Coquette :v");

        panOpciones.setBackground(new java.awt.Color(255, 255, 255));

        panConos.setBackground(new java.awt.Color(226, 183, 252));
        panConos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panConosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panImgConoLayout = new javax.swing.GroupLayout(panImgCono);
        panImgCono.setLayout(panImgConoLayout);
        panImgConoLayout.setHorizontalGroup(
            panImgConoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panImgConoLayout.setVerticalGroup(
            panImgConoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtConos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtConos.setText("Conos");

        javax.swing.GroupLayout panConosLayout = new javax.swing.GroupLayout(panConos);
        panConos.setLayout(panConosLayout);
        panConosLayout.setHorizontalGroup(
            panConosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panImgCono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtConos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panConosLayout.setVerticalGroup(
            panConosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panImgCono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panConosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtConos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panVasos.setBackground(new java.awt.Color(226, 183, 252));
        panVasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panVasosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panImgVasosLayout = new javax.swing.GroupLayout(panImgVasos);
        panImgVasos.setLayout(panImgVasosLayout);
        panImgVasosLayout.setHorizontalGroup(
            panImgVasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panImgVasosLayout.setVerticalGroup(
            panImgVasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtVasos.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtVasos.setText("Vasos");

        javax.swing.GroupLayout panVasosLayout = new javax.swing.GroupLayout(panVasos);
        panVasos.setLayout(panVasosLayout);
        panVasosLayout.setHorizontalGroup(
            panVasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panImgVasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtVasos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panVasosLayout.setVerticalGroup(
            panVasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVasosLayout.createSequentialGroup()
                .addGroup(panVasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVasosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panImgVasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panVasosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtVasos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBebidas.setBackground(new java.awt.Color(226, 183, 252));
        panBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panBebidasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panImgBebidasLayout = new javax.swing.GroupLayout(panImgBebidas);
        panImgBebidas.setLayout(panImgBebidasLayout);
        panImgBebidasLayout.setHorizontalGroup(
            panImgBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panImgBebidasLayout.setVerticalGroup(
            panImgBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtBebidas.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtBebidas.setText("Bebidas");

        javax.swing.GroupLayout panBebidasLayout = new javax.swing.GroupLayout(panBebidas);
        panBebidas.setLayout(panBebidasLayout);
        panBebidasLayout.setHorizontalGroup(
            panBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panImgBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBebidas)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panBebidasLayout.setVerticalGroup(
            panBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBebidasLayout.createSequentialGroup()
                .addGroup(panBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBebidasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panImgBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panBebidasLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtBebidas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panBebidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panVasos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panConos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panConos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panVasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanTicket.setBackground(new java.awt.Color(255, 255, 255));

        tabTicket.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tabTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Sabor", "Tamaño", "Toping", "Cantidad", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tabTicket);

        panHeaderCarito.setBackground(new java.awt.Color(233, 215, 248));

        txtHeaderPapuCarrito.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtHeaderPapuCarrito.setText("Papu Carrito :v");

        javax.swing.GroupLayout panHeaderCaritoLayout = new javax.swing.GroupLayout(panHeaderCarito);
        panHeaderCarito.setLayout(panHeaderCaritoLayout);
        panHeaderCaritoLayout.setHorizontalGroup(
            panHeaderCaritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHeaderCaritoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHeaderPapuCarrito)
                .addGap(192, 192, 192))
        );
        panHeaderCaritoLayout.setVerticalGroup(
            panHeaderCaritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderCaritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHeaderPapuCarrito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCobro.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtCobro.setText("$0.0");

        txtTotal.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtTotal.setText("Total");

        btnPagar.setBackground(new java.awt.Color(226, 183, 252));
        btnPagar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanTicketLayout = new javax.swing.GroupLayout(PanTicket);
        PanTicket.setLayout(PanTicketLayout);
        PanTicketLayout.setHorizontalGroup(
            PanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeaderCarito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanTicketLayout.createSequentialGroup()
                .addGroup(PanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanTicketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
                    .addGroup(PanTicketLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtCobro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanTicketLayout.setVerticalGroup(
            PanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panHeaderCarito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal)
                    .addComponent(txtCobro)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTitulo))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(PanTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(panOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panConosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panConosMouseClicked
        DetallesProducto dt = new DetallesProducto("Conos");
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panConosMouseClicked

    private void panVasosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panVasosMouseClicked
        DetallesProducto dt = new DetallesProducto("Vasos");
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panVasosMouseClicked

    private void panBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panBebidasMouseClicked
        DetallesProducto dt = new DetallesProducto("Bebidas");
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panBebidasMouseClicked

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        JFormaPago jfp = new JFormaPago();
        jfp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanTicket;
    private javax.swing.JButton btnPagar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panBebidas;
    private javax.swing.JPanel panConos;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panHeaderCarito;
    private javax.swing.JPanel panImgBebidas;
    private javax.swing.JPanel panImgCono;
    private javax.swing.JPanel panImgVasos;
    private javax.swing.JPanel panOpciones;
    private javax.swing.JPanel panVasos;
    private javax.swing.JTable tabTicket;
    private javax.swing.JLabel txtBebidas;
    private javax.swing.JLabel txtCobro;
    private javax.swing.JLabel txtConos;
    private javax.swing.JLabel txtHeaderPapuCarrito;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtVasos;
    // End of variables declaration//GEN-END:variables
}
