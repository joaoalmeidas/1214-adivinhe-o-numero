import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdivinhacaoFrame extends JFrame {
	
	private final JPanel panelLabel;
	private final JPanel panelNumero;
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	private final JTextField numero;
	
	public AdivinhacaoFrame() {
		
		setLayout(new GridLayout(5,1));
		
		panelNumero = new JPanel();
		panelNumero.setLayout(new FlowLayout());
		
		panelLabel = new JPanel();
		panelLabel.setLayout(new FlowLayout());
		
		label1 = new JLabel("Tenho um número entre 1 e 1000.");
		label2 = new JLabel("Você consegue adivinhar meu número?");
		label3 = new JLabel("Insira a sua tentativa:");
		
		panelLabel.add(label1);
		panelLabel.add(label2);
		panelLabel.add(label3);
		
		numero = new JTextField(5);
		
		panelNumero.add(numero);
		
		add(panelLabel);
		add(panelNumero);
		
		
	}

}
