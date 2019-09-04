import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rekordai {

	private JFrame frmRekordai;

	/**
	 * Launch the application.
	 */
	public static void pagrindinis() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rekordai window = new Rekordai();
					window.frmRekordai.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Rekordai() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frmRekordai = new JFrame();
		frmRekordai.setTitle("Rekordai");
		frmRekordai.setBounds(100, 100, 515, 230);
		frmRekordai.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRekordai.getContentPane().setLayout(null);
		
		JLabel lblVieta = new JLabel("Vieta");
		lblVieta.setBounds(34, 24, 46, 14);
		frmRekordai.getContentPane().add(lblVieta);
		
		JLabel lblTaskai = new JLabel("Taskai");
		lblTaskai.setBounds(167, 24, 46, 14);
		frmRekordai.getContentPane().add(lblTaskai);
		
		JLabel lblKulkuLikutis = new JLabel("Kulku likutis");
		lblKulkuLikutis.setBounds(223, 24, 79, 14);
		frmRekordai.getContentPane().add(lblKulkuLikutis);
		
		JLabel lblKuroLikutis = new JLabel("Kuro likutis");
		lblKuroLikutis.setBounds(312, 24, 79, 14);
		frmRekordai.getContentPane().add(lblKuroLikutis);
		
		JLabel lblSunkumoLygis = new JLabel("Sunkumo lygis");
		lblSunkumoLygis.setBounds(400, 24, 99, 14);
		frmRekordai.getContentPane().add(lblSunkumoLygis);
		
		JLabel label = new JLabel("1.");
		label.setBounds(34, 49, 22, 14);
		frmRekordai.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setBounds(34, 74, 22, 14);
		frmRekordai.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setBounds(34, 99, 22, 14);
		frmRekordai.getContentPane().add(label_2);
		
		JLabel lblVardas = new JLabel("Vardas");
		lblVardas.setBounds(76, 24, 52, 14);
		frmRekordai.getContentPane().add(lblVardas);
		
		JLabel vardas1 = new JLabel("Kipras");
		vardas1.setBounds(76, 49, 81, 14);
		frmRekordai.getContentPane().add(vardas1);
		
		JLabel taskai1 = new JLabel("New label");
		taskai1.setBounds(167, 49, 46, 14);
		frmRekordai.getContentPane().add(taskai1);
		
		JLabel kuro1 = new JLabel("New label");
		kuro1.setBounds(312, 49, 46, 14);
		frmRekordai.getContentPane().add(kuro1);
		
		JLabel kulku1 = new JLabel("New label");
		kulku1.setBounds(223, 49, 58, 14);
		frmRekordai.getContentPane().add(kulku1);
		
		JLabel sunkumas1 = new JLabel("New label");
		sunkumas1.setBounds(400, 49, 69, 14);
		frmRekordai.getContentPane().add(sunkumas1);
		
		JLabel vardas2 = new JLabel("New label");
		vardas2.setBounds(76, 74, 81, 14);
		frmRekordai.getContentPane().add(vardas2);
		
		JLabel vardas3 = new JLabel("New label");
		vardas3.setBounds(76, 99, 81, 14);
		frmRekordai.getContentPane().add(vardas3);
		
		JLabel taskai2 = new JLabel("New label");
		taskai2.setBounds(167, 74, 46, 14);
		frmRekordai.getContentPane().add(taskai2);
		
		JLabel taskai3 = new JLabel("New label");
		taskai3.setBounds(167, 99, 46, 14);
		frmRekordai.getContentPane().add(taskai3);
		
		JLabel kulku2 = new JLabel("New label");
		kulku2.setBounds(223, 74, 58, 14);
		frmRekordai.getContentPane().add(kulku2);
		
		JLabel kulku3 = new JLabel("New label");
		kulku3.setBounds(223, 99, 58, 14);
		frmRekordai.getContentPane().add(kulku3);
		
		JLabel kuro2 = new JLabel("New label");
		kuro2.setBounds(312, 74, 46, 14);
		frmRekordai.getContentPane().add(kuro2);
		
		JLabel kuro3 = new JLabel("New label");
		kuro3.setBounds(312, 99, 46, 14);
		frmRekordai.getContentPane().add(kuro3);
		
		JLabel sunkumas2 = new JLabel("New label");
		sunkumas2.setBounds(400, 74, 69, 14);
		frmRekordai.getContentPane().add(sunkumas2);
		
		JLabel sunkumas3 = new JLabel("New label");
		sunkumas3.setBounds(400, 99, 69, 14);
		frmRekordai.getContentPane().add(sunkumas3);
		
		String eilute;
		eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(0);
		eilute = eilute.replace(" ", "");
		String [] eilute1 = eilute.split(",");
	
		eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(1);
		eilute = eilute.replace(" ", "");
		String [] eilute2 = eilute.split(",");

		eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(2);
		eilute = eilute.replace(" ", "");
		String [] eilute3 = eilute.split(",");
		
		vardas1.setText(eilute1[1]);
		vardas2.setText(eilute2[1]);
		vardas3.setText(eilute3[1]);
		taskai1.setText(eilute1[0]);
		taskai2.setText(eilute2[0]);
		taskai3.setText(eilute3[0]);
		kulku1.setText(eilute1[2]);
		kulku2.setText(eilute2[2]);
		kulku3.setText(eilute3[2]);
		kuro1.setText(eilute1[3]);
		kuro2.setText(eilute2[3]);
		kuro3.setText(eilute3[3]);
		sunkumas1.setText(eilute1[4]);
		sunkumas2.setText(eilute2[4]);
		sunkumas3.setText(eilute3[4]);
		
		JButton btnUdaryti = new JButton("U\u017Edaryti");
		btnUdaryti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(JFrame.DISPOSE_ON_CLOSE);
				frmRekordai.dispose();
			}
		});
		btnUdaryti.setBounds(370, 158, 89, 23);
		frmRekordai.getContentPane().add(btnUdaryti);
		
		JButton btnAnuliuoti = new JButton("Anuliuoti");
		btnAnuliuoti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PrintWriter writer = null;
				try {
					writer = new PrintWriter("rekordai.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("");
				writer.close();
				vardas1.setText(eilute1[1]);
				vardas2.setText(eilute2[1]);
				vardas3.setText(eilute3[1]);
				taskai1.setText(eilute1[0]);
				taskai2.setText(eilute2[0]);
				taskai3.setText(eilute3[0]);
				kulku1.setText(eilute1[2]);
				kulku2.setText(eilute2[2]);
				kulku3.setText(eilute3[2]);
				kuro1.setText(eilute1[3]);
				kuro2.setText(eilute2[3]);
				kuro3.setText(eilute3[3]);
				sunkumas1.setText(eilute1[4]);
				sunkumas2.setText(eilute2[4]);
				sunkumas3.setText(eilute3[4]);
				
				
				String eilute = null;
				try {
					eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(0);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				eilute = eilute.replace(" ", "");
				String [] eilute1 = eilute.split(",");
			
				try {
					eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				eilute = eilute.replace(" ", "");
				String [] eilute2 = eilute.split(",");

				try {
					eilute = Files.readAllLines(Paths.get("rekordai.txt")).get(2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				eilute = eilute.replace(" ", "");
				String [] eilute3 = eilute.split(",");
				
				vardas1.setText(eilute1[1]);
				vardas2.setText(eilute2[1]);
				vardas3.setText(eilute3[1]);
				taskai1.setText(eilute1[0]);
				taskai2.setText(eilute2[0]);
				taskai3.setText(eilute3[0]);
				kulku1.setText(eilute1[2]);
				kulku2.setText(eilute2[2]);
				kulku3.setText(eilute3[2]);
				kuro1.setText(eilute1[3]);
				kuro2.setText(eilute2[3]);
				kuro3.setText(eilute3[3]);
				sunkumas1.setText(eilute1[4]);
				sunkumas2.setText(eilute2[4]);
				sunkumas3.setText(eilute3[4]);
			}
		});
		btnAnuliuoti.setBounds(34, 158, 89, 23);
		frmRekordai.getContentPane().add(btnAnuliuoti);
	}

}
