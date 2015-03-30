package vues;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.JMenu;

public class menu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\workspace\\cabinet orthophonie\\photo\\group.png"));
		setTitle("bienvenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Gestion patient");
		mnNewMenu.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\group.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ajouter patient");
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\group_add.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("liste patients");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\group_edit.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Gestion s\u00E9ances");
		mnNewMenu_1.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\date.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("agenda");
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\date_magnify.png"));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("liste s\u00E9ances");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\date_previous.png"));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Gestion CNAM");
		mnNewMenu_2.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\page.png"));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("ajouter une fiche CNAM");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\page_attach.png"));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("consulter les fiches CNAM");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\page_copy.png"));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Gestion facture");
		mnNewMenu_3.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\layout.png"));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("ajouter facture");
		mntmNewMenuItem_6.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\layout_add.png"));
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("consulter facture");
		mntmNewMenuItem_7.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\layout_sidebar.png"));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_4 = new JMenu("comptabilit\u00E9s");
		mnNewMenu_4.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money.png"));
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("recette");
		mnNewMenu_5.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money_add.png"));
		mnNewMenu_4.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("ajouter recette");
		mntmNewMenuItem_8.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money_add.png"));
		mnNewMenu_5.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("consulter les recettes");
		mntmNewMenuItem_9.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money.png"));
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_6 = new JMenu("d\u00E9pences");
		mnNewMenu_6.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money_delete.png"));
		mnNewMenu_4.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("ajouter d\u00E9pense");
		mntmNewMenuItem_10.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money_add.png"));
		mnNewMenu_6.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("consulter d\u00E9pense");
		mntmNewMenuItem_11.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money.png"));
		mnNewMenu_6.add(mntmNewMenuItem_11);
		
		JMenuItem mntmCaisse = new JMenuItem("Caisse");
		mntmCaisse.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\money.png"));
		mnNewMenu_4.add(mntmCaisse);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("statistique");
		mntmNewMenuItem_12.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\chart_bar_delete.png"));
		menuBar.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_7 = new JMenu("param\u00E9trage");
		mnNewMenu_7.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\wrench.png"));
		menuBar.add(mnNewMenu_7);
		
		JMenuItem mntmAjouterParamtrage = new JMenuItem("ajouter param\u00E9trage");
		mntmAjouterParamtrage.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\page_white_wrench.png"));
		mnNewMenu_7.add(mntmAjouterParamtrage);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("consulter les param\u00E9trages");
		mntmNewMenuItem_13.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\wrench_orange.png"));
		mnNewMenu_7.add(mntmNewMenuItem_13);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\Cabinet-Orthophonie.png"));
		lblNewLabel.setBounds(-92, 0, 402, 238);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\Sans titre.png"));
		lblNewLabel_1.setBounds(293, 0, 455, 238);
		getContentPane().add(lblNewLabel_1);
		
		
	}
}
