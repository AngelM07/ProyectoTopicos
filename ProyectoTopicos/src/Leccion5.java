import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Leccion5 extends JFrame implements ActionListener{
	JButton recurso, regresar;
	
	Leccion5(){
		
		Initcomponentes();
	}

	public void Initcomponentes() {
		Dimension dim = this.getToolkit().getScreenSize();
		this.setSize(dim);
		this.setTitle("Leccion 5");
		//pantalla.setUndecorated(true);
		this.setVisible(true);
		this.setResizable(false);
		JPanel panel = new JPanel();
		this.add(panel);
	
		
		recurso = new JButton("Recurso");
		regresar = new JButton("Anterior");
		
		regresar = new JButton("Regresar");
		regresar.setBounds(1250, 650, 100, 60);
		regresar.addActionListener(this);
		
		panel.add(regresar);
	
		recurso = new JButton("Recurso");
		recurso.setBounds(1100, 650, 100, 60);
		recurso.addActionListener(this);
		panel.add(recurso);	
		panel.setLayout(new BorderLayout());
	
	}

	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==regresar){
			ListaDeCursos c = new ListaDeCursos();
			c.setVisible(true);
			c.setSize(1000, 700);
			c.setResizable(false);
			Leccion5.this.dispose();
		}
		if(e.getSource()==recurso){
			new Recurso();
			Leccion5.this.dispose();
		}
	}
	

}