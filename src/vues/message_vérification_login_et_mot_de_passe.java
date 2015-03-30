package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;

public class message_vérification_login_et_mot_de_passe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					message_vérification_login_et_mot_de_passe frame = new message_vérification_login_et_mot_de_passe();
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
	public message_vérification_login_et_mot_de_passe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 268);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\n.png"));
		lblNewLabel.setBounds(0, 0, 225, 240);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("v\u00E9rifier votre login et votre mot de passe");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		label.setBounds(76, 99, 348, 22);
		contentPane.add(label);
	}

}
