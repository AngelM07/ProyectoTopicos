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
import javax.swing.WindowConstants;

import Recursos.Recurso;

@SuppressWarnings("serial")
public class Leccion1_5 extends JFrame implements ActionListener{
	
	public JButton jButton1; public JButton jButton2; public JButton jButton3; public JButton jButton4;
    public JLabel jLabel1;   public JLabel jLabel10;  public JLabel jLabel11;  public JLabel jLabel12;
    public JLabel jLabel13;  public JLabel jLabel14;  public JLabel jLabel15;  public JLabel jLabel16;
    public JLabel jLabel17;  public JLabel jLabel18;  public JLabel jLabel19;  public JLabel jLabel2;
    public JLabel jLabel20;  public JLabel jLabel21;  public JLabel jLabel22;  public JLabel jLabel23;
    public JLabel jLabel24;  public JLabel jLabel25;  public JLabel jLabel26;  public JLabel jLabel27;
    public JLabel jLabel28;  public JLabel jLabel29;  public JLabel jLabel3;   public JLabel jLabel30;
    public JLabel jLabel31;  public JLabel jLabel32;  public JLabel jLabel33;  public JLabel jLabel34;
    public JLabel jLabel35;  public JLabel jLabel36;  public JLabel jLabel37;  public JLabel jLabel38;
    public JLabel jLabel39;  public JLabel jLabel4;   public JLabel jLabel40;  public JLabel jLabel41;
    public JLabel jLabel42;  public JLabel jLabel43;  public JLabel jLabel44;  public JLabel jLabel45;
    public JLabel jLabel46;  public JLabel jLabel47;  public JLabel jLabel48;  public JLabel jLabel49;
    public JLabel jLabel5;   public JLabel jLabel50;  public JLabel jLabel51;  public JLabel jLabel52;
    public JLabel jLabel53;  public JLabel jLabel6;   public JLabel jLabel7;   public JLabel jLabel8;
    public JLabel jLabel9;   public JPanel jPanel1;
    
	public Leccion1_5(){
		initComponents();
	}
	public void initComponents() {

        jPanel1 = new JPanel(); jLabel1 = new JLabel();  jLabel2 = new JLabel(); jLabel3 = new JLabel();
        jLabel4 = new JLabel(); jLabel5 = new JLabel();  jLabel6 = new JLabel(); jLabel7 = new JLabel();
        jLabel8 = new JLabel(); jLabel9 = new JLabel();  jButton1 = new JButton(); jLabel10 = new JLabel();
        jLabel11 = new JLabel();  jLabel12 = new JLabel(); jLabel13 = new JLabel();  jLabel14 = new JLabel();
        jLabel15 = new JLabel();  jLabel16 = new JLabel();  jLabel17 = new JLabel();
        jLabel18 = new JLabel();  jLabel19 = new JLabel();  jLabel20 = new JLabel();  jLabel21 = new JLabel();
        jLabel22 = new JLabel();  jLabel23 = new JLabel();  jLabel24 = new JLabel();  jLabel25 = new JLabel();
        jLabel26 = new JLabel();  jLabel27 = new JLabel();  jLabel28 = new JLabel();  jLabel29 = new JLabel();
        jLabel30 = new JLabel();  jLabel31 = new JLabel();  jLabel32 = new JLabel();  jLabel33 = new JLabel();
        jLabel34 = new JLabel();  jLabel35 = new JLabel();  jLabel36 = new JLabel();  jLabel37 = new JLabel();
        jLabel38 = new JLabel();  jLabel39 = new JLabel();  jLabel40 = new JLabel();  jLabel41 = new JLabel();
        jLabel42 = new JLabel();  jLabel43 = new JLabel();  jLabel44 = new JLabel();  jLabel45 = new JLabel();
        jLabel46 = new JLabel();  jLabel47 = new JLabel();  jLabel48 = new JLabel();  jLabel49 = new JLabel();
        jButton2 = new JButton(); jButton3 = new JButton(); jButton4 = new JButton(); jLabel50 = new JLabel();
        jLabel51 = new JLabel();  jLabel52 = new JLabel();  jLabel53 = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1370, 778));
        this.setResizable(false);

        jLabel1.setFont(new Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("CONJUGACIONES EN MAYA");

        jLabel2.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("PRESENTE INDICATIVO");

        jLabel3.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("El presente de indicativo se divide en actual y habitual.");

        jLabel4.setText("PRESENTE ACTUAL");

        jLabel5.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("El presente actual indica que la acción del verbo se ejecuta en el momento mismo de ");

        jLabel6.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("expresar la oración. Para conjugar los verbos en el presente actual primero se dicen los ");

        jLabel7.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("pronombres personales, tèen, tèech, leti', to'on, te'ex, letio'ob, y se añade la particula táan,");

        jLabel8.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("los pronombres dependientes in, a, u, k, a, u, respectivamente y el verbo.");

        jLabel9.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("MODELO DE CONJUGACION");

        jButton1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MDC.png"))); // NOI18N

        jLabel10.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("La partícula táan se puede contraer y se convierte en tin. Por ejemplo, se elimina parte del pronombre");

        jLabel11.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Tene' táan in wa'alik");

        jLabel12.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Teche' táan a wa'alik");

        jLabel13.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Letie' táan u ya'alik");

        jLabel14.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Te'exe' táan a wa'alike'ex");

        jLabel15.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("To'one' k a'alik");

        jLabel16.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Todos los verbos que comienzan con");

        jLabel17.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("vocal en la conjugación llevan los siguientes");

        jLabel18.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Ejemplo:");

        jLabel19.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Letio'obe' táan u ya'aliko'ob");

        jLabel20.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("se elimina parte del pronombre personal, la partícula táan y queda la primera t y el in:");

        jLabel21.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("tene' táan in míis");

        jLabel22.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("tin míis");

        jLabel23.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("ta míis");

        jLabel24.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("tu míis");

        jLabel25.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel25.setText("t míis");

        jLabel26.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("ta míise'ex");

        jLabel27.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("Las formas con la partícula táan, indican una acción progresando constantemente, es una acción necesariamente ");

        jLabel28.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("de más de una duración momentánea yendo en el tiempo presente\" ");

        jLabel29.setText("PRESENTE HABITUAL");

        jLabel30.setText("El presente habitual no indica cuándo se ejecuta la acción del verbo, sino únicamente expresa una acción habitual.");

        jLabel31.setText("El presente habitual se diferencia por la partícula k que antecede los pronombres dependiente en sustitución de la");

        jLabel32.setText("t, de tin que se usa en el presente actual. Ejemplos:");

        jLabel33.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Kin míis");

        jLabel34.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Ka míis");

        jLabel35.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Ku míis");

        jLabel36.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("K míis");

        jLabel37.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Ku míis'ob");

        jLabel38.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel38.setText("Ka míise'ex");

        jLabel39.setText(" Las formas que comienzan con la partícula k, indican, en contraste una acción habitual o general y no es que ");

        jLabel40.setText("necesariamente proceda en ese mismos momento. Se le llama también presente habitual o verbos incompletos.");

        jLabel41.setText("Los pronombres dependientes se convierten en adjetivos posesivos cuando se anteponen a los sustantivos.");

        jLabel42.setText("Todos los sustantivos que comienzan con vocal, llevan los prefijos w-y Ejemplos");

        jLabel43.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel43.setText("u yotocho'ob");

        jLabel44.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel44.setText("a wotoche'ex");

        jLabel45.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel45.setText("K otoch");

        jLabel46.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel46.setText("u yotoch");

        jLabel47.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel47.setText("a wotoch");

        jLabel48.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel48.setText("In wotoch");

        jLabel49.setText("Como pluralizan los sustantivos. Los sustantivos se pluralizan con el sufijo o'ob que se añade de los nombres.");

        jButton2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PREHABI.png"))); // NOI18N

        jButton3.setText("Recurso");
        jButton3.addActionListener(this);
        jButton4.setText("Regresar");
        jButton4.addActionListener(this);

        jLabel50.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel50.setText("Cuando se indica el número de animales, personas u cosas");

        jLabel51.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel51.setText("no es necesario usar el sufijo o'ob. Por Ejemplo");

        jLabel52.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel52.setText("tin manik ka'atúul kàax");

        jLabel53.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel53.setText("tin manik kantúul hmìis.");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(494, 494, 494))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel19)))))
                    .addComponent(jLabel10)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel47)
                                                .addComponent(jLabel48))
                                            .addGap(38, 38, 38)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel44)
                                                .addComponent(jLabel45)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel46)
                                            .addGap(38, 38, 38)
                                            .addComponent(jLabel43)))
                                    .addGap(274, 274, 274))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(150, 150, 150)
                                            .addComponent(jButton4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel51)
                                                .addComponent(jLabel50)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel53)
                                                        .addComponent(jLabel52))))))
                                    .addGap(33, 33, 33)))
                            .addComponent(jLabel32)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel49)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel31)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel17)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel37)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel39, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel43))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel51)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel52)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel53)
                                .addGap(156, 156, 156)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3))
                                .addGap(13, 13, 13)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource()==jButton3);{
    		new Recurso();
			Leccion1_5.this.dispose();
    	}
        if(e.getSource()==jButton4){
        	new Leccion1().setVisible(true);
        }
	
	}
}
 
