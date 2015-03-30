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

public class message_vérification_disponibilité extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					message_vérification_disponibilité frame = new message_vérification_disponibilité();
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
	public message_vérification_disponibilité() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 279);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\n.png"));
		lblNewLabel.setBounds(0, 0, 230, 262);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("heure non disponible");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 33));
		label.setBounds(80, 94, 344, 47);
		contentPane.add(label);
	}

}
