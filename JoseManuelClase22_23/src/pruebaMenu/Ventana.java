/**
 * JoseManuelClase22_23 pruebaMenu Ventana.java
 * 14 nov 2022 9:34:41
 * @author Jose Manuel García Travé
 */
package pruebaMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import paneles1.Panel;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	private JMenuBar miBarra;
	private JMenu archivo,edicion, herramientas, opciones;
	private JMenuItem guardar,guardarComo,copiar,cortar,
	pegar,generales,itemEmergente1,itemEmergente2,opcion1,opcion2;
	private JPanel miPanel;
	private JPopupMenu menuEmergente;
	
	
	public Ventana() {
		super("MENUS Y MENUS EMERGENTES");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,1000);
		this.iniciarComponentes();
		
	}
	
	private void iniciarComponentes(){
		miBarra = new JMenuBar();
		//menu
		archivo = new JMenu ("Archivo");
		edicion = new JMenu ("Edicion");
		herramientas = new JMenu ("Herramientas");
		opciones = new JMenu ("Opciones");
		//opciones del menu
		guardar = new JMenuItem("Guardar");
		guardarComo = new JMenuItem("GuardarComo");
		copiar = new JMenuItem("Copiar");
		cortar = new JMenuItem("Cortar");
		pegar = new JMenuItem("pegar");
		opcion1 = new JMenuItem("Opcion1");
		opcion2 = new JMenuItem("Opcion2");
		generales = new JMenuItem("Generales");
		
		//agregamos las opciones a los menus
		
		//ARCHIVO:
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		//EDICION:
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);

		//SEPARADOR DE BARRA DE MENU: --INCLUIMOS UN SEPARADOR--
		edicion.addSeparator();
		
		//HERRAMIENTAS:
		
		
		herramientas.add(generales);
		//OPCIONES:
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		
		//AÑADIMOS LOS MENUS A LA BARRA
		
		
		edicion.add(opciones);
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		//AÑADIMOS LA BARRA A LA VENTANA:
		
		
		this.setJMenuBar(miBarra);
		
		
		
		
		//OPCIONES DEL MENU EMERGENTE:
		
		miPanel = new JPanel();
		
		
		itemEmergente1 = new JMenuItem("Opcion Emergente 1");
		
		itemEmergente2 = new JMenuItem("Opcion Emergente 2");
		
		menuEmergente = new JPopupMenu();
		
		
		menuEmergente.add(itemEmergente1);
		menuEmergente.add(itemEmergente2);
		
		miPanel.setComponentPopupMenu(menuEmergente);
		
		
		this.add(miPanel);
		
		
		//FINAL:
		
		this.setVisible(true);
		
	}
	
	

}
