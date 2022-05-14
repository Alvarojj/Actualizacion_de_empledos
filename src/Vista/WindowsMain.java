package Vista;

import Controlador.ListaDoble;
import Modelo.Empleado;
import javax.swing.JOptionPane;

public class WindowsMain extends javax.swing.JFrame {

    ListaDoble open = new ListaDoble();
    int xmouse, ymouse;

    public WindowsMain() {
        initComponents();

    }

    public void limpiar() {
        textCodigo.setText("");
        textEmpleado.setText("");
        textHoras.setText("");
        textTarifa.setText("");
    }

    public void limpiartabla() {
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        SeparadorCodigo = new javax.swing.JSeparator();
        EmpleadoTitul = new javax.swing.JLabel();
        textEmpleado = new javax.swing.JTextField();
        SeparadorEmpleado = new javax.swing.JSeparator();
        EmpleadoTitul1 = new javax.swing.JLabel();
        textHoras = new javax.swing.JTextField();
        SeparadorEmpleado1 = new javax.swing.JSeparator();
        EmpleadoTitul2 = new javax.swing.JLabel();
        textTarifa = new javax.swing.JTextField();
        SeparadorEmpleado2 = new javax.swing.JSeparator();
        btnListar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCosultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        codigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        codigo.setText("CODIGO:");
        jPanel3.add(codigo);
        codigo.setBounds(30, 20, 100, 25);

        textCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textCodigo.setForeground(new java.awt.Color(102, 102, 102));
        textCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textCodigo.setToolTipText("Ingrese el codigo");
        textCodigo.setBorder(null);
        textCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCodigoMouseClicked(evt);
            }
        });
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(textCodigo);
        textCodigo.setBounds(50, 50, 210, 22);
        jPanel3.add(SeparadorCodigo);
        SeparadorCodigo.setBounds(50, 70, 200, 10);

        EmpleadoTitul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmpleadoTitul.setText("EMPLEADO:");
        jPanel3.add(EmpleadoTitul);
        EmpleadoTitul.setBounds(310, 20, 110, 25);

        textEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textEmpleado.setForeground(new java.awt.Color(102, 102, 102));
        textEmpleado.setToolTipText("Ingrese el nombre del empleado");
        textEmpleado.setBorder(null);
        textEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEmpleadoMouseClicked(evt);
            }
        });
        textEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(textEmpleado);
        textEmpleado.setBounds(330, 50, 220, 20);
        jPanel3.add(SeparadorEmpleado);
        SeparadorEmpleado.setBounds(330, 70, 200, 10);

        EmpleadoTitul1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmpleadoTitul1.setText(" HORAS:");
        jPanel3.add(EmpleadoTitul1);
        EmpleadoTitul1.setBounds(30, 90, 80, 25);

        textHoras.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textHoras.setForeground(new java.awt.Color(102, 102, 102));
        textHoras.setToolTipText("Ingrese las horas trabajadas");
        textHoras.setBorder(null);
        textHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textHorasMouseClicked(evt);
            }
        });
        textHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHorasActionPerformed(evt);
            }
        });
        jPanel3.add(textHoras);
        textHoras.setBounds(50, 120, 180, 22);
        jPanel3.add(SeparadorEmpleado1);
        SeparadorEmpleado1.setBounds(50, 140, 193, 5);

        EmpleadoTitul2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmpleadoTitul2.setText(" TARIFA:");
        jPanel3.add(EmpleadoTitul2);
        EmpleadoTitul2.setBounds(310, 90, 80, 25);

        textTarifa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textTarifa.setForeground(new java.awt.Color(102, 102, 102));
        textTarifa.setToolTipText("Ingrese la tarifa debengada");
        textTarifa.setBorder(null);
        textTarifa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTarifaMouseClicked(evt);
            }
        });
        textTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTarifaActionPerformed(evt);
            }
        });
        jPanel3.add(textTarifa);
        textTarifa.setBounds(330, 120, 180, 20);
        jPanel3.add(SeparadorEmpleado2);
        SeparadorEmpleado2.setBounds(330, 140, 170, 5);

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(102, 102, 102));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/listar1.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setBorder(null);
        btnListar.setContentAreaFilled(false);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel3.add(btnListar);
        btnListar.setBounds(540, 70, 72, 80);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/agregar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrar);
        btnRegistrar.setBounds(30, 390, 150, 70);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar);
        btnModificar.setBounds(180, 390, 150, 70);

        btnCosultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/consultar.png"))); // NOI18N
        btnCosultar.setText("CONSULTAR");
        btnCosultar.setContentAreaFilled(false);
        btnCosultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCosultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCosultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCosultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCosultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCosultar);
        btnCosultar.setBounds(330, 390, 150, 70);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar);
        btnEliminar.setBounds(500, 390, 125, 70);

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Horas", "Tarifa", "Pago"
            }
        ));
        table.setGridColor(new java.awt.Color(101, 139, 242));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(101, 139, 242));
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 600, 210);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 650, 470));

        jPanel2.setBackground(new java.awt.Color(101, 139, 242));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("MANTENIMIENTOS DE EMPLEADOS");

        btnSalir.setBackground(new java.awt.Color(101, 139, 242));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/salir5.png"))); // NOI18N
        btnSalir.setToolTipText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmpleadoActionPerformed

    private void textHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHorasActionPerformed

    private void textTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTarifaActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            limpiartabla();
            Empleado p;
            if (!open.esvacia()) {
                p = open.getpuntero();
                for (int i = 0; i < open.contarregistros(); i++) {
                    table.setValueAt(p.getCodigo(), i, 0);
                    table.setValueAt(p.getNombre(), i, 1);
                    table.setValueAt(p.getHoras(), i, 2);
                    table.setValueAt(p.getTarifa(), i, 3);
                    table.setValueAt(p.getPago(), i, 4);
                    p = p.getSig();
                }
                //HabilitarBotones("IMPRIMIR");
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros.", "Sistema Estudiantes", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos: Descripción de la Falla:\n " + ex.getStackTrace().toString(), "Error de ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
    }//GEN-LAST:event_btnSalirMouseClicked

    private void textCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCodigoMouseClicked

    }//GEN-LAST:event_textCodigoMouseClicked

    private void textEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEmpleadoMouseClicked

    }//GEN-LAST:event_textEmpleadoMouseClicked

    private void textHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textHorasMouseClicked

    }//GEN-LAST:event_textHorasMouseClicked

    private void textTarifaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTarifaMouseClicked
        
    }//GEN-LAST:event_textTarifaMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (!open.Escodigo(textCodigo.getText().trim()) || textCodigo.getText().trim().isEmpty() || Long.parseLong(textCodigo.getText().trim()) < 0) {
                JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún codigo no negativa", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!open.Esnombre(textEmpleado.getText().trim()) || textEmpleado.getText().trim().isEmpty()) {
                    JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún nombre no debe tener caracter especiales", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!open.Esentero(textHoras.getText().trim()) || textHoras.getText().trim().isEmpty() || Long.parseLong(textHoras.getText().trim()) < 0) {
                        JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (textTarifa.getText().trim().isEmpty() || !open.Esdecimal(textTarifa.getText().trim())) {
                            JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún numero decimeal no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (open.buscar(textCodigo.getText().trim()) == null) {
                                Empleado nuevo = open.crearEmpleado(textCodigo.getText().trim(), textEmpleado.getText().trim(), Integer.parseInt(textHoras.getText().trim()), Double.parseDouble(textTarifa.getText().trim()));
                                open.agregar(nuevo);
                                JOptionPane.showMessageDialog(null, "El registro ha sido agregado.", "Acción Ingresar Datos", JOptionPane.INFORMATION_MESSAGE);
                                limpiar();
                                limpiartabla();
                            } else {
                                JOptionPane.showMessageDialog(null, "El empleado ya existe en la lista", "Validación de datos", JOptionPane.ERROR_MESSAGE);

                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos: Descripción de la Falla:\n " + ex.getStackTrace().toString(), "Error de ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int r = JOptionPane.showOptionDialog(this, "¿Estas seguro de eliminar el resgistro?", "Sistema de estudiantes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                if (!textCodigo.getText().trim().isEmpty() && !open.esvacia()) {
                    open.eliminarEmpleado(textCodigo.getText().trim());
                    limpiar();
                    limpiartabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Coloque un codigo valido", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Acción cancelada", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos: Descripción de la Falla:\n " + ex.getStackTrace().toString(), "Error de ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if (!open.Escodigo(textCodigo.getText().trim()) || textCodigo.getText().trim().isEmpty() || Long.parseLong(textCodigo.getText().trim()) < 0) {
                JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún codigo no negativa", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!open.Esnombre(textEmpleado.getText().trim()) || textEmpleado.getText().trim().isEmpty()) {
                    JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún nombre no debe tener caracter especiales", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!open.Esentero(textHoras.getText().trim()) || textHoras.getText().trim().isEmpty() || Long.parseLong(textHoras.getText().trim()) < 0) {
                        JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (textTarifa.getText().trim().isEmpty() || !open.Esdecimal(textTarifa.getText().trim())) {
                            JOptionPane.showConfirmDialog(null, "No es válido o debe ingresar algún numero decimeal no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Empleado p = open.buscar(textCodigo.getText().trim());
                            if (p != null) {
                                open.modificarEmpleado(p, textEmpleado.getText().trim(), Integer.parseInt(textHoras.getText().trim()), Double.parseDouble(textTarifa.getText().trim()));
                                JOptionPane.showMessageDialog(null, "La actualizacion ha sido exitosa.", "Acción Actualizar Datos", JOptionPane.INFORMATION_MESSAGE);
                                limpiar();
                                limpiartabla();
                            } else {
                                JOptionPane.showMessageDialog(null, "El empleado no existe en la lista", "Validación de datos", JOptionPane.ERROR_MESSAGE);

                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos: Descripción de la Falla:\n " + ex.getStackTrace().toString(), "Error de ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCosultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosultarActionPerformed
        try {
            if (!open.Escodigo(textCodigo.getText().trim()) || textCodigo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El codigo no es valido", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (open.buscar(textCodigo.getText().trim()) != null) {
                    Empleado q = open.buscar(textCodigo.getText().trim());
                    textEmpleado.setText(q.getNombre());
                    textHoras.setText(Integer.toString(q.getHoras()));
                    textTarifa.setText(Double.toString(q.getTarifa()));
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado no existe", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos: Descripción de la Falla:\n " + ex.getStackTrace().toString(), "Error de ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCosultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowsMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmpleadoTitul;
    private javax.swing.JLabel EmpleadoTitul1;
    private javax.swing.JLabel EmpleadoTitul2;
    private javax.swing.JSeparator SeparadorCodigo;
    private javax.swing.JSeparator SeparadorEmpleado;
    private javax.swing.JSeparator SeparadorEmpleado1;
    private javax.swing.JSeparator SeparadorEmpleado2;
    private javax.swing.JButton btnCosultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel codigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textEmpleado;
    private javax.swing.JTextField textHoras;
    private javax.swing.JTextField textTarifa;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
