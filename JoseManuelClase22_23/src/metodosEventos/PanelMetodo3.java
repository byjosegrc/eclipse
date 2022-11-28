/**
 * JoseManuelClase22_23 metodosEventos PanelMetodo3.java
 * 8 nov 2022 8:26:47
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
public class PanelMetodo3 extends JPanel{
	
	private JButton botonAzul, botonAmarillo, botonRojo;
	
	//Constructor
	public PanelMetodo3() {
		
		//CREO LOS OBJETOS BOTONES:
		botonAzul = new JButton("AZUL");
		botonAmarillo = new JButton("AMARILLO");
		botonRojo = new JButton("ROJO");
		
		
	
		
		//Añado los botones:
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
		
		
		botonAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
				
			}
			
			
		});
		botonAmarillo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.YELLOW);
				
			}
			
			
		});
		botonRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
				
			}
			
			
		});
		
		
	}

	
}
