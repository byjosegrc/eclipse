/**
 * JoseManuelClase22_23 layouts Ventana.java
 * 25 oct 2022 8:35:15
 * @author Jose Manuel García Travé
 */
package layouts;


import layouts.PanelSimpleFlowLayout;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame{
	
	
//private PanelSimpleFlowLayout psfl;
//private PanelSimpleBorderLayout psbl;
private PanelSimpleGridLayout psgl;
private PanelSimpleBoxLayout psboxl;
//private PanelSimpleBoxLayoutBox psboxlbox;
//private PanelSimpleGridBagLayout psgbl;
public Ventana() {
super("Ventana sobre la que aplicamos Layouts");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//this.setVisible(true);

this.setBounds(150,150,400,400);

/*psfl = new PanelSimpleFlowLayout();
psfl.setBorder(BorderFactory.createTitledBorder("PanelSimpleFlowLayout"));
this.add(psfl);*/


//psbl = new PanelSimpleBorderLayout();
//psbl.setBorder(BorderFactory.createTitledBorder("PanelSimpleBorderLayout"));
//this.add(psbl);

psgl=new PanelSimpleGridLayout();
psgl.setBorder(BorderFactory.createTitledBorder("PanelSimpleGridLayout"));
this.add(psgl);



/*psboxl= new PanelSimpleBoxLayout();
psboxl.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayout"));
this.add(psboxl);*/


/*psboxlbox = new PanelSimpleBoxLayoutBox();
psboxlbox.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayoutBox"));
this.add(psboxlbox);
*/



/*psgbl= new PanelSimpleGridBagLayout();
//psgbl.setBorder(BorderFactory.createTitledBorder("SimpleGridBagLayout"));
this.add(psgbl);*/



this.setMaximumSize(new Dimension(800,800));
this.setMinimumSize(new Dimension(400,300));
this.pack();
this.setVisible(true);
}
}


