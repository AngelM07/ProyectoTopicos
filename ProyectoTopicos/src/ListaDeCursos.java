import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ListaDeCursos extends JFrame implements ActionListener, MouseListener{

    JButton button1, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6,jButton7;
    JScrollPane jScrollPane1;  JTextArea jTextArea1;
    Label label1, label2, label3 ,label4;

    public ListaDeCursos() {
        initComponents();
    }
    @SuppressWarnings("deprecation")
	private void initComponents() {

        jButton1 = new JButton("Leccion #1");
        jButton2 = new JButton("Leccion #3");
        jButton3 = new JButton("Leccion #2");
        jButton4 = new JButton("Leccion #6");
        jButton5 = new JButton("Leccion #5");
        jButton6 = new JButton("Leccion #4");
        jButton7 = new JButton("Leccion #7");
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        button1 = new JButton();
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        label1.setText("Descripcion Del Curso");
        label2.setText("Nivel Basico");
        label3.setText("Nivel Intermedio");
        label4.setText("Nivel Avanzado");
        button1.setLabel("button1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton7))
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton4)
                                    .addComponent(jButton6)))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(11, 11, 11)
                                .addComponent(jButton3)
                                .addGap(12, 12, 12)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(11, 11, 11)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(70, 70, 70)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(64, 64, 64)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
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
    	
    	
    	button1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/dial.gif")));
    	button1.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
    	button1.setBorder(null);//Codigo Para Quitar El Border
    	button1.addActionListener(this);
    }
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == jButton1){
			jTextArea1.setText("Leccion #1");
			  }
		if (e.getSource() == jButton2){
			jTextArea1.setText("Leccion #3");
			  }
		if (e.getSource() == jButton3){
			jTextArea1.setText("Leccion #2");
			  }
		if (e.getSource() == jButton4){
			jTextArea1.setText("Leccion #6");
			  }
		if (e.getSource() == jButton5){
			jTextArea1.setText("Leccion #5");
			  }
		if (e.getSource() == jButton6){
			jTextArea1.setText("Leccion #4");
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
			new Leccion1();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton2){
			new Leccion3();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton3){
			new Leccion2();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton4){
			new Leccion6();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton5){
			new Leccion5();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton6){
			new Leccion4();
			ListaDeCursos.this.dispose();
			  }
		if (e.getSource() == jButton7){
			new Leccion7();
			ListaDeCursos.this.dispose();
			  }
		if(e.getSource()==button1){
			new PantallaPrincipal();
			ListaDeCursos.this.dispose();
		}
	}
    
                                                         
}


