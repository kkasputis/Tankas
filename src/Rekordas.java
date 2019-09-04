import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Rekordas {

	private JFrame frame;
	JTextField vardas;

	/**
	 * Launch the application.
	 */
	public static void rekordas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rekordas window = new Rekordas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rekordas() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 341, 136);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRekordas = new JLabel("Rekordas!!!");
		lblRekordas.setBounds(-24, 0, 387, 34);
		lblRekordas.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblRekordas.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRekordas);
		
		JLabel lblveskiteVard = new JLabel("\u012Eveskite vard\u0105:");
		lblveskiteVard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblveskiteVard.setBounds(21, 47, 98, 14);
		frame.getContentPane().add(lblveskiteVard);
		
		vardas = new JTextField();
		vardas.setBounds(118, 45, 188, 19);
		vardas.setText("  ");
		frame.getContentPane().add(vardas);
		vardas.setColumns(1);
		
		JButton btnrayti = new JButton("\u012Era\u0161yti");
		btnrayti.setBounds(10, 72, 309, 16);
		frame.getContentPane().add(btnrayti);
	}
}
