/**
 * JoseManuelClase22_23 primeraVentana Ventana.java
 * 3 oct 2022 8:49:45
 * @author Jose Manuel García Travé
 */
package primeraVentana;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	//Creamos el constructor
	public Ventana() {
		//ponemos titulo al constructor del padre
		super("Mi primera ventana");
		//operacion por defecto para cerrar la ventana 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tamaño de la ventana
		this.setSize(400,500);
		
		//this.setLocation(500,300);
		
		// this.setBounds(100, 200, 500, 400);


		//para que no se redimensione para que no se pueda minimizar una ventana
		// this.setResizable(false);
		 
		 //Tamaño por defecto de una ventana
		
		//this.setExtendedState(MAXIMIZED_BOTH);
		
		this.setExtendedState(6);
		
		//Poner titulo:
		//this.setTitle("Mi primera ventana");
		
		//visible, siempre al final
		this.setVisible(true);
	}

}
