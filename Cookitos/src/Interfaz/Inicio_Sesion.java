package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author sohaib
 */
public class Inicio_Sesion extends javax.swing.JPanel {

    private String administrador;
    private String contrasena;
    private Almacen_de_jugadores almacenjug;
    //CONSTRUCTOR
    public Inicio_Sesion(Almacen_de_jugadores almacenjug) {
        initComponents();

        this.setSize(650,380);
        this.almacenjug = almacenjug;
        this.administrador="Admin"; //PONGO UN ADMINISTRADOR DE PRUEBA
        this.contrasena="12345";   //PONGO UNA CONTRASEÑA DE PRUEBA
        //PONGO UNA CONTRASEÑA DE PRUEBA
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
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INICIAR SESIÓN ADMIN");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
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

        EntrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        EntrarSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EntrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        EntrarSesion.setText("ENTRAR");
        EntrarSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        EntrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntrarSesionMousePressed(evt);
            }
        });
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
                .addGap(170, 170, 170)
                .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDiferenteLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(EntrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IniciarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        PanelDiferenteLayout.setVerticalGroup(
            PanelDiferenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiferenteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                .addContainerGap(90, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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

    private void EntrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarSesionMousePressed

    }//GEN-LAST:event_EntrarSesionMousePressed

    private void EntrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarSesionActionPerformed
//COMPARA SI ADMINISTRADOR CONCIDIE CON EL QUE EXISTE
        if (IniciarSesion.getText().equals(this.administrador) && (Contrasena.getText().equals(this.contrasena))) {
            Config_ menuConfig = new Config_(almacenjug);
            this.MuestraPanel(menuConfig); //MUESTRO EL PANEL DE CONFIGURACION SI EL ADMIN ES CORRECTO
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR"); //si los datos incorrectos salta pestaña de error
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
