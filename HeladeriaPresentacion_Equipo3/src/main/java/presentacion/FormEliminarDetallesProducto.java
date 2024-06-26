/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dto.DetalleProductoDTO;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JCheckBox;

/**
 *
 * @author USER
 */
public class FormEliminarDetallesProducto extends javax.swing.JFrame {
    private List<DetalleProductoDTO> listaDetallesProductos;
    
    /**
     * Creates new form FormEliminarDetallesProducto
     */
    public FormEliminarDetallesProducto(List<DetalleProductoDTO> listaDetallesProductos) {
        this.listaDetallesProductos=listaDetallesProductos;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        ActionListener listenerTam = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JCheckBox) {
                    JCheckBox selectedCheckBox = (JCheckBox) e.getSource();
                    if (selectedCheckBox.isSelected()) {
                        for(int i=0;i<listaDetallesProductos.size();i++){
                            
                            if(selectedCheckBox.getText().equals(listaDetallesProductos.get(i).toString())){
                                listaDetallesProductos.remove(i);
                                break;
                            }
                        }
                        Container parent = selectedCheckBox.getParent();
                        parent.remove(selectedCheckBox);
                        parent.revalidate();
                        parent.repaint();
                    }
                }
            }
        };
        
        for (DetalleProductoDTO t : listaDetallesProductos) {
            JCheckBox checkbox = new JCheckBox(t.toString());
            checkbox.setPreferredSize(new Dimension(200, 50));
            checkbox.addActionListener(listenerTam);
            panel.add(checkbox);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 215, 248));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Papu Coquette");

        botonRegresar.setBackground(new java.awt.Color(226, 183, 252));
        botonRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panel);

        jLabel2.setText("(Selecciona para eliminar)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(botonRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonRegresar)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 642, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        JMenuPrincipal menuPrincipal = new JMenuPrincipal();
        menuPrincipal.actualizarTable(listaDetallesProductos);
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
