import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Pagrindinis {

	private JFrame frmTankai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagrindinis window = new Pagrindinis();
					window.frmTankai.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pagrindinis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static JLabel priesas;
	static int x = 125;
	static int y = 125;
	static int k = 1;
	static int px;
	static int py;
	static int pkrypt = 0;
	static int begalybe = 1;
	static int kuras = 500;
	static int kuras1 = 250;
	static int kuras2 = 100;
	static int kulkos = 30;
	static int kulkos1 = 20;
	static int kulkos2 = 10;
	static int priesasgyvas = 1;
	static int taskaisk = 0;
	static JLabel pkulka;
	static String sunkumas = "Lengvas";
	static JLabel gameover;
	static JButton sauti;
	static JLabel kulka;
	static int pgreitis = 1500;
	static int psaudymog = 4000;
	static int kulkaskrenda = 0;
	
	static JLabel taskai;
	static JLabel tankas;
	static JButton apacia;
	static JButton virsu;
	static JButton desine;
	static JButton kaire;
	static JProgressBar kulkuBar;
	static JLabel baigesiKulkos;
	static JLabel baigesiKuras;
	private JMenu mnSunkumoLygis;
	private JMenuItem mntmRekordai;
	private JMenuItem mntmSunkumoLygis;
	private JMenuItem mntmINaujo;
	static JProgressBar kuroBar;
	static JButton susinaikinti;
	static JButton valdymas;

	private void initialize() {
		
		
		
		
		
		if (Files.notExists(Paths.get("rekordai.txt"))) {
			try {
				Files.createFile(Paths.get("rekordai.txt"));
				PrintWriter writer = new PrintWriter("rekordai.txt");
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("00, NoName, 00, 000, Lengvas");
				writer.println("");
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (Files.notExists(Paths.get("sunkumas.txt"))) {
			try {
				Files.createFile(Paths.get("sunkumas.txt"));
				PrintWriter writer = new PrintWriter("sunkumas.txt");
				writer.println("Vidutinis, 1500, 4000, 500, 250, 100, 30, 20, 10");
				writer.println("");
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		Random rand = new Random();
		px = ((rand.nextInt(25)+1)*10)+5;
		py = ((rand.nextInt(25)+1)*10)+5;
		if ((px > x-50) && (px < x+50) && (py > y-50) && (py < y+50)) { px = px + 50; py = py +50; }
		frmTankai = new JFrame();

		frmTankai.setTitle("Tankai!");


		frmTankai.setBounds(100, 100, 563, 450);
		frmTankai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTankai.getContentPane().setLayout(null);
		
		
//        AbstractAction buttonPressed = new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(e.getActionCommand());
//            }
//        };

		Priesas.pVaziuok();
		Priesas.pSaudymas();
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(21, 66, 300, 300);
		frmTankai.getContentPane().add(panel);
		panel.setLayout(null);
		
		gameover = new JLabel("Tave sunaikino");
		gameover.setFont(new Font("Tahoma", Font.PLAIN, 27));
		gameover.setHorizontalAlignment(SwingConstants.CENTER);
		gameover.setBounds(27, 50, 263, 186);
		panel.add(gameover);
		
		tankas = new JLabel("");
		tankas.setBounds(125, 125, 50, 50);
		panel.add(tankas);
		tankas.setIcon(new ImageIcon("tankass.gif"));
		
		kulka = new JLabel("|");
		kulka.setBounds(129, 113, 10, 14);
		panel.add(kulka);
		
		priesas = new JLabel("");
		priesas.setIcon(new ImageIcon("ps.gif"));
		priesas.setBounds(76, 51, 50, 50);
		panel.add(priesas);
		kulka.hide();
		priesas.setLocation(px,py);
		
		
		pkulka = new JLabel("|");
		pkulka.setBounds(129, 178, 10, 14);
		panel.add(pkulka);
		pkulka.hide();
		gameover.hide();
		
		JLabel fonas = new JLabel("");
		fonas.setBounds(2, 2, 296, 296);
		panel.add(fonas);
		fonas.setIcon(new ImageIcon("fonas.png"));
		
		
		kuroBar = new JProgressBar();
		kuroBar.setForeground(SystemColor.textHighlight);
		kuroBar.setMaximum(kuras);
		kuroBar.setBounds(347, 208, 180, 14);
		frmTankai.getContentPane().add(kuroBar);
		
		JLabel lblKuroLikutis = new JLabel("Kuro likutis:");
		lblKuroLikutis.setBounds(403, 183, 69, 14);
		frmTankai.getContentPane().add(lblKuroLikutis);
		
		kulkuBar = new JProgressBar();
		kulkuBar.setForeground(SystemColor.textHighlight);
		
		kulkuBar.setMaximum(kulkos);
		kulkuBar.setBounds(347, 134, 180, 14);
		frmTankai.getContentPane().add(kulkuBar);
		
		JLabel lblKulkuLikutis = new JLabel("Kulk\u0173 likutis:");
		lblKulkuLikutis.setBounds(403, 108, 97, 14);
		frmTankai.getContentPane().add(lblKulkuLikutis);

		




		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(1, 0, 97, 21);

		
		virsu = new JButton("New button");
		virsu.setIcon(new ImageIcon("virsu.png"));
		virsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Priesas.virsun();
			}
		});
		virsu.setBounds(417, 309, 40, 40);
		frmTankai.getContentPane().add(virsu);
		
		
		
		
		

		
		
		
		
		apacia = new JButton("New button");
		apacia.setIcon(new ImageIcon("apacia.png"));
		apacia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Priesas.zemyn();
			}
		});
		apacia.setBounds(417, 360, 40, 40);
		frmTankai.getContentPane().add(apacia);
		
		desine = new JButton(">");
		desine.setIcon(new ImageIcon("desine.png"));
//		desine.addKeyListener(buttonPressed);
		desine.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
        put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,0), "A_pressed");
//		desine.getActionMap().put("A_pressed", buttonPressed);
		
		
		
		
		
		
		
		desine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Priesas.desinen();
			}
		});
		desine.setBounds(467, 360, 40, 40);

		frmTankai.getContentPane().add(desine);
		
		kaire = new JButton("");
		kaire.setIcon(new ImageIcon("kaire.png"));


		kaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
Priesas.kairen();
			}
		});
		kaire.setBounds(367, 360, 40, 40);
		frmTankai.getContentPane().add(kaire);
		
		
		
		sauti = new JButton("Sauti");
		sauti.setBounds(21, 377, 300, 23);
		frmTankai.getContentPane().add(sauti);
		
		JLabel lblTakai = new JLabel("Ta\u0161kai:");
		lblTakai.setBounds(403, 54, 46, 14);
		frmTankai.getContentPane().add(lblTakai);
		
		taskai = new JLabel("0");
		taskai.setFont(new Font("Tahoma", Font.BOLD, 17));
		taskai.setBounds(452, 53, 46, 14);
		frmTankai.getContentPane().add(taskai);
		
		baigesiKulkos = new JLabel("");
		baigesiKulkos.setBounds(391, 151, 100, 20);
		frmTankai.getContentPane().add(baigesiKulkos);
		
		baigesiKuras = new JLabel("");
		baigesiKuras.setBounds(391, 227, 100, 20);
		frmTankai.getContentPane().add(baigesiKuras);
		
		kulkuBar.setValue(kulkos);
		kuroBar.setValue(kuras);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(1, 0, 60, 21);
		frmTankai.getContentPane().add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("Tankai");
		menuBar_1.add(mnNewMenu);
		
		mntmSunkumoLygis = new JMenuItem("Sunkumo Lygis");
		mntmSunkumoLygis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sunkumas.sunkumas();
			}
		});
		mnNewMenu.add(mntmSunkumoLygis);
		
		mntmRekordai = new JMenuItem("Rekordai");
		mntmRekordai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rekordai.pagrindinis();
			}
		});
		mnNewMenu.add(mntmRekordai);
		
		mntmINaujo = new JMenuItem("I\u0161 naujo");
		mntmINaujo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Priesas.isnaujo();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Priesas.randkoordinates();
				priesas.setLocation(px, py);
				
			}
		});
		mnNewMenu.add(mntmINaujo);
		
		JMenuItem mntmIeiti = new JMenuItem("I\u0161eiti");
		mntmIeiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmIeiti);
		
		susinaikinti = new JButton("Susinaikinti");
		susinaikinti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Priesas.pabaiga();
			}
		});
		susinaikinti.setForeground(Color.RED);
		susinaikinti.setBounds(429, 11, 108, 23);
		frmTankai.getContentPane().add(susinaikinti);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("logo.png"));
		lblNewLabel.setBounds(71, 15, 300, 40);
		frmTankai.getContentPane().add(lblNewLabel);
		
		valdymas = new JButton("New button");
		valdymas.setBounds(-2000, -2000, 89, 23);
		frmTankai.getContentPane().add(valdymas);
		

		
		valdymas.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	        }

	        public void keyPressed(KeyEvent e) {
	        	if (e.getKeyCode() == 37) { Priesas.kairen(); }
	        	if (e.getKeyCode() == 40) { Priesas.zemyn(); }
	        	if (e.getKeyCode() == 39) { Priesas.desinen(); }
	        	if (e.getKeyCode() == 38) { Priesas.virsun(); }
	        	if ((e.getKeyCode() == 32) && (kulkaskrenda == 0)) { 
					if (kulkos > 0)  { Priesas.sauk(); }
					kulkos = kulkos -1;
					kulkuBar.setValue(kulkos);
					if (kulkos == kulkos1) {
						kulkuBar.setForeground(Color.BLUE);
					}
					if (kulkos <= kulkos2) { 
						kulkuBar.setForeground(Color.RED);
					}
					
					if (kulkos == 0) {
						baigesiKulkos.show();
						baigesiKulkos.setIcon(new ImageIcon("kulkos.gif"));
					}
	        	}
//	            System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
	        }

	        @Override
	        public void keyReleased(KeyEvent e) {
	        }
	    });		
		
		
		sauti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (kulkos > 0)  { Priesas.sauk(); }
				kulkos = kulkos -1;
				kulkuBar.setValue(kulkos);
				if (kulkos == kulkos1) {
					kulkuBar.setForeground(Color.BLUE);
				}
				if (kulkos <= kulkos2) { 
					kulkuBar.setForeground(Color.RED);
				}
				
				if (kulkos == 0) {
					baigesiKulkos.show();
					baigesiKulkos.setIcon(new ImageIcon("kulkos.gif"));
				}
				
			}
		});
		try {
			Priesas.isnaujo2();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
