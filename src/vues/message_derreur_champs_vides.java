package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class message_derreur_champs_vides extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					message_derreur_champs_vides frame = new message_derreur_champs_vides();
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
	public message_derreur_champs_vides() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\n.png"));
		lblNewLabel.setBounds(0, 0, 225, 262);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("erreur : veuiller remplir la formulaire");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(109, 110, 315, 22);
		contentPane.add(label);
	}

}
