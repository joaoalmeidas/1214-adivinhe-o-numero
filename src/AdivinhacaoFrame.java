import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdivinhacaoFrame extends JFrame {
	
	private final JPanel panelDescricao;
	private final JPanel panelNumero;
	private final JPanel panelResultado;
	private final JPanel panelBotoes;
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	private final JLabel labelResultado;
	
	private final JTextField numero;
	
	private final JButton botaoTentar;
	private final JButton botaoNovoJogo;
	
	public AdivinhacaoFrame() {
		
		setLayout(new GridLayout(5,1));
		
		panelNumero = new JPanel();
		panelNumero.setLayout(new FlowLayout());
		
		panelDescricao = new JPanel();
		panelDescricao.setLayout(new FlowLayout());
		
		panelResultado = new JPanel();
		panelResultado.setLayout(new FlowLayout());
		
		panelBotoes = new JPanel();
		panelBotoes.setLayout(new FlowLayout());
		
		label1 = new JLabel("Tenho um número entre 1 e 1000.");
		label2 = new JLabel("Você consegue adivinhar meu número?");
		label3 = new JLabel("Insira a sua tentativa:");
		
		panelDescricao.add(label1);
		panelDescricao.add(label2);
		panelDescricao.add(label3);
		
		numero = new JTextField(5);
		
		panelNumero.add(numero);
		
		labelResultado = new JLabel();
		
		panelResultado.add(labelResultado);
		
		botaoTentar = new JButton("Tentar");
		botaoNovoJogo = new JButton("Jogar Novamente");
		
		panelBotoes.add(botaoTentar);
		
		
		add(panelDescricao);
		add(panelNumero);
		add(panelResultado);
		add(panelBotoes);
		
	}

}
