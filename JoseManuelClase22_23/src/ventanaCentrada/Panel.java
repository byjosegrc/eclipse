/**
 * JoseManuelClase22_23 ventanaCentrada Panel.java
 * 13 oct 2022 13:03:23
 * @author Jose Manuel García Travé
 */
package ventanaCentrada;

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
