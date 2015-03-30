package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTable;

public class consulte_facture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consulte_facture frame = new consulte_facture();
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
	public consulte_facture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("rechercher");
		btnNewButton.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\zoom.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(402, 105, 110, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("N\u00B0 facture");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(32, 27, 56, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date facture");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(32, 73, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom parent");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(241, 31, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom parent");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(241, 62, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		Choice choice = new Choice();
		choice.setBounds(104, 30, 110, 20);
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBackground(new Color(255, 255, 255));
		choice_1.setForeground(new Color(30, 144, 255));
		choice_1.setBounds(104, 67, 110, 20);
		contentPane.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(349, 27, 110, 20);
		contentPane.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(349, 56, 110, 20);
		contentPane.add(choice_3);
		
		JButton btnNewButton_1 = new JButton("Modifier");
		btnNewButton_1.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\email_edit.png"));
		btnNewButton_1.setBounds(163, 390, 101, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\cancel.png"));
		btnNewButton_2.setBounds(314, 390, 101, 23);
		contentPane.add(btnNewButton_2);
	}
}
