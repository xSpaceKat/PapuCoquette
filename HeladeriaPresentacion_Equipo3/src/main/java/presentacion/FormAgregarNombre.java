/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dto.ProductoDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Berry
 */
public class FormAgregarNombre extends javax.swing.JFrame {

    /**
     * Creates new form FromAgregarNombre
     */
    public FormAgregarNombre() {
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

        btnPagar4 = new javax.swing.JButton();
        panFondo = new javax.swing.JPanel();
        panOpciones = new javax.swing.JPanel();
        txtAgregarProducto = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        panSeparador = new javax.swing.JPanel();
        txtNombreDelProducto = new javax.swing.JLabel();
        txfNombreDelProdcuto = new javax.swing.JTextField();
        panSeparador2 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        btnPagar4.setBackground(new java.awt.Color(226, 183, 252));
        btnPagar4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnPagar4.setText("Tarjeta");
        btnPagar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagar4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondo.setBackground(new java.awt.Color(233, 215, 248));

        panOpciones.setBackground(new java.awt.Color(255, 255, 255));

        txtAgregarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtAgregarProducto.setText("Agregar Producto");

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDescripcion.setText("Nombre del producto");

        panSeparador.setBackground(new java.awt.Color(233, 215, 248));

        javax.swing.GroupLayout panSeparadorLayout = new javax.swing.GroupLayout(panSeparador);
        panSeparador.setLayout(panSeparadorLayout);
        panSeparadorLayout.setHorizontalGroup(
            panSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panSeparadorLayout.setVerticalGroup(
            panSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        txtNombreDelProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreDelProducto.setText("Nombre del Producto");

        txfNombreDelProdcuto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        panSeparador2.setBackground(new java.awt.Color(233, 215, 248));

        javax.swing.GroupLayout panSeparador2Layout = new javax.swing.GroupLayout(panSeparador2);
        panSeparador2.setLayout(panSeparador2Layout);
        panSeparador2Layout.setHorizontalGroup(
            panSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        panSeparador2Layout.setVerticalGroup(
            panSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        btnSiguiente.setBackground(new java.awt.Color(226, 183, 252));
        btnSiguiente.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(226, 183, 252));
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(txtAgregarProducto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(txtDescripcion))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(txtNombreDelProducto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(txfNombreDelProdcuto, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panOpcionesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panSeparador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panOpcionesLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtNombreDelProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombreDelProdcuto)
                .addGap(108, 108, 108)
                .addComponent(panSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(txfNombreDelProdcuto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El nombre esta vacio D:");
        }
        else{
            ProductoDTO productoDTO = new ProductoDTO();
            productoDTO.setNombre(txfNombreDelProdcuto.getText());
            FormAgregarSabores FAT = new FormAgregarSabores(productoDTO);
            FAT.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnPagar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPagar4ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Seguro que quieres salirte?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            JMenuPrincipal jmp = new JMenuPrincipal();
            jmp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panOpciones;
    private javax.swing.JPanel panSeparador;
    private javax.swing.JPanel panSeparador2;
    private javax.swing.JTextField txfNombreDelProdcuto;
    private javax.swing.JLabel txtAgregarProducto;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtNombreDelProducto;
    // End of variables declaration//GEN-END:variables
}
