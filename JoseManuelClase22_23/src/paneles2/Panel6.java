/**
 * JoseManuelClase22_23 paneles2 Panell6.java
 * 4 oct 2022 9:17:43
 * @author Jose Manuel García Travé
 */
package paneles2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel6 extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel6() {
		this.setLayout(null);
		labelTitulo = new JLabel("Panel 6");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
	
	

}
