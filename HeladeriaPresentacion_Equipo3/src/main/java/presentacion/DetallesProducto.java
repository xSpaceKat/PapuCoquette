/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.mycompany.heladeriaagregar.CasoAgregar;
import com.mycompany.heladeriaagregarinteraz.ICasoAgregar;
import dto.DetalleProductoDTO;
import dto.ProductoDTO;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author natas
 */
public class DetallesProducto extends javax.swing.JFrame {

    private String producto;
    private ProductoDTO productoDTO;
    private List<DetalleProductoDTO> listaDetallesProductos;
    private DetalleProductoDTO detalleProductoDTO;
    

    /**
     * Creates new form DetallesProducto
     */
    public DetallesProducto(String producto, List<DetalleProductoDTO> listaDetallesProductos) {
        this.listaDetallesProductos = listaDetallesProductos;
        this.producto = producto;
        this.detalleProductoDTO = new DetalleProductoDTO();
        
        initComponents();

        txtNombreProducto.setText(producto);
        detalleProductoDTO.setProducto(productoDTO);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupTamaño = new javax.swing.ButtonGroup();
        btnGrupSabores = new javax.swing.ButtonGroup();
        panFondoRosa = new javax.swing.JPanel();
        panFondoBlanco = new javax.swing.JPanel();
        panLogo = new javax.swing.JPanel();
        txtProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JLabel();
        panSeparador1 = new javax.swing.JPanel();
        txtNombreProducto1 = new javax.swing.JLabel();
        radTamChico = new javax.swing.JRadioButton();
        radTamMediano = new javax.swing.JRadioButton();
        radTamGrande = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        panSeparador2 = new javax.swing.JPanel();
        txtNombreProducto2 = new javax.swing.JLabel();
        radTamSabor1 = new javax.swing.JRadioButton();
        radTamSabor2 = new javax.swing.JRadioButton();
        radTamSabor3 = new javax.swing.JRadioButton();
        radTamSabor4 = new javax.swing.JRadioButton();
        radTamSabor5 = new javax.swing.JRadioButton();
        panSeparador16 = new javax.swing.JPanel();
        txtNombreProducto3 = new javax.swing.JLabel();
        radTamToping = new javax.swing.JRadioButton();
        panSeparador17 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JLabel();
        txfCantidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoRosa.setBackground(new java.awt.Color(233, 215, 248));

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panLogoLayout = new javax.swing.GroupLayout(panLogo);
        panLogo.setLayout(panLogoLayout);
        panLogoLayout.setHorizontalGroup(
            panLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panLogoLayout.setVerticalGroup(
            panLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtProducto.setText("Producto:");

        txtNombreProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreProducto.setText("Nombre del producto");

        javax.swing.GroupLayout panSeparador1Layout = new javax.swing.GroupLayout(panSeparador1);
        panSeparador1.setLayout(panSeparador1Layout);
        panSeparador1Layout.setHorizontalGroup(
            panSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panSeparador1Layout.setVerticalGroup(
            panSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        txtNombreProducto1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreProducto1.setText("Tamaño");

        radTamChico.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupTamaño.add(radTamChico);
        radTamChico.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamChico.setText("Chico ");

        radTamMediano.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupTamaño.add(radTamMediano);
        radTamMediano.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamMediano.setText("Mediano");

        radTamGrande.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupTamaño.add(radTamGrande);
        radTamGrande.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamGrande.setText("Grande");

        btnCancelar.setBackground(new java.awt.Color(226, 183, 252));
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSeparador2Layout = new javax.swing.GroupLayout(panSeparador2);
        panSeparador2.setLayout(panSeparador2Layout);
        panSeparador2Layout.setHorizontalGroup(
            panSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panSeparador2Layout.setVerticalGroup(
            panSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        txtNombreProducto2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreProducto2.setText("Sabores");

        radTamSabor1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupSabores.add(radTamSabor1);
        radTamSabor1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamSabor1.setText("Vainilla");

        radTamSabor2.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupSabores.add(radTamSabor2);
        radTamSabor2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamSabor2.setText("Chocolate");

        radTamSabor3.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupSabores.add(radTamSabor3);
        radTamSabor3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamSabor3.setText("Fresa");
        radTamSabor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTamSabor3ActionPerformed(evt);
            }
        });

        radTamSabor4.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupSabores.add(radTamSabor4);
        radTamSabor4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamSabor4.setText("Platano");

        radTamSabor5.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupSabores.add(radTamSabor5);
        radTamSabor5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamSabor5.setText("Chicle");

        javax.swing.GroupLayout panSeparador16Layout = new javax.swing.GroupLayout(panSeparador16);
        panSeparador16.setLayout(panSeparador16Layout);
        panSeparador16Layout.setHorizontalGroup(
            panSeparador16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        panSeparador16Layout.setVerticalGroup(
            panSeparador16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        txtNombreProducto3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreProducto3.setText("Topings");

        radTamToping.setBackground(new java.awt.Color(255, 255, 255));
        radTamToping.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        radTamToping.setText("Si");

        javax.swing.GroupLayout panSeparador17Layout = new javax.swing.GroupLayout(panSeparador17);
        panSeparador17.setLayout(panSeparador17Layout);
        panSeparador17Layout.setHorizontalGroup(
            panSeparador17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panSeparador17Layout.setVerticalGroup(
            panSeparador17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        txtCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtCantidad.setText("Cantidad");

        txfCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(226, 183, 252));
        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFondoBlancoLayout = new javax.swing.GroupLayout(panFondoBlanco);
        panFondoBlanco.setLayout(panFondoBlancoLayout);
        panFondoBlancoLayout.setHorizontalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panSeparador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addComponent(panLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                        .addComponent(txtNombreProducto)
                                        .addGap(0, 17, Short.MAX_VALUE))
                                    .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                        .addComponent(txtProducto)
                                        .addGap(8, 146, Short.MAX_VALUE))))
                            .addComponent(panSeparador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panSeparador16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panSeparador17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panFondoBlancoLayout.createSequentialGroup()
                        .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(txtNombreProducto1))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radTamMediano)
                                    .addComponent(radTamChico, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radTamGrande, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(txtNombreProducto2))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radTamSabor2)
                                    .addComponent(radTamSabor1)
                                    .addComponent(radTamSabor3)
                                    .addComponent(radTamSabor4)
                                    .addComponent(radTamSabor5)))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(radTamToping))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(txtNombreProducto3))
                            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad))
                                .addGap(18, 18, 18)
                                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panFondoBlancoLayout.setVerticalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoBlancoLayout.createSequentialGroup()
                        .addComponent(txtProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProducto))
                    .addComponent(panLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamChico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamMediano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamGrande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamSabor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamSabor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamSabor3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamSabor4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamSabor5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panSeparador16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radTamToping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSeparador17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout panFondoRosaLayout = new javax.swing.GroupLayout(panFondoRosa);
        panFondoRosa.setLayout(panFondoRosaLayout);
        panFondoRosaLayout.setHorizontalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panFondoRosaLayout.setVerticalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoRosaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JMenuPrincipal jmp = new JMenuPrincipal(listaDetallesProductos);
        jmp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radTamSabor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTamSabor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radTamSabor3ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //JOptionPane.showMessageDialog(rootPane, "Se agrego el producto correctamente");
        
        //tamaño
        if (radTamChico.isSelected()) {
            detalleProductoDTO.setTamanio("Chico");
        } else if (radTamMediano.isSelected()) {
            detalleProductoDTO.setTamanio("Mediano");
        } else if (radTamGrande.isSelected()) {
            detalleProductoDTO.setTamanio("Grande");
        }
        
        //sabor
        if (radTamSabor1.isSelected()) {
            detalleProductoDTO.setSabores("Vainilla");
        } else if (radTamSabor2.isSelected()) {
            detalleProductoDTO.setSabores("Chocolate");
        } else if (radTamSabor3.isSelected()) {
            detalleProductoDTO.setSabores("Fresa");
        } else if (radTamSabor4.isSelected()) {
            detalleProductoDTO.setSabores("Platano");
        } else if (radTamSabor5.isSelected()) {
            detalleProductoDTO.setSabores("Chichle");
        }
        
        //toping
        if (radTamToping.isSelected()) {
            detalleProductoDTO.setToppings(true);
        } else {
            detalleProductoDTO.setToppings(false);
        }
        
        //cantidad
        detalleProductoDTO.setCantidad(Integer.parseInt(txfCantidad.getText()));
        
        //se agrega a la lista de detallesproducots
        listaDetallesProductos.add(detalleProductoDTO);
        
        JMenuPrincipal jmp = new JMenuPrincipal(listaDetallesProductos);
        jmp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGrupSabores;
    private javax.swing.ButtonGroup btnGrupTamaño;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panFondoRosa;
    private javax.swing.JPanel panLogo;
    private javax.swing.JPanel panSeparador1;
    private javax.swing.JPanel panSeparador16;
    private javax.swing.JPanel panSeparador17;
    private javax.swing.JPanel panSeparador2;
    private javax.swing.JRadioButton radTamChico;
    private javax.swing.JRadioButton radTamGrande;
    private javax.swing.JRadioButton radTamMediano;
    private javax.swing.JRadioButton radTamSabor1;
    private javax.swing.JRadioButton radTamSabor2;
    private javax.swing.JRadioButton radTamSabor3;
    private javax.swing.JRadioButton radTamSabor4;
    private javax.swing.JRadioButton radTamSabor5;
    private javax.swing.JRadioButton radTamToping;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtNombreProducto;
    private javax.swing.JLabel txtNombreProducto1;
    private javax.swing.JLabel txtNombreProducto2;
    private javax.swing.JLabel txtNombreProducto3;
    private javax.swing.JLabel txtProducto;
    // End of variables declaration//GEN-END:variables
}
