package Lecciones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


@SuppressWarnings({ "serial" })
public class ListaDeCursos extends JFrame implements ActionListener, MouseListener{
	Image ifondo; URL fondo;
	 JButton jButton1;
     JButton jButton2;
     JButton jButton3;
     JButton jButton4;
     JButton jButton5;
     JButton jButton6;
     JButton jButton7;
     JButton jButton8;
     JLabel jLabel1;
     JLabel jLabel2;
     JLabel jLabel3;
     JScrollPane jScrollPane1;
     JTextArea jTextArea1;
	   
    public ListaDeCursos() {
        initComponents();
        fondo = this.getClass().getResource("/Imagenes/PRe.png");
		ifondo = new ImageIcon(fondo).getImage();
		//this.setResizable(false);
    }
    public JPanel jPanel1= new JPanel(){
    	public void paintComponent(Graphics g){
    		Dimension tam=getSize();
    		//System.out.println(tam);
    		g.drawImage(ifondo, 0, 0,tam.width,tam.height, null);
    	}
    	};
    	

   private void initComponents() {

            //jPanel1 = new javax.swing.JPanel();
            jButton1 = new JButton();
            jButton2 = new JButton();
            jButton3 = new JButton();
            jButton4 = new JButton();
            jButton5 = new JButton();
            jButton6 = new JButton();
            jButton7 = new JButton();
            jButton8 = new JButton();
            jScrollPane1 = new JScrollPane();
            jTextArea1 = new JTextArea();
            jLabel1 = new JLabel();
            jLabel2 = new JLabel();
            jLabel3 = new JLabel();
            
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            jButton1.setFont(new java.awt.Font("Arial", 1, 12));
            jButton2.setFont(new java.awt.Font("Arial", 1, 12));
            jButton3.setFont(new java.awt.Font("Arial", 1, 12));
            jButton4.setFont(new java.awt.Font("Arial", 1, 12));
            jButton5.setFont(new java.awt.Font("Arial", 1, 12));
            jButton6.setFont(new java.awt.Font("Arial", 1, 12));
            jButton7.setFont(new java.awt.Font("Arial", 1, 12));
            jButton1.setText("LECCION 1");
            jButton2.setText("LECCION 2");
            jButton3.setText("LECCION 3");
            jButton4.setText("LECCION 4");
            jButton5.setText("LECCION 5");
            jButton6.setText("LECCION 6");
            jButton7.setText("LECCION 7");
            
            jTextArea1.setEditable(false);
            jTextArea1.setColumns(20);
            jTextArea1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);
            jScrollPane1.setOpaque(false);
            jScrollPane1.getViewport().setOpaque(false);
            jScrollPane1.setBorder(null);
            jScrollPane1.setViewportBorder(null);

            jTextArea1.setBorder(null);
            jTextArea1.setBackground(new Color(0, 0, 0, 0));
            
            jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 51, 51));
            jLabel1.setText("NIVEL PRICIPIANTE");
            jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 51, 51));
            jLabel2.setText("NIVEL INTERMEDIO");
            jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 51, 51));
            jLabel3.setText("NIVEL AVANZADO");
            
            this.setPreferredSize(new Dimension(1370, 778));
            this.setResizable(false);
            

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(379, 379, 379))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton5)
                                .addComponent(jButton4)
                                .addComponent(jButton6)
                                .addComponent(jLabel2))
                            .addGap(167, 167, 167))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jButton7))
                            .addGap(350, 350, 350)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(185, 185, 185))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton7)
                            .addGap(41, 41, 41)))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        
            SeleccionCurso();     
   }
        
    public  void SeleccionCurso() {
    	jButton1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton1.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton1.setBorder(null);//Codigo Para Quitar El Border
    	jButton1.addMouseListener(this);
    	jButton1.addActionListener(this);
    	
    	jButton2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton2.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton2.setBorder(null);//Codigo Para Quitar El Border
    	jButton2.addMouseListener(this);
    	jButton2.addActionListener(this);
    	
    	jButton3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton3.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton3.setBorder(null);//Codigo Para Quitar El Border
    	jButton3.addMouseListener(this);
    	jButton3.addActionListener(this);
    	
    	jButton4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton4.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton4.setBorder(null);//Codigo Para Quitar El Border
    	jButton4.addMouseListener(this);
    	jButton4.addActionListener(this);
    	
    	
    	jButton5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton5.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton5.setBorder(null);//Codigo Para Quitar El Border
    	jButton5.addMouseListener(this);
    	jButton5.addActionListener(this);
    	
    	
    	jButton6.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton6.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton6.setBorder(null);//Codigo Para Quitar El Border
    	jButton6.addMouseListener(this);
    	jButton6.addActionListener(this);
    	
    	
    	jButton7.setIcon(new ImageIcon(getClass().getResource("/Imagenes/lecc.gif")));
    	jButton7.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton7.setBorder(null);//Codigo Para Quitar El Border
    	jButton7.addMouseListener(this);
    	jButton7.addActionListener(this);
    	
    	
    	jButton8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/dial.gif")));
    	jButton8.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	jButton8.setBorder(null);//Codigo Para Quitar El Border
    	jButton8.addActionListener(this);
    }
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == jButton1){
			jTextArea1.setText("Leccion #1");
			  }
		if (e.getSource() == jButton2){
			jTextArea1.setText("Leccion #2");
			  }
		if (e.getSource() == jButton3){
			jTextArea1.setText("Leccion #3");
			  }
		if (e.getSource() == jButton4){
			jTextArea1.setText("Leccion #4");
			  }
		if (e.getSource() == jButton5){
			jTextArea1.setText("Leccion #5");
			  }
		if (e.getSource() == jButton6){
			jTextArea1.setText("Leccion #6");
			  }
		if (e.getSource() == jButton7){
			jTextArea1.setText("Leccion #7");
			  }
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource() == jButton1){
			new Leccion1().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton2){
			new Leccion2().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton3){
			new Leccion3().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton4){
			new Leccion4().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton5){
			new Leccion5().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton6){
			new Leccion4().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton7){
			new Leccion7().setVisible(true);
			ListaDeCursos.this.dispose();
			  }
		if(e.getSource()==jButton8){
			ListaDeCursos.this.dispose();
		}
	}
    
                                                         
}


