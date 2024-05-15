/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import Caso.CasoConsultarVentas;
import Interfaz.ICasoConsultarVenta;
import com.mycompany.heladeriaconsultar.CasoConsultar;
import dto.PedidoDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class HistorialVentas extends javax.swing.JFrame {

    /**
     * Creates new form HistorilVentas
     */
    public HistorialVentas() throws PersistenciaException {
        initComponents();

        CasoConsultarVentas cv = new CasoConsultarVentas();
        List<PedidoDTO> listaPedidosPro = cv.listaHistorial();
        tabla(listaPedidosPro);
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
        jPanel3 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        panFondoRosa.setBackground(new java.awt.Color(233, 215, 248));

        javax.swing.GroupLayout panFondoRosaLayout = new javax.swing.GroupLayout(panFondoRosa);
        panFondoRosa.setLayout(panFondoRosaLayout);
        panFondoRosaLayout.setHorizontalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );
        panFondoRosaLayout.setVerticalGroup(
            panFondoRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(233, 215, 248));

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtTitulo.setText("Historial de ventas");

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonRegresar)
                        .addGap(90, 90, 90)
                        .addComponent(txtTitulo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo)
                    .addComponent(botonRegresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        ConsultarVentas2 cv = new ConsultarVentas2();
        cv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    public static String formatDate(Date date) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public void tabla(List<PedidoDTO> pedido) throws PersistenciaException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha de la venta");
        modelo.addColumn("Total venta");

        try {
            if (pedido != null && !pedido.isEmpty()) {
                for (PedidoDTO patricio : pedido) {
                    String[] datos = new String[2];
                    datos[0] = formatDate(patricio.getFecha());
                    datos[1] = "" + patricio.getTotalPedido();

                    modelo.addRow(datos);
                }
                tablaHistorial.setModel(modelo);
                tablaHistorial.repaint();
            } else {
                System.out.println("La lista está vacía");
            }
        } catch (Exception e) {
            throw e;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panFondoRosa;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
