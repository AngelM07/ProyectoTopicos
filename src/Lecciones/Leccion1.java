package Lecciones;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

@SuppressWarnings("serial")
public class Leccion1 extends JFrame implements ActionListener {

    public JButton jButton1; public JButton jButton2; public JButton jButton3; public JButton jButton4;
    public JButton jButton5; public JLabel jLabel1;  public JLabel jLabel10;  public JLabel jLabel11;
    public JLabel jLabel12;  public JLabel jLabel13; public JLabel jLabel14;  public JLabel jLabel15;
    public JLabel jLabel16;  public JLabel jLabel17; public JLabel jLabel18;  public JLabel jLabel19;
    public JLabel jLabel2;   public JLabel jLabel20;  public JLabel jLabel21;  public JLabel jLabel22;
    public JLabel jLabel23;  public JLabel jLabel24;  public JLabel jLabel25;  public JLabel jLabel26;
    public JLabel jLabel27;  public JLabel jLabel28;  public JLabel jLabel29;  public JLabel jLabel3;
    public JLabel jLabel30;  public JLabel jLabel31;  public JLabel jLabel32;  public JLabel jLabel33;
    public JLabel jLabel34;  public JLabel jLabel35;  public JLabel jLabel36;  public JLabel jLabel37;
    public JLabel jLabel38;  public JLabel jLabel39;  public JLabel jLabel4;   public JLabel jLabel40;
    public JLabel jLabel41;  public JLabel jLabel42;  public JLabel jLabel43;  public JLabel jLabel44;
    public JLabel jLabel45;  public JLabel jLabel46;  public JLabel jLabel47;  public JLabel jLabel48;
    public JLabel jLabel49;  public JLabel jLabel5;   public JLabel jLabel50;  public JLabel jLabel52;
    public JLabel jLabel53;  public JLabel jLabel54;  public JLabel jLabel55;  public JLabel jLabel56;
    public JLabel jLabel57;  public JLabel jLabel58;  public JLabel jLabel59;  public JLabel jLabel6;
    public JLabel jLabel60;  public JLabel jLabel61;  public JLabel jLabel62;  public JLabel jLabel63;
    public JLabel jLabel64;  public JLabel jLabel65;  public JLabel jLabel66;  public JLabel jLabel67;
    public JLabel jLabel68;  public JLabel jLabel7;   public JLabel jLabel8;   public JLabel jLabel9;
    public JPanel jPanel1;
    

	public Leccion1() {
        initComponents();
    }
    private void initComponents() {

    	jPanel1 = new JPanel();  jLabel2 = new JLabel();  jLabel1 = new JLabel(); jLabel3 = new JLabel(); 
    	jButton1 = new JButton();  jLabel4 = new JLabel(); jLabel5 = new JLabel();  jButton2 = new JButton();
        jLabel6 = new JLabel();  jButton3 = new JButton(); jLabel7 = new JLabel();  jLabel8 = new JLabel();
        jLabel9 = new JLabel();  jLabel10 = new JLabel();  jLabel11 = new JLabel(); jLabel12 = new JLabel();
        jLabel13 = new JLabel(); jLabel14 = new JLabel();  jLabel15 = new JLabel(); jLabel16 = new JLabel();
        jLabel17 = new JLabel(); jLabel18 = new JLabel();  jLabel19 = new JLabel(); jLabel20 = new JLabel();
        jLabel21 = new JLabel(); jLabel22 = new JLabel();  jLabel23 = new JLabel(); jLabel24 = new JLabel();
        jLabel25 = new JLabel(); jLabel26 = new JLabel();  jLabel27 = new JLabel(); jLabel28 = new JLabel();
        jLabel29 = new JLabel(); jLabel30 = new JLabel();  jLabel31 = new JLabel(); jLabel32 = new JLabel();
        jLabel33 = new JLabel(); jLabel34 = new JLabel();  jLabel35 = new JLabel(); jLabel36 = new JLabel();
        jLabel37 = new JLabel(); jLabel38 = new JLabel();  jLabel39 = new JLabel(); jLabel40 = new JLabel();
        jLabel41 = new JLabel(); jLabel42 = new JLabel();  jLabel43 = new JLabel(); jLabel44 = new JLabel();
        jLabel45 = new JLabel(); jLabel46 = new JLabel();  jButton4 = new JButton(); jButton5 = new JButton();
        jLabel47 = new JLabel();  jLabel48 = new JLabel(); jLabel49 = new JLabel();  jLabel50 = new JLabel();
        jLabel52 = new JLabel();  jLabel53 = new JLabel(); jLabel54 = new JLabel();  jLabel55 = new JLabel();
        jLabel56 = new JLabel();  jLabel57 = new JLabel(); jLabel58 = new JLabel();  jLabel59 = new JLabel();
        jLabel60 = new JLabel();  jLabel61 = new JLabel(); jLabel62 = new JLabel();  jLabel63 = new JLabel();
        jLabel64 = new JLabel();  jLabel65 = new JLabel(); jLabel66 = new JLabel();  jLabel67 = new JLabel();
        jLabel68 = new JLabel();
        
        this.setPreferredSize(new Dimension(1370, 778));
        this.setResizable(false);
        
        jPanel1.setPreferredSize(new Dimension(1092, 738));
        jLabel2.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("      EL ALFABETO MAYA");
        jLabel1.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("El alfabeto maya consta de 24 letras y un signo (') denominado glotal.");
        jLabel3.setText("CONSONANTES:");
        jButton1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Consonantes.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jLabel4.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("(La d, f, g, r y la rr, se prestan del español para escribir las palabras que se han introducido al maya).");
        jLabel5.setText("VOCALES:");
        jButton2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Vocales.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jLabel6.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Estas vocales se pronuncian de acuerdo a la forma de colocación de los acentos, dichos acentos los denominamos tonos:");
        jButton3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Vocalespronunciacion.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jLabel7.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Cada consonante se puede combinar con vocales para obtener nombres, palabras monosilábicas  ");
        jLabel8.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Acento Nuetral");
        jLabel9.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Acento Alto");
        jLabel10.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Acento Bajo");
        jLabel11.setText("Nah");
        jLabel12.setText("Casa");
        jLabel13.setText("Sa'");
        jLabel14.setText("Atole");
        jLabel15.setText("Mamá");
        jLabel16.setText("Na'");
        jLabel17.setText("Nariz");
        jLabel18.setText("Ni'");
        jLabel19.setText("Caracol");
        jLabel20.setText("Hub");
        jLabel21.setText("Chi'");
        jLabel22.setText("Boca");
        jLabel23.setText("Caballo");
        jLabel24.setText("Buche");
        jLabel25.setText("Tsíimin");
        jLabel26.setText("Chíin");
        jLabel27.setText("Kéeh");
        jLabel28.setText("Barrer");
        jLabel29.setText("Venado");
        jLabel30.setText("Hamaca");
        jLabel31.setText("Tortuga");
        jLabel32.setText("Áak");
        jLabel33.setText("Ch'íich");
        jLabel34.setText("k'áan");
        jLabel35.setText("Codorniz");
        jLabel36.setText("Béech");
        jLabel37.setText("Chíin");
        jLabel38.setText("Abuela");
        jLabel39.setText("Káax");
        jLabel40.setText("Ch'óom");
        jLabel41.setText("Zopilote");
        jLabel42.setText("Gallina");
        jLabel43.setText("Míis");
        jLabel44.setText("Gato");
        jLabel45.setText("Pequeno");
        jLabel46.setText("Cháan");
        jButton4.setText("Siguiente");
        jButton4.addActionListener(this);
        jButton5.setText("Regresar");
        jButton5.addActionListener(this);
        jLabel47.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel47.setText("o bisilábicas, según sea la colocación del acento,así será el tono de pronunciación que se le dará.");
        jLabel48.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel48.setText("PRONOMBRES PERSONALES");
        jLabel49.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel49.setText("PRONOMBRES DEPENDIENTES");
        jLabel50.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel50.setText("Singular");
        jLabel52.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel52.setText("Plural");
        jLabel53.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel53.setText("Plural");
        jLabel54.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel54.setText("Singular");
        jLabel55.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel55.setText("Téen");
        jLabel56.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel56.setText("To'on");
        jLabel57.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel57.setText("Te'ex");
        jLabel58.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel58.setText("Téech");
        jLabel59.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel59.setText("Letí");
        jLabel60.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel60.setText("Letio'ob");
        jLabel61.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel61.setText("u");
        jLabel62.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel62.setText("u");
        jLabel63.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel63.setText("a");
        jLabel64.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel64.setText("a");
        jLabel65.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel65.setText("k");
        jLabel66.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel66.setText("in");
        jLabel67.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel67.setText("Los Pronombres dependientes no tienen significado por si solos, lo adquiere cuando se anteponen");
        jLabel68.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel68.setText("a los verbos en las conjugaciones del presente habitual y actual");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel7)
                            .addComponent(jButton3)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                            .addComponent(jLabel19))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel11))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, GroupLayout.Alignment.TRAILING)))
                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel17))))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel23)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30))))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel31))
                            .addComponent(jLabel25)
                            .addComponent(jLabel9))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(269, 269, 269)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel56)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel52))
                                    .addComponent(jLabel57))
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel64)
                                            .addComponent(jLabel61))))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel65))
                                            .addComponent(jLabel63, GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62, GroupLayout.Alignment.LEADING)))
                                    .addComponent(jLabel53))
                                .addGap(0, 39, Short.MAX_VALUE)))
                        .addGap(163, 163, 163))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel41))
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel42)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel44))
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel45)))
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 95,GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel38))
                                .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel35))))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(228, 228, 228)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel58)
                                            .addComponent(jLabel55)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel60)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel67))
                                .addGap(76, 76, 76))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jButton3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel34))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel42))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel24))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel23)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel43))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel35))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel55)
                                            .addComponent(jLabel56))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel38))
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel60)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel66))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel63))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel68)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1289, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }
    
    public void actionPerformed(ActionEvent e) {

    	if(e.getSource()== jButton4){
            new Leccion1_5().setVisible(true);
            Leccion1.this.dispose();
           }
    	if(e.getSource()==jButton5){

            new ListaDeCursos().setVisible(true);
				Leccion1.this.dispose();
    	}
	
	}
}

