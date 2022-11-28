/**
 * JoseManuelClase22_23 metodosEventos PanelMetodo1.java
 * 7 nov 2022 9:04:31
 * @author Jose Manuel García Travé
 */
package metodosEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class PanelMetodo1 extends JPanel {
	private JButton botonAzul, botonAmarillo, botonRojo;
	private ColorFondo fondoAzul;
	
	//Constructor
	public PanelMetodo1() {
		
		//CREO LOS OBJETOS BOTONES:
		botonAzul = new JButton("AZUL");
		botonAmarillo = new JButton("AMARILLO");
		botonRojo = new JButton("ROJO");
		
		
		
		
		//añadir a la lista de escucha del oyente el boton
		
		// AZUL:
		
		fondoAzul = new ColorFondo(Color.BLUE);
		botonAzul.addActionListener(fondoAzul);
		
		// AMARILLO:
		
		botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
		
		// ROJO:
		
		botonRojo.addActionListener(new ColorFondo(Color.RED));
		
		
		//Añado los botones:
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
		
		
	}
	
	
	//Definimos la clase oyente , la definimos como una clase interna
	//para poder utilizar el metodo setBackground
	
	
	private class ColorFondo implements ActionListener{

		private Color colorFondo;
		public ColorFondo(Color c) {
			colorFondo=c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorFondo);
		}
		
	}
	
}
