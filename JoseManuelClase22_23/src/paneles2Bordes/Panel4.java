/**
 * JoseManuelClase22_23 paneles2 panel4.java
 * 4 oct 2022 9:12:16
 * @author Jose Manuel García Travé
 */
package paneles2Bordes;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel4 extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel4() {
		this.setLayout(null);
		labelTitulo = new JLabel("Panel 1");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
}
	
	
