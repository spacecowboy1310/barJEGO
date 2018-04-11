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

public class proba1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proba1 frame = new proba1();
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
	public proba1() {
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
		
		JButton btnKarta = new JButton(Partida.getPartida().getEskKartIz(0));
		btnKarta.setIcon(new ImageIcon(proba1.class.getResource(Partida.getPartida().getEskKartIz(0)+".png").getFile()));
		btnKarta.addMouseListener(new java.awt.event.MouseAdapter()
	    {
	        public void mouseClicked(java.awt.event.MouseEvent evt)
	        {
	            Partida.getPartida().getEskKartIz(0);
	            btnKarta.setVisible(false);
	            System.out.println("Karta sartu da");
	            contentPane.repaint();
	        }
	    });
		panel.add(btnKarta);
		
		JButton btnKarta_1 = new JButton(Partida.getPartida().getEskKartIz(1));
		btnKarta_1.setIcon(new ImageIcon(proba1.class.getResource(Partida.getPartida().getEskKartIz(1)+".png").getFile()));
		panel.add(btnKarta_1);
		
		JButton btnKarta_2 = new JButton(Partida.getPartida().getEskKartIz(2));
		btnKarta_2.setIcon(new ImageIcon(proba1.class.getResource(Partida.getPartida().getEskKartIz(2)+".png").getFile()));
		panel.add(btnKarta_2);
		
		JButton btnKarta_3 = new JButton(Partida.getPartida().getEskKartIz(3));
		btnKarta_3.setIcon(new ImageIcon(proba1.class.getResource(Partida.getPartida().getEskKartIz(3)+".png").getFile()));
		panel.add(btnKarta_3);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JLabel lblXKartaGeratzen = new JLabel(Partida.getPartida().getMazoarenTamaina(true)+ " karta geratzen zaizkizu");
		verticalBox.add(lblXKartaGeratzen);
		
		JLabel lblEwaterwa = new JLabel("");
		lblEwaterwa.setIcon(new ImageIcon(proba1.class.getResource("mazo.png").getFile()));
		verticalBox.add(lblEwaterwa);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(proba1.class.getResource("zerue.png").getFile()));
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(proba1.class.getResource("ostike.png").getFile()));
		contentPane.add(label, BorderLayout.EAST);
		//panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{label_1, lblKartalekua_1, lblKartalekua_2, lblKartalekua_3, lblKartalekua}));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblDenbora = new JLabel("");
		lblDenbora.setIcon(new ImageIcon(proba1.class.getResource("zureTX.png").getFile()));
		panel_2.add(lblDenbora);
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox, BorderLayout.CENTER);
		
		Component glue = Box.createGlue();
		horizontalBox.add(glue);
		
		JLabel lblOla = new JLabel("");
		//lblOla.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		horizontalBox.add(lblOla);
		
		Component glue_1 = Box.createGlue();
		horizontalBox.add(glue_1);
		
		JLabel lblOla_1 = new JLabel("");
		lblOla_1.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		horizontalBox.add(lblOla_1);
		
		Component glue_2 = Box.createGlue();
		horizontalBox.add(glue_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		horizontalBox.add(label_1);
		
		Component glue_3 = Box.createGlue();
		horizontalBox.add(glue_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		horizontalBox.add(label_2);
		
		Component glue_4 = Box.createGlue();
		horizontalBox.add(glue_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(proba1.class.getResource("proba.png").getFile()));
		horizontalBox.add(label_3);
		
		Component glue_5 = Box.createGlue();
		horizontalBox.add(glue_5);
	}

	
}