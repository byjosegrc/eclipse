/**
 * JoseManuelClase22_23 paneles2Bordes Ventana.java
 * 4 oct 2022 10:10:56
 * @author Jose Manuel García Travé
 */
package paneles2Bordes;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */

import paneles2.Panel1;
import paneles2.Panel2;
import paneles2.Panel3;
import paneles2.Panel4;
import paneles2.Panel5;
import paneles2.Panel6;

import java.awt.Color;
import java.awt.Container;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//public class BorderSamples extends JPanel {

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	
	
	
	
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	private Panel5 p5;
	private Panel6 p6;
	private Color c1,c2;
	
	
	//se declara el objeto:
	
	public Ventana() {
	
		super("Ventana sobre la que escribimos");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000,1000);
		
		
		
		
		//se instacian los objetos:
		
		p1 = new Panel1();
		p2 = new Panel2();
		p3 = new Panel3();
		p4 = new Panel4();
		p5 = new Panel5();
		p6 = new Panel6();
		c1 = new Color(255,136,75);
		p1.setBorder(BorderFactory.createLineBorder(c1));
		c2 = new Color(255,136,75);
		p2.setBorder(BorderFactory.createLineBorder(c2));
		
		
		  // Bordes biselado de varios colores
		  
		p3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED));

		p4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GRAY));
		
		
		//URL imgURL = getClass().getResource("src/recursos/imagen.jpg");
		
		
		
		  ImageIcon ico = new ImageIcon("src/recursos/textura.png");
		
		  
		  
		  /* Ademas de elegir el grosor podemos establecer una icono como imagen de fondo del borde. */

		
		p5.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, ico));
		
		
		
		p6.setBorder(BorderFactory.createMatteBorder(3, 3, 5, 5, Color.ORANGE));


		
		//se posiciona los paneles:
		
		p1.setBounds(10,10,100,50);
		p2.setBounds(120,10,100,50);
		p3.setBounds(240,10,100,50);
		p4.setBounds(10,60,100,50);
		p5.setBounds(10,120,100,50);
		p6.setBounds(120,120,100,50);
		
		

		
		// Borde vacio con 10px por cada lado
		  Border empty = BorderFactory.createEmptyBorder(10, 10, 10, 10);

		  /** Bordes simples */
		  // Borde de color rojo con grosor de linea de 2px
		  Border line = BorderFactory.createLineBorder(Color.RED, 2);
		
		
		//los añado:
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(p5);
		this.add(p6);
		
		//FINAL:
		
		this.setVisible(true);
		
	}

}
