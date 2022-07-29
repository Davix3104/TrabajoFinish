package com.tienda;

import java.awt.Color;

public class interfaz_tienda extends javax.swing.JFrame {
  
  //ATRIBUTOS
  int xMouse, yMouse;
  String productoACE;
  String productoShampoo;
  String productoSuavitel;
  String productoPampers;
  double CompraA, CompraB, CompraC, CompraD;
  
  public interfaz_tienda() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Fondo = new javax.swing.JPanel();
    Banner = new javax.swing.JLabel();
    Logo = new javax.swing.JLabel();
    Texto1 = new javax.swing.JLabel();
    Texto2 = new javax.swing.JLabel();
    Texto3 = new javax.swing.JLabel();
    Texto4 = new javax.swing.JLabel();
    Texto5 = new javax.swing.JLabel();
    Texto6 = new javax.swing.JLabel();
    FondoLogo = new javax.swing.JLabel();
    DatosCompra = new javax.swing.JLabel();
    nameClienteInfo = new javax.swing.JLabel();
    nameClienteLabel = new javax.swing.JLabel();
    nameClientetxt = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    infoProductosLabel = new javax.swing.JLabel();
    comprarBtn = new javax.swing.JPanel();
    comprarLabel = new javax.swing.JLabel();
    Header = new javax.swing.JPanel();
    ExitBtn = new javax.swing.JPanel();
    txtExit = new javax.swing.JLabel();
    cantidadACELabel = new javax.swing.JLabel();
    cantidadACE = new javax.swing.JTextField();
    aceLabel = new javax.swing.JLabel();
    AceInfo = new javax.swing.JLabel();
    precioACE = new javax.swing.JLabel();
    shampooLabel = new javax.swing.JLabel();
    shampooInfo = new javax.swing.JLabel();
    shampooPrecio = new javax.swing.JLabel();
    cantidadShampooLabel = new javax.swing.JLabel();
    cantidadShampoo = new javax.swing.JTextField();
    suavitelLabel = new javax.swing.JLabel();
    SuavitelInfo = new javax.swing.JLabel();
    suavitelPrecio = new javax.swing.JLabel();
    cantidadSuavitelLabel = new javax.swing.JLabel();
    cantidadSuavitel = new javax.swing.JTextField();
    pampersLabel = new javax.swing.JLabel();
    pampersInfo = new javax.swing.JLabel();
    pampersInfo1 = new javax.swing.JLabel();
    pampersPrecio = new javax.swing.JLabel();
    cantidadPampersLabel = new javax.swing.JLabel();
    cantidadPampers = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLocationByPlatform(true);
    setUndecorated(true);
    setResizable(false);

    Fondo.setBackground(new java.awt.Color(189, 232, 139));
    Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Donpepe.png"))); // NOI18N
    Fondo.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 540, -1));

    Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
    Fondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, 220));

    Texto1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
    Texto1.setForeground(new java.awt.Color(0, 0, 0));
    Texto1.setText("Dueños:");
    Texto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    Fondo.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, -1));

    Texto2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
    Texto2.setForeground(new java.awt.Color(0, 0, 0));
    Texto2.setText("- Benique Aquino, Jean");
    Fondo.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

    Texto3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
    Texto3.setForeground(new java.awt.Color(0, 0, 0));
    Texto3.setText("- Huarcaya Salgado, Andoni");
    Fondo.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, 30));

    Texto4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
    Texto4.setForeground(new java.awt.Color(0, 0, 0));
    Texto4.setText("- Carlos Sempertigue, Jeremy ");
    Fondo.add(Texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 220, 30));

    Texto5.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
    Texto5.setForeground(new java.awt.Color(0, 0, 0));
    Texto5.setText("- Rodriguez Valverde, Alvaro ");
    Fondo.add(Texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 30));

    Texto6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
    Texto6.setForeground(new java.awt.Color(0, 0, 0));
    Texto6.setText("- Ruiz Torres, Piero");
    Fondo.add(Texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 220, 30));

    FondoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/FondoLogo_1.png"))); // NOI18N
    Fondo.add(FondoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 540));

    DatosCompra.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
    DatosCompra.setForeground(new java.awt.Color(51, 51, 51));
    DatosCompra.setText("DATOS DE COMPRA");
    Fondo.add(DatosCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 180, 25));

    nameClienteInfo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
    nameClienteInfo.setForeground(new java.awt.Color(102, 102, 102));
    nameClienteInfo.setText("Nombre del Cliente");
    Fondo.add(nameClienteInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 228, 30));
    Fondo.add(nameClienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 20));

    nameClientetxt.setBackground(new java.awt.Color(255, 255, 255));
    nameClientetxt.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
    nameClientetxt.setForeground(new java.awt.Color(153, 153, 153));
    nameClientetxt.setText("Ingrese el nombre del cliente");
    nameClientetxt.setBorder(null);
    nameClientetxt.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nameClientetxtMousePressed(evt);
      }
    });
    Fondo.add(nameClientetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 250, 20));

    jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
    jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
    Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 250, 10));

    infoProductosLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
    infoProductosLabel.setForeground(new java.awt.Color(102, 102, 102));
    infoProductosLabel.setText("Productos en Venta");
    Fondo.add(infoProductosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 133, 30));

    comprarBtn.setBackground(new java.awt.Color(235, 186, 41));
    comprarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    comprarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        comprarBtnMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        comprarBtnMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        comprarBtnMouseExited(evt);
      }
    });

    comprarLabel.setForeground(new java.awt.Color(102, 102, 102));
    comprarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    comprarLabel.setText("COMPRAR");

    javax.swing.GroupLayout comprarBtnLayout = new javax.swing.GroupLayout(comprarBtn);
    comprarBtn.setLayout(comprarBtnLayout);
    comprarBtnLayout.setHorizontalGroup(
      comprarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarBtnLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(comprarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    comprarBtnLayout.setVerticalGroup(
      comprarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarBtnLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(comprarLabel)
        .addContainerGap())
    );

    Fondo.add(comprarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 90, 30));

    Header.setBackground(new java.awt.Color(189, 232, 139));
    Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseDragged(java.awt.event.MouseEvent evt) {
        HeaderMouseDragged(evt);
      }
    });
    Header.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        HeaderMousePressed(evt);
      }
    });

    ExitBtn.setBackground(new java.awt.Color(189, 232, 139));
    ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        ExitBtnMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        ExitBtnMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        ExitBtnMouseExited(evt);
      }
    });

    txtExit.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
    txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtExit.setText("x");

    javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
    ExitBtn.setLayout(ExitBtnLayout);
    ExitBtnLayout.setHorizontalGroup(
      ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    ExitBtnLayout.setVerticalGroup(
      ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
    Header.setLayout(HeaderLayout);
    HeaderLayout.setHorizontalGroup(
      HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    HeaderLayout.setVerticalGroup(
      HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    Fondo.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));
    Fondo.add(cantidadACELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 90, 30));

    cantidadACE.setBackground(new java.awt.Color(255, 255, 255));
    cantidadACE.setForeground(new java.awt.Color(153, 153, 153));
    cantidadACE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    cantidadACE.setText("Cantidad");
    cantidadACE.setToolTipText("");
    cantidadACE.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cantidadACEMousePressed(evt);
      }
    });
    Fondo.add(cantidadACE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 88, -1));

    aceLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ACE.jpg"))); // NOI18N
    Fondo.add(aceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

    AceInfo.setForeground(new java.awt.Color(51, 51, 51));
    AceInfo.setText("Detergente ACE");
    Fondo.add(AceInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 17));

    precioACE.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
    precioACE.setForeground(new java.awt.Color(51, 51, 51));
    precioACE.setText("S/. 3.50");
    Fondo.add(precioACE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

    shampooLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    shampooLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Shampoo.png"))); // NOI18N
    Fondo.add(shampooLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

    shampooInfo.setForeground(new java.awt.Color(51, 51, 51));
    shampooInfo.setText("Shampoo H&S");
    Fondo.add(shampooInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 17));

    shampooPrecio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
    shampooPrecio.setForeground(new java.awt.Color(51, 51, 51));
    shampooPrecio.setText("S/. 10.50");
    Fondo.add(shampooPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));
    Fondo.add(cantidadShampooLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 90, 30));

    cantidadShampoo.setBackground(new java.awt.Color(255, 255, 255));
    cantidadShampoo.setForeground(new java.awt.Color(153, 153, 153));
    cantidadShampoo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    cantidadShampoo.setText("Cantidad");
    cantidadShampoo.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cantidadShampooMousePressed(evt);
      }
    });
    cantidadShampoo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cantidadShampooActionPerformed(evt);
      }
    });
    Fondo.add(cantidadShampoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 89, -1));

    suavitelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/suavitel.jpg"))); // NOI18N
    Fondo.add(suavitelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

    SuavitelInfo.setForeground(new java.awt.Color(51, 51, 51));
    SuavitelInfo.setText("Suavitel Grande");
    Fondo.add(SuavitelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, 17));

    suavitelPrecio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
    suavitelPrecio.setForeground(new java.awt.Color(51, 51, 51));
    suavitelPrecio.setText("S/. 30.50");
    Fondo.add(suavitelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));
    Fondo.add(cantidadSuavitelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 100, 30));

    cantidadSuavitel.setBackground(new java.awt.Color(255, 255, 255));
    cantidadSuavitel.setForeground(new java.awt.Color(153, 153, 153));
    cantidadSuavitel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    cantidadSuavitel.setText("Cantidad");
    cantidadSuavitel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cantidadSuavitelMousePressed(evt);
      }
    });
    cantidadSuavitel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cantidadSuavitelActionPerformed(evt);
      }
    });
    Fondo.add(cantidadSuavitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 99, -1));

    pampersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Pampers.jpg"))); // NOI18N
    Fondo.add(pampersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

    pampersInfo.setForeground(new java.awt.Color(51, 51, 51));
    pampersInfo.setText("Pañales Pampers");
    Fondo.add(pampersInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

    pampersInfo1.setForeground(new java.awt.Color(51, 51, 51));
    pampersInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pampersInfo1.setText("Paq. 72 Unid.");
    Fondo.add(pampersInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 80, 15));

    pampersPrecio.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
    pampersPrecio.setForeground(new java.awt.Color(51, 51, 51));
    pampersPrecio.setText("S/. 56.90");
    Fondo.add(pampersPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));
    Fondo.add(cantidadPampersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 100, 30));

    cantidadPampers.setBackground(new java.awt.Color(255, 255, 255));
    cantidadPampers.setForeground(new java.awt.Color(153, 153, 153));
    cantidadPampers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    cantidadPampers.setText("Cantidad");
    cantidadPampers.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cantidadPampersMousePressed(evt);
      }
    });
    cantidadPampers.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cantidadPampersActionPerformed(evt);
      }
    });
    Fondo.add(cantidadPampers, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 89, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cantidadShampooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadShampooActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cantidadShampooActionPerformed

  private void cantidadPampersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadPampersActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cantidadPampersActionPerformed

  private void cantidadSuavitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadSuavitelActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cantidadSuavitelActionPerformed

  private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
  }//GEN-LAST:event_HeaderMousePressed

  private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - xMouse, y - yMouse);

  }//GEN-LAST:event_HeaderMouseDragged

  private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
    System.exit(0);
  }//GEN-LAST:event_ExitBtnMouseClicked

  private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
    ExitBtn.setBackground(Color.red);
    txtExit.setForeground(Color.white);
  }//GEN-LAST:event_ExitBtnMouseEntered

  private void ExitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseExited
    ExitBtn.setBackground(Color.white);
    txtExit.setForeground(Color.black);
  }//GEN-LAST:event_ExitBtnMouseExited

  private void comprarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarBtnMouseEntered
    comprarBtn.setBackground(new Color(235, 177, 2));
  }//GEN-LAST:event_comprarBtnMouseEntered

  private void comprarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarBtnMouseExited
    comprarBtn.setBackground(new Color(235, 186, 41));
  }//GEN-LAST:event_comprarBtnMouseExited

  private void nameClientetxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameClientetxtMousePressed
    if (nameClientetxt.getText().equals("Ingrese el nombre del cliente")) {
      nameClientetxt.setText("");
      nameClientetxt.setForeground(Color.black);
    }
  }//GEN-LAST:event_nameClientetxtMousePressed

  private void cantidadACEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadACEMousePressed
    int cantACE;
    double precioACE = 3.50;
    String a = "";
    if (cantidadACE.getText().equals("Cantidad")) {
      int rand = (int) (Math.random() * 10+1);
      String rd = String.valueOf(rand);
      cantidadACE.setText(rd);
      cantidadACE.setForeground(Color.black);

      cantACE = Integer.parseInt(cantidadACE.getText());
      double precioTotalACE = cantACE * precioACE;
      a = "Detergente ACE   X" + String.valueOf(cantACE) + "    S/." + String.valueOf(precioTotalACE);
      this.productoACE = a;
      this.CompraA = precioTotalACE;

    }
  }//GEN-LAST:event_cantidadACEMousePressed

  private void comprarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarBtnMouseClicked
    javax.swing.JOptionPane.showMessageDialog(this, "---------------- FACTURA ----------------\nCliente: " + nameClientetxt.getText() + "\nProductos comprados:\n " + productoACE + "\n" + productoShampoo + "\n" + productoSuavitel + "\n" + productoPampers + "\nMonto a pagar:     S/." + (CompraA + CompraB + CompraC + CompraD));
  }//GEN-LAST:event_comprarBtnMouseClicked

  private void cantidadShampooMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadShampooMousePressed
    int cantShampoo;
    double precioShampoo = 10.50;
    String b = "";
    if (cantidadShampoo.getText().equals("Cantidad")) {
      int rand = (int) (Math.random() * 10+1);
      String rd = String.valueOf(rand);
      cantidadShampoo.setText(rd);
      cantidadShampoo.setForeground(Color.black);

      cantShampoo = Integer.parseInt(cantidadShampoo.getText());
      double precioTotalShampoo = cantShampoo * precioShampoo;
      b = " Shampoo   X" + String.valueOf(cantShampoo) + "    S/." + String.valueOf(precioTotalShampoo);
      this.productoShampoo = b;
      this.CompraB = precioTotalShampoo;

    }
  }//GEN-LAST:event_cantidadShampooMousePressed

  private void cantidadSuavitelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadSuavitelMousePressed
    int cantSuavitel;
    double precioSuavitel = 30.50;
    String c = "";
    if (cantidadSuavitel.getText().equals("Cantidad")) {
      int rand = (int) (Math.random() * 10+1);
      String rd = String.valueOf(rand);
      cantidadSuavitel.setText(rd);
      cantidadSuavitel.setForeground(Color.black);

      cantSuavitel = Integer.parseInt(cantidadSuavitel.getText());
      double precioTotalSuavitel = cantSuavitel * precioSuavitel;
      c = " Suavitel   X" + String.valueOf(cantSuavitel) + "    S/." + String.valueOf(precioTotalSuavitel);
      this.productoSuavitel = c;
      this.CompraC = precioTotalSuavitel;

    }
  }//GEN-LAST:event_cantidadSuavitelMousePressed

  private void cantidadPampersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadPampersMousePressed
    int cantPampers;
    double precioPampers = 56.90;
    String d = "";
    if (cantidadPampers.getText().equals("Cantidad")) {
      int rand = (int) (Math.random() * 10+1);
      String rd = String.valueOf(rand);
      cantidadPampers.setText(rd);
      cantidadPampers.setForeground(Color.black);
      cantPampers = Integer.parseInt(cantidadPampers.getText());
      double precioTotalPampers = cantPampers * precioPampers;
      d = " Pampers   X" + String.valueOf(cantPampers) + "    S/." + String.valueOf(precioTotalPampers);
      this.productoPampers = d;
      this.CompraD = precioTotalPampers;

    }
  }//GEN-LAST:event_cantidadPampersMousePressed

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
      java.util.logging.Logger.getLogger(interfaz_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(interfaz_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(interfaz_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(interfaz_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new interfaz_tienda().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AceInfo;
  private javax.swing.JLabel Banner;
  private javax.swing.JLabel DatosCompra;
  private javax.swing.JPanel ExitBtn;
  private javax.swing.JPanel Fondo;
  private javax.swing.JLabel FondoLogo;
  private javax.swing.JPanel Header;
  private javax.swing.JLabel Logo;
  private javax.swing.JLabel SuavitelInfo;
  private javax.swing.JLabel Texto1;
  private javax.swing.JLabel Texto2;
  private javax.swing.JLabel Texto3;
  private javax.swing.JLabel Texto4;
  private javax.swing.JLabel Texto5;
  private javax.swing.JLabel Texto6;
  private javax.swing.JLabel aceLabel;
  private javax.swing.JTextField cantidadACE;
  private javax.swing.JLabel cantidadACELabel;
  private javax.swing.JTextField cantidadPampers;
  private javax.swing.JLabel cantidadPampersLabel;
  private javax.swing.JTextField cantidadShampoo;
  private javax.swing.JLabel cantidadShampooLabel;
  private javax.swing.JTextField cantidadSuavitel;
  private javax.swing.JLabel cantidadSuavitelLabel;
  private javax.swing.JPanel comprarBtn;
  private javax.swing.JLabel comprarLabel;
  private javax.swing.JLabel infoProductosLabel;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel nameClienteInfo;
  private javax.swing.JLabel nameClienteLabel;
  private javax.swing.JTextField nameClientetxt;
  private javax.swing.JLabel pampersInfo;
  private javax.swing.JLabel pampersInfo1;
  private javax.swing.JLabel pampersLabel;
  private javax.swing.JLabel pampersPrecio;
  private javax.swing.JLabel precioACE;
  private javax.swing.JLabel shampooInfo;
  private javax.swing.JLabel shampooLabel;
  private javax.swing.JLabel shampooPrecio;
  private javax.swing.JLabel suavitelLabel;
  private javax.swing.JLabel suavitelPrecio;
  private javax.swing.JLabel txtExit;
  // End of variables declaration//GEN-END:variables
}
