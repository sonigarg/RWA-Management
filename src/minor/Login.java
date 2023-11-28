package minor;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RWA MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(79, 48, 747, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("# Please enter login details:");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\shyam\\Desktop\\RWA-Management-main\\img\\th.jfif"));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(222, 159, 440, 72);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\shyam\\Desktop\\RWA-Management-main\\img\\Actions-system-lock-screen.png"));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 272, 146, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Password:");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\shyam\\Desktop\\RWA-Management-main\\img\\Key.png"));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 339, 146, 34);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(204, 204, 204));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(154, 272, 488, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBackground(new Color(204, 204, 204));
		textField_1.setBounds(154, 342, 488, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(217, 408, 112, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = textField_1.getText();
				if(username.contains("Shyam") && password.contains("password")) {
					RWA rwa = new RWA();
					dispose();
					rwa.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "LoginError", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(442, 408, 101, 41);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.GRAY);
		textArea.setBounds(10, 134, 869, 367);
		contentPane.add(textArea);
	}
}
