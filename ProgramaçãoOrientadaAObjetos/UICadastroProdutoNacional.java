package uicodigo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import Listas.Produto;
import uicodigo.UIPrincipal;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JTextPane;

public class UICadastroProdutoNacional extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JLabel lblNewLabel_1;
	private JTextField textFieldValor;
	protected String codigoProdutoNacional;
	protected String nomeProdutoNacional;
	protected String valorProdutoNacional;
	protected String pesoProdutoNacional;
	protected double pesoNacional;
	protected double valorNacional;
	private JTextField textFieldPeso;
	private JLabel lblNewLabel_3;
	private JTextField textFieldCodigo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UICadastroProdutoNacional frame = new UICadastroProdutoNacional(null);
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
	public UICadastroProdutoNacional(final ArrayList <Produto> listaNacional) {
		final DecimalFormat df = new DecimalFormat ("0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		final JButton Botao1 = new JButton("confirma");
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(34, 72, 48, 14);
		contentPane.add(lblNewLabel);
		
		final JTextPane txtpnProdutoJCadastrado = new JTextPane();
		txtpnProdutoJCadastrado.setText("Produto já cadastrado");
		txtpnProdutoJCadastrado.setBounds(34, 176, 283, 20);
		contentPane.add(txtpnProdutoJCadastrado);
		txtpnProdutoJCadastrado.setVisible(false);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				int cont = 0;
				for (Produto aux: listaNacional) {
					if (aux.getCod().equalsIgnoreCase(textFieldCodigo.getText())) {
						cont++;
						break;
					}
				}
				if (cont > 0) {
					Botao1.setEnabled(false);
					txtpnProdutoJCadastrado.setVisible(true);	
				}
				else {
					Botao1.setEnabled(true);
					txtpnProdutoJCadastrado.setVisible(false);
				}
			}
		});
		
		textFieldCodigo.setBounds(92, 38, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(92, 69, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Valor");
		lblNewLabel_1.setBounds(34, 103, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(92, 100, 86, 20);
		contentPane.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		Botao1.setBounds(34, 227, 95, 23);
		Botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigoProdutoNacional = textFieldCodigo.getText();
				nomeProdutoNacional = textFieldNome.getText();
				valorProdutoNacional = textFieldValor.getText();
				valorNacional = Double.parseDouble(valorProdutoNacional);
				pesoProdutoNacional = textFieldPeso.getText();
				pesoNacional = Double.parseDouble(pesoProdutoNacional);
				
				Produto p = new Produto (codigoProdutoNacional, nomeProdutoNacional, valorNacional, pesoNacional);
				listaNacional.add(p);
				
//				for (Produto aux: listaNacional) {
//					aux.ImprimeDados();
//				}
				
				JOptionPane.showConfirmDialog(null, "O produto " + nomeProdutoNacional  + " no valor de R$ " + df.format(valorNacional) + " e com peso de " + df.format(pesoNacional) + "kg foi Cadastrado", "", JOptionPane.PLAIN_MESSAGE);
			}
		});
		contentPane.add(Botao1);
		
		JLabel lblNewLabel_2 = new JLabel("Peso (kg)");
		lblNewLabel_2.setBounds(34, 134, 54, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(92, 131, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Código");
		lblNewLabel_3.setBounds(34, 41, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 0, 0));
		canvas.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas.setBounds(351, 212, 48, 49);
		contentPane.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1.setBackground(new Color(44, 35, 43));
		canvas_1.setBounds(376, 189, 48, 46);
		contentPane.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1_1.setBackground(new Color(55, 55, 55));
		canvas_1_1.setBounds(386, 212, 59, 64);
		contentPane.add(canvas_1_1);
		
		JTextPane txtpnCadastroDeProdutos = new JTextPane();
		txtpnCadastroDeProdutos.setEditable(false);
		txtpnCadastroDeProdutos.setText("                                              Cadastro de Produtos Nacionais");
		txtpnCadastroDeProdutos.setBounds(0, 0, 434, 20);
		contentPane.add(txtpnCadastroDeProdutos);
	}
}
