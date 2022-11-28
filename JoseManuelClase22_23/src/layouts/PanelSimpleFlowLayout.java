/**
 * JoseManuelClase22_23 layouts PanelSimpleFlowLayout.java
 * 25 oct 2022 8:39:35
 * @author Jose Manuel García Travé
 */
package layouts;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */
import java.awt.*;
import javax.swing.*;
public class PanelSimpleFlowLayout extends JPanel{
public PanelSimpleFlowLayout() {
// this.setLayout(new FlowLayout());
// this.setLayout(new FlowLayout(FlowLayout.RIGHT));
 this.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
//this.setLayout(new FlowLayout(1,80,10));
this.add(new JLabel("Primera"));
this.add(new JLabel("Segunda"));
this.add(new JLabel("Tercera"));
this.add(new JLabel("Cuarta"));
this.add(new JLabel("Quinta"));
this.add(new JLabel("Sexta"));
}
}

