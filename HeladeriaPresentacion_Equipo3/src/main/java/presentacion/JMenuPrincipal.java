package presentacion;

import com.mycompany.heladeriaagregar.CasoAgregar;
import com.mycompany.heladeriaagregarinteraz.ICasoAgregar;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import dto.ProductoDTO;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author natas
 */
public class JMenuPrincipal extends javax.swing.JFrame {

    private List<DetalleProductoDTO> listaDetallesProductos;
    private List <ProductoDTO> productosDTO;
    private ICasoAgregar casoAgregar;

    /**
     * Creates new form JMenuPrincipal
     *
     * @param listaDetallesProductos
     */
    public JMenuPrincipal() {
        this.listaDetallesProductos = listaDetallesProductos;
        this.casoAgregar = new CasoAgregar();
        initComponents();
        List<String> productos=new ArrayList<>();
        productos.add("Nieve");
        productos.add("Conos");
        productos.add("Sabritas");
        productos.add("Paletas");
        
        for(int i=0;i<productos.size();i++){
            JButton boton = new JButton(productos.get(i));
            boton.setPreferredSize(new Dimension(230, 120)); 
            boton.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                ProductoAdquirido adquirido=new ProductoAdquirido(boton.getText(), listaDetallesProductos);         
                            
                    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panFondo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        panOpciones = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
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

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane3.setViewportView(panel);

        javax.swing.GroupLayout panOpcionesLayout = new javax.swing.GroupLayout(panOpciones);
        panOpciones.setLayout(panOpcionesLayout);
        panOpcionesLayout.setHorizontalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panOpcionesLayout.setVerticalGroup(
            panOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOpcionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(20, 20, 20)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(PanTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panFondoLayout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panHeaderCarito;
    private javax.swing.JPanel panOpciones;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabTicket;
    private javax.swing.JLabel txtCobro;
    private javax.swing.JLabel txtHeaderPapuCarrito;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
