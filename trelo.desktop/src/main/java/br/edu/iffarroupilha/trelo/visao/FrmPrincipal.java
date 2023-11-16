package br.edu.iffarroupilha.trelo.visao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Janela Principal que inicia o programa
 */
public class FrmPrincipal extends JFrame {

	public FrmPrincipal() {
		// define o titulo
		setTitle("Trelo!!");
		// define proporcoes inicias
		setSize(640, 480);
		// abrir a janela ao centro
		setLocationRelativeTo(null);
		// desena componentes
		desenharComponentesGraficos();
		// define a operacao padrao quando fecha a janelka
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// deixa a tela visivel
		setVisible(true);
	}

	/**
	 * Cria os componentes graficos
	 */
	private void desenharComponentesGraficos() {
		GridBagLayout layout = new GridBagLayout();
		// layout.

		getContentPane().setLayout(layout);

		JButton botao = new JButton("Clique aqui");
		getContentPane().add(botao, new Defs(1, 1, true));

		getContentPane().add(new JLabel("centro"), new Defs(1, 2));

	}

	public static void main(String[] args) {
		new FrmPrincipal();

	}

}
