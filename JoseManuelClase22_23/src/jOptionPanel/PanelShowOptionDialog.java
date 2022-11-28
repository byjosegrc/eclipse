/**
 * JoseManuelClase22_23 jOptionPanel PanelShowOptionDialog.java
 * 10 oct 2022 9:54:20
 * @author Jose Manuel García Travé
 */
package jOptionPanel;

/**
 * @author JOSMA
 *
 */
import javax.swing.*;
public class PanelShowOptionDialog extends JPanel{
MiIcon icon = new MiIcon();
String[] opciones = { "Opcion A", "Opcion B", "Opcion C", "Opcion D" };
int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo",
JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
}
