package vues;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class modifier_facture extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_facture frame = new ajout_facture();
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
	public modifier_facture() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ajout_facture.class.getResource("/media/orthophonie/images/Cabinet-Orthophonie.png")));
		setTitle("ajout facture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facture");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 80));
		lblNewLabel.setBounds(259, 21, 284, 59);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("N\u00B0 facture");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(41, 37, 73, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Date facture");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(41, 65, 86, 22);
		contentPane.add(label_1);
		
		Label label_3 = new Label("nom assur\u00E9");
		label_3.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_3.setBounds(26, 93, 77, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("pr\u00E9nom assur\u00E9");
		label_4.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_4.setBounds(26, 131, 101, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("CIN assur\u00E9");
		label_5.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_5.setBounds(26, 159, 86, 22);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(141, 200, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(141, 37, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 65, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 93, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(141, 131, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(141, 161, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		Label label_6 = new Label("CNAM");
		label_6.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_6.setBounds(27, 198, 62, 22);
		contentPane.add(label_6);
		
		Label label_7 = new Label("Nom patient");
		label_7.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_7.setBounds(26, 226, 86, 22);
		contentPane.add(label_7);
		
		Label label_8 = new Label("pr\u00E9nom patient");
		label_8.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_8.setBounds(26, 262, 101, 22);
		contentPane.add(label_8);
		
		Label label_9 = new Label("Prise en charge ");
		label_9.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_9.setBounds(26, 290, 110, 22);
		contentPane.add(label_9);
		
		Label label_13 = new Label("Edit\u00E9 le");
		label_13.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_13.setBounds(26, 318, 62, 22);
		contentPane.add(label_13);
		
		Label label_14 = new Label("Prix unitaire");
		label_14.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_14.setBounds(401, 133, 76, 22);
		contentPane.add(label_14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(141, 231, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(141, 262, 86, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(141, 290, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(141, 318, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		Label label_15 = new Label("Nbre s\u00E9ances");
		label_15.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_15.setBounds(390, 161, 98, 22);
		contentPane.add(label_15);
		
		Label label_16 = new Label("Montant HT");
		label_16.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_16.setBounds(401, 189, 87, 22);
		contentPane.add(label_16);
		
		Label label_17 = new Label("TVA");
		label_17.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_17.setBounds(415, 222, 62, 22);
		contentPane.add(label_17);
		
		Label label_18 = new Label("Montant TTC");
		label_18.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_18.setBounds(401, 250, 87, 22);
		contentPane.add(label_18);
		
		textField_13 = new JTextField();
		textField_13.setBackground(UIManager.getColor("Button.highlight"));
		textField_13.setBounds(494, 133, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setForeground(UIManager.getColor("Button.darkShadow"));
		textField_14.setBounds(494, 167, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(494, 197, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(494, 224, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(494, 252, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		Label label_19 = new Label("Montant en lettre : la somme est arr\u00E9t\u00E9e \u00E0");
		label_19.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_19.setBounds(237, 304, 328, 22);
		contentPane.add(label_19);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\vf.jpg"));
		lblNewLabel_1.setBounds(363, -2, 289, 290);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\vf - Copie (2).jpg"));
		lblNewLabel_3.setBounds(0, -5, 218, 267);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\vf - Copie (3).jpg"));
		lblNewLabel_4.setBounds(-6, 99, 164, 307);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\vv.jpg"));
		lblNewLabel_5.setBounds(170, 68, 334, 225);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\s.jpg"));
		lblNewLabel_2.setBounds(483, 175, 302, 274);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setIcon(new ImageIcon("C:\\workspace\\cabinet orthophonie\\photo\\accept.png"));
		btnNewButton.setBounds(188, 365, 116, 23);
		contentPane.add(btnNewButton);
		
		
		textField_10 = new JTextField();
		textField_10.setBounds(494, 133, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		
	}
}

