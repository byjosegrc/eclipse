/**
 * JoseManuelClase22_23 componentesAtomicos Panel.java
 * 13 oct 2022 13:05:16
 * @author Jose Manuel García Travé
 */
package componentesAtomicos;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;





/**
 * @author JOSMA
 *
 */


public class Panel extends JPanel implements ActionListener,ChangeListener {
	private JLabel label1, label2, label3;
	private JButton boton1;
	private JCheckBox checkbox1,  checkbox2 ;
	private JRadioButton radio1, radio2;
	private ButtonGroup grupoRadios;
	private JToggleButton toggleButton;
	private JComboBox<String> combo;
	private JSeparator separadorVertical, separadorHorizontal;
	private JSlider deslizador;
	private JSpinner spinner;
	private JProgressBar barra;
	public Panel() {
	
		//Objetos:
		

		label1 = new JLabel();
		label1.setText("Componentes atómicos");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Forte",Font.BOLD,16));
		label1.setForeground(Color.BLUE);
		label1.setBackground(Color.CYAN);
		
		
		//Para cualquier fondo
		
		label1.setOpaque(true);
		
		label2 = new JLabel("Esto es una etiqueta o JLabel");
		label2.setFont(new Font("Bill Sans",Font.BOLD,16));
		label2.setForeground(Color.BLUE);
		label2.setBackground(Color.CYAN);
		
		
		
		label2.setOpaque(true);
		
		//LABEL3
		
		
		label3 = new JLabel("Esto es una JLabel"); 
		
		
		//BOTON 1:
		
		boton1 = new JButton("HOLA"); 
		boton1.addActionListener(this);
		
		
		//checkbox
		
		
		checkbox1 = new JCheckBox("Check 1");
		checkbox2 = new JCheckBox("Check 2", true);
		
		
		//GRUPO RADIOS:
		
		grupoRadios = new ButtonGroup();
		
		
		
		
		
		//radios:
		
		radio1 = new JRadioButton("RADIO 1");
		radio2 = new JRadioButton("RADIO 2");
		
		
		
		//toggleButton
		
		toggleButton = new JToggleButton ("ACTIVAR", true);
		
		toggleButton.addActionListener(this);
		
		
	
		
		//combo
		
		
		String[] opciones= {"Opción1", "Op2", "Op3", "Op4", "Op5"};
		combo = new JComboBox<String>(opciones);
		combo.setSelectedItem("Op2");
		
		//separadores:
		
		
		separadorVertical = new JSeparator();
		separadorVertical.setOrientation(SwingConstants.VERTICAL);
		separadorHorizontal = new JSeparator();
	
		
		
		//DESLIZADOR:
		
		deslizador = new JSlider(SwingConstants.HORIZONTAL,0,200,90);
		deslizador.setMajorTickSpacing(50);
		deslizador.setMinorTickSpacing(5);
		deslizador.setPaintTicks(true);
		deslizador.setFont(new Font("Tahoma",Font.PLAIN,16));
		deslizador.setForeground(Color.blue);
		deslizador.setPaintLabels(true);
		deslizador.addChangeListener(this);
		
		deslizador.setEnabled(true);
		
	//	barra.setValue(50);
		
		
		
		//SPINER:
		
		spinner = new JSpinner();
		spinner.addChangeListener(this);

		
		
		//BARRA:
		
		barra = new JProgressBar(0,150);

		
	
		//posicionamos los componentes:
		
		this.setLayout(null);
		
		label1.setBounds(250,10,500,60);
		label2.setBounds(20,80,250,20);
		label3.setBounds(310,80,250,20);
		boton1.setBounds(300,300,250,20);
		checkbox1.setBounds(150,140,100,20);
		checkbox2.setBounds(250,140,100,20);
		radio1.setBounds(250,180,100,20);
		radio2.setBounds(250,200,100,20);
		toggleButton.setBounds(300,350,250,20);;
		combo.setBounds(830, 100, 100, 23);
		separadorVertical.setBounds(580, 80, 10, 300);
		separadorHorizontal.setBounds(100, 250, 400, 200);
		deslizador.setBounds(600, 130, 200, 70);
		spinner.setBounds(600, 300, 150, 30);
		barra.setBounds(600, 200, 200, 60);
		
		//Añadir objetos:
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(boton1);
		this.add(checkbox1);
		this.add(checkbox2);
		this.add(radio1);
		this.add(radio2);
		grupoRadios.add(radio1);
		grupoRadios.add(radio2);
		this.add(toggleButton);
		this.add(combo);
		this.add(separadorVertical);
		this.add(separadorHorizontal);
		this.add(deslizador);
		this.add(spinner);
		this.add(barra);


		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		int valor;
		
		if (e.getSource()==spinner) {
			
			 valor = (int) spinner.getValue();
			 deslizador.setValue(valor);
			 barra.setValue(valor);
			
		}
		if(e.getSource()==deslizador) {
			
			valor = (int) deslizador.getValue();
			deslizador.setValue(valor);
			barra.setValue(valor);
			
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()==boton1) {
			String salida="";
			
			//JOptionPane.showMessageDialog(this, "Hola desde el boton1");
		
			salida = validaSalida();
			JOptionPane.showMessageDialog(null, salida);
		}
		
		/*if(e.getActionCommand()== "ACTIVAR") {
			
			JOptionPane.showMessageDialog(this, "Hola desde el toggleButton ");
			
		}*/
		
		
	}
	
	
	//ValidarSalida:
	
	
	private String validaSalida(){
		String cad="Seleccionado: \n";
		if(checkbox1.isSelected()) {
		cad+="check1\n";
		}
		if(checkbox2.isSelected()) {
		cad+="check2\n";
		}
		if(radio1.isSelected()) {
		cad+="radio1\n";
		}
		if(radio2.isSelected()) {
		cad+="radio2\n";
		}
		if(toggleButton.isSelected()) {
		cad+="toggleButton Activo\n";
		}else {
		cad+="toggleButton Desactivado\n";
		}
		cad+=combo.getSelectedItem()+"\n";
		return cad;
		}


}