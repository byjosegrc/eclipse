/**
 * JoseManuelClase22_23 metodosEventos PanelMetodo2.java
 * 7 nov 2022 9:29:14
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
public class PanelMetodo2 extends JPanel implements ActionListener{
	
	private JButton botonAzul, botonAmarillo, botonRojo;
	
	//Constructor
	public PanelMetodo2() {
		
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
