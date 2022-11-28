/**
 * JoseManuelClase22_23 paneles2 Panel4.java
 * 4 oct 2022 9:17:02
 * @author Jose Manuel García Travé
 */
package paneles2;

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
		labelTitulo = new JLabel("Panel 4");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
	
	

}