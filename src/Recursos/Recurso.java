package Recursos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Lecciones.ListaDeCursos;


@SuppressWarnings("serial")
public class Recurso extends JFrame implements ActionListener {
	JButton recurso, regresar;
	
	public Recurso(){
		Init();
		
	}
	public void Init(){
		Dimension dim = this.getToolkit().getScreenSize();
		this.setSize(dim);
		this.setTitle("Recursos");
		//pantalla.setUndecorated(true);
		this.setVisible(true);
		this.setResizable(false);
		JPanel panel = new JPanel();
		this.add(panel);
	
		regresar = new JButton("Regresar");
		regresar.setBounds(1250, 650, 100, 60);
		regresar.addActionListener(this);
		
		panel.add(regresar);
		panel.setLayout(new BorderLayout());
		
		Reproducir();
	}
	public void Reproducir() {
		//if
		new Multimedia();
		//else
		new Complementario();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()== regresar){
			ListaDeCursos c = new ListaDeCursos();
			c.setVisible(true);
			c.setSize(1000, 700);
			c.setResizable(false);
			Recurso.this.dispose();
		
		}
	}


}
