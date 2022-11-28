/**
 * JoseManuelClase22_23 paneles1 ventana.java
 * 4 oct 2022 8:44:51
 * @author Jose Manuel García Travé
 */
package paneles1;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	private Panel miPanel;
	public Ventana() {
		super("Ventana sobre la que escribimos");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		
	
		miPanel = new Panel();
		this.add(miPanel);
		
		//FINAL:
		
		this.setVisible(true);
		
	}

}
