/**
 * JoseManuelClase22_23 paneles2 Panel2.java
 * 4 oct 2022 9:15:18
 * @author Jose Manuel García Travé
 */
package paneles2;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
public class Panel2 extends JPanel {
	private JLabel labelTitulo;
	//Constructor
	public Panel2() {
		this.setLayout(null);
		labelTitulo = new JLabel("Panel2");
		labelTitulo.setBounds(5,5,50,20);
	
		this.add(labelTitulo);
	}
	
	

}
