/**
 * JoseManuelClase22_23 jOptionPanel PanelShowConfirmDialog.java
 * 10 oct 2022 9:39:03
 * @author Jose Manuel García Travé
 */
package jOptionPanel;

/**
 * @author JOSMA
 *
 */
import javax.swing.*;


public class PanelShowConfirmDialog extends JPanel{
	
	private MiIcon icon;
	
public PanelShowConfirmDialog() {
	

			int respuesta0 = JOptionPane.showConfirmDialog(null, "Chao", "Titulo", JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE);
			
			int respuesta1 = JOptionPane.showConfirmDialog(null, "¿Está seguro?");

			int respuesta2 = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!",JOptionPane.YES_NO_OPTION);

			int respuesta3 = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
		
		
			MiIcon icon = new MiIcon();
			
			int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE, icon);



	}

}
