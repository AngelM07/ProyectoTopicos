
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Lecciones.ListaDeCursos;


@SuppressWarnings("serial")
public class PantallaPrincipal extends JFrame implements ActionListener {
	JButton guia, lista;
	
	Image ifondo; URL fondo;
	public PantallaPrincipal(){
		
		Init();
	
	}
	

	public void Init() {
		
		Dimension dim = this.getToolkit().getScreenSize();
		this.setSize(dim);
		this.setVisible(true);
		this.add(p);
		fondo = this.getClass().getResource("Imagenes/p1.png");
		ifondo = new ImageIcon(fondo).getImage();
		this.setResizable(false);
		ListaDeCurso();
		Guia();
	}
	
	public JPanel p= new JPanel(){
	public void paintComponent(Graphics g){
		Dimension tam=getSize();
		System.out.println(tam);
		g.drawImage(ifondo, 0, 0,tam.width,tam.height, null);
	}
	};
	
	public void Guia() {
		
		guia = new JButton();
		guia.setBounds(600, 300, 300, 80);
		p.add(guia);
		guia.setIcon(new ImageIcon(getClass().getResource("/Imagenes/cu.png")));
		guia.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
		guia.setBorder(null);//Codigo Para Quitar El Border
		guia.addActionListener(this);
		
	}

	public void ListaDeCurso() {
		
		lista = new JButton();
		lista.setBounds(100, 650, 250, 58);
		p.add(lista);
		lista.setIcon(new ImageIcon(getClass().getResource("/Imagenes/curso.png")));
		lista.setContentAreaFilled(false); //Codigo Para Dejar Los Botones Transparentes
		lista.setBorder(null);//Codigo Para Quitar El Border
		lista.addActionListener(this);
	
		
	}

	public static void main(String [] args){
	
		new PantallaPrincipal();
	}

	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()== guia){
		new Instrucciones();
		//System.out.println("Boton Presionado Guia");
		}
		
		if(e.getSource()== lista){
			try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(ListaDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(ListaDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(ListaDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(ListaDeCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ListaDeCursos().setVisible(true);
	                PantallaPrincipal.this.dispose();
	            }
	        });
			}
	
	}
}
