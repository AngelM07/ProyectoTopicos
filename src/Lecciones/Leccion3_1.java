package Lecciones;

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
public class Leccion3_1 extends JFrame implements ActionListener{
	 public JButton jButton1;
	    public JButton jButton2;
	    public JButton jButton3;
	    public JButton jButton4;
	    public JButton jButton5;
	    public JButton jButton6;
	    public JLabel jLabel1;
	    public JLabel jLabel2;
	    public JLabel jLabel3;
	    public JLabel jLabel4;
	    public JLabel jLabel5;
	    public JLabel jLabel6;
	    public JLabel jLabel7;
	    public JLabel jLabel8;
	    public JLabel jLabel9;
	    public JPanel jPanel1;
	
	public Leccion3_1() {
        initComponents();
    }
    public void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jButton4 = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jButton5 = new JButton();
        jButton6 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Continuacion de los verbos");

        jButton1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Verbos2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        jLabel2.setText("Lectura");

        jButton2.setText("Pause");
        jButton2.addActionListener(this);
        jButton3.setText("Detener");
        jButton3.addActionListener(this);
        jButton4.setText("Reproducir");
        jButton4.addActionListener(this);
        jLabel3.setText("Tu k'ìin in bin k'íiwik hmàane', kin láah manik tuláakal ba'alo'ob, k'abéet ten ti' hunp'éel p'is k'ìin.");

        jLabel4.setText("Kin manik hunchúuch lòol, k'úum, p'àak, òon, ìis, bu'ul, su'uts' pak'áal, bak', bàak yéetel pùut.");

        jLabel5.setText("Beyo' mina'an in hóok'ol sáansamal hmàan, ma'alob in ki' chitàal, tin k'àan le ken ts'o'okok in meyah");

        jLabel6.setText("Vocabulario");
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Vocabulario.png"))); // NOI18N

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Vocabulario1.png"))); // NOI18N

        jLabel9.setText("Continuacion");

        jButton5.setText("Regresar");
        jButton5.addActionListener(this);
        jButton6.setText("Recurso");
        jButton6.addActionListener(this);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5)
                                .addComponent(jButton6)))
                        .addComponent(jLabel7)))
                .addContainerGap(16, Short.MAX_VALUE))
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
    
public void actionPerformed(ActionEvent e) {
		
	if (e.getSource()==jButton2){
		//PAUSE
	}
	if (e.getSource()==jButton3){
		//DETENER
	}
	if (e.getSource()==jButton4){
		//REPRODUCIR
	}
	if (e.getSource()==jButton5){
		new Leccion3().setVisible(true);
		Leccion3_1.this.dispose();
	}
	if (e.getSource()==jButton6){

		new Recurso().setVisible(true);
		Leccion3_1.this.dispose();
		
	}
	}
    
}
