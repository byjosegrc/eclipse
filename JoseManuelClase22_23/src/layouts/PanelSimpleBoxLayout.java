/**
 * JoseManuelClase22_23 layouts PanelSimpleBoxLayout.java
 * 26 oct 2022 8:38:30
 * @author Jose Manuel García Travé
 */
package layouts;

/**
 * @author JOSMA
 *
 */
import java.awt.*;
import javax.swing.*;
public class PanelSimpleBoxLayout extends JPanel{
public PanelSimpleBoxLayout() {
this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
this.add(new JLabel("Primera"));
this.add(new JLabel("Segunda"));
this.add(new JLabel("Tercera"));
this.add(new JLabel("Cuarta"));
this.add(new JLabel("Quinta"));
this.add(new JLabel("Sexta"));

this.add(new JButton("Primera"));
this.add(new JButton("Segunda"));
this.add(new JButton("Tercera"));
this.add(new JButton("Cuarta"));
this.add(new JButton("Quinta"));
this.add(new JButton("Sexta"));


}
}
