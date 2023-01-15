package Interfaz;

import Pack_Config.Almacen_Configuracion;
import Pack_Jugador.Almacen_de_jugadores;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;

/*
 * @author sohaib,Laura,Jose
 */
public class Config_ extends javax.swing.JPanel implements Serializable {

    private int letras1; //numero de letras jugador 1
    private int letras2; //numero de letras jugador 2
    private int letraAuxiliar; //sirve para dar el numero de letras a cada jugador
    private int numPalabras; //numero de palabras por partida
    private String pista; //si hay pista o no
    private ArrayList<String> palabras_partida1; //las palabras que hay de 5 letras
    private ArrayList<String> palabras_partida2; //las palabras que hay de 6 letras 
    private Almacen_Configuracion infoConfig;
    private int contador = 0; //nos servira para limitar el ingreso de palabras en el arraylist
    private Almacen_de_jugadores almacenjug;
//CONSTRUCTOR--------------------
    public Config_(Almacen_de_jugadores almacenjug) {
        initComponents();
        this.setSize(650, 380);   //fijar tamaño default
        this.setLocation(0, 0);        //fijar ubicacion default 
        this.palabras_partida1 = new ArrayList<String>();  //las palabras que hay de 5 letras
        this.palabras_partida2 = new ArrayList<String>(); //las palabras que hay de 6 letras 
        this.contador = 0;  //contador de palabras que se van metiendo

        this.almacenjug = almacenjug;
        //ESCONDEMOS ELEMENTOS DE LA INTERFAZ
        TitJugador2.setVisible(false); //escondemos un titulo de jugador 2
        BotonGu2.setVisible(false);      //escondemos un boton de jugador 2
        IntroPal2.setVisible(false);    //escondemos un boton de jugador 2
        SelectSeis.setVisible(false); //esconder la opcion de 6 para que luego aparezca, ya que en esta parte solo sera de 5

    }

    //METODO PARA MOSTRAR PANEL
    public void MuestraPanel(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(650, 380);
        PanelPartida.removeAll();
        PanelPartida.add(p);
        PanelPartida.revalidate();
        PanelPartida.repaint();
        p.setFocusable(true);
        p.grabFocus();
    }

    //METODO COMPROBAR SELECCIONADO PARA ENVIAR POR PANTALLA 
    public void selectBoton() {
        if (SelectCinco.isSelected()) {
            this.letraAuxiliar = 5;
            System.out.println("-> TIENE " + this.letraAuxiliar + " letras");

        } else if (SelectSeis.isSelected()) {
            this.letraAuxiliar = 6;
            System.out.println("-> TIENE " + this.letraAuxiliar + " letras");

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "FALTAN CAMPOS POR RELLENAR"); //si los datos incorrectos salta pestaña de error
        }
    }

    //METODO GET NUMERO DE PALABRAS
    public int getnumPalabras() { //indica el numero de palabras que se ha seleccionado
        this.numPalabras = Integer.parseInt(NumPalabras.getText());//convertimos el string en int y lo devolvemos 
        return this.numPalabras;
    }

    //METODO PARA VER EL CONTENIDO DE LOS ARRAYSLIST
    public void getPalabrasCompletas(ArrayList<String> partida) {
        for (String palabra : partida) {
            System.out.println(palabra);
        }

    }

    //METODO PARA METER PALABRAS EN LA ARRAYLIST
    public void setPalabras(ArrayList<String> palabras_partida) {

        if (this.contador < this.getnumPalabras()) {        //sirve para solo añadir las palabras necesarias el contador se incrementa cada vez que se apreta el boton
            if (SelectCinco.isSelected()) {                //si se presiona el 5 
                if (this.lasPalabras.getText().length() == 5) {   //si el tamaño de la palabra es 5
                    palabras_partida.add(String.valueOf(lasPalabras.getText()).toUpperCase());  //se guarda la palabra en mayuscula en el arraylist
                } else {
                    --this.contador; //para que no salte un hueco en el arraylist
                    javax.swing.JOptionPane.showMessageDialog(this, "LA PALABRA INTRODUCIDA NO TIENE 5 LETRAS"); //si los datos incorrectos salta pestaña de error
                }
            } else if (SelectSeis.isSelected()) {//sirve para solo añadir las palabras necesarias el contador se incrementa cada vez que se apreta el boton
                if (lasPalabras.getText().length() == 6) {//si se presiona el 6 
                    palabras_partida.add(String.valueOf(lasPalabras.getText()).toUpperCase()); //si el tamaño de la palabra es 6    
                } else {
                    --this.contador; //para que no salte un hueco en el arraylist
                    javax.swing.JOptionPane.showMessageDialog(this, "LA PALABRA INTRODUCIDA NO TIENE 6 LETRAS"); //si los datos incorrectos salta pestaña de error
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "SELECCIONA EL NÚMERO DE LETRAS"); //si los datos incorrectos salta pestaña de error
            }
        }
        ++this.contador; //se incrementa cada vez que ingresamos una palabra

    }
    //METODO PARA AVISAR DE QUE SOLO SE RECOGEN TANTAS PALABRAS COMO NUMEROS INGRESADOS

    public void avisoPalabras() {
        //CONDICION DE VER SI SE HAN METIDO LAS LETRAS SUFICIENTES
        if (palabras_partida1.size() != this.numPalabras) { //compara si el numero de palabras metidas, coincide con el numero de palabra que se ha puesto
            javax.swing.JOptionPane.showMessageDialog(this, "NOTA:  SOLO SE HAN RECOGIDO EL NÚMERO DE PALABRAS INDICADAS "); //si los datos incorrectos salta pestaña de error
        }
        if (palabras_partida2.size() != this.numPalabras) { //compara si el numero de palabras metidas, coincide con el numero de palabra que se ha puesto
            javax.swing.JOptionPane.showMessageDialog(this, "NOTA: SOLO SE HAN RECOGIDO EL NÚMERO DE PALABRAS INDICADAS "); //si los datos incorrectos salta pestaña de error
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoLetras = new javax.swing.ButtonGroup();
        GrupoPistas = new javax.swing.ButtonGroup();
        PanelPartida = new javax.swing.JPanel();
        SelectNo = new javax.swing.JRadioButton();
        DejarPistaTxt = new javax.swing.JLabel();
        NumpalabrasTxt = new javax.swing.JLabel();
        NumPalabras = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        SelectCinco = new javax.swing.JRadioButton();
        SelectSeis = new javax.swing.JRadioButton();
        SelectSi = new javax.swing.JRadioButton();
        BotonGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lasPalabras = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        IntroPal1 = new javax.swing.JButton();
        OpDeJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TitJugador1 = new javax.swing.JLabel();
        TitJugador2 = new javax.swing.JLabel();
        BotonGu2 = new javax.swing.JButton();
        IntroPal2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 380));

        PanelPartida.setBackground(new java.awt.Color(255, 255, 255));
        PanelPartida.setPreferredSize(new java.awt.Dimension(500, 380));

        SelectNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectNo.setText("NO");

        DejarPistaTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DejarPistaTxt.setText("Dejar Pistas");

        NumpalabrasTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NumpalabrasTxt.setText("Numero de Palabras");

        NumPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumPalabrasActionPerformed(evt);
            }
        });
        NumPalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumPalabrasKeyTyped(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Opciones de Partida");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        SelectCinco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCinco.setText("5 Letras");
        SelectCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCincoActionPerformed(evt);
            }
        });

        SelectSeis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectSeis.setText("6 Letras");
        SelectSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSeisActionPerformed(evt);
            }
        });

        SelectSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectSi.setText("SI");

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("  [0 -10]");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Palabras");

        lasPalabras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lasPalabrasMouseClicked(evt);
            }
        });
        lasPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lasPalabrasActionPerformed(evt);
            }
        });
        lasPalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lasPalabrasKeyTyped(evt);
            }
        });

        IntroPal1.setText("Introducir Palabra");
        IntroPal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntroPal1ActionPerformed(evt);
            }
        });

        OpDeJugador.setText("Opcion Jugador");
        OpDeJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpDeJugadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Opciones de Jugador");

        TitJugador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TitJugador1.setText("Palabras de 5 Letras");

        TitJugador2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TitJugador2.setText("Palabras de 6 Letras");

        BotonGu2.setText("Guardar");
        BotonGu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGu2ActionPerformed(evt);
            }
        });

        IntroPal2.setText("Introducir Palabra");
        IntroPal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntroPal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPartidaLayout = new javax.swing.GroupLayout(PanelPartida);
        PanelPartida.setLayout(PanelPartidaLayout);
        PanelPartidaLayout.setHorizontalGroup(
            PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPartidaLayout.createSequentialGroup()
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SelectSi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPartidaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                                        .addComponent(NumpalabrasTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartidaLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NumPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPartidaLayout.createSequentialGroup()
                                        .addComponent(TitJugador1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SelectCinco))
                                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DejarPistaTxt)
                                            .addGroup(PanelPartidaLayout.createSequentialGroup()
                                                .addComponent(TitJugador2)
                                                .addGap(172, 172, 172)
                                                .addComponent(SelectSeis))
                                            .addGroup(PanelPartidaLayout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59)
                                                .addComponent(IntroPal2)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IntroPal1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lasPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelPartidaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(144, 144, 144))
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(PanelPartidaLayout.createSequentialGroup()
                                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OpDeJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(BotonGu2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelPartidaLayout.setVerticalGroup(
            PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPartidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addComponent(SelectCinco)
                        .addGap(7, 7, 7)
                        .addComponent(SelectSeis)
                        .addGap(18, 18, 18))
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addComponent(TitJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TitJugador2)
                        .addGap(28, 28, 28)))
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(NumpalabrasTxt))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectNo)
                    .addComponent(DejarPistaTxt))
                .addGap(18, 18, 18)
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lasPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(IntroPal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IntroPal1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelPartidaLayout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OpDeJugador)
                            .addComponent(BotonGu2)
                            .addComponent(BotonGuardar))))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectCincoActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
//GRUPO DE BOTONES SOBRE NUM LETRAS
        GrupoLetras.add(SelectCinco);
        GrupoLetras.add(SelectSeis);

//GRUPO DE BOTONES SOBRE DAR LAS PISTAS
        GrupoPistas.add(SelectSi);
        GrupoPistas.add(SelectNo);

        //---------------------------------VALORES EN ORDEN PARA METER EN FICHERO---------------------------------------------------       
//--> CONDICION PARA SELECCIONAR UNO U OTRO (LETRAS)
        //1º PARTE DEL FICHERO----------------------------------- 
        this.selectBoton();//para poner el numero de letras en el auxiliar
        this.letras1 = this.letraAuxiliar;

        //2º PARTE DEL FICHERO----------------------------------- 
        //-IMPRIMIR Y GUARDAR NUMERO DE PALABRAS
        if (this.numPalabras <= 10) {
            System.out.println("-> Habra: " + this.numPalabras + " palabras"); //mientras este en el rango se podra hacer normal
        } else {
            this.numPalabras = 10; //si se pasa del rango de palabras maximas hacemos que use el maximo de palabras permitidas
            System.out.println("-> Habra: " + this.numPalabras + " palabras");
        }

        //3º PARTE DEL FICHERO----------------------------------- 
        //CONDICION PARA SELECCIONAR UNO U OTRO (PISTAS)
        if (SelectSi.isSelected()) {  //si la opcion de Si es seleccionada
            System.out.println("-> SE CONCEDE LA PISTA");
            this.pista = "SI";
        } else if (SelectNo.isSelected()) { //si la opcion de No es seleccionada
            System.out.println("-> NO SE CONCEDE LA PISTA");
            this.pista = "NO";
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "FALTAN CAMPOS POR RELLENAR"); //si los datos incorrectos salta pestaña de error
        }
        this.getPalabrasCompletas(this.palabras_partida1); //vemos todas las palabras que hay del jugador 1
        this.avisoPalabras();  //es el aviso de que solo se recogen tantas palabras como numeros se hayan ingresado

        //VAMOS A ESCONDER ALGUNAS OPCIONES PARA EL JUGDAOR 2 (SOLO NECESITAMOS LAS PALABRAS QUE SE VAN A METER Y EL NUMERO DE LETRAS)
        this.contador = 0;                 //reiniciamos contador para el jugador 2 y meta desde el inicio del arraylist
        this.TitJugador1.setVisible(false);  //se esconde titulo jugador 1
        this.TitJugador2.setVisible(true);  //Se muestra titulo jugador 2
        this.SelectSi.setVisible(false);    //se esconde seleccionar Si
        this.SelectNo.setVisible(false);    //se esconde seleccionar No
        this.NumPalabras.setVisible(false);  //se esconde el texto de numero de palabras
        this.jLabel6.setVisible(false);     //se esconde un titulo
        this.jSeparator3.setVisible(false); //se esconde el separador
        this.BotonGuardar.setVisible(false); //se esconde el boton de guardar1
        this.BotonGu2.setVisible(true);     //se muestra el boton guardar 2
        this.IntroPal1.setVisible(false);     //se esconde boton para meter palabras jugador 1
        this.IntroPal2.setVisible(true);   //se muestra el boton para escribir en el jugador 2
        this.GrupoLetras.clearSelection();     //borramos la seleccion para permitir nueva seleccion
        this.SelectSeis.setVisible(true); //mostrar la opcion de 6 para que luego aparezca, ya que en esta parte solo sera de 5
        this.SelectCinco.setVisible(false); //esconder la opcion de 5 para que luego no aparezca, ya que en esta parte solo sera de 6
       NumpalabrasTxt.setVisible(false); //se esconde porque no es relevante
       DejarPistaTxt.setVisible(false); //se esconde porque no es relevante
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void NumPalabrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumPalabrasKeyTyped
        int teclado = evt.getKeyChar(); //detecta presionado del teclado

        boolean numeros = teclado >= 48 && teclado <= 57; //marcar limites de caracter numerico en tabla ASCII

        //CONDICION PARA SOLO ADMITIR CARACTERES NUMERICOS (el valor se guarda en el boton de guardar)
        if (!numeros) {
            evt.consume(); //ACCIONA LA FUNCION

        }

//CONDICION PARA SOLO ADMITIR 0 A 2 DIGITOS 
        if (NumPalabras.getText().length() >= 2) {
            evt.consume();//ACCIONA LA FUNCION
        }


    }//GEN-LAST:event_NumPalabrasKeyTyped

    private void NumPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumPalabrasActionPerformed

    private void lasPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lasPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lasPalabrasActionPerformed

    private void OpDeJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpDeJugadorActionPerformed
        Config_Jugador opJugador = new Config_Jugador(almacenjug);
        this.MuestraPanel(opJugador);
    }//GEN-LAST:event_OpDeJugadorActionPerformed

    private void IntroPal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntroPal1ActionPerformed

        this.setPalabras(this.palabras_partida1);

    }//GEN-LAST:event_IntroPal1ActionPerformed

    private void BotonGu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGu2ActionPerformed
        //4º parte del fichero
        this.selectBoton(); //para poner el numero de letras en el auxiliar
        this.letras2 = letraAuxiliar; //para ver cuantas letras tendra las palabras del 2º jugador
        //5º parte del fichero
        this.getPalabrasCompletas(this.palabras_partida2); //para ver las palabras del 2º jugador
        this.avisoPalabras(); //es el aviso de que solo se recogen tantas palabras como numeros se hayan ingresado

        //VAMOS A METER TODOS LOS DATOS GENERADOS EN EL FICHERO
        infoConfig = new Almacen_Configuracion(this.letras1, this.numPalabras, this.pista, this.palabras_partida1, this.letras2, this.palabras_partida2);
        //---------------------------------------------------------------CREACION DEL FICHERO----------------------------------------------------//
        try {
            ObjectOutputStream configFichero = new ObjectOutputStream(new FileOutputStream("Fichero_Configuracion.txt"));
            configFichero.writeObject(infoConfig);
            configFichero.close();
        } catch (IOException e) {
        }

        //---------------------------------------------------------------CREACION DEL FICHERO----------------------------------------------------// 
    }//GEN-LAST:event_BotonGu2ActionPerformed

    private void lasPalabrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lasPalabrasMouseClicked
        this.getnumPalabras();
    }//GEN-LAST:event_lasPalabrasMouseClicked

    private void lasPalabrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lasPalabrasKeyTyped
        //para limitar que solo se use caracteres alfabeticos 
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
        //para limitar que solo se use caracteres alfabeticos  
    }//GEN-LAST:event_lasPalabrasKeyTyped

    private void IntroPal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntroPal2ActionPerformed
        this.setPalabras(this.palabras_partida2);//metemos las palabras del partida 2
    }//GEN-LAST:event_IntroPal2ActionPerformed

    private void SelectSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSeisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectSeisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGu2;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel DejarPistaTxt;
    private javax.swing.ButtonGroup GrupoLetras;
    private javax.swing.ButtonGroup GrupoPistas;
    private javax.swing.JButton IntroPal1;
    private javax.swing.JButton IntroPal2;
    private javax.swing.JTextField NumPalabras;
    private javax.swing.JLabel NumpalabrasTxt;
    private javax.swing.JButton OpDeJugador;
    private javax.swing.JPanel PanelPartida;
    private javax.swing.JRadioButton SelectCinco;
    private javax.swing.JRadioButton SelectNo;
    private javax.swing.JRadioButton SelectSeis;
    private javax.swing.JRadioButton SelectSi;
    private javax.swing.JLabel TitJugador1;
    private javax.swing.JLabel TitJugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lasPalabras;
    // End of variables declaration//GEN-END:variables
}
