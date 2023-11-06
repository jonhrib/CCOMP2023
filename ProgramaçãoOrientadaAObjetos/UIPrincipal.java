package uicodigo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listas.Produto;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.Font;

public class UIPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public ArrayList <Produto> listaNacional = new ArrayList<Produto>();
	public ArrayList <Produto> listaInternacional = new ArrayList<Produto>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIPrincipal frame = new UIPrincipal();
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
	public UIPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		JMenuItem CadastroNac = new JMenuItem("Nacional");
		CadastroNac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UICadastroProdutoNacional cadastroProdNacional = new UICadastroProdutoNacional(listaNacional);
				cadastroProdNacional.setVisible(true);
			}
		});
		mnNewMenu.add(CadastroNac);
		
		JMenuItem CadastroIn = new JMenuItem("Internacional");
		CadastroIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UICadastroProdutoInternacional cadastroProdInternacional = new UICadastroProdutoInternacional(listaInternacional);
				cadastroProdInternacional.setVisible(true);
			}
		});
		mnNewMenu.add(CadastroIn);
		
		JMenu mnNewMenu_1 = new JMenu("Relatório"); 
		menuBar.add(mnNewMenu_1);
		
		JMenuItem RelatorioNac = new JMenuItem("Nacional");
		RelatorioNac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIRelatorioNacional relatorioNacional = new UIRelatorioNacional(listaNacional);
				relatorioNacional.setVisible(true);
			}
		});
		mnNewMenu_1.add(RelatorioNac);
		
		JMenuItem RelatorioIn = new JMenuItem("Internacional");
		RelatorioIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIRelatorioInternacional relatorioInternacional = new UIRelatorioInternacional(listaInternacional);
				relatorioInternacional.setVisible(true);
			}
		});
		mnNewMenu_1.add(RelatorioIn);
		
		JMenuItem RelatorioTotal = new JMenuItem("Total");
		RelatorioTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIRelatorioTotal relatorioTotal = new UIRelatorioTotal(listaInternacional,listaNacional);
				relatorioTotal.setVisible(true);
			}
		});
		mnNewMenu_1.add(RelatorioTotal);
		
		JMenu mnNewMenu_3 = new JMenu("Apagar produtos");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Apagar produtos nacionais");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIApagar apagarNacional = new UIApagar(listaNacional);
				apagarNacional.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Apagar produtos internacionais");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIApagar apagarInternacional = new UIApagar(listaInternacional);
				apagarInternacional.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Sair");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem ItemSair = new JMenuItem("Exit");
		ItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu_2.add(ItemSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setEditable(false);
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 12));
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(99, 95, 250, 23);
		textField.setText("       Bem vindo ao sistema de cadastro!");
		contentPane.add(textField);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 0, 0));
		canvas.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas.setBounds(29, 105, 100, 100);
		contentPane.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1.setBackground(new Color(44, 35, 43));
		canvas_1.setBounds(67, 18, 100, 100);
		contentPane.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1_1.setBackground(new Color(55, 55, 55));
		canvas_1_1.setBounds(109, 67, 100, 100);
		contentPane.add(canvas_1_1);
	}
}
