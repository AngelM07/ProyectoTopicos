package Lecciones;

import java.awt.Color;
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



@SuppressWarnings("serial")
public class Leccion3 extends JFrame implements ActionListener{

    public Leccion3() {
        initComponents();
    }
    public void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jButton3 = new JButton();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jButton4 = new JButton();
        jButton5 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1370, 778));
        this.setResizable(false);
        jLabel1.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("LECCION 3: Pronombre Personales tópico é ");

        jButton1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PRo.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        
        jButton2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/PRo1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        
        jLabel2.setText("Ejemplos");
        jLabel2.setFont(new Font("Arial", 0, 12));
        jLabel3.setText("Tene', wèenen ma' tin wu 'uyah le k'àayo'");
        jLabel3.setFont(new Font("Arial", 0, 12));
        jLabel4.setText("Teche' hàanech yiknal a kìik");
        jLabel4.setFont(new Font("Arial", 0, 12));
        jLabel5.setText("X Ròosa'e', lúub tu k'àan");
        jLabel5.setFont(new Font("Arial", 0, 12));
        jLabel6.setText("Letio'obe', tu bino'ob yiknal ts'akyah.");
        jLabel6.setFont(new Font("Arial", 0, 12));
        jLabel7.setText("Te'exe' ts'o'ok a hanale'ex");
        jLabel7.setFont(new Font("Arial", 0, 12));
        jLabel8.setText("H Juàane', bin cha'an");
        jLabel8.setFont(new Font("Arial", 0, 12));
        jLabel9.setText("VERBOS TRANSITIVOS E INTRANSITIVOS");
        jLabel9.setFont(new Font("Arial", 0, 12));
        jLabel10.setText("VERBOS TRANSITIVOS");
        jLabel10.setFont(new Font("Arial", 0, 12));
        jLabel11.setText("EJemplos de verbo transitivos con objeto expresado");
        jLabel11.setFont(new Font("Arial", 0, 12));
        jLabel12.setFont(new Font("Arial", 0, 12));
        jLabel12.setForeground(new Color(255, 0, 51));
        jLabel12.setText("Táan in hàantik bak'");
        jLabel13.setForeground(new Color(255, 0, 51));
        jLabel13.setText("Táan in p'o'ik in nòok'");
        jLabel13.setFont(new Font("Arial", 0, 12));
        jLabel14.setForeground(new Color(251, 0, 51));
        jLabel14.setText("Táan a wèensik a wíits'in");
        jLabel14.setFont(new Font("Arial", 0, 12));
        jLabel15.setText("VERBOS INTRANSITIVOS");
        jLabel15.setFont(new Font("Arial", 0, 12));
        jLabel16.setText("Los verbos intransitivos no presuponen un objeto Ejemplos:");
        jLabel16.setFont(new Font("Arial", 0, 12));
        jLabel17.setForeground(new Color(255, 0, 51));
        jLabel17.setText("Táan in hanal");
        jLabel17.setFont(new Font("Arial", 0, 12));
        jLabel18.setForeground(new Color(255, 0, 51));
        jLabel18.setText("Táan in wenel");
        jLabel18.setFont(new Font("Arial", 0, 12));
        jLabel19.setForeground(new Color(251, 0, 51));
        jLabel19.setText("Táan in ts'íib");
        jLabel19.setFont(new Font("Arial", 0, 12));
        jLabel20.setForeground(new Color(255, 0, 51));
        jLabel20.setText("Yaan in bin");
        jLabel20.setFont(new Font("Arial", 0, 12));
        jLabel21.setForeground(new Color(255, 0, 51));
        jLabel21.setText("Ko'ox uk'ul");
        jLabel21.setFont(new Font("Arial", 0, 12));
        jLabel22.setForeground(new Color(251, 0, 51));
        jLabel22.setText("Táan k kòol");
        jLabel22.setFont(new Font("Arial", 0, 12));
        jLabel23.setText("Continuacion....");
        jLabel23.setFont(new Font("Arial", 0, 12));
        jLabel24.setText("Los verbos intransitivos se forman con el sufijo ik  que se le añade a la raíz del verbo");
        jLabel24.setFont(new Font("Arial", 0, 12));
        jButton3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Verbos.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jLabel25.setText("Intransitivos");
        jLabel25.setFont(new Font("Arial", 0, 12));
        
        jLabel26.setText("Transitivos");
        jLabel26.setFont(new Font("Arial", 0, 12));
        
        jLabel27.setText("Voz Pasiva");
        jLabel27.setFont(new Font("Arial", 0, 12));
        jButton4.setText("Regresar");
        jButton4.addActionListener(this);
        jButton5.setText("Siguiente");
        jButton5.addActionListener(this);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2))
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel24)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel25)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel26)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel23)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    public JButton jButton1;
    public JButton jButton2;
    public JButton jButton3;
    public JButton jButton4;
    public JButton jButton5;
    public JLabel jLabel1;
    public JLabel jLabel10;
    public JLabel jLabel11;
    public JLabel jLabel12;
    public JLabel jLabel13;
    public JLabel jLabel14;
    public JLabel jLabel15;
    public JLabel jLabel16;
    public JLabel jLabel17;
    public JLabel jLabel18;
    public JLabel jLabel19;
    public JLabel jLabel2;
    public JLabel jLabel20;
    public JLabel jLabel21;
    public JLabel jLabel22;
    public JLabel jLabel23;
    public JLabel jLabel24;
    public JLabel jLabel25;
    public JLabel jLabel26;
    public JLabel jLabel27;
    public JLabel jLabel3;
    public JLabel jLabel4;
    public JLabel jLabel5;
    public JLabel jLabel6;
    public JLabel jLabel7;
    public JLabel jLabel8;
    public JLabel jLabel9;
    public JPanel jPanel1;
   

    public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==jButton4){
			new ListaDeCursos().setVisible(true);
			Leccion3.this.dispose();
		}
		if(e.getSource()==jButton5 ){
			new Leccion3_1().setVisible(true);
			Leccion3.this.dispose();
		}
	}
	

}