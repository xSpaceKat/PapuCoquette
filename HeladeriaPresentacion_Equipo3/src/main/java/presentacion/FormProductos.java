/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import com.mycompany.heladeriaconsultar.CasoConsultar;
import com.mycompany.iheladeriaconsultar.ICasoConsultar;
import dto.ProductoDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class FormProductos extends javax.swing.JFrame {
    private List<ProductoDTO> productosDTO;
    private ICasoConsultar casoConsultar;
    List<ProductoDTO> productoDTOs;
    /**
     * Creates new form FormProductos
     */
    public FormProductos() {
        casoConsultar=new CasoConsultar();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        productoDTOs = casoConsultar.consultarTodosProductos();
        JFrame menu=this;
        
        for (int i = 0; i < productoDTOs.size(); i++) {
            JButton boton = new JButton(productoDTOs.get(i).getNombre());
            boton.setBackground(new Color(226,183,252));
            Font f=new Font("Comic Sans MS",18,18);
            boton.setFont(f);
            boton.setPreferredSize(new Dimension(295, 200));
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    FormEditarProducto editarProducto=new FormEditarProducto(boton.getText());
                    menu.dispose();

                }
            });
            panel.add(boton);
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

        panFondo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        anadirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTitulo.setText("Papu Coquette :v    Menú de edición productos");

        regresarButton.setBackground(new java.awt.Color(226, 183, 252));
        regresarButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        anadirButton.setBackground(new java.awt.Color(226, 183, 252));
        anadirButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        anadirButton.setText("Añadir");
        anadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirButtonActionPerformed(evt);
            }
        });

        panel.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane1.setViewportView(panel);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTitulo)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(panFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        JMenuPrincipal menuPrincipal=new JMenuPrincipal();
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void anadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirButtonActionPerformed
        // TODO add your handling code here:
        FormAgregarNombre agregarNombre=new FormAgregarNombre();
        agregarNombre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anadirButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
