/**
 * JoseManuelClase22_23 jOptionPanel PanelShowImputDialog.java
 * 11 oct 2022 8:50:23
 * @author Jose Manuel García Travé
 */
package jOptionPanel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author JOSMA
 *
 */


public class PanelShowImputDialog extends JPanel{
public PanelShowImputDialog() {
String respuesta0 = JOptionPane.showInputDialog("Escribe tu nombre");
String respuesta1 = JOptionPane.showInputDialog("¿Cuál es su nombre?", "Maria");
String respuesta2 = JOptionPane.showInputDialog(this, "Escribe tu nombre");
String respuesta3 = JOptionPane.showInputDialog(this, "¿Cuál es tu nombre?", "Maria");
String respuesta4 = JOptionPane.showInputDialog(this, "Escriba nuevamente su nombre", "Error!",
JOptionPane.ERROR_MESSAGE);
String[] modulos = { "Acceso a datos", "Sistemas de gestión empresarial.", "Desarrollo de interfaces",
"Programación de servicios y procesos", "Programación multimedia y dispositivos móviles" };
MiIcon icon = new MiIcon();
String respuesta5 = (String) JOptionPane.showInputDialog(this, "Seleccione una carrera a cursar", "Carrera",
JOptionPane.DEFAULT_OPTION, icon, modulos, modulos[0]);
}
}