package minor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class RWA extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel RWAPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RWA rwa = new RWA();
					rwa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RWA() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 559);
		RWAPane = new JPanel();
		RWAPane.setBackground(new Color(0, 0, 128));
		RWAPane.setForeground(Color.WHITE);
		RWAPane.setBorder(new LineBorder(Color.white, 2));
		setContentPane(RWAPane);
		RWAPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Delete record from database");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete = new Delete();
				dispose();
				delete.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(351, 271, 482, 52);
		RWAPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View a record in database");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIEW view = new VIEW();
				dispose();
				view.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(351, 357, 482, 49);
		RWAPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("RWA MANAGEMENT ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(188, 23, 489, 64);
		RWAPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Select Action to be performed:");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\minor\\img\\cursor.png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(351, 114, 396, 55);
		RWAPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add record in database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add add = new Add();
				dispose();
				add.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(351, 179, 482, 52);
		RWAPane.add(btnNewButton);
		
		JTextArea txtrWelcomeLoginSuccessful = new JTextArea();
		txtrWelcomeLoginSuccessful.setEditable(false);
		txtrWelcomeLoginSuccessful.setBackground(new Color(240, 255, 255));
		txtrWelcomeLoginSuccessful.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrWelcomeLoginSuccessful.setText("       WELCOME!! \r\n   LOGIN SUCCESSFUL\r\nOne of the most tedious\r\r\ntask of RWA is to \r\nmaintain the data about\r\n the residents, staff \r\nand committee members.\r\nThus, this software helps\r\nto make these tasks easy.\n");
		txtrWelcomeLoginSuccessful.setBounds(35, 156, 278, 273);
		RWAPane.add(txtrWelcomeLoginSuccessful);
		
		JButton btnNewButton_3 = new JButton("<- Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(10, 10, 97, 29);
		RWAPane.add(btnNewButton_3);
	}
}
