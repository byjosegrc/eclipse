/**
 * JoseManuelClase22_23 paneles2 Ventana.java
 * 4 oct 2022 9:12:57
 * @author Jose Manuel García Travé
 */
package paneles2;

import javax.swing.JFrame;

import paneles2.Panel1;

/**
 * @author JOSMA
 *
 */
public class Ventana extends JFrame {
	
	
	//se declara el objeto:
	
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	private Panel5 p5;
	private Panel6 p6;
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
	
		
		//se posiciona los paneles:
		
		p1.setBounds(10,10,100,50);
		p2.setBounds(120,10,100,50);
		p3.setBounds(240,10,100,50);
		p4.setBounds(10,60,100,50);
		p5.setBounds(10,120,100,50);
		p6.setBounds(120,120,100,50);
		
		
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
