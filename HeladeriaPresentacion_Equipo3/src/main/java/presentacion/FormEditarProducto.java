/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.mycompany.heladeriaconsultar.CasoConsultar;
import com.mycompany.heladeriaeditarproducto.CasoEditarProducto;
import com.mycompany.iheladeriaconsultar.ICasoConsultar;
import com.mycompany.iheladeriaeditarproducto.ICasoEditarProducto;
import dto.ProductoDTO;
import dto.TamanoDTO;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FormEditarProducto extends javax.swing.JFrame {
    ICasoConsultar casoConsultar;
    ProductoDTO productoActual;
    ICasoEditarProducto casoEditarProducto;
    /**
     * Creates new form FormEditarProducto
     */
    public FormEditarProducto(String nombreProducto) {
        casoConsultar=new CasoConsultar();
        casoEditarProducto=new CasoEditarProducto();
        productoActual=casoConsultar.consultarProducto(nombreProducto);
        initComponents();
        ActionListener listenerTam = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JCheckBox) {
                    JCheckBox selectedCheckBox = (JCheckBox) e.getSource();
                    if (selectedCheckBox.isSelected()) {
                        for(int i=0;i<productoActual.getTamano().size();i++){
                            
                            if(selectedCheckBox.getName().equals(productoActual.getTamano().get(i).getNombreTamano())){
                                productoActual.getTamano().remove(i);
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

        List<TamanoDTO> tamanos = productoActual.getTamano();
        for (TamanoDTO t : tamanos) {
            JCheckBox checkbox = new JCheckBox(t.getNombreTamano() + " $" + t.getPrecioBase());
            checkbox.setName(t.getNombreTamano());
            checkbox.setPreferredSize(new Dimension(200, 50));
            checkbox.addActionListener(listenerTam);
            panelTamano.add(checkbox);
        }
        ActionListener listenerSab = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JCheckBox) {
                    JCheckBox selectedCheckBox = (JCheckBox) e.getSource();
                    if (selectedCheckBox.isSelected()) {
                        
                        for(int i=0;i<productoActual.getSabores().size();i++){
                            if(selectedCheckBox.getText().equals(productoActual.getSabores().get(i))){
                                productoActual.getSabores().remove(i);
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
        List<String> sabores = productoActual.getSabores();
        for (String s : sabores) {
            JCheckBox checkbox = new JCheckBox(s);
            checkbox.setPreferredSize(new Dimension(200, 50));
            checkbox.addActionListener(listenerSab);
            panelSabor.add(checkbox);
        }

        this.setLocationRelativeTo(null);
        txtNombreProducto.setText(productoActual.getNombre());
        this.setVisible(true);
    }
    public String obtenerPrecio(String texto) {
        int indiceSignoDolar = texto.indexOf("$");
        if (indiceSignoDolar != -1 && indiceSignoDolar < texto.length() - 1) {
            String textoDespuesDelSignoDolar = texto.substring(indiceSignoDolar + 1);
            textoDespuesDelSignoDolar = textoDespuesDelSignoDolar.trim();
            return textoDespuesDelSignoDolar;
        } else {
            return "";
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

        regresarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelTamano = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        anadirTamanoButton = new javax.swing.JButton();
        tamanoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();
        saborTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        anadirSaborButton = new javax.swing.JButton();
        panFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelSabor = new javax.swing.JPanel();
        txtNombreProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresarButton.setBackground(new java.awt.Color(226, 183, 252));
        regresarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        regresarButton.setForeground(new java.awt.Color(0, 0, 0));
        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        eliminarButton.setBackground(new java.awt.Color(226, 183, 252));
        eliminarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(0, 0, 0));
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, -1));

        guardarButton.setBackground(new java.awt.Color(226, 183, 252));
        guardarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        guardarButton.setForeground(new java.awt.Color(0, 0, 0));
        guardarButton.setText("Guadar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        panelTamano.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panelTamano);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 240, 120));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Tamaño:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        anadirTamanoButton.setBackground(new java.awt.Color(226, 183, 252));
        anadirTamanoButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        anadirTamanoButton.setForeground(new java.awt.Color(0, 0, 0));
        anadirTamanoButton.setText("+");
        anadirTamanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirTamanoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anadirTamanoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        getContentPane().add(tamanoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        getContentPane().add(precioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, -1));
        getContentPane().add(saborTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 90, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Sabor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        anadirSaborButton.setBackground(new java.awt.Color(226, 183, 252));
        anadirSaborButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        anadirSaborButton.setForeground(new java.awt.Color(0, 0, 0));
        anadirSaborButton.setText("+");
        anadirSaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirSaborButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anadirSaborButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        panFondo.setBackground(new java.awt.Color(233, 215, 248));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Tamaños:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Sabores:");

        jLabel5.setText("Producto:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("(Seleccione el tamaño para eliminar)");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("(Seleccione el sabor para eliminar)");

        panelSabor.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane4.setViewportView(panelSabor);

        txtNombreProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNombreProducto.setText("Tamaños:");

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel5))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto)
                            .addComponent(jLabel1)))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panFondoLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panFondoLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        getContentPane().add(panFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        FormProductos formProductos=new FormProductos();
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        try {
            casoEditarProducto.eliminarProducto(productoActual);
            FormProductos formProductos=new FormProductos();
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        // TODO add your handling code here:
        try {
            casoEditarProducto.actualizarProducto(productoActual);
            System.out.println(productoActual);
            
            FormProductos formProductos=new FormProductos();
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void anadirTamanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirTamanoButtonActionPerformed
        // TODO add your handling code here:
        if(!tamanoTextField.getText().equals("")||!precioTextField.getText().equals("")){
            try{
                String tamano=tamanoTextField.getText();
                Float precio=Float.parseFloat( precioTextField.getText());
                TamanoDTO tamanoDTO=new TamanoDTO(tamano, precio);
                ActionListener listenerTam = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JCheckBox) {
                        JCheckBox selectedCheckBox = (JCheckBox) e.getSource();
                        if (selectedCheckBox.isSelected()) {
                            for (int i = 0; i < productoActual.getTamano().size(); i++) {

                                if (selectedCheckBox.getName().equals(productoActual.getTamano().get(i).getNombreTamano())) {
                                    productoActual.getTamano().remove(i);
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
            JCheckBox checkbox = new JCheckBox(tamano + " $" + precio);
            checkbox.setName(tamano);
            checkbox.setPreferredSize(new Dimension(200, 50));
            checkbox.addActionListener(listenerTam);
            productoActual.getTamano().add(tamanoDTO);
            panelTamano.add(checkbox);
            panelTamano.revalidate();
            panelTamano.repaint();
            tamanoTextField.setText("");
            precioTextField.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ingrese el precio correctamente");
            }
        }
    }//GEN-LAST:event_anadirTamanoButtonActionPerformed

    private void anadirSaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirSaborButtonActionPerformed
        // TODO add your handling code here:
        if(!saborTextField.getText().equals("")){
            try{
                String sabor=saborTextField.getText();
                
                ActionListener listenerTam = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof JCheckBox) {
                        JCheckBox selectedCheckBox = (JCheckBox) e.getSource();
                        if (selectedCheckBox.isSelected()) {
                            for (int i = 0; i < productoActual.getSabores().size(); i++) {

                                if (selectedCheckBox.getName().equals(productoActual.getSabores().get(i))) {
                                    productoActual.getSabores().remove(i);
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
            JCheckBox checkbox = new JCheckBox(sabor);
            checkbox.setName(sabor);
            checkbox.setPreferredSize(new Dimension(200, 50));
            checkbox.addActionListener(listenerTam);
            productoActual.getSabores().add(sabor);
            panelSabor.add(checkbox);
            panelSabor.revalidate();
            panelSabor.repaint();
            saborTextField.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_anadirSaborButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirSaborButton;
    private javax.swing.JButton anadirTamanoButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panelSabor;
    private javax.swing.JPanel panelTamano;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTextField saborTextField;
    private javax.swing.JTextField tamanoTextField;
    private javax.swing.JLabel txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}
