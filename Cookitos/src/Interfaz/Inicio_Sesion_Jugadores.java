package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;

/**
 *
 * @author sohaib, Jose, Laura
 */
public class Inicio_Sesion_Jugadores extends javax.swing.JPanel {

    private String usuario;
    private String password;
    private String usuario2;
    private String password2;
    private Almacen_de_jugadores almacenjug;
    private Jugador j1, j2;

    //  j2=new Jugador();
    //CONSTRUCTOR
    public Inicio_Sesion_Jugadores(Almacen_de_jugadores almacenj) {
        initComponents();
        this.setSize(650, 380);
        this.almacenjug = almacenj;
    }

    public void MostrarPanelPartida(JPanel p) {
        this.removeAll();
        p.setSize(650, 380);
        p.setLocation(0, 0);
        this.add(p, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    public void MuestraPanel(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(650, 380);
        PanelDiferente.removeAll();
        PanelDiferente.add(p);
        PanelDiferente.revalidate();
        PanelDiferente.repaint();
        p.setFocusable(true); //mirar
        p.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDiferente = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Contrasena1 = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        IniciarSesion1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        PanelDiferente.setBackground(new java.awt.Color(255, 255, 255));
        PanelDiferente.setMaximumSize(new java.awt.Dimension(500, 380));
        PanelDiferente.setMinimumSize(new java.awt.Dimension(500, 380));

        IniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        IniciarSesion.setText("Inserte nombre de usuario");
        IniciarSesion.setBorder(null);
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IniciarSesionMousePressed(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN JUGADOR 1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        Contrasena.setForeground(new java.awt.Color(102, 102, 102));
        Contrasena.setText("pon una contraseña");
        Contrasena.setToolTipText("");
        Contrasena.setBorder(null);
        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContrasenaMousePressed(evt);
            }
        });
        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");

        Contrasena1.setForeground(new java.awt.Color(102, 102, 102));
        Contrasena1.setText("pon una contraseña");
        Contrasena1.setToolTipText("");
        Contrasena1.setBorder(null);
        Contrasena1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Contrasena1MousePressed(evt);
            }
        });
        Contrasena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contrasena1ActionPerformed(evt);
            }
        });

        IniciarSesion1.setForeground(new java.awt.Color(102, 102, 102));
        IniciarSesion1.setText("Inserte nombre de usuario");
        IniciarSesion1.setBorder(null);
        IniciarSesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IniciarSesion1MousePressed(evt);
            }
        });
        IniciarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesion1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LOGIN JUGADOR 2");

        jButton1.setText("JUGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDiferenteLayout = new javax.swing.GroupLayout(PanelDiferente);
        PanelDiferente.setLayout(PanelDiferenteLayout);
        PanelDiferenteLayout.setHorizontalGroup(
            PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiferenteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Contrasena, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        PanelDiferenteLayout.setVerticalGroup(
            PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiferenteLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IniciarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDiferente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDiferente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed

    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void IniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMousePressed
        if (IniciarSesion.getText().equals("Inserte nombre de usuario")) {
            IniciarSesion.setText("");                  //cuando se pulsa se borra el texto que estuviera
            IniciarSesion.setForeground(Color.BLACK); //cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(Contrasena.getPassword()).isEmpty()) {//si no tiene nada escrito restaura con el texto original
            Contrasena.setText("pon una contraseña");
            Contrasena.setForeground(Color.GRAY);
        }


    }//GEN-LAST:event_IniciarSesionMousePressed

    private void ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMousePressed
        if (Contrasena.getText().equals("pon una contraseña")) { //solo deja entrar a esta condicion cuando el texto anterior sea el mismo
            Contrasena.setText(" ");                 //cuando se pulsa se borra el texto que estuviera
            Contrasena.setForeground(Color.BLACK);//cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(IniciarSesion.getText()).isEmpty()) { //si no tiene nada escrito restaura con el texto original
            IniciarSesion.setText("Inserte nombre de usuario");
            IniciarSesion.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_ContrasenaMousePressed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void Contrasena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contrasena1ActionPerformed
        if (Contrasena1.getText().equals("pon una contraseña")) { //solo deja entrar a esta condicion cuando el texto anterior sea el mismo
            Contrasena1.setText(" ");                 //cuando se pulsa se borra el texto que estuviera
            Contrasena1.setForeground(Color.BLACK);//cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(IniciarSesion1.getText()).isEmpty()) { //si no tiene nada escrito restaura con el texto original
            IniciarSesion1.setText("Inserte nombre de usuario");
            IniciarSesion1.setForeground(Color.GRAY);
        }    }//GEN-LAST:event_Contrasena1ActionPerformed

    private void IniciarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesion1ActionPerformed
        if (IniciarSesion1.getText().equals("Inserte nombre de usuario")) {
            IniciarSesion1.setText("");                  //cuando se pulsa se borra el texto que estuviera
            IniciarSesion1.setForeground(Color.BLACK); //cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(Contrasena1.getPassword()).isEmpty()) {//si no tiene nada escrito restaura con el texto original
            Contrasena1.setText("pon una contraseña");
            Contrasena1.setForeground(Color.GRAY);
        
        }    }//GEN-LAST:event_IniciarSesion1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.usuario = String.valueOf(IniciarSesion.getText());
        this.password = String.valueOf(Contrasena.getText());
        this.usuario2 = String.valueOf(IniciarSesion1.getText());
        this.password2 = String.valueOf(Contrasena1.getText());

        //JUGADOR 1
        try {
            this.almacenjug.deserializar(); //leer
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.j1 = (almacenjug.autenticar(usuario, password));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (j1 == null) {
            System.out.println("No existe el jugador 1 que has introducido");
        } else {
            System.out.println("Jugador 1 introducido correctamente");
        }

        //JUGADOR 2
        try {
            this.almacenjug.deserializar(); //leer
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.j2 = (almacenjug.autenticar(usuario2, password2));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (j2 == null) {
            System.out.println("No existe el jugador 2 que has introducido");
            //HE PUESTO ESTO DE ABAJO
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha introducido o no se pusó los datos correctamente"); //si los datos incorrectos salta pestaña de error
        } else {
            System.out.println("Jugador 2 introducido correctamente");
        }

        //Si jugador 1 y 2 existen debe redirigir hacia la interfaz Eleccion_num_letras
        if (j1 != null && j2 != null) {
            Eleccion_num_letras eleccionLetras = new Eleccion_num_letras(j1, j2, almacenjug);
            this.MuestraPanel(eleccionLetras);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void Contrasena1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contrasena1MousePressed
      if (Contrasena1.getText().equals("pon una contraseña")) { //solo deja entrar a esta condicion cuando el texto anterior sea el mismo
            Contrasena1.setText(" ");                 //cuando se pulsa se borra el texto que estuviera
            Contrasena1.setForeground(Color.BLACK);//cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(IniciarSesion1.getText()).isEmpty()) { //si no tiene nada escrito restaura con el texto original
            IniciarSesion1.setText("Inserte nombre de usuario");
            IniciarSesion1.setForeground(Color.GRAY);}
    }//GEN-LAST:event_Contrasena1MousePressed

    private void IniciarSesion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesion1MousePressed
       if (IniciarSesion1.getText().equals("Inserte nombre de usuario")) {
            IniciarSesion1.setText("");                  //cuando se pulsa se borra el texto que estuviera
            IniciarSesion1.setForeground(Color.BLACK); //cuando se escriba las letras cambian a negro
        }

        if (String.valueOf(Contrasena1.getPassword()).isEmpty()) {//si no tiene nada escrito restaura con el texto original
            Contrasena1.setText("pon una contraseña");
            Contrasena1.setForeground(Color.GRAY);}
    }//GEN-LAST:event_IniciarSesion1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JPasswordField Contrasena1;
    private javax.swing.JTextField IniciarSesion;
    private javax.swing.JTextField IniciarSesion1;
    private javax.swing.JPanel PanelDiferente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
