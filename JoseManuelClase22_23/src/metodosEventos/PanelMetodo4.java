/**
 * JoseManuelClase22_23 metodosEventos PanelMetodo4.java
 * 8 nov 2022 8:42:14
 * @author Jose Manuel García Travé
 */
package metodosEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class PanelMetodo4 extends JPanel implements ActionListener{
	
	private JButton botonAzul, botonAmarillo, botonRojo;
	
	//Constructor
	public PanelMetodo4() {
		
		//CREO LOS OBJETOS BOTONES:
		botonAzul = new JButton("AZUL");
		botonAmarillo = new JButton("AMARILLO");
		botonRojo = new JButton("ROJO");
		
		//Añado los botones:
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
		
		
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
		botonAzul.addActionListener(e -> Accion1());
		
		botonAmarillo.addActionListener(e -> setBackground(Color.YELLOW));
		
		botonRojo.addActionListener(e -> {setBackground(Color.RED);
										botonAzul.setEnabled(false);});
		
		
		
	}
	
	public void Accion1() {
		setBackground(Color.BLUE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado=e.getSource();
		if(botonPulsado==botonAzul) {
			setBackground(Color.BLUE);
		}
		if(botonPulsado==botonAmarillo) {
			setBackground(Color.YELLOW);
			
		}
		if(botonPulsado==botonRojo) {
			setBackground(Color.RED);
			
		}
		
	}
	
	
}
