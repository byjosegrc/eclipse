/**
 * JoseManuelClase22_23 jOptionPanel MiIcon.java
 * 10 oct 2022 9:03:14
 * @author Jose Manuel García Travé
 */
package jOptionPanel;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 * @author JOSMA
 *
 */
public class MiIcon implements Icon {

	@Override


		public void paintIcon(Component c, Graphics g, int x, int y) {
			
		
			try {
			Image imagen = ImageIO.read(getClass().getResource("../recursos/imagen.jpg"));
			g.drawImage(imagen, x, y, c);
			} catch (IOException e) {
			JOptionPane.showMessageDialog(c, "Imagen No Encontrada", "Atención",JOptionPane.WARNING_MESSAGE);
			}
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 37;
	}

}
