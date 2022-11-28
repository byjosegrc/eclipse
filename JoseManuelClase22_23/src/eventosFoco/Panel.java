/**
 * JoseManuelClase22_23 eventosFoco Panel.java
 * 9 nov 2022 9:14:36
 * @author Jose Manuel García Travé
 */
package eventosFoco;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author JOSMA
 *
 */
public class Panel extends JPanel implements FocusListener{
	private JTextField campoEmail, campoComprobacion;
	private JLabel etiquetaEmail, etiquetaComprobacion;
	public Panel() {
	this.setLayout(null);
	
	etiquetaEmail = new JLabel("email: ");
	etiquetaComprobacion = new JLabel("¿email corecto?: ");
	campoEmail = new JTextField();
	campoComprobacion = new JTextField();
	etiquetaEmail.setBounds(10, 10, 150, 20);
	etiquetaComprobacion.setBounds(10, 50, 150, 20);
	campoEmail.setBounds(160, 10, 150, 20);
	campoComprobacion.setBounds(160, 50, 150, 20);
	campoEmail.addFocusListener(this);
	this.add(etiquetaEmail);
	this.add(etiquetaComprobacion);
	this.add(campoEmail);
	this.add(campoComprobacion);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	// TODO Auto-generated method stub
	}
	@Override
	public void focusLost(FocusEvent arg0) {
	// JOptionPane.showMessageDialog(null, "Has perdido el foco");
	String email = campoEmail.getText();
	boolean comprobacion = false;
	for (int i = 0; i < email.length(); i++) {
	if (email.charAt(i) == '@') {
	comprobacion = true;
	}
	}
	if (comprobacion) {
	campoComprobacion.setText("correcto");
	} else {
	campoComprobacion.setText("incorrecto");
	}
	}
	}
