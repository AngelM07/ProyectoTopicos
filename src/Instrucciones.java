import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Instrucciones extends JFrame implements ActionListener{
	JButton regresar;
	
	Instrucciones(){
		//Caractericas De La Ventana
				Dimension dim = this.getToolkit().getScreenSize();
				this.setSize(dim);
				//pantalla.setUndecorated(true);
				this.setVisible(true);
				this.setResizable(false);
				
		//JButton
				JPanel panel = new JPanel();
				this.add(panel);
				
				regresar = new JButton("Regresar");
				regresar.setBounds(1200, 630, 90, 50);
				regresar.addActionListener(this);
				panel.add(regresar);
				panel.setLayout(new BorderLayout());
				
				//BOTONES
					}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== regresar){
			new PantallaPrincipal();
			Instrucciones.this.dispose();
		
		}

	
	}

}
