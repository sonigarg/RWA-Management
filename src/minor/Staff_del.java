package minor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import minor.Helper.DB_Handler;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Staff_del extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_3;
	
	static private DB_Handler DBhandler;
    static private Connection connection;
    static private PreparedStatement preparedstatement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_del staff_del = new Staff_del();
					staff_del.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Staff_del() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 558);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Details of staff member:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(20, 82, 410, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff ID:*");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(20, 189, 112, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(20, 256, 112, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone Number:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(20, 315, 112, 31);
		contentPane.add(lblNewLabel_4);
		
		JTextField textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(148, 377, 484, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(148, 250, 484, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(148, 312, 484, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Designation:");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(20, 383, 112, 29);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBhandler = new DB_Handler();
	        try {
				connection = DBhandler.getDbConnection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        String query = "DELETE FROM staff_members WHERE Staff_id=?";
                        //get text method for converting textfield text to string
	        Integer Staffid = Integer.parseInt(textField_3.getText());

	       try {
	    	   preparedstatement = (PreparedStatement)connection.prepareStatement(query);
		} catch (SQLException e2) {
			
			e2.printStackTrace();
		}
        try {
			
	                 preparedstatement.setInt(1,Staffid );
	                 preparedstatement.execute();
	                 preparedstatement.close();
	                 JOptionPane.showMessageDialog(null, "Successfully Deleted", "Delete", JOptionPane.ERROR_MESSAGE);
	         		RWA rwa = new RWA();
	         		dispose();
	         		rwa.setVisible(true);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}	
});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(310, 452, 118, 31);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 189, 483, 39);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("<- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete = new Delete();
				dispose();
				delete.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(20, 10, 97, 31);
		contentPane.add(btnNewButton_1);
		
		
		
	}
		}
		
	


