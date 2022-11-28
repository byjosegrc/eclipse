/**
 * JoseManuelClase22_23 layouts PanelSimpleGridBagLayout.java
 * 26 oct 2022 9:25:29
 * @author Jose Manuel García Travé
 */
package layouts;

/**
 * @author JOSMA
 *
 */
import java.awt.*;
import javax.swing.*;


class PanelSimpleGridBagLayout extends JPanel{
 private GridBagLayout layout; // layout of this frame
 private GridBagConstraints constraints; // constraints of this layout
 // set up GUI
 
 
 
 
 public PanelSimpleGridBagLayout(){
 layout = new GridBagLayout();
 this.setLayout( layout ); // set frame layout
 constraints = new GridBagConstraints(); // instantiate constraints
 
 
 
 //create GUI components
 JTextArea textArea1 = new JTextArea( "TextArea1",2,2);
 
// JLabel usuario = new JLabel("Usuario : ");
// 
// 
// JLabel contraseña = new JLabel("Contraseña : ");
 
 JTextArea textArea2 = new JTextArea( "TextArea2", 2, 2 );
 String[] names = { "Iron", "Steel", "Brass" };
 JComboBox<String> comboBox = new JComboBox<String>(names);
 JTextField textField = new JTextField( "TextField" );
 
 
 JButton button1 = new JButton( "Button 1" );

// JTextField cogerUsuario = new JTextField();
 JButton button2 = new JButton( "Button 2" );
// JTextField cogerContra = new JTextField();
 JButton button3 = new JButton( "Button 3" );
 
// JButton botonEnviar = new JButton( "LOGIN" );

 //textArea1
 //gridx = 0
 //gridy = 0
 //gridwidth = 1
 //gridheight = 3

// constraints.fill = GridBagConstraints.NONE;
// constraints.fill = GridBagConstraints.VERTICAL;
 addComponent(textArea1, 0, 0, 2, 3 );
 constraints.fill = GridBagConstraints.HORIZONTAL;
 
 
 
// constraints.fill = GridBagConstraints.BOTH;
// addComponent(usuario, 0, 0, 1, 1 );
// 
// constraints.fill = GridBagConstraints.BOTH;
// addComponent(contraseña, 0, 0, 1, 2 );
 

 //button1
 //weightx and weighty for button1 are both 0: the default
 //fill is HORIZONTAL
 constraints.fill = GridBagConstraints.HORIZONTAL;
// this.addComponent(cogerUsuario, 1, 0, 2, 1 );

 //comboBox
 //fill is HORIZONTAL
 //weightx and weighty for comboBox are both 0: the default
 this.addComponent(comboBox, 1, 2, 2, 1 );

 //button2
 //fill is BOTH for button2

 //LAS SIGUIENTES OPCIONES HACEN QUE SEA REPONSITIVE
 
 
 constraints.weightx = 1000; // puede crecer m᳠ancho
constraints.weighty = 1; // puede crecer m᳠alto

//----------------------------------------------------



constraints.fill = GridBagConstraints.HORIZONTAL;
 

//this.addComponent(cogerContra, 1, 1, 1, 1 );



//button3
 constraints.weightx = 0;
 constraints.weighty = 0;
 this.addComponent(button3, 2, 1, 1, 1 );

 //weightx and weighty for textField are both 0, fill is BOTH
 //this.addComponent(botonEnviar, 0, 3, 2, 1 );
 //weightx and weighty for textArea2 are both 0, fill is BOTH
 this.addComponent(textArea2, 2, 3, 1, 1 );
 } // end GridBagFrame constructor
 //method to set constraints on
 
 
 private void addComponent(Component component,int column, int row, int width,int height ) {
	 constraints.gridx = column; // set gridx, La columna en la que se colocar elcomponente.
	 constraints.gridy = row; // set gridy, La fila en la que se colocar el componente.
	 constraints.gridwidth = width; // set gridwidth, El nmero de columnas que ocupa el componente.
	 constraints.gridheight = height; // set gridheight, El nmero de filas que ocupa el componente.
	 layout.setConstraints(component, constraints ); // set constraints
 this.add(component); // add component
 } // end method addComponent
}