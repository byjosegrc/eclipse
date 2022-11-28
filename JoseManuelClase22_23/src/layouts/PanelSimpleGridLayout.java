/**
 * JoseManuelClase22_23 layouts PanelSimpleGridLayout.java
 * 26 oct 2022 8:29:03
 * @author Jose Manuel García Travé
 */
package layouts;

/**
 * @author JOSMA
 *
 */
	
	import java.awt.*;
	import javax.swing.*;
	public class PanelSimpleGridLayout extends JPanel{
	public PanelSimpleGridLayout() {
		
		
	this.setLayout(new GridLayout(2,1));
//	this.add(new JLabel("Primera"));
//	this.add(new JLabel("Segunda"));
//	this.add(new JLabel("Tercera"));
//	this.add(new JLabel("Cuarta"));
//	this.add(new JLabel("Quinta"));
//	this.add(new JLabel("Sexta"));

	this.add(new JButton("1"));
	this.add(new JButton("2"));
	
	this.add(new JButton("3"));
	
	this.add(new JButton("4"));
	}
	}
