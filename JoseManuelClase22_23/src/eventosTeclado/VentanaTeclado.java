/**
 * JoseManuelClase22_23 eventosTeclado VentanaTeclado.java
 * 9 nov 2022 8:47:54
 * @author Jose Manuel García Travé
 */
package eventosTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author JOSMA
 *
 */
public class VentanaTeclado extends JFrame{
	public VentanaTeclado(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,300,500,350);
		//2º paso. nos creamos una instancia que pertenezca a la clase
		//oyente y le decimos que este preparado para cuando se produzca el evento
		EventoDeTeclado tecla =new EventoDeTeclado();
		addKeyListener(tecla);
		}
		}
		////1º paso. clase oyente
		class EventoDeTeclado implements KeyListener{
		//pulsado de la tecla
		public void keyPressed(KeyEvent e) {
		//obtener el codigo de la tecla pulsada
		int codigo=e.getKeyCode();
		System.out.println(codigo);
		char letra=e.getKeyChar();
		System.out.println(letra);
		}
		//levantado de la tecla
		public void keyReleased(KeyEvent e) {
		}
		// pulsado y levantado de la tecla
		public void keyTyped(KeyEvent e) {
		}
		}

