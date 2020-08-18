import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaNumeros extends JFrame {

	private JPanel contentPane;
	private JTextPane textA;
	private JTextPane textB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNumeros frame = new TelaNumeros();
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
	public TelaNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_OK = new JButton("Mostrar n\u00FAmeros");
		btn_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a, b, c;
				
				a = Integer.parseInt(textA.getText());
				b = Integer.parseInt(textB.getText());
				c = a;
				
				ArrayList List = new ArrayList();
				
				do {
					List.add(c += 1);
				} while (c < b -1);
					JOptionPane.showMessageDialog(contentPane, List);
			}
		});
		btn_OK.setBounds(123, 202, 179, 32);
		contentPane.add(btn_OK);
		
		textA = new JTextPane();
		textA.setBounds(123, 43, 179, 32);
		contentPane.add(textA);
		
		textB = new JTextPane();
		textB.setBounds(123, 108, 179, 32);
		contentPane.add(textB);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(97, 43, 27, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(97, 108, 38, 25);
		contentPane.add(lblNewLabel_1);
	}
}
