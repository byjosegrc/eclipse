/**
 * JoseManuelClase22_23 layouts PanelSimpleBorderLayout.java
 * 25 oct 2022 8:48:12
 * @author Jose Manuel García Travé
 */
package layouts;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author JOSMA
 *
 */

	public class PanelSimpleBorderLayout extends JPanel{
	private JPanel p1;
		
		public PanelSimpleBorderLayout() {
		p1 = new JPanel();
	this.setLayout(new BorderLayout());
	//this.add(new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
	//this.add(new JLabel("Norte2", SwingConstants.CENTER), BorderLayout.NORTH); //Solo se añade el ultimo
	//this.add(new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
	this.add(new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
	this.add(new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
	this.add(new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);

	p1.add(new JLabel("Dentro de p1_a"));
	p1.add(new JLabel("Dentro de p1_b"));
	p1.add(new JLabel("Dentro de p1_c"));
	p1.setBorder(BorderFactory.createTitledBorder("PANEL 1"));
	
	
	//, BorderLayout.CENTER
	this.add(p1);
	
	
		}
	}



