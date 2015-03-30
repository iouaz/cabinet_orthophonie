package vues;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import media.orthophonie.dto.Utilisateur;
import media.orthophonie.metier.IUtilisateurMetier;
import media.orthophonie.metier.UtilisateurMetierImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class authentification extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private IUtilisateurMetier userMetier;
	private static authentification frame1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new authentification();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public authentification() {
		userMetier = new UtilisateurMetierImpl();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\e0a014ea3ddf4822491c84890323a53b.jpg"));
		lblNewLabel.setBounds(0, -11, 233, 273);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Authentification");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_1.setBounds(237, 33, 187, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(247, 95, 62, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mot de passe");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(243, 153, 85, 17);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(338, 100, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(338, 150, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login = textField.getText();
				char[] password = passwordField.getPassword();
				if (!Arrays.equals("".toCharArray(),  password) && !login.equals("")){
					Utilisateur user = userMetier.getUtilisateurByLoginPassword(login, String.copyValueOf(passwordField.getPassword()));
					if (user != null ){
						JOptionPane.showMessageDialog (null, "Connection effectuée avec succès", "Connection à l'application", JOptionPane.INFORMATION_MESSAGE);
						dispose();
			 			new  menu().setVisible(true);
					} else {
						JOptionPane.showMessageDialog (null, "Login ou mot de passe invalides", "Connection à l'application", JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog (null, "Saisir login et mot de passe", "Connection à l'application", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\accept.png"));
		btnNewButton.setBounds(284, 208, 114, 23);
		contentPane.add(btnNewButton);
	}
}
