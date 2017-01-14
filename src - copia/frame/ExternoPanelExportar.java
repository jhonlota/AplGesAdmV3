/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExternoPanelExportar.java
 *
 * Created on 27/11/2012, 05:14:50 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jhon Lopez
 */
public class ExternoPanelExportar extends javax.swing.JPanel {

    /** Creates new form ExternoPanelExportar */
    public ExternoPanelExportar() {
        initComponents();

        fechaInicio.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        fechaFin.setFormats(new SimpleDateFormat("yyyy-MM-dd"));

        fechaInicio.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));
        fechaFin.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));
    }

    /**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        fechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        fechaFin = new org.jdesktop.swingx.JXDatePicker();

        setPreferredSize(new java.awt.Dimension(240, 150));

        jLabel1.setBackground(ClaseGeneral.titulo);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><p align = center>Exportar Informacion<br>de Contratos - F20</p></html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 40));
        add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jLabel2);

        separador1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separador1.setPreferredSize(new java.awt.Dimension(250, 10));
        add(separador1);

        jLabel3.setText("FECHA INICIO : ");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 25));
        add(jLabel3);

        fechaInicio.setFocusable(false);
        fechaInicio.setMaximumSize(new java.awt.Dimension(120, 25));
        fechaInicio.setMinimumSize(new java.awt.Dimension(120, 25));
        fechaInicio.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechaInicio);

        jLabel4.setText("FECHA FIN : ");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 25));
        add(jLabel4);

        fechaFin.setFocusable(false);
        fechaFin.setMaximumSize(new java.awt.Dimension(120, 25));
        fechaFin.setMinimumSize(new java.awt.Dimension(120, 25));
        fechaFin.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechaFin);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.jdesktop.swingx.JXDatePicker fechaFin;
    public org.jdesktop.swingx.JXDatePicker fechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator separador1;
    // End of variables declaration//GEN-END:variables
}
