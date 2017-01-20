/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelFormadepagocontratos.java
 *
 * Created on 16/01/2012, 05:14:48 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import entidades.Formadepagocontratos;
import entidades.FormadepagocontratosPK;
import entidades.Formadepagosolicitudesoferta;
import entidades.FormadepagosolicitudesofertaPK;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Lopez
 */
public class PanelFormadepagosolicitudesoferta extends javax.swing.JPanel {

    private List lista = new ArrayList();
    private ClaseInformacion informacion = new ClaseInformacion();

    /**
     * Creates new form PanelFormadepagocontratos
     */
    public PanelFormadepagosolicitudesoferta() {
        initComponents();

        fecha.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        fecha.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));

        fksolicitudoferta.setText(ClaseGeneral.solicitudesoferta.getId());
        metodoMostrar();
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
        fksolicitudoferta = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        fecha = new org.jdesktop.swingx.JXDatePicker();
        jLabel29 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setName("panelFormadepagosolicitudesoferta"); // NOI18N
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("NÚMERO INVITACION : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 25));
        add(jLabel1);

        fksolicitudoferta.setBackground(ClaseGeneral.verde);
        fksolicitudoferta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fksolicitudoferta.setForeground(ClaseGeneral.rojo);
        fksolicitudoferta.setFocusable(false);
        fksolicitudoferta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fksolicitudoferta.setPreferredSize(new java.awt.Dimension(300, 25));
        add(fksolicitudoferta);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);
        jTextField15.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField15.setOpaque(false);
        jTextField15.setPreferredSize(new java.awt.Dimension(340, 25));
        add(jTextField15);

        jLabel49.setText("VALOR DEL PAGO PARCIAL : ");
        jLabel49.setPreferredSize(new java.awt.Dimension(175, 25));
        add(jLabel49);

        valor.setBackground(ClaseGeneral.campo);
        valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor.setText("0");
        valor.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valor.setPreferredSize(new java.awt.Dimension(150, 25));
        valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TexyFieldFocusGained(evt);
            }
        });
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldKeyReleased(evt);
            }
        });
        add(valor);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setEnabled(false);
        jTextField11.setFocusable(false);
        jTextField11.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField11.setOpaque(false);
        jTextField11.setPreferredSize(new java.awt.Dimension(475, 25));
        add(jTextField11);

        jLabel50.setText("FECHAD DE PAGO : ");
        jLabel50.setPreferredSize(new java.awt.Dimension(115, 25));
        add(jLabel50);

        jPanel9.setBackground(ClaseGeneral.campo);
        jPanel9.setMaximumSize(new java.awt.Dimension(140, 25));
        jPanel9.setMinimumSize(new java.awt.Dimension(140, 25));
        jPanel9.setPreferredSize(new java.awt.Dimension(140, 25));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        fecha.setFocusable(false);
        fecha.setMaximumSize(new java.awt.Dimension(120, 25));
        fecha.setMinimumSize(new java.awt.Dimension(120, 25));
        fecha.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel9.add(fecha);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setMaximumSize(new java.awt.Dimension(20, 26));
        jLabel29.setMinimumSize(new java.awt.Dimension(20, 26));
        jLabel29.setPreferredSize(new java.awt.Dimension(20, 26));
        jPanel9.add(jLabel29);

        add(jPanel9);

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.setEnabled(false);
        jTextField26.setFocusable(false);
        jTextField26.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField26.setOpaque(false);
        jTextField26.setPreferredSize(new java.awt.Dimension(545, 25));
        add(jTextField26);

        jLabel71.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel71);

        jScrollPane.setPreferredSize(new java.awt.Dimension(810, 445));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "FECHA ESTIMADA DE PAGO", "VALOR"
            }
        ));
        jTable.setEnabled(false);
        jTable.setFocusable(false);
        jTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable.setRowHeight(20);
        jTable.setSelectionBackground(ClaseGeneral.campo);
        jScrollPane.setViewportView(jTable);

        add(jScrollPane);
    }// </editor-fold>//GEN-END:initComponents

    private void TexyFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TexyFieldFocusGained
        javax.swing.JTextField componente = (javax.swing.JTextField) evt.getComponent();
        componente.selectAll();
        componente.requestFocus();
    }//GEN-LAST:event_TexyFieldFocusGained

    private void TexyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexyFieldKeyReleased
        try {
            valor.setText(ClaseInformacion.formatoDecimal.format(Long.parseLong(valor.getText().trim().replace(".", ""))));
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TexyFieldKeyReleased

    public void metodoInsertar() {
        ClaseGeneral.formadepagosolicitudesoferta = new Formadepagosolicitudesoferta();
        ClaseGeneral.formadepagosolicitudesofertaPK = new FormadepagosolicitudesofertaPK();
        ClaseGeneral.formadepagosolicitudesofertaPK.setFksolicitudoferta("" + fksolicitudoferta.getText());
        ClaseGeneral.formadepagosolicitudesofertaPK.setFecha(fecha.getDate());
        ClaseGeneral.formadepagosolicitudesoferta.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));
        ClaseGeneral.formadepagosolicitudesoferta.setFormadepagosolicitudesofertaPK(ClaseGeneral.formadepagosolicitudesofertaPK);

        if (ClaseGeneral.controlFormadepagosolicitudesoferta.verify(ClaseGeneral.formadepagosolicitudesoferta)) {
            try {
                ClaseGeneral.controlFormadepagosolicitudesoferta.create(ClaseGeneral.formadepagosolicitudesoferta);
            } catch (Exception ex) {
                Logger.getLogger(PanelFormadepagosolicitudesoferta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoConsultar() {
        try {
            fksolicitudoferta.setText("" + ClaseGeneral.formadepagosolicitudesoferta.getFormadepagosolicitudesofertaPK().getFksolicitudoferta());
            fecha.setDate(ClaseGeneral.formadepagosolicitudesoferta.getFormadepagosolicitudesofertaPK().getFecha());
            valor.setText("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.formadepagosolicitudesoferta.getValor()));

            fksolicitudoferta.setFocusable(false);
        } catch (Exception ex) {
            Logger.getLogger(PanelFormadepagosolicitudesoferta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoActualizar() {
        Formadepagosolicitudesoferta formadepagosolicitudesofertaId = ClaseGeneral.formadepagosolicitudesoferta;
        formadepagosolicitudesofertaId.setFormadepagosolicitudesofertaPK(ClaseGeneral.formadepagosolicitudesoferta.getFormadepagosolicitudesofertaPK());
        ClaseGeneral.formadepagosolicitudesoferta = new Formadepagosolicitudesoferta();
        ClaseGeneral.formadepagosolicitudesofertaPK = new FormadepagosolicitudesofertaPK();
        ClaseGeneral.formadepagosolicitudesofertaPK.setFksolicitudoferta("" + fksolicitudoferta.getText());
        ClaseGeneral.formadepagosolicitudesofertaPK.setFecha(fecha.getDate());
        ClaseGeneral.formadepagosolicitudesoferta.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));
        ClaseGeneral.formadepagosolicitudesoferta.setFormadepagosolicitudesofertaPK(ClaseGeneral.formadepagosolicitudesofertaPK);

        if (ClaseGeneral.controlFormadepagosolicitudesoferta.verify(ClaseGeneral.formadepagosolicitudesoferta)) {
            try {
                ClaseGeneral.controlFormadepagosolicitudesoferta.edit(ClaseGeneral.formadepagosolicitudesoferta, formadepagosolicitudesofertaId);
            } catch (Exception ex) {
                Logger.getLogger(PanelFormadepagosolicitudesoferta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoEliminar() {
        Formadepagosolicitudesoferta formadepagosolicitudesofertaId = ClaseGeneral.formadepagosolicitudesoferta;
        formadepagosolicitudesofertaId.setFormadepagosolicitudesofertaPK(ClaseGeneral.formadepagosolicitudesoferta.getFormadepagosolicitudesofertaPK());
        ClaseGeneral.formadepagosolicitudesoferta = new Formadepagosolicitudesoferta();
        ClaseGeneral.formadepagosolicitudesofertaPK = new FormadepagosolicitudesofertaPK();
        try {
            ClaseGeneral.controlFormadepagosolicitudesoferta.destroy(formadepagosolicitudesofertaId);
        } catch (Exception ex) {
            Logger.getLogger(PanelFormadepagosolicitudesoferta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void metodoMostrar() {
        ClaseGeneral.formadepagosolicitudesoferta = new Formadepagosolicitudesoferta();
        lista = ClaseGeneral.controlFormadepagosolicitudesoferta.findAllInFormadepagosolicitudesofertaByFksolicitudoferta(fksolicitudoferta.getText());

        for (int i = 0; i < 100; i++) {
            jTable.setValueAt("", i, 0);
            jTable.setValueAt("", i, 1);
        }

        int i = 0;
        for (Object lista1 : lista) {
            ClaseGeneral.formadepagosolicitudesoferta = (Formadepagosolicitudesoferta) lista1;
            jTable.setValueAt("" + ClaseGeneral.formadepagosolicitudesoferta.getFormadepagosolicitudesofertaPK().getFecha(), i, 0);
            jTable.setValueAt("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.formadepagosolicitudesoferta.getValor()), i, 1);
            i++;
        }

        jTable.clearSelection();
        jTable.getColumnModel().getColumn(0).setPreferredWidth(460);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(350);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker fecha;
    private javax.swing.JTextField fksolicitudoferta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
