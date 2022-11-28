/**
 * JoseManuelClase22_23 metodosEventos Ventana.java
 * 7 nov 2022 9:04:41
 * @author Jose Manuel García Travé
 */
package metodosEventos;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class Ventana  extends JFrame {
	
	public PanelMetodo1 panelMetodo1;
	public PanelMetodo2 panelMetodo2;
	public PanelMetodo3 panelMetodo3;
	public PanelMetodo4 panelMetodo4;
	public PanelMetodo4a panelMetodo4a;
	
	//Creamos el constructor
	public Ventana() {
		//ponemos titulo al constructor del padre
		super("EVENTOS");
		//operacion por defecto para cerrar la ventana 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
		PanelMetodo1 panelMetodo1 = new PanelMetodo1();

		
		PanelMetodo2 panelMetodo2 = new PanelMetodo2();
		
		PanelMetodo3 panelMetodo3 = new PanelMetodo3();
		
		
		PanelMetodo4 panelMetodo4 = new PanelMetodo4();
		
		PanelMetodo4a panelMetodo4a = new PanelMetodo4a();
		
		
		//this.add(panelMetodo1);
		
		//this.add(panelMetodo2);
		
		
		//this.add(panelMetodo3);
		
		//this.add(panelMetodo4);
		
		this.add(panelMetodo4a);
		
		
		//tamaño de la ventana
		this.setSize(400,500);
		
		
		this.setExtendedState(6);
		
		//Poner titulo:
		//this.setTitle("Mi primera ventana");
		
		//visible, siempre al final
		this.setVisible(true);
	}

}