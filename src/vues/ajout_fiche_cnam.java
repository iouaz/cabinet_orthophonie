package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JToolBar;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ajout_fiche_cnam extends JFrame {

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
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajout_fiche_cnam frame = new ajout_fiche_cnam();
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
	public ajout_fiche_cnam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(95, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 73, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 138, 74, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 169, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(88, 200, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(238, 200, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(251, 42, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(332, 73, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(238, 138, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(408, 138, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(251, 169, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(408, 169, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		Label label = new Label("d\u00E9cision de la prise en charge");
		label.setFont(UIManager.getFont("FormattedTextField.font"));
		label.setBounds(22, 4, 148, 32);
		contentPane.add(label);
		
		Label label_1 = new Label("N\u00B0.D\u00E9cision");
		label_1.setBounds(10, 42, 62, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("date d\u00E9but");
		label_2.setBounds(187, 42, 62, 20);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Nbre s\u00E9ance total");
		label_3.setBounds(10, 73, 93, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Nbre s\u00E9ance par s\u00E9maine");
		label_4.setBounds(197, 71, 129, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Donn\u00E9es patient");
		label_5.setBounds(38, 110, 86, 22);
		contentPane.add(label_5);
		
		Label label_6 = new Label("Nom patient");
		label_6.setBounds(10, 138, 62, 22);
		contentPane.add(label_6);
		
		Label label_7 = new Label("pr\u00E9nom patient");
		label_7.setBounds(158, 138, 74, 22);
		contentPane.add(label_7);
		
		Label label_8 = new Label("Nom assur\u00E9");
		label_8.setBounds(10, 169, 62, 22);
		contentPane.add(label_8);
		
		Label label_9 = new Label("Sexe patient");
		label_9.setBounds(332, 138, 62, 22);
		contentPane.add(label_9);
		
		Label label_10 = new Label("Pr\u00E9nom assur\u00E9");
		label_10.setBounds(168, 169, 81, 22);
		contentPane.add(label_10);
		
		Label label_11 = new Label("CIN assur\u00E9");
		label_11.setBounds(342, 169, 62, 22);
		contentPane.add(label_11);
		
		Label label_12 = new Label("centre CNAM");
		label_12.setBounds(10, 197, 67, 22);
		contentPane.add(label_12);
		
		Label label_13 = new Label("N\u00B0 assur\u00E9");
		label_13.setBounds(180, 200, 55, 22);
		contentPane.add(label_13);
	}
}
