package uicodigo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import Listas.Produto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class UIApagar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIApagar frame = new UIApagar(null);
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
	public UIApagar(ArrayList <Produto> lista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(null);
		JTextPane txtpnOsProdutosForam = new JTextPane();
		txtpnOsProdutosForam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnOsProdutosForam.setEditable(false);
		if (lista.isEmpty()) {
			txtpnOsProdutosForam.setText("Não existem produtos cadastrados!");
		}
		else {
			lista.clear();
			txtpnOsProdutosForam.setText("Os produtos foram apagados!");
		}
		txtpnOsProdutosForam.setBounds(138, 26, 178, 20);
		contentPane.add(txtpnOsProdutosForam);
		txtpnOsProdutosForam.setVisible(true);

		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 0, 0));
		canvas.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas.setBounds(79, 52, 100, 100);
		contentPane.add(canvas);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1.setBackground(new Color(44, 35, 43));
		canvas_1.setBounds(167, 80, 100, 100);
		contentPane.add(canvas_1);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		canvas_1_1.setBackground(new Color(55, 55, 55));
		canvas_1_1.setBounds(247, 107, 100, 100);
		contentPane.add(canvas_1_1);
		
		setContentPane(contentPane);
	}

}
