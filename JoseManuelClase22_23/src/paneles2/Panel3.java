/**
 * JoseManuelClase22_23 paneles2 Panel3.java
 * 4 oct 2022 9:16:42
 * @author Jose Manuel García Travé
 */
package paneles2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel3 extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel3() {
		this.setLayout(null);
		labelTitulo = new JLabel("Panel 3");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
	
	

}