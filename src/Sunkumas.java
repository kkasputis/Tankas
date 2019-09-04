import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Sunkumas {

	private JFrame frmSunkumoLygis;

	/**
	 * Launch the application.
	 */
	public static void sunkumas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sunkumas window = new Sunkumas();
					window.frmSunkumoLygis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sunkumas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSunkumoLygis = new JFrame();
		frmSunkumoLygis.setTitle("Sunkumo lygis");
		frmSunkumoLygis.setBounds(100, 100, 251, 306);
		frmSunkumoLygis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSunkumoLygis.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Lengvas", "Vidutinis", "Sunkus", "Insane"}));
		comboBox.setBounds(36, 52, 158, 20);
		frmSunkumoLygis.getContentPane().add(comboBox);
		
		JLabel lblLygis = new JLabel("Lygis");
		lblLygis.setBounds(36, 27, 46, 14);
		frmSunkumoLygis.getContentPane().add(lblLygis);
		
		JLabel lblDmesioNuoSunkumo = new JLabel("D\u0117mesio! Nuo sunkumo lygio ");
		lblDmesioNuoSunkumo.setBounds(36, 99, 183, 20);
		frmSunkumoLygis.getContentPane().add(lblDmesioNuoSunkumo);
		
		JLabel lblPriklausoKuroKiekis = new JLabel("priklauso   kuro kiekis, kulku ");
		lblPriklausoKuroKiekis.setBounds(36, 116, 183, 20);
		frmSunkumoLygis.getContentPane().add(lblPriklausoKuroKiekis);
		
		JLabel lblKiekisIrKai = new JLabel("kiekis ir kaip greitai juda, bei ");
		lblKiekisIrKai.setBounds(36, 133, 183, 20);
		frmSunkumoLygis.getContentPane().add(lblKiekisIrKai);
		
		JLabel lblaudoPrieas = new JLabel("\u0161audo prie\u0161as");
		lblaudoPrieas.setBounds(36, 150, 183, 20);
		frmSunkumoLygis.getContentPane().add(lblaudoPrieas);
		
		JButton btnNewButton = new JButton("Pasirinkti");
		
		if (Pagrindinis.sunkumas.equals("Vidutinis")) { comboBox.setSelectedIndex(1); }
		if (Pagrindinis.sunkumas.equals("Sunkus")) { comboBox.setSelectedIndex(2); }
		if (Pagrindinis.sunkumas.equals("Insane")) { comboBox.setSelectedIndex(3); }
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedIndex() == 0) {
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("sunkumas.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					writer.println("Lengvas, 2000, 4000, 750, 375, 150, 20, 10, 5");
					writer.println("");
					writer.close();
				}
				if (comboBox.getSelectedIndex() == 1) {
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("sunkumas.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					writer.println("Vidutinis, 1500, 3000, 500, 250, 100, 30, 20, 10");
					writer.println("");
					writer.close();
				}
				if (comboBox.getSelectedIndex() == 2) {
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("sunkumas.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					writer.println("Sunkus, 1000, 2000, 250, 125, 25, 40, 25, 10");
					writer.println("");
					writer.close();
				}
				try {
					Priesas.isnaujo();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (comboBox.getSelectedIndex() == 3) {
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("sunkumas.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					writer.println("Insane, 700, 1300, 150, 75, 15, 25, 15, 5");
					writer.println("");
					writer.close();
				}
				try {
					Priesas.isnaujo();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frmSunkumoLygis.dispose();
			}
		});
		btnNewButton.setBounds(36, 211, 158, 23);
		frmSunkumoLygis.getContentPane().add(btnNewButton);
	}
}
