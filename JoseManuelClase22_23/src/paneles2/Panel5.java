/**
 * JoseManuelClase22_23 paneles2 Panel5.java
 * 4 oct 2022 9:17:23
 * @author Jose Manuel García Travé
 */
package paneles2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel5 extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel5() {
		this.setLayout(null);
		labelTitulo = new JLabel("Panel 5");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
	
	

}