package barJEGO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.SpringLayout;

import java.awt.CardLayout;

import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JProgressBar;
import javax.swing.Box;

public class Interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		Partida.getPartida();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interface.class.getResource("zerue.png").getFile()));
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interface.class.getResource("ostike.png").getFile()));
		contentPane.add(label, BorderLayout.EAST);
		//panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{label_1, lblKartalekua_1, lblKartalekua_2, lblKartalekua_3, lblKartalekua}));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		int help;
		JLabel lblDenbora = new JLabel("");
		lblDenbora.setIcon(new ImageIcon(Interface.class.getResource("zureTX.png").getFile()));
		panel_2.add(lblDenbora);
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox, BorderLayout.CENTER);
		
		Component glue = Box.createGlue();
		horizontalBox.add(glue);
		
		JLabel lekua = new JLabel(Partida.getPartida().getTablerokoKartaIzena(0));
		//lblOla.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		lekua.addMouseListener(new java.awt.event.MouseAdapter()
	    {
	        public void mouseEntered(java.awt.event.MouseEvent evt)
	        {
	        	lekua.setText(Partida.getPartida().getTablerokoKartaIzena(0));
	        	lekua.repaint();
	        }
	    });
		horizontalBox.add(lekua);
		
		Component glue_1 = Box.createGlue();
		horizontalBox.add(glue_1);
		
		JLabel lekua1 = new JLabel(Partida.getPartida().getTablerokoKartaIzena(1));
		lekua1.setIcon(new ImageIcon(Interface.class.getResource("proba.png").getFile()));
		horizontalBox.add(lekua1);
		
		Component glue_2 = Box.createGlue();
		horizontalBox.add(glue_2);
		
		JLabel lekua2 = new JLabel(Partida.getPartida().getTablerokoKartaIzena(2));
		lekua2.setIcon(new ImageIcon(Interface.class.getResource("proba.png").getFile()));
		horizontalBox.add(lekua2);
		
		Component glue_3 = Box.createGlue();
		horizontalBox.add(glue_3);
		
		JLabel lekua3 = new JLabel(Partida.getPartida().getTablerokoKartaIzena(3));
		lekua3.setIcon(new ImageIcon(Interface.class.getResource("proba.png").getFile()));
		horizontalBox.add(lekua3);
		
		Component glue_4 = Box.createGlue();
		horizontalBox.add(glue_4);
		
		JLabel lekua4 = new JLabel(Partida.getPartida().getTablerokoKartaIzena(4));
		lekua4.setIcon(new ImageIcon(Interface.class.getResource("proba.png").getFile()));
		horizontalBox.add(lekua4);
		//eskuko kartak jartzeko
		Component glue_5 = Box.createGlue();
		horizontalBox.add(glue_5);
		JButton btnKarta = new JButton(Partida.getPartida().getEskKartIz(0));
		//btnKarta.setIcon(new ImageIcon(Interface.class.getResource(Partida.getPartida().getJok().getEskua().getKartaIzena(0)+".png").getFile()));
		if(Partida.getPartida().txanda) {
			btnKarta.addMouseListener(new java.awt.event.MouseAdapter()
		    {
		        public void mouseClicked(java.awt.event.MouseEvent evt)
		        {
		        	JLabel lblXKartaGeratzen = new JLabel(Partida.getPartida().getMazoarenTamaina(true)+" karta geratzen dira");
		    		lblXKartaGeratzen.repaint();
		            Partida.getPartida().ipiniTableroan(0);
		            btnKarta.setVisible(false);
		            btnKarta.repaint();
					//btnKarta1.repaint();
					//btnKarta2.repaint();
					//btnKarta3.repaint();
					
					lekua.repaint();
					lekua.setText(Partida.getPartida().getTablerokoKartaIzena(0));
					lekua1.repaint();
					lekua1.setText(Partida.getPartida().getTablerokoKartaIzena(1));
					lekua2.repaint();
					lekua2.setText(Partida.getPartida().getTablerokoKartaIzena(2));
					lekua3.repaint();
					lekua3.setText(Partida.getPartida().getTablerokoKartaIzena(3));
					lekua4.repaint();
					lekua4.setText(Partida.getPartida().getTablerokoKartaIzena(4));
		            System.out.println("Karta sartu da");
		            contentPane.repaint();
		        }
		    });
		}
		panel.add(btnKarta);
		
		JButton btnKarta1 = new JButton(Partida.getPartida().getEskKartIz(1));
		//btnKarta_1.setIcon(new ImageIcon(Interface.class.getResource(Partida.getPartida().getJok().getEskua().getKartaIzena(1)+".png").getFile()));
		if(Partida.getPartida().txanda) {
			btnKarta1.addMouseListener(new java.awt.event.MouseAdapter()
		    {
		        public void mouseClicked(java.awt.event.MouseEvent evt)
		        {
		        	JLabel lblXKartaGeratzen = new JLabel(Partida.getPartida().getMazoarenTamaina(true)+" karta geratzen dira");
		    		lblXKartaGeratzen.repaint();
		            Partida.getPartida().ipiniTableroan(1);
		            btnKarta1.setVisible(false);
		            btnKarta.repaint();
					btnKarta1.repaint();
					//btnKarta2.repaint();
					//btnKarta3.repaint();
					
					lekua.repaint();
					lekua.setText(Partida.getPartida().getTablerokoKartaIzena(0));
					lekua1.repaint();
					lekua1.setText(Partida.getPartida().getTablerokoKartaIzena(1));
					lekua2.repaint();
					lekua2.setText(Partida.getPartida().getTablerokoKartaIzena(2));
					lekua3.repaint();
					lekua3.setText(Partida.getPartida().getTablerokoKartaIzena(3));
					lekua4.repaint();
					lekua4.setText(Partida.getPartida().getTablerokoKartaIzena(4));
		            System.out.println("Karta sartu da");
		            contentPane.repaint();
		        }
		    });
		}
		panel.add(btnKarta1);
		
		JButton btnKarta2 = new JButton(Partida.getPartida().getEskKartIz(2));
		//btnKarta_2.setIcon(new ImageIcon(Interface.class.getResource(Partida.getPartida().getJok().getEskua().getKartaIzena(2)+".png").getFile()));
		if(Partida.getPartida().txanda) {
			btnKarta2.addMouseListener(new java.awt.event.MouseAdapter()
		    {
		        public void mouseClicked(java.awt.event.MouseEvent evt)
		        {
		        	
		            Partida.getPartida().ipiniTableroan(2);
		            JLabel lblXKartaGeratzen = new JLabel(Partida.getPartida().getMazoarenTamaina(true)+" karta geratzen dira");
		        	int help=Partida.getPartida().getMazoarenTamaina(true);
		    		lblXKartaGeratzen.repaint();
		            btnKarta2.setVisible(false);
		            btnKarta.repaint();
					btnKarta1.repaint();
					btnKarta2.repaint();
					
					
					//btnKarta3.repaint(); Porque razon da esto error?
					
					lekua.repaint();
					lekua.setText(Partida.getPartida().getTablerokoKartaIzena(0));
					lekua1.repaint();
					lekua1.setText(Partida.getPartida().getTablerokoKartaIzena(1));
					lekua2.repaint();
					lekua2.setText(Partida.getPartida().getTablerokoKartaIzena(2));
					lekua3.repaint();
					lekua3.setText(Partida.getPartida().getTablerokoKartaIzena(3));
					lekua4.repaint();
					lekua4.setText(Partida.getPartida().getTablerokoKartaIzena(4));
		            System.out.println("Karta sartu da");
		            contentPane.repaint();
		        }
		    });
		}
		
		panel.add(btnKarta2);
		
		JButton btnKarta3 = new JButton(Partida.getPartida().getEskKartIz(3));
		//btnKarta_3.setIcon(new ImageIcon(Interface.class.getResource(Partida.getPartida().getJok().getEskua().getKartaIzena(3)+".png").getFile()));
		if(Partida.getPartida().txanda) {
			btnKarta3.addMouseListener(new java.awt.event.MouseAdapter()
		    {
		        public void mouseClicked(java.awt.event.MouseEvent evt)
		        {
		        	
		        	
		    		
		            Partida.getPartida().ipiniTableroan(3);
		            btnKarta3.setVisible(false);
		       
		            btnKarta.repaint();
					btnKarta1.repaint();
					btnKarta2.repaint();
		            btnKarta3.repaint();
					
					lekua.repaint();
					lekua.setText(Partida.getPartida().getTablerokoKartaIzena(0));
					lekua1.repaint();
					lekua1.setText(Partida.getPartida().getTablerokoKartaIzena(1));
					lekua2.repaint();
					lekua2.setText(Partida.getPartida().getTablerokoKartaIzena(2));
					lekua3.repaint();
					lekua3.setText(Partida.getPartida().getTablerokoKartaIzena(3));
					lekua4.repaint();
					lekua4.setText(Partida.getPartida().getTablerokoKartaIzena(4));
		            System.out.println("Karta sartu da");
		            contentPane.repaint();
		        }
		    });
		}
		panel.add(btnKarta3);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JLabel lblXKartaGeratzen = new JLabel(Partida.getPartida().getMazoarenTamaina(true)+" karta geratzen dira");
		
		verticalBox.add(lblXKartaGeratzen);
		
		JLabel lblEwaterwa = new JLabel("");
		lblEwaterwa.setIcon(new ImageIcon(Interface.class.getResource("mazo.png").getFile()));
		verticalBox.add(lblEwaterwa);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_1);
		
	}
	


	
}
