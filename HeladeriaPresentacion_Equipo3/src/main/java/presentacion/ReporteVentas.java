/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import Caso.CasoConsultarVentas;
import ImprimirReporteVentas.ImprimirReporteVentas;
import dto.ConsultarVentasDTO;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfaces.IImprimirReporteVentas;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class ReporteVentas extends javax.swing.JFrame {

    private List<PedidoDTO> listaPedidosPro;
    private List<DetalleProductoDTO> listaDetallesPro;
    private CasoConsultarVentas cv;
    private IImprimirReporteVentas rp = new ImprimirReporteVentas();
    private Float PapuTotal;
    private Date Papufecha;

    /**
     * Creates new form ReporteVentas
     */
    public ReporteVentas(List<PedidoDTO> pedido, Date fecha, Float total) throws PersistenciaException {

        initComponents();
        txtFechaVenta.setText(formatoFecha(fecha));
        txtTotalVenta.setText("" + total);
        listaPedidosPro = pedido;
        cv = new CasoConsultarVentas();
        PapuTotal = total;
        Papufecha = fecha;

        System.out.println(listaDetallesPro);

        tabla(cv.consultaVentasDetalles(listaPedidosPro));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo1 = new javax.swing.JLabel();
        botonImprimir = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapapupro = new javax.swing.JTable();
        txtTitulo2 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        txtTitulo3 = new javax.swing.JLabel();
        txtTotalVenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo1.setText("Reporte de ventas");

        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablapapupro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablapapupro);

        txtTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo2.setText("Venta total");

        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });

        txtTitulo3.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo3.setText("Fecha");

        txtTotalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(botonRegresar)
                .addGap(194, 194, 194)
                .addComponent(txtTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonImprimir)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImprimir)
                    .addComponent(botonRegresar))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static String formatoFecha(Date date) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        System.out.println("Generando reporte de ventas...");

        List<DetalleProductoDTO> detalles = new ArrayList<>();
        PedidoDTO pedido = new PedidoDTO();

        for (PedidoDTO pedido2 : listaPedidosPro) {
            detalles.addAll(pedido2.getDetalles());
            pedido = pedido2;
            pedido.setFecha(Papufecha);
            pedido.setTotalPedido(PapuTotal);
        }

        if (detalles.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay detalles de productos para imprimir.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            JOptionPane.showMessageDialog(this, "Reporte de ventas generado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el reporte de ventas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        String filePath = "./ReporteVentas.pdf";
        File file = new File(filePath);
        if (file.exists()) {
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                Logger.getLogger(ReporteVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
            rp.imprimirReporteVentas(detalles, pedido);
            ConsultarVentas2 cv = new ConsultarVentas2();
            cv.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        ConsultarVentas2 cv = new ConsultarVentas2();
        cv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    public void tabla(List<DetalleProductoDTO> pedido) throws PersistenciaException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre del Artículo");
        modelo.addColumn("Tamaño");
        modelo.addColumn("Sabor");
        modelo.addColumn("Cantidad");
        modelo.addColumn("¿Topping?");
        modelo.addColumn("Costo");
        modelo.addColumn("Total vendido");

        try {
            if (pedido != null && !pedido.isEmpty()) {
                for (DetalleProductoDTO detalle : pedido) {
                    String[] datos = new String[7];
                    datos[0] = detalle.getNombreProducto();
                    datos[1] = detalle.getTamano();
                    datos[2] = detalle.getSabor();
                    datos[3] = String.valueOf(detalle.getCantidad());
                    datos[4] = String.valueOf(detalle.getTopping());
                    if (detalle.getTopping() == true) {
                        datos[4] = "Sí";
                    } else {
                        datos[4] = "No";
                    }
                    datos[5] = String.valueOf(detalle.getTamanoPrecio());
                    datos[6] = String.valueOf(detalle.getPrecioTotal());
                    modelo.addRow(datos);
                }
                tablapapupro.setModel(modelo);
                tablapapupro.repaint();
            } else {
                System.out.println("La lista está vacía");
            }
        } catch (Exception e) {
            throw e;
        }
    }


    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        try {
            ConsultarVentasDTO cv = new ConsultarVentasDTO();
            Date fechaVenta = cv.getFecha();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaVentaStr = dateFormat.format(fechaVenta);
            txtFechaVenta.setText(fechaVentaStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void txtTotalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablapapupro;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JLabel txtTitulo2;
    private javax.swing.JLabel txtTitulo3;
    private javax.swing.JTextField txtTotalVenta;
    // End of variables declaration//GEN-END:variables
}
