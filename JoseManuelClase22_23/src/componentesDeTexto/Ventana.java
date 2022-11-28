/**
 * JoseManuelClase22_23 componentesDeTexto Ventana.java
 * 19 oct 2022 9:44:07
 * @author Jose Manuel García Travé
 */
package componentesDeTexto;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;



/**
 * @author JOSMA
 *
 */


import componentesDeTexto.Panel;
import paneles2.Panel1;


public class Ventana extends JFrame {
	private Panel p1;
	public Ventana() {
		super();
		this.setTitle("JFRAME COMPONENTES ATOMICOS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		
		
		//obetenemos la resolucion 
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		
		//dimesion pantalla 
		
		Dimension tamagnoPantalla=miPantalla.getScreenSize();
		
		//Obtener ancho y alto de mi pantalla y guardamos los datos:
		
		int altoPantalla=tamagnoPantalla.height;
		int anchoPantalla=tamagnoPantalla.width;
		
		this.setSize(anchoPantalla/2, altoPantalla/2);
		
		this.setLocation(anchoPantalla/4, altoPantalla/4);
		
		
		//se instacian los objetos:
		
		p1 = new Panel();
		
		this.add(p1);
		
		
		//Final:
		
		this.setVisible(true);
		
	}

}
