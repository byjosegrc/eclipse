/**
 * JoseManuelClase22_23 ventanaCentrada Ventana.java
 * 3 oct 2022 9:36:58
 * @author Jose Manuel García Travé
 */
package ventanaCentrada;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	public Ventana() {
		super();
		this.setTitle("Ventana Centrada");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		
		//FINAL:
		
		this.setVisible(true);
		
		//obetenemos la resolucion 
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		
		//dimesion pantalla 
		
		Dimension tamagnoPantalla=miPantalla.getScreenSize();
		
		//Obtener ancho y alto de mi pantalla y guardamos los datos:
		
		int altoPantalla=tamagnoPantalla.height;
		int anchoPantalla=tamagnoPantalla.width;
		
		this.setSize(anchoPantalla/2, altoPantalla/2);
		
		this.setLocation(anchoPantalla/4, altoPantalla/4);
		
		int imagen;
		//Imagen miIcono = miPantalla.getImage(imagen/eclipse.png);

		
		
		
		
		
		
	}

}
