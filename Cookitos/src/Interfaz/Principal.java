package Interfaz;

import Pack_Jugador.Almacen_de_jugadores;
import Pack_Palabra.*;
import Pack_Partida.Marcador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author sohaib, Jose, Laura
 */
//PRINCIPAL ES NUESTRA JFRAME MAIN, ES DECIR LA PESTAÑA PRINCIPAL-----------------------------------
public class Principal extends javax.swing.JFrame {

    private Palabra clase_palabra;                                          //PARA ENTRENAMIENTO
    private final Marcador marcador_jugadores = new Marcador();             //PARA ENTRENAMIENTO
    private Almacen_de_jugadores almacenjug = new Almacen_de_jugadores();
    public Principal() {
        initComponents();
        //PONER ICONO AQUI -->
       
        TituloPartida.setVisible(false); //
        Inicio_Sesion nombre = new Inicio_Sesion(almacenjug); // CREO UN OBJETO DE TIPO PANEL
        this.MostrarPanel(nombre); //USO EL METODO PARA QUE NADAMAS INCIAR SALTE LA PESTAÑA de inicio sesion
        this.setLocationRelativeTo(null);  //COLOCAR PESTAÑA EN EL CENTRO DE LA PANTALLA
    }
    
   @Override
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));


   return retValue;
}
    
    
    
    
    
    
    public void MostrarPanel(JPanel p) {
        p.setSize(650, 380);
        p.setLocation(0, 0);
        PanelDeCambio.removeAll();
        PanelDeCambio.add(p, BorderLayout.CENTER);
        PanelDeCambio.revalidate();
        PanelDeCambio.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        BarraDeConfig = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VolverPanel = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JLabel();
        PanelBotonEntrenamiento1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        VerPerfil = new javax.swing.JLabel();
        Entrenamiento = new javax.swing.JLabel();
        verRanking = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TituloPartida = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelDeCambio = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraDeConfig.setBackground(new java.awt.Color(0, 0, 0));
        BarraDeConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BarraDeConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BarraDeConfigMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPCIONES ");

        VolverPanel.setBackground(new java.awt.Color(0, 0, 0));
        VolverPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VolverPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverPanelMouseExited(evt);
            }
        });

        BotonVolver.setBackground(new java.awt.Color(0, 0, 0));
        BotonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("Volver Menu");
        BotonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VolverPanelLayout = new javax.swing.GroupLayout(VolverPanel);
        VolverPanel.setLayout(VolverPanelLayout);
        VolverPanelLayout.setHorizontalGroup(
            VolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VolverPanelLayout.setVerticalGroup(
            VolverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBotonEntrenamiento1.setBackground(new java.awt.Color(0, 0, 0));
        PanelBotonEntrenamiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBotonEntrenamiento1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBotonEntrenamiento1MouseExited(evt);
            }
        });

        Login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Iniciar Partida");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonEntrenamiento1Layout = new javax.swing.GroupLayout(PanelBotonEntrenamiento1);
        PanelBotonEntrenamiento1.setLayout(PanelBotonEntrenamiento1Layout);
        PanelBotonEntrenamiento1Layout.setHorizontalGroup(
            PanelBotonEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonEntrenamiento1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonEntrenamiento1Layout.setVerticalGroup(
            PanelBotonEntrenamiento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBotonEntrenamiento1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login)
                .addContainerGap())
        );

        VerPerfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VerPerfil.setForeground(new java.awt.Color(255, 255, 255));
        VerPerfil.setText("Ver Perfil ");
        VerPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerPerfilMouseClicked(evt);
            }
        });

        Entrenamiento.setBackground(new java.awt.Color(0, 0, 0));
        Entrenamiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Entrenamiento.setForeground(new java.awt.Color(255, 255, 255));
        Entrenamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrenamiento.setText("Entrenamiento");
        Entrenamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrenamientoMouseClicked(evt);
            }
        });

        verRanking.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verRanking.setForeground(new java.awt.Color(255, 255, 255));
        verRanking.setText("Ver Ranking");
        verRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verRankingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarraDeConfigLayout = new javax.swing.GroupLayout(BarraDeConfig);
        BarraDeConfig.setLayout(BarraDeConfigLayout);
        BarraDeConfigLayout.setHorizontalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotonEntrenamiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraDeConfigLayout.createSequentialGroup()
                        .addComponent(VolverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraDeConfigLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43))))
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(VerPerfil)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraDeConfigLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BarraDeConfigLayout.setVerticalGroup(
            BarraDeConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraDeConfigLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PanelBotonEntrenamiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(VerPerfil)
                .addGap(45, 45, 45)
                .addComponent(verRanking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(VolverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Background.add(BarraDeConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 440));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        TituloPartida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TituloPartida.setForeground(new java.awt.Color(255, 255, 255));
        TituloPartida.setText("PARTIDA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TituloPartida)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 660, 60));

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LINGO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(759, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        Background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 30));

        PanelDeCambio.setBackground(new java.awt.Color(255, 255, 255));
        PanelDeCambio.setPreferredSize(new java.awt.Dimension(650, 380));

        javax.swing.GroupLayout PanelDeCambioLayout = new javax.swing.GroupLayout(PanelDeCambio);
        PanelDeCambio.setLayout(PanelDeCambioLayout);
        PanelDeCambioLayout.setHorizontalGroup(
            PanelDeCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        PanelDeCambioLayout.setVerticalGroup(
            PanelDeCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        Background.add(PanelDeCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 660, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVolverMouseClicked
        Inicio_Sesion inicio = new Inicio_Sesion(almacenjug); // CREO UN OBEJTO PANEL DE INICIO_SESION
        this.MostrarPanel(inicio); //MUESTRO POR PANTALLA AL PULSAR EL BOTON DEL INICIO SESION
        TituloPartida.setVisible(false);

    }//GEN-LAST:event_BotonVolverMouseClicked

    private void VolverPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseEntered
        VolverPanel.setBackground(Color.GRAY);
    }//GEN-LAST:event_VolverPanelMouseEntered

    private void VolverPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverPanelMouseExited
        VolverPanel.setBackground(Color.BLACK);
    }//GEN-LAST:event_VolverPanelMouseExited

    private void BarraDeConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraDeConfigMouseEntered

    }//GEN-LAST:event_BarraDeConfigMouseEntered

    private void BarraDeConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraDeConfigMouseExited

    }//GEN-LAST:event_BarraDeConfigMouseExited

    private void EntrenamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrenamientoMouseClicked
   Eleccion_num_Entrenamiento num = new Eleccion_num_Entrenamiento(); // CREO UN OBEJTO PANEL DE PARTIDA_CINCO
  this.MostrarPanel(num);
    }//GEN-LAST:event_EntrenamientoMouseClicked
    private void PanelBotonEntrenamiento1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonEntrenamiento1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBotonEntrenamiento1MouseEntered

    private void PanelBotonEntrenamiento1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBotonEntrenamiento1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBotonEntrenamiento1MouseExited

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
       Inicio_Sesion_Jugadores login = new Inicio_Sesion_Jugadores(almacenjug);
        this.MostrarPanel(login);
    }//GEN-LAST:event_LoginMouseClicked

    private void VerPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerPerfilMouseClicked
        EntrarPerfil perfilJugador = new EntrarPerfil();
        this.MostrarPanel(perfilJugador);
    }//GEN-LAST:event_VerPerfilMouseClicked

    private void verRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verRankingMouseClicked
        try {
            Ranking ranking = new Ranking(almacenjug);
            this.MostrarPanel(ranking);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verRankingMouseClicked

    //MAIN DE LA INTERFAZ
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BarraDeConfig;
    private javax.swing.JLabel BotonVolver;
    private javax.swing.JLabel Entrenamiento;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel PanelBotonEntrenamiento1;
    private javax.swing.JPanel PanelDeCambio;
    private javax.swing.JLabel TituloPartida;
    private javax.swing.JLabel VerPerfil;
    private javax.swing.JPanel VolverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel verRanking;
    // End of variables declaration//GEN-END:variables
}
