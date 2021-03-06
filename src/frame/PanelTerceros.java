/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Panelterceros.java
 *
 * Created on 16/01/2012, 05:14:48 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import entidades.Terceros;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Jhon Lopez
 */
public class PanelTerceros extends javax.swing.JPanel {

    private List lista = new ArrayList();
    private ClaseInformacion informacion = new ClaseInformacion();
    private String estado = "";

    /**
     * Creates new form Panelterceros
     */
    public PanelTerceros() {
        initComponents();

        tipoid.setEditable(true);
        regimen.setEditable(true);
        dependencia.setEditable(true);
        perfil.setEditable(true);
        tipocuenta.setEditable(true);
        tipoidrepresentante.setEditable(true);

        AutoCompleteDecorator.decorate(tipoid);
        AutoCompleteDecorator.decorate(regimen);
        AutoCompleteDecorator.decorate(dependencia);
        AutoCompleteDecorator.decorate(perfil);
        AutoCompleteDecorator.decorate(tipocuenta);
        AutoCompleteDecorator.decorate(tipoidrepresentante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        tipoid = new javax.swing.JComboBox();
        jTextField33 = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        profesion = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        regimen = new javax.swing.JComboBox();
        jTextField35 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        idrepresentante = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        tipoidrepresentante = new javax.swing.JComboBox();
        jTextField36 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        nombrerepresentante = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        dependencia = new javax.swing.JComboBox();
        jTextField17 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        sededependencia = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        edificio = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        oficina = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        perfil = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        ip = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        nombrebanco = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        sedebanco = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        numerocuenta = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        tipocuenta = new javax.swing.JComboBox();
        jTextField24 = new javax.swing.JTextField();

        setName("panelTerceros"); // NOI18N
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabelId.setText("IDENTIFICACION : ");
        jLabelId.setPreferredSize(new java.awt.Dimension(130, 25));
        add(jLabelId);

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setText("0");
        id.setMargin(new java.awt.Insets(2, 4, 2, 4));
        id.setPreferredSize(new java.awt.Dimension(150, 25));
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        add(id);

        jLabel48.setText("TIPO IDENTIFICACIÓN : ");
        jLabel48.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel48);

        tipoid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "CC: CEDULA", "CE: CEDULA DE EXTRANJERIA", "PAS: PASAPORTE", "NIT: NIT" }));
        tipoid.setPreferredSize(new java.awt.Dimension(250, 25));
        add(tipoid);

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField33.setEnabled(false);
        jTextField33.setFocusable(false);
        jTextField33.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField33.setOpaque(false);
        jTextField33.setPreferredSize(new java.awt.Dimension(110, 25));
        add(jTextField33);

        jLabelNombre.setText("NOMBRE COMPLETO : ");
        jLabelNombre.setPreferredSize(new java.awt.Dimension(140, 25));
        add(jLabelNombre);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setMargin(new java.awt.Insets(2, 4, 2, 4));
        nombre.setPreferredSize(new java.awt.Dimension(665, 25));
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        add(nombre);

        jLabel51.setText("DIRECCIÓN / DOMICILIO : ");
        jLabel51.setPreferredSize(new java.awt.Dimension(155, 25));
        add(jLabel51);

        direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccion.setMargin(new java.awt.Insets(2, 4, 2, 4));
        direccion.setPreferredSize(new java.awt.Dimension(320, 25));
        add(direccion);

        jLabel52.setText("TELÉFONO DE CONTACTO : ");
        jLabel52.setPreferredSize(new java.awt.Dimension(170, 25));
        add(jLabel52);

        telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono.setMargin(new java.awt.Insets(2, 4, 2, 4));
        telefono.setPreferredSize(new java.awt.Dimension(150, 25));
        add(telefono);

        jLabel53.setText("CORREO ELECTRÓNICO : ");
        jLabel53.setPreferredSize(new java.awt.Dimension(155, 25));
        add(jLabel53);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setMargin(new java.awt.Insets(2, 4, 2, 4));
        email.setPreferredSize(new java.awt.Dimension(350, 25));
        add(email);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);
        jTextField15.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField15.setOpaque(false);
        jTextField15.setPreferredSize(new java.awt.Dimension(295, 25));
        add(jTextField15);

        jLabel60.setText("PROFESIÓN : ");
        jLabel60.setPreferredSize(new java.awt.Dimension(85, 25));
        add(jLabel60);

        profesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profesion.setMargin(new java.awt.Insets(2, 4, 2, 4));
        profesion.setPreferredSize(new java.awt.Dimension(300, 25));
        add(profesion);

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.setEnabled(false);
        jTextField22.setFocusable(false);
        jTextField22.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField22.setOpaque(false);
        jTextField22.setPreferredSize(new java.awt.Dimension(415, 25));
        add(jTextField22);

        jLabel62.setText("RÉGIMEN TRIBUTARIO : ");
        jLabel62.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel62);

        regimen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regimen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Régimen Simplificado", "Régimen Común" }));
        regimen.setPreferredSize(new java.awt.Dimension(180, 25));
        add(regimen);

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField35.setEnabled(false);
        jTextField35.setFocusable(false);
        jTextField35.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField35.setOpaque(false);
        jTextField35.setPreferredSize(new java.awt.Dimension(470, 25));
        add(jTextField35);

        jLabel75.setPreferredSize(new java.awt.Dimension(810, 10));
        add(jLabel75);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DILIGENCIAR LA INFORMACIÓN DEL REPRESENTANTE LEGAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(810, 100));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel66.setText("ID. REPRESENTANTE :");
        jLabel66.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel6.add(jLabel66);

        idrepresentante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idrepresentante.setText("0");
        idrepresentante.setMargin(new java.awt.Insets(2, 4, 2, 4));
        idrepresentante.setPreferredSize(new java.awt.Dimension(150, 25));
        idrepresentante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idrepresentanteTextFieldFocusGained(evt);
            }
        });
        jPanel6.add(idrepresentante);

        jLabel68.setText("TIPO IDENTIFICACIÓN :");
        jLabel68.setPreferredSize(new java.awt.Dimension(140, 25));
        jPanel6.add(jLabel68);

        tipoidrepresentante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoidrepresentante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "CC: CEDULA", "CE: CEDULA DE EXTRANJERIA", "PAS: PASAPORTE", "NIT: NIT" }));
        tipoidrepresentante.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel6.add(tipoidrepresentante);

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField36.setEnabled(false);
        jTextField36.setFocusable(false);
        jTextField36.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField36.setOpaque(false);
        jTextField36.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel6.add(jTextField36);

        jLabel69.setText("NOMBRE COMPLETO :");
        jLabel69.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel6.add(jLabel69);

        nombrerepresentante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrerepresentante.setMargin(new java.awt.Insets(2, 4, 2, 4));
        nombrerepresentante.setPreferredSize(new java.awt.Dimension(650, 25));
        nombrerepresentante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombrerepresentanteTextFieldFocusGained(evt);
            }
        });
        jPanel6.add(nombrerepresentante);

        add(jPanel6);

        jLabel71.setPreferredSize(new java.awt.Dimension(810, 10));
        add(jLabel71);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DILIGENCIAR LA INFORMACIÓN CUANDO EL TERCERO ES EMPLEADO DE LA UNIVERSIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(810, 150));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel54.setText("CARGO : ");
        jLabel54.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel5.add(jLabel54);

        cargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargo.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cargo.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel5.add(cargo);

        jLabel65.setText(" SALARIO : ");
        jLabel65.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel5.add(jLabel65);

        salario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salario.setText("0");
        salario.setMargin(new java.awt.Insets(2, 4, 2, 4));
        salario.setPreferredSize(new java.awt.Dimension(200, 25));
        salario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldKeyReleased(evt);
            }
        });
        jPanel5.add(salario);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField16.setEnabled(false);
        jTextField16.setFocusable(false);
        jTextField16.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField16.setOpaque(false);
        jTextField16.setPreferredSize(new java.awt.Dimension(125, 25));
        jPanel5.add(jTextField16);

        jLabel55.setText("DEPENDENCIA : ");
        jLabel55.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel5.add(jLabel55);

        dependencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "ARTES GRAFICAS", "DECANATO", "DEPARTAMENTO DE BIOLOGIA", "DEPARTAMENTO DE FISICA", "DEPARTAMENTO DE MATEMATICAS", "DEPARTAMENTO DE QUIMICA" }));
        dependencia.setPreferredSize(new java.awt.Dimension(400, 25));
        //dependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "COORDINACIÓN DE ÁREA ADMINISTRATIVA", "VICE-DECANATURA DE INVESTIGACIONES", "ESCUELA DE INGENIERIA INDUSTRIAL" }));
        jPanel5.add(dependencia);

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField17.setEnabled(false);
        jTextField17.setFocusable(false);
        jTextField17.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField17.setOpaque(false);
        jTextField17.setPreferredSize(new java.awt.Dimension(275, 25));
        jPanel5.add(jTextField17);

        jLabel67.setText("SEDE DEPENDENCIA :");
        jLabel67.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel5.add(jLabel67);

        sededependencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sededependencia.setMargin(new java.awt.Insets(2, 4, 2, 4));
        sededependencia.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel5.add(sededependencia);

        jLabel56.setText("EDIFICIO : ");
        jLabel56.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel5.add(jLabel56);

        edificio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edificio.setMargin(new java.awt.Insets(2, 4, 2, 4));
        edificio.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel5.add(edificio);

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setEnabled(false);
        jTextField18.setFocusable(false);
        jTextField18.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField18.setOpaque(false);
        jTextField18.setPreferredSize(new java.awt.Dimension(175, 25));
        jPanel5.add(jTextField18);

        jLabel59.setText("OFICINA : ");
        jLabel59.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel5.add(jLabel59);

        oficina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oficina.setMargin(new java.awt.Insets(2, 4, 2, 4));
        oficina.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel5.add(oficina);

        jLabel63.setText("PERFIL : ");
        jLabel63.setPreferredSize(new java.awt.Dimension(75, 25));
        jPanel5.add(jLabel63);

        perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "root", "usuario" }));
        perfil.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel5.add(perfil);

        jLabel64.setText("IP : ");
        jLabel64.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel5.add(jLabel64);

        ip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ip.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ip.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel5.add(ip);

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setEnabled(false);
        jTextField23.setFocusable(false);
        jTextField23.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField23.setOpaque(false);
        jTextField23.setPreferredSize(new java.awt.Dimension(105, 25));
        jPanel5.add(jTextField23);

        add(jPanel5);

        jLabel72.setPreferredSize(new java.awt.Dimension(810, 10));
        add(jLabel72);

        jLabel57.setText("NOMBRE DEL BANCO : ");
        jLabel57.setPreferredSize(new java.awt.Dimension(140, 25));
        add(jLabel57);

        nombrebanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrebanco.setMargin(new java.awt.Insets(2, 4, 2, 4));
        nombrebanco.setPreferredSize(new java.awt.Dimension(280, 25));
        add(nombrebanco);

        jLabel70.setText("SEDE DEL BANCO : ");
        jLabel70.setPreferredSize(new java.awt.Dimension(120, 25));
        add(jLabel70);

        sedebanco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedebanco.setMargin(new java.awt.Insets(2, 4, 2, 4));
        sedebanco.setPreferredSize(new java.awt.Dimension(255, 25));
        add(sedebanco);

        jLabel58.setText("NUMERO DE CUENTA : ");
        jLabel58.setPreferredSize(new java.awt.Dimension(140, 25));
        add(jLabel58);

        numerocuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numerocuenta.setText("0");
        numerocuenta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        numerocuenta.setPreferredSize(new java.awt.Dimension(280, 25));
        add(numerocuenta);

        jLabel61.setText("TIPO DE CUENTA : ");
        jLabel61.setPreferredSize(new java.awt.Dimension(120, 25));
        add(jLabel61);

        tipocuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipocuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Cuenta de Ahorros", "Cuenta Corriente" }));
        tipocuenta.setPreferredSize(new java.awt.Dimension(180, 25));
        add(tipocuenta);

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField24.setEnabled(false);
        jTextField24.setFocusable(false);
        jTextField24.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField24.setOpaque(false);
        jTextField24.setPreferredSize(new java.awt.Dimension(70, 25));
        add(jTextField24);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldFocusGained
        javax.swing.JTextField componente = (javax.swing.JTextField) evt.getComponent();
        componente.selectAll();
        componente.requestFocus();
    }//GEN-LAST:event_TextFieldFocusGained

    private void TexyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexyFieldKeyReleased
        try {
            salario.setText(ClaseInformacion.formatoDecimal.format(Long.parseLong(salario.getText().trim().replace(".", ""))));
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TexyFieldKeyReleased

    private void idrepresentanteTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idrepresentanteTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idrepresentanteTextFieldFocusGained

    private void nombrerepresentanteTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombrerepresentanteTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrerepresentanteTextFieldFocusGained

    public void metodoInsertar() {
        ClaseGeneral.terceros = new Terceros();
        ClaseGeneral.terceros.setId(id.getText());
        ClaseGeneral.terceros.setDireccion(direccion.getText());
        ClaseGeneral.terceros.setEmail(email.getText());
        ClaseGeneral.terceros.setNombre(nombre.getText());
        ClaseGeneral.terceros.setTelefono(telefono.getText());
        ClaseGeneral.terceros.setTipoid("" + tipoid.getSelectedItem());
        ClaseGeneral.terceros.setCargo(cargo.getText());
        ClaseGeneral.terceros.setDependencia("" + dependencia.getSelectedItem());
        ClaseGeneral.terceros.setEdificio(edificio.getText());
        ClaseGeneral.terceros.setNombrebanco(nombrebanco.getText());
        ClaseGeneral.terceros.setNumerocuenta(numerocuenta.getText());
        ClaseGeneral.terceros.setOficina(oficina.getText());
        ClaseGeneral.terceros.setProfesion(profesion.getText());
        ClaseGeneral.terceros.setRegimen("" + regimen.getSelectedItem());
        ClaseGeneral.terceros.setTipocuenta("" + tipocuenta.getSelectedItem());
        ClaseGeneral.terceros.setPerfil("" + perfil.getSelectedItem());
        ClaseGeneral.terceros.setIp(ip.getText());
        ClaseGeneral.terceros.setSalario(BigDecimal.valueOf(Long.parseLong("" + salario.getText().trim().replace(".", ""))));
        ClaseGeneral.terceros.setIdrepresentante(idrepresentante.getText());
        ClaseGeneral.terceros.setTipoidrepresentante("" + tipoidrepresentante.getSelectedItem());
        ClaseGeneral.terceros.setNombrerepresentante(nombrerepresentante.getText());
        ClaseGeneral.terceros.setSedebanco(sedebanco.getText());
        ClaseGeneral.terceros.setSededependencia(sededependencia.getText());

        try {
            ClaseGeneral.controlTerceros.create(ClaseGeneral.terceros);
        } catch (Exception ex) {
            Logger.getLogger(PanelTerceros.class.getName()).log(Level.SEVERE, null, ex);
        }

        estado = "nuevo";
    }

    public void metodoConsultar() {
        try {
            id.setText(ClaseGeneral.terceros.getId());
            direccion.setText(ClaseGeneral.terceros.getDireccion());
            email.setText(ClaseGeneral.terceros.getEmail());
            nombre.setText(ClaseGeneral.terceros.getNombre());
            telefono.setText(ClaseGeneral.terceros.getTelefono());
            tipoid.setSelectedItem(ClaseGeneral.terceros.getTipoid());
            cargo.setText(ClaseGeneral.terceros.getCargo());
            dependencia.setSelectedItem(ClaseGeneral.terceros.getDependencia());
            edificio.setText(ClaseGeneral.terceros.getEdificio());
            nombrebanco.setText(ClaseGeneral.terceros.getNombrebanco());
            numerocuenta.setText(ClaseGeneral.terceros.getNumerocuenta());
            oficina.setText(ClaseGeneral.terceros.getOficina());
            profesion.setText(ClaseGeneral.terceros.getProfesion());
            regimen.setSelectedItem(ClaseGeneral.terceros.getRegimen());
            tipocuenta.setSelectedItem(ClaseGeneral.terceros.getTipocuenta());
            perfil.setSelectedItem(ClaseGeneral.terceros.getPerfil());
            ip.setText(ClaseGeneral.terceros.getIp());
            salario.setText("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.terceros.getSalario()));
            idrepresentante.setText(ClaseGeneral.terceros.getIdrepresentante());
            tipoidrepresentante.setSelectedItem(ClaseGeneral.terceros.getTipoidrepresentante());
            nombrerepresentante.setText(ClaseGeneral.terceros.getNombrerepresentante());
            sedebanco.setText(ClaseGeneral.terceros.getSedebanco());
            sededependencia.setText(ClaseGeneral.terceros.getSededependencia());

            /**/ FramePrincipal.metodoEntidadSeleccionada("Beneficiarios", "Terceros *");
//            /**/ ClaseGeneral.parametro = "ID";
//            /**/ ClaseGeneral.valor = id.getText();

            estado = "consultar";
        } catch (Exception ex) {
            Logger.getLogger(PanelResoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoActualizar() {
        Terceros tercerosId = ClaseGeneral.terceros;

        ClaseGeneral.terceros = new Terceros();
        ClaseGeneral.terceros.setId(id.getText());
        ClaseGeneral.terceros.setDireccion(direccion.getText());
        ClaseGeneral.terceros.setEmail(email.getText());
        ClaseGeneral.terceros.setNombre(nombre.getText());
        ClaseGeneral.terceros.setTelefono(telefono.getText());
        ClaseGeneral.terceros.setTipoid("" + tipoid.getSelectedItem());
        ClaseGeneral.terceros.setCargo(cargo.getText());
        ClaseGeneral.terceros.setDependencia("" + dependencia.getSelectedItem());
        ClaseGeneral.terceros.setEdificio(edificio.getText());
        ClaseGeneral.terceros.setNombrebanco(nombrebanco.getText());
        ClaseGeneral.terceros.setNumerocuenta(numerocuenta.getText());
        ClaseGeneral.terceros.setOficina(oficina.getText());
        ClaseGeneral.terceros.setProfesion(profesion.getText());
        ClaseGeneral.terceros.setRegimen("" + regimen.getSelectedItem());
        ClaseGeneral.terceros.setTipocuenta("" + tipocuenta.getSelectedItem());
        ClaseGeneral.terceros.setPerfil("" + perfil.getSelectedItem());
        ClaseGeneral.terceros.setIp(ip.getText());
        ClaseGeneral.terceros.setSalario(BigDecimal.valueOf(Long.parseLong("" + salario.getText().trim().replace(".", ""))));
        ClaseGeneral.terceros.setIdrepresentante(idrepresentante.getText());
        ClaseGeneral.terceros.setTipoidrepresentante("" + tipoidrepresentante.getSelectedItem());
        ClaseGeneral.terceros.setNombrerepresentante(nombrerepresentante.getText());
        ClaseGeneral.terceros.setSedebanco(sedebanco.getText());
        ClaseGeneral.terceros.setSededependencia(sededependencia.getText()); 
        
        try {
            ClaseGeneral.controlTerceros.edit(ClaseGeneral.terceros, tercerosId);
            ClaseGeneral.controlAnexosterceros.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlTercerosresoluciones.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlComprobantes.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlContratos.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlCuentas.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlCumplidoscomprobantes.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlResoluciones.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
            ClaseGeneral.controlSolicitudesoferta.editFktercero(id.getText() + " - " + nombre.getText(), tercerosId.getId());
        } catch (Exception ex) {
            Logger.getLogger(PanelTerceros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoEliminar() {
        try {
            ClaseGeneral.controlTerceros.destroy(id.getText());
            ClaseGeneral.controlAnexosterceros.destroyFktercero(id.getText());
        } catch (Exception ex) {
            Logger.getLogger(PanelTerceros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargo;
    private javax.swing.JComboBox dependencia;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edificio;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idrepresentante;
    private javax.swing.JTextField ip;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombrebanco;
    private javax.swing.JTextField nombrerepresentante;
    private javax.swing.JTextField numerocuenta;
    private javax.swing.JTextField oficina;
    private javax.swing.JComboBox perfil;
    private javax.swing.JTextField profesion;
    private javax.swing.JComboBox regimen;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField sedebanco;
    private javax.swing.JTextField sededependencia;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox tipocuenta;
    private javax.swing.JComboBox tipoid;
    private javax.swing.JComboBox tipoidrepresentante;
    // End of variables declaration//GEN-END:variables
}
