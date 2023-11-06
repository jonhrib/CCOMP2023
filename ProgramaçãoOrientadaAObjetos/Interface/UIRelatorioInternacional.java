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

public class UIRelatorioInternacional extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIRelatorioInternacional frame = new UIRelatorioInternacional(null);
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
	public UIRelatorioInternacional(final ArrayList <Produto> listaInternacional) {
		final DecimalFormat df = new DecimalFormat("0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		final JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(10, 46, 414, 204);
		contentPane.add(textArea1);
		
		JButton btnNewButton = new JButton("Gerar Relatório");
		btnNewButton.setBounds(140, 11, 159, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Gerado!");
				
				if (!listaInternacional.isEmpty()) {
					for (Produto aux: listaInternacional) {
						textArea1.setText("");
						textArea1.append("Código: " + aux.getCod() + " \n");
						textArea1.append("Nome: " + aux.getNome() + " \n");
						textArea1.append("Valor total: R$" + df.format(aux.getValor()) + "(contém 10% de taxa de importação) \n");
						textArea1.append("Peso: " + aux.getPeso() + "kg \n");
						textArea1.append("Valor por kg: R$" + df.format(aux.getValorkg()) + " \n");
						textArea1.append("---------------------------------- \n");
					}
				}
				else {
					textArea1.append("Não existem produtos cadastrados");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane(textArea1);
		scrollPane.setBounds(10, 45, 414, 208);
		contentPane.add(scrollPane);
		
	}
}
