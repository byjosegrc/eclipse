/**
 * JoseManuelClase22_23 jOptionPanel Ventana.java
 * 10 oct 2022 8:42:43
 * @author Jose Manuel García Travé
 */
package jOptionPanel;

import javax.swing.JFrame;

import jOptionPanel.PanelShowMessageDialog;

/**
 * @author JOSMA
 *
 */

	public class Ventana extends JFrame {
		
		private PanelShowMessageDialog psmd;
		private PanelShowConfirmDialog pscd;
		private PanelShowImputDialog psid;
		
		//Creamos el constructor
		public Ventana() {
			//ponemos titulo al constructor del padre
			super("Ventana sobre la que insertamos JOptionPane-Paneles");
			//operacion por defecto para cerrar la ventana 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//tamaño de la ventana
			
			this.setSize(400,500);
			
			//psmd = new PanelShowMessageDialog();
			
			//pscd = new PanelShowConfirmDialog();
			
			
			 psid= new PanelShowImputDialog(); 
			
			
			//this.add(psmd);
			//this.add(pscd);
			this.add(psid);
			//visible, siempre al final
			this.setVisible(true);
		}
	}

