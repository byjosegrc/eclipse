/**
 * JoseManuelClase22_23 panelesImagenes Panel.java
 * 5 oct 2022 9:18:33
 * @author Jose Manuel García Travé
 */
package panelesImagenes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */

public class Panel extends JPanel {
	private JLabel labelTitulo;
	
	private JLabel labelPintura1,pintura1, labelPintura2,pintura2;
	
	public ImageIcon image1, image2;
	//Constructor
	public Panel() {
		this.setLayout(null);
		labelTitulo = new JLabel("Estamos añadiendo imagenes");
		labelTitulo.setBounds(160,5,380,40);
	
		labelPintura1 = new JLabel("Pintura1 fichero compilado");
		
		image1=new ImageIcon("src/recursos/textura.png");
		pintura1=new JLabel(image1);
		pintura1.setBounds(100,100,100,150);
		
		
		
		this.add(labelTitulo);
		this.add(labelPintura1);
		this.add(pintura1);
		
	}

}