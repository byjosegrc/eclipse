/**
 * JoseManuelClase22_23 eventosFoco VentanaEventosFoco.java
 * 9 nov 2022 9:13:47
 * @author Jose Manuel García Travé
 */
package eventosFoco;

import javax.swing.JFrame;

import componentesAtomicos.Panel;

/**
 * @author JOSMA
 *
 */
public class VentanaEventosFoco extends JFrame {
	public VentanaEventosFoco() {
		this.setTitle("Ventana Respondiendo FocusEvent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 300, 500, 350);
		this.add(new Panel());
		}
		}



