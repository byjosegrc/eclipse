/**
 * JoseManuelClase22_23 panelesImagenes Ventana.java
 * 5 oct 2022 9:17:50
 * @author Jose Manuel García Travé
 */
package panelesImagenes;

import panelesImagenes.Panel;

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
