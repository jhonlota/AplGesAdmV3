/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * ExternoPanelFktercero.java
 *
 * Created on 16/02/2012, 09:45:23 PM
 */
package frame;

import clases.ClaseGeneral;
import entidades.Soportescomprobantes;
import entidades.Soportescuentas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Jhon Lopez
 */
public class ExternoPanelBuscarImputacion extends javax.swing.JPanel {

    private List listaSoportesComprobante = new ArrayList();
    private List listaSoportesCuenta = new ArrayList();
    public String soporte = "Seleccione";
    public String fksoportecuenta;
    public int fksoportecuentaid;
    public int fksoportecomprobante;
    public int fksoportecomprobanteid;
    public int fksoportecomprobanteano;

    /**
     * Creates new form ExternoPanelFktercero
     */
    public ExternoPanelBuscarImputacion() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        parametro = new javax.swing.JComboBox();
        jLabelNumero = new javax.swing.JLabel();
        fkcomprobante = new javax.swing.JTextField();
        jLabelNumeroOG = new javax.swing.JLabel();
        fkcuenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scrollLista = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();

        setMaximumSize(new java.awt.Dimension(550, 300));
        setMinimumSize(new java.awt.Dimension(550, 300));
        setPreferredSize(new java.awt.Dimension(550, 300));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setBackground(ClaseGeneral.titulo);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criterios de Búsqueda");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(540, 25));
        add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jLabel2);

        jLabel3.setText("TIPO DE PAGO :");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        add(jLabel3);

        parametro.setBackground(ClaseGeneral.campo);
        parametro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parametro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Fondo Renovable y/o Caja Menor", "Solicitud de Pago" }));
        parametro.setSelectedItem("COORDINACIÓN DE ÁREA ADMINISTRATIVA");
        parametro.setPreferredSize(new java.awt.Dimension(435, 25));
        parametro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                parametroItemStateChanged(evt);
            }
        });
        add(parametro);

        jLabelNumero.setText("NUMERO :");
        jLabelNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        this.jLabelNumero.setVisible(false);
        add(jLabelNumero);

        fkcomprobante.setBackground(ClaseGeneral.campo);
        fkcomprobante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fkcomprobante.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fkcomprobante.setName("COMPROBANTE"); // NOI18N
        fkcomprobante.setPreferredSize(new java.awt.Dimension(435, 25));
        fkcomprobante.setVisible(false);
        fkcomprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldKeyReleased(evt);
            }
        });
        add(fkcomprobante);

        jLabelNumeroOG.setText("NUMERO OG :");
        jLabelNumeroOG.setPreferredSize(new java.awt.Dimension(100, 25));
        this.jLabelNumeroOG.setVisible(false);
        add(jLabelNumeroOG);

        fkcuenta.setBackground(ClaseGeneral.campo);
        fkcuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fkcuenta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fkcuenta.setName("SOPORTE"); // NOI18N
        fkcuenta.setPreferredSize(new java.awt.Dimension(435, 25));
        fkcuenta.setVisible(false);
        fkcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldKeyReleased(evt);
            }
        });
        add(fkcuenta);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jLabel5);

        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(540, 10));
        add(jSeparator1);

        scrollLista.setMaximumSize(new java.awt.Dimension(540, 150));
        scrollLista.setMinimumSize(new java.awt.Dimension(540, 150));
        scrollLista.setPreferredSize(new java.awt.Dimension(540, 150));

        lista.setSelectionBackground(ClaseGeneral.campo);
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        scrollLista.setViewportView(lista);

        add(scrollLista);
    }// </editor-fold>//GEN-END:initComponents

    private void TexyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexyFieldKeyReleased
        javax.swing.JTextField componente = (javax.swing.JTextField) evt.getComponent();
        String texto = componente.getText();
        componente.setText(texto.toUpperCase());

        ClaseGeneral.parametro = componente.getName();
        ClaseGeneral.valor = componente.getText();

        String seleccion = "" + parametro.getSelectedItem();

        if (seleccion.equals("Fondo Renovable y/o Caja Menor")) {
            listaSoportesComprobante = ClaseGeneral.controlSoportescomprobantes.findAllInSoportescomprobantesByFkcomprobanteAno(Integer.parseInt(ClaseGeneral.valor), ClaseGeneral.resoluciones.getResolucionPK().getAno());
            DefaultListModel modeloLista = new DefaultListModel();
            for (int i = 0; i < listaSoportesComprobante.size(); i++) {
                ClaseGeneral.soportescomprobantes = (Soportescomprobantes) listaSoportesComprobante.get(i);
                modeloLista.addElement(ClaseGeneral.soportescomprobantes.getCuenta() + " - " + ClaseGeneral.soportescomprobantes.getActividad() + " - " + ClaseGeneral.soportescomprobantes.getSubgrupo() + " - " + ClaseGeneral.soportescomprobantes.getCcostos() + " - " + ClaseGeneral.soportescomprobantes.getCinfo() + " - " + ClaseGeneral.soportescomprobantes.getCuentainterna() + " - " + ClaseGeneral.soportescomprobantes.getValor());
                fksoportecomprobante = ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK().getFkcomprobante();
                fksoportecomprobanteid = ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK().getId();
                fksoportecomprobanteano = ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK().getAno();
                fksoportecuenta = "-";
                fksoportecuentaid = -1;
            }
            lista.setModel(modeloLista);
//            System.out.println("SOPORTECOMPROBANTE --> FKSOPORTE = " + fksoportecomprobante + ", ID =" + fksoportecomprobanteid + "ANO = " + fksoportecomprobanteano);
        }

        if (seleccion.equals("Solicitud de Pago")) {
            listaSoportesCuenta = ClaseGeneral.controlSoportescuentas.findAllInSoportescuentasLIKEFkcuenta(ClaseGeneral.valor);
            DefaultListModel modeloLista = new DefaultListModel();
            for (int i = 0; i < listaSoportesCuenta.size(); i++) {
                ClaseGeneral.soportescuentas = (Soportescuentas) listaSoportesCuenta.get(i);
                modeloLista.addElement(ClaseGeneral.soportescuentas.getCuenta() + " - " + ClaseGeneral.soportescuentas.getActividad() + " - " + ClaseGeneral.soportescuentas.getSubgrupo() + " - " + ClaseGeneral.soportescuentas.getCcostos() + " - " + ClaseGeneral.soportescuentas.getCinfo() + " - " + ClaseGeneral.soportescuentas.getCuentainterna() + " - " + ClaseGeneral.soportescuentas.getValor());
                fksoportecuenta = ClaseGeneral.soportescuentas.getSoportescuentasPK().getFkcuenta();
                fksoportecuentaid = ClaseGeneral.soportescuentas.getSoportescuentasPK().getId();
                fksoportecomprobante = -1;
                fksoportecomprobanteid = -1;
                fksoportecomprobanteano = -1;
            }
            lista.setModel(modeloLista);
//            System.out.println("SOPORTECUENTA --> FKSOPORTE = " + fksoportecuenta + ", ID =" + fksoportecuentaid);
        }
}//GEN-LAST:event_TexyFieldKeyReleased

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        JList laLista = (JList) evt.getSource();
        if (laLista.isSelectionEmpty()) {
            soporte = "Seleccione";
            return;
        } else {
            soporte = "" + laLista.getSelectedValue();
        }
}//GEN-LAST:event_listaValueChanged

    private void parametroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_parametroItemStateChanged
        // TODO add your handling code here:
        String seleccion = (String) parametro.getSelectedItem();
        if (!seleccion.equals("Seleccione")) {
            jLabelNumero.setVisible(true);
            fkcomprobante.setVisible(true);
            fkcomprobante.setText("");
        } else {
            jLabelNumero.setVisible(false);
            fkcomprobante.setVisible(false);
            fkcomprobante.setText("");
        }
    }//GEN-LAST:event_parametroItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fkcomprobante;
    private javax.swing.JTextField fkcuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroOG;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lista;
    private javax.swing.JComboBox parametro;
    private javax.swing.JScrollPane scrollLista;
    // End of variables declaration//GEN-END:variables
}
