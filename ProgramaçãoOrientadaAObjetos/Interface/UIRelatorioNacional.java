package uicodigo;

import java.awt.EventQueue;

import Listas.Produto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.event.InputMethodListener;
import java.text.DecimalFormat;
import java.awt.event.InputMethodEvent;

public class UIRelatorioNacional extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIRelatorioNacional frame = new UIRelatorioNacional(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIRelatorioNacional(final ArrayList <Produto> listaNacional) {
		final DecimalFormat df = new DecimalFormat("0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 38, 414, 212);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Gerar Relatório");
		btnNewButton.setBounds(140, 11, 159, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Gerado!");
				
				if (!listaNacional.isEmpty()) { 
					for (Produto aux: listaNacional) {
						textArea.setText("");
						textArea.append("Código: " + aux.getCod() + " \n");
						textArea.append("Nome: " + aux.getNome() + " \n");
						textArea.append("Valor total: R$" + df.format(aux.getValor()) + " \n");
						textArea.append("Peso: " + aux.getPeso() + "kg \n");
						textArea.append("Valor por kg: R$" + df.format(aux.getValorkg()) + " \n");
						textArea.append("---------------------------------- \n");
					}
				}
				else {
					textArea.append("Não existem produtos cadastrados");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 45, 414, 208);
		contentPane.add(scrollPane);
		
	}
}
