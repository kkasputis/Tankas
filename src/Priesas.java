import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Priesas extends Pagrindinis {
	Pagrindinis p = new Pagrindinis();
	static Random rand = new Random();


	public static void pVaziuok() {
		begalybe = 1;
		priesasgyvas = 1;
		pSaudymas();
		Runnable pjudesys = new Runnable() {

			public void run() {
				randkoordinates();
				while (begalybe >= 1) {
					

					try {
						Thread.sleep(pgreitis);
					} catch (InterruptedException e1) {

						e1.printStackTrace();
					}

					pkrypt = rand.nextInt(4) + 1;
					switch (pkrypt) {
					case 1:
						if (((px > 0) && (((px - 10 <= x - 50) || (px - 10 >= x + 50))
								|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
							px = px - 10;
							priesas.setIcon(new ImageIcon("pv.gif"));
							priesas.setLocation(px, py);
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if ((((px > 0) && (((px - 10 <= x - 50) || (px - 10 >= x + 50)))
									|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
								px = px - 10;
								priesas.setLocation(px, py);
							}
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (((px > 0) && (((px - 10 <= x - 50) || (px - 10 >= x + 50))
									|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
								px = px - 10;
								priesas.setLocation(px, py);

							}
						}
						break;
					case 2:
						if (((px < 250) && (((px + 10 <= x - 50) || (px + 10 >= x + 50))
								|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
							px = px + 10;
							priesas.setIcon(new ImageIcon("pr.gif"));
							priesas.setLocation(px, py);
						}
						try {
							Thread.sleep(400);
						} catch (InterruptedException e5) {
							// TODO Auto-generated catch block
							e5.printStackTrace();
						}
						if (((px < 250) && (((px + 10 <= x - 50) || (px + 10 >= x + 50))
								|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
							px = px + 10;
							priesas.setIcon(new ImageIcon("pr.gif"));
							priesas.setLocation(px, py);
						}
						try {
							Thread.sleep(400);
						} catch (InterruptedException e4) {
							// TODO Auto-generated catch block
							e4.printStackTrace();
						}
						if (((px < 250) && (((px + 10 <= x - 50) || (px + 10 >= x + 50))
								|| ((py <= y - 50) || (py >= y + 50)))) && (begalybe >= 1)) {
							px = px + 10;
							priesas.setIcon(new ImageIcon("pr.gif"));
							priesas.setLocation(px, py);
						}
						break;

					case 3:
						if (((py > 0) && (((px <= x - 50) || (px >= x + 50))
								|| ((py - 10 <= y - 50) || (py - 10 >= y + 50)))) && (begalybe >= 1)) {
							py = py - 10;
							priesas.setIcon(new ImageIcon("ps.gif"));
							priesas.setLocation(px, py);
						}

						try {
							Thread.sleep(400);
						} catch (InterruptedException e3) {
							// TODO Auto-generated catch block
							e3.printStackTrace();
						}
						if (((py > 0) && (((px <= x - 50) || (px >= x + 50))
								|| ((py - 10 <= y - 50) || (py - 10 >= y + 50)))) && (begalybe >= 1)) {
							py = py - 10;

							priesas.setLocation(px, py);
						}
						try {
							Thread.sleep(400);
						} catch (InterruptedException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						if (((py > 0) && (((px <= x - 50) || (px >= x + 50))
								|| ((py - 10 <= y - 50) || (py - 10 >= y + 50))))  && (begalybe >= 1)) {
							py = py - 10;

							priesas.setLocation(px, py);
						}

						break;
					case 4:
						if (((py < 250) && (((px <= x - 50) || (px >= x + 50))
								|| ((py + 10 <= y - 50) || (py + 10 >= y + 50)))) && (begalybe >= 1)) {
							py = py + 10;
							priesas.setIcon(new ImageIcon("pp.gif"));
							priesas.setLocation(px, py);
						}
						try {
							Thread.sleep(400);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if (((py < 250) && (((px <= x - 50) || (px >= x + 50))
								|| ((py + 10 <= y - 50) || (py + 10 >= y + 50)))) && (begalybe >= 1)) {
							py = py + 10;
							priesas.setLocation(px, py);
						}
						try {
							Thread.sleep(400);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (((py < 250) && (((px <= x - 50) || (px >= x + 50))
								|| ((py + 10 <= y - 50) || (py + 10 >= y + 50)))) && (begalybe >= 1)) {
							py = py + 10;
							priesas.setLocation(px, py);
						}
						break;
					}
				}
			}
		};
		Thread jud = new Thread(pjudesys, "Code Executer");
		jud.start();

	}
	
		public static void randkoordinates() {
			px = ((rand.nextInt(25)+1)*10)+5;
			py = ((rand.nextInt(25)+1)*10)+5;
			if ((px > x-50) && (px < x+50) && (py > y-50) && (py < y+50)) { randkoordinates(); }

		}
		public static void sauk() {
			sauti.setEnabled(false);
			kulkaskrenda = 1;
			if (k == 1) {
				kulka.setLocation(x + 24, y);
				kulka.show();
				kulka.setText("|");

				Runnable runner = new Runnable() {
					public void run() {
						int ky = 0;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							ky = ky - 10;
							kulka.setLocation(x + 24, y + ky);
							if ((x+25 > px) && (x-25 < px) && (y+ky == py) && (priesasgyvas != 0)) { 
							kulka.hide();
							priesasgyvas = 0;
							begalybe = 0;
							taskaisk = taskaisk + 1;
							if (sunkumas.equals("Insane")) { taskaisk = taskaisk + 1; }
							taskai.setText(String.valueOf(taskaisk));
							
							priesas.setIcon(new ImageIcon("sprogimas.gif"));

							
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				
							priesas.setIcon(new ImageIcon("ugnis.gif"));
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							pVaziuok();
						
							break;
							}
						}
						sauti.setEnabled(true);
						kulkaskrenda = 0;
						
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
				
			}
			if (k == 2) {
				kulka.setLocation(x + 24, y + 50);
				kulka.show();
				kulka.setText("|");
				Runnable runner = new Runnable() {
					public void run() {
						int ky = 40;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							ky = ky + 10;
							kulka.setLocation(x + 24, y + ky);
							if ((x+25 > px) && (x-25 < px) && (y+ky == py) && (priesasgyvas != 0)) {  
							kulka.hide();
//							jud.stop();
							begalybe = 0;
							
							priesasgyvas = 0;
							taskaisk = taskaisk + 1;
							if (sunkumas.equals("Insane")) { taskaisk = taskaisk + 1; }
							taskai.setText(String.valueOf(taskaisk));
							
							
							priesas.setIcon(new ImageIcon("sprogimas.gif"));
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							priesas.setIcon(new ImageIcon("ugnis.gif"));
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							pVaziuok();
							break;
							}
						}
						sauti.setEnabled(true);
						kulkaskrenda = 0;
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			}
			if (k == 3) {
				kulka.setLocation(x + 24, y);
				kulka.show();
				kulka.setText("_");
				Runnable runner = new Runnable() {
					public void run() {
						int kx = 25;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							kx = kx + 10;
							kulka.setLocation(x + kx, y+11);
							if ((y+25 > py) && (y-25 < py) && (x+kx-5 == px) && (priesasgyvas != 0)) {  
							kulka.hide();

							begalybe = 0;
							priesasgyvas = 0;
							taskaisk = taskaisk + 1;
							if (sunkumas.equals("Insane")) { taskaisk = taskaisk + 1; }
							taskai.setText(String.valueOf(taskaisk));
							
							priesas.setIcon(new ImageIcon("sprogimas.gif"));
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							priesas.setIcon(new ImageIcon("ugnis.gif"));
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							pVaziuok();
							break;
							}
						}
						sauti.setEnabled(true);
						kulkaskrenda = 0;
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			}
			if (k == 4) {
				kulka.setLocation(x + 24, y);
				kulka.show();
				kulka.setText("_");
				Runnable runner = new Runnable() {
					public void run() {
						int kx = 0;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							kx = kx - 10;
							kulka.setLocation(x + kx, y+11);
							if (((y+25 > py) && (y-25 < py) && (x+kx == px)) && (priesasgyvas == 1) && (priesasgyvas != 0)){  
							kulka.hide();

							begalybe = 0;
							taskaisk = taskaisk + 1;
							if (sunkumas.equals("Insane")) { taskaisk = taskaisk + 1; }
							taskai.setText(String.valueOf(taskaisk));
							
							priesasgyvas = 0;
							priesas.setIcon(new ImageIcon("sprogimas.gif"));
							try {
								Thread.sleep(1500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							priesas.setIcon(new ImageIcon("ugnis.gif"));
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							pVaziuok();
							break;
							}
						}
						sauti.setEnabled(true);
						kulkaskrenda = 0;
							
						
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			
			}


		}
		public static void pSauk() {
			
			if (pkrypt == 3) {
				pkulka.setLocation(px + 24, py);
				pkulka.show();
				pkulka.setText("|");

				Runnable runner = new Runnable() {
					public void run() {
						int ky = 0;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							ky = ky - 10;
							pkulka.setLocation(px + 24, py + ky);
							if ((px+25 > x) && (px-25 < x) && (py+ky == y)) { 
								pabaiga();
							break;
							}
						}
					
						
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
				
			}
			if (pkrypt == 4) {
				pkulka.setLocation(px + 24, py + 50);
				pkulka.show();
				pkulka.setText("|");
				Runnable runner = new Runnable() {
					public void run() {
						int ky = 40;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							ky = ky + 10;
							pkulka.setLocation(px + 24, py + ky);
							if ((px+25 > x) && (px-25 < x) && (py+ky == y)) {  
							pkulka.hide();
							pabaiga();
							break;
							}
						}
					
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			}
			if (pkrypt == 2) {
				pkulka.setLocation(px + 24, py);
				pkulka.show();
				pkulka.setText("_");
				Runnable runner = new Runnable() {
					public void run() {
						int kx = 25;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							kx = kx + 10;
							pkulka.setLocation(px + kx, py+11);
							if ((py+25 > y) && (py-25 < y) && (px+kx-5 == x)) {  
							pkulka.hide();
							pabaiga();
							break;
							}
						}
				
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			}
			if (pkrypt == 1) {
				pkulka.setLocation(px + 24, py);
				pkulka.show();
				pkulka.setText("_");
				Runnable runner = new Runnable() {
					public void run() {
						int kx = 0;
						for (int i = 0; i < 27; i++) {
							try {
								Thread.sleep(45);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							kx = kx - 10;
							pkulka.setLocation(px + kx, py+11);
							if ((py+25 > y) && (py-25 < y) && (px+kx == x)) {  
							pkulka.hide();

							pabaiga();
							break;
							}
						}
					
					}

				};
				Thread s = new Thread(runner, "Code Executer");
				s.start();
			
			
			}
			

		}
		
		public static void isnaujo() throws IOException {
			String eilute;
			eilute = Files.readAllLines(Paths.get("sunkumas.txt")).get(0);
			eilute = eilute.replace(" ", "");
			String [] eilute1 = eilute.split(",");
			sunkumas = eilute1[0];
			pgreitis = Integer.valueOf(eilute1[1]);
			psaudymog = Integer.valueOf(eilute1[2]);
			kuras = Integer.valueOf(eilute1[3]);
			kuras1 = Integer.valueOf(eilute1[4]);
			kuras2 = Integer.valueOf(eilute1[5]);
			kulkos = Integer.valueOf(eilute1[6]);
			kulkos1 = Integer.valueOf(eilute1[7]);
			kulkos2 = Integer.valueOf(eilute1[8]);
			x = 125;
			y = 125;
			tankas.setLocation(x,y);
			tankas.setIcon(new ImageIcon("tankass.gif"));
			valdymas.setEnabled(true);
			apacia.setEnabled(true);
			virsu.setEnabled(true);
			kaire.setEnabled(true);
			desine.setEnabled(true);
			sauti.setEnabled(true);
			susinaikinti.setEnabled(true);
			
			kuroBar.setMaximum(kuras);
			kuroBar.setValue(kuras);
			kuroBar.setForeground(SystemColor.textHighlight);
			kulkuBar.setMaximum(kulkos);
			kulkuBar.setValue(kulkos);
			kulkuBar.setForeground(SystemColor.textHighlight);
			baigesiKuras.hide();
			baigesiKulkos.hide();
			
			gameover.hide();
			taskaisk = 0;
			taskai.setText(String.valueOf(taskaisk));
			if (priesasgyvas == 0) {
				priesasgyvas = 1;
				pVaziuok();
			}
			
			
		}
		
		public static void isnaujo2() throws IOException {
			String eilute;
			eilute = Files.readAllLines(Paths.get("sunkumas.txt")).get(0);
			eilute = eilute.replace(" ", "");
			String [] eilute1 = eilute.split(",");

			sunkumas = eilute1[0];
			pgreitis = Integer.valueOf(eilute1[1]);
			psaudymog = Integer.valueOf(eilute1[2]);
			kuras = Integer.valueOf(eilute1[3]);
			kuras1 = Integer.valueOf(eilute1[4]);
			kuras2 = Integer.valueOf(eilute1[5]);
			kulkos = Integer.valueOf(eilute1[6]);
			kulkos1 = Integer.valueOf(eilute1[7]);
			kulkos2 = Integer.valueOf(eilute1[8]);

			kuroBar.setMaximum(kuras);
			kuroBar.setValue(kuras);
			kulkuBar.setMaximum(kulkos);
			kulkuBar.setValue(kulkos);


			
			
		}
		
		
		public static void kairen() {
			if (kuras > 0) {
			if ((x > 0) && (((px <= x-60) || (px >= x+40)) || ((py <= y-50) || (py >= y+50)))) {
			x = x - 10;
			k = 4;
			tankas.setIcon(new ImageIcon("tankasv.gif"));
			tankas.setLocation(x, y);

			}
			else { 
				k = 4;
				tankas.setIcon(new ImageIcon("tankasv.gif"));
			}
			kuras = kuras - 1;
			kuroBar.setValue(kuras);
			if ((kuras < kuras1) && (kuras >kuras2)) {
				kuroBar.setForeground(Color.BLUE);
				
			}
			if (kuras < kuras2) {
				kuroBar.setForeground(Color.RED);
			}
			if (kuras == 0) {
				baigesiKuras.show();
				baigesiKuras.setIcon(new ImageIcon("kuras.gif"));
			}
			}
		}
		public static void desinen() {
			if (kuras >0) {
			if ((x < 250) && (((px <= x-40) || (px >= x+60)) || ((py <= y-50) || (py >= y+50)))) {
			x = x + 10;
			k = 3;
			tankas.setIcon(new ImageIcon("tankasr.gif"));
			tankas.setLocation(x, y);
			}
			else {
				k = 3;
				tankas.setIcon(new ImageIcon("tankasr.gif"));
			}
			kuras = kuras - 1;
			kuroBar.setValue(kuras);
			if ((kuras < kuras1) && (kuras >kuras2)) {
				kuroBar.setForeground(Color.BLUE);
				
			}
			if (kuras < kuras2) {
				kuroBar.setForeground(Color.RED);
			}
			if (kuras == 0) {
				baigesiKuras.show();
				baigesiKuras.setIcon(new ImageIcon("kuras.gif"));
			}
			}
		}
		public static void virsun() {
			if (kuras > 0) {
			if ((y > 0) && (((px <= x-50) || (px >= x+50)) || ((py <= y-60) || (py >= y+40)))) {
				y = y - 10;
				k = 1;
			tankas.setIcon(new ImageIcon("tankass.gif"));
			tankas.setLocation(x, y);
			}
			else { 
 				k = 1;
				tankas.setIcon(new ImageIcon("tankass.gif"));
			}
			kuras = kuras - 1;
			kuroBar.setValue(kuras);

			if ((kuras < kuras1) && (kuras > kuras2)) {
				kuroBar.setForeground(Color.BLUE);
				
			}
			if (kuras < kuras2) {
				kuroBar.setForeground(Color.RED);
			}
			if (kuras == 0) {
				baigesiKuras.show();
				baigesiKuras.setIcon(new ImageIcon("kuras.gif"));
			}

			}
		}
		public static void zemyn() {
			if (kuras > 0) {
			if ((y < 250) && (((px <= x-50) || (px >= x+50)) || ((py <= y-40) || (py >= y+60)))) {
			y = y + 10;
			k = 2;
			tankas.setIcon(new ImageIcon("tankasp.gif"));
			tankas.setLocation(x, y);
			}
			else {
				k = 2;
				tankas.setIcon(new ImageIcon("tankasp.gif"));
			}
			kuras = kuras - 1;
			kuroBar.setValue(kuras);
			if ((kuras < kuras1) && (kuras >kuras2)) {
				kuroBar.setForeground(Color.BLUE);
				
			}
			if (kuras < kuras2) {
				kuroBar.setForeground(Color.RED);
			}
			if (kuras == 0) {
				baigesiKuras.show();
				baigesiKuras.setIcon(new ImageIcon("kuras.gif"));
			}
			}
		}
		
		public static void pabaiga() {
			
			gameover.setIcon(new ImageIcon("go.gif"));
			gameover.show();
			tankas.setIcon(new ImageIcon("sprogimas.gif"));
			apacia.setEnabled(false);
			virsu.setEnabled(false);
			kaire.setEnabled(false);
			desine.setEnabled(false);
			sauti.setEnabled(false);
			susinaikinti.setEnabled(false);
			valdymas.setEnabled(false);
			x = 1000;
			y = 1000;
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			tankas.setIcon(new ImageIcon("ugnis.gif"));
			try {
				tikrinkRekorda();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void pSaudymas() {
			Runnable saudymas = new Runnable() {

				public void run() {
				
					while (begalybe >= 1) {
						

						try {
							Thread.sleep(psaudymog);
						} catch (InterruptedException e1) {

							e1.printStackTrace();
						}
						if (begalybe >= 1) { pSauk(); }
		}
				}
			};
			Thread sau = new Thread(saudymas, "Code Executer");
			sau.start();
		}
		public  static void tikrinkRekorda() throws IOException {
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
			if (Integer.valueOf(eilute3[0]) < taskaisk) {
				if (Integer.valueOf(eilute2[0]) < taskaisk) {
					if (Integer.valueOf(eilute1[0]) < taskaisk) {
						
						PrintWriter writer = new PrintWriter("rekordai.txt");

					
						String vardas = JOptionPane.showInputDialog("Rekordas!!!","Ivesk varda");
						writer.println(taskaisk + ", " + vardas + ", " + kulkos + ", " + kuras + ", " + sunkumas);
						writer.println(eilute1[0] + "," + eilute1[1] + ", " + eilute1[2] + ", " + eilute1[3] + ", " + eilute1[4]);
						writer.println(eilute2[0] + "," + eilute2[1] + ", " + eilute2[2] + ", " + eilute2[3] + ", " + eilute2[4]);
						writer.println("");
						writer.close();
					

					}
					else {
						PrintWriter writer = new PrintWriter("rekordai.txt");
						String vardas = JOptionPane.showInputDialog("Rekordas!!!","Ivesk varda");

						writer.println(eilute1[0] + "," + eilute1[1] + ", " + eilute1[2] + ", " + eilute1[3] + ", " + eilute1[4]);
						writer.println(taskaisk + ", " + vardas + ", " + kulkos + ", " + kuras + ", " + sunkumas + ", " + sunkumas);
						writer.println(eilute2[0] + "," + eilute2[1] + ", " + eilute2[2] + ", " + eilute2[3] + ", " + eilute2[4]);
						writer.println("");
						writer.close();
					}
					
				}
				else {
					PrintWriter writer = new PrintWriter("rekordai.txt");
					String vardas = JOptionPane.showInputDialog("Rekordas!!!","Ivesk varda");

					writer.println(eilute1[0] + "," + eilute1[1] + ", " + eilute1[2] + ", " + eilute1[3] + ", " + eilute1[4]);
					writer.println(eilute2[0] + "," + eilute2[1] + ", " + eilute2[2] + ", " + eilute2[3] + ", " + eilute2[4]);
					writer.println(taskaisk + ", " + vardas + ", " + kulkos + ", " + kuras + ", " + sunkumas);
					writer.println("");
					writer.close();
				}
				Rekordai.pagrindinis();
				
			}
	
					
			
		}
}
