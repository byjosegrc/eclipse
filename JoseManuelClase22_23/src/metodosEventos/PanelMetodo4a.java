/**
 * JoseManuelClase22_23 metodosEventos PanelMetodo4a.java
 * 8 nov 2022 8:51:19
 * @author Jose Manuel García Travé
 */
package metodosEventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class PanelMetodo4a extends JPanel implements ActionListener{
	
	private JButton botonAzul, botonAmarillo, botonRojo;
	
	//Constructor
	public PanelMetodo4a() {
		
		//CREO LOS OBJETOS BOTONES:
		botonAzul = new JButton("AZUL");
		botonAmarillo = new JButton("AMARILLO");
		botonRojo = new JButton("ROJO");
		

		
		
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
		
		
		
		botonAzul.setMnemonic(KeyEvent.VK_A);	
		
		botonAzul.setToolTipText("Hola, soy el boton Azul");
		
		botonAzul.addActionListener(e -> Accion1(e));
		
		
		
		botonAmarillo.setMnemonic(KeyEvent.VK_M);	
		
		botonAmarillo.setToolTipText("Hola, soy el boton Amarillo");
		
		botonAmarillo.addActionListener(e -> Accion1(e));
		
		
		botonRojo.setMnemonic(KeyEvent.VK_R);	
		
		botonRojo.setToolTipText("Hola, soy el boton Rojo");
		
		
		botonRojo.addActionListener(e -> {Accion1(e);
						botonAzul.setEnabled(false);});
		
		
		
		
		
		//Añado los botones:
		
		this.add(botonAzul);
		this.add(botonAmarillo);
		this.add(botonRojo);
		
	}
	
	public void Accion1(ActionEvent e) {
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