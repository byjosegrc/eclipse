/**
 * JoseManuelClase22_23 paneles1 panel.java
 * 4 oct 2022 8:44:45
 * @author Jose Manuel García Travé
 */
package paneles1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel() {
		this.setLayout(null);
		labelTitulo = new JLabel("Estamos aprendiendo swing");
		labelTitulo.setBounds(160,5,380,40);
	
		this.add(labelTitulo);
	}
	

	
	
}




