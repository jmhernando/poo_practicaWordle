package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import Pack_Jugador.Almacen_de_jugadores;
import Pack_Jugador.Jugador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sohaib, Jose, Laura
 */
public class EntrarPerfil extends javax.swing.JPanel {

    private String usuario;
    private String password;
    Almacen_de_jugadores almacenj = new Almacen_de_jugadores();
    Jugador j1;
    //  j2=new Jugador();

    //CONSTRUCTOR
    public EntrarPerfil() {
        initComponents();
        this.setSize(650, 380);

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
        p.setSize(500, 380);
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
        EntrarSesion = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESIÓN COMO JUGADOR");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
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

        EntrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        EntrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EntrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        EntrarSesion.setText("ENTRAR");
        EntrarSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        EntrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDiferenteLayout = new javax.swing.GroupLayout(PanelDiferente);
        PanelDiferente.setLayout(PanelDiferenteLayout);
        PanelDiferenteLayout.setHorizontalGroup(
            PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiferenteLayout.createSequentialGroup()
                .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(EntrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        PanelDiferenteLayout.setVerticalGroup(
            PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiferenteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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

    private void EntrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarSesionActionPerformed
        //RECOGIENDO LOS DATOS INTRODUCIDOS PARA VALIDAR SI EXISTE 
        this.usuario = String.valueOf(IniciarSesion.getText());
        this.password = String.valueOf(Contrasena.getText());
     //leemeos y comprobamos que esta todo bien en el fichero
        try {
            this.almacenj.deserializar(); //leer
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.j1 = (this.almacenj.autenticar(usuario, password));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio_Sesion_Jugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        //comprobar que se meten correctamente los datos
        if (j1 == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se ha introducido o no se pusó los datos correctamente"); //si los datos incorrectos salta pestaña de error
            System.out.println("No existe el jugador que has introducido");
        } else {
            //mostrar el panel de perfil
            VerPerfil perfilJugador = new VerPerfil(this.j1);
            this.MostrarPanelPartida(perfilJugador);
            System.out.println("Jugador introducido correctamente");
        }


    }//GEN-LAST:event_EntrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JButton EntrarSesion;
    private javax.swing.JTextField IniciarSesion;
    private javax.swing.JPanel PanelDiferente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
