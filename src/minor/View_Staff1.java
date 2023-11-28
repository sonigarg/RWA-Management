package minor;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import minor.Helper.DB_Handler;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class View_Staff1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Staff1 view_staff1 = new View_Staff1();
					view_staff1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static private DB_Handler DBhandler;
    static private Connection connection;
    static private PreparedStatement preparedstatement;
    private JButton btnNewButton_1;
    private JTable table;
    private JScrollPane scrollPane;
    private JButton btnNewButton_2;

	/**
	 * Create the frame.
	 */
	public View_Staff1() {
		setBackground(new Color(0, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 529);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBounds(225, 443, 118, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBhandler = new DB_Handler();
				try {
					connection = DBhandler.getDbConnection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				String query = "SELECT * FROM staff_members";
				
				try {
					preparedstatement = connection.prepareStatement(query);
					ResultSet rs = preparedstatement.executeQuery();
					 DefaultTableModel t_1 = (DefaultTableModel) table.getModel();
					 t_1.addColumn("Staff_id");
					 t_1.addColumn("Name");
					 t_1.addColumn("Phone_Number");
					 t_1.addColumn("Designation");
					 t_1.setRowCount(0);
					 while(rs.next())
					 {
						 Object o[] = {rs.getInt("Staff_id"),rs.getString("Name"),rs.getString("Phone_Number"),rs.getString("Designation")};
						 t_1.addRow(o);
					 }
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(427, 443, 118, 39);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 82, 676, 341);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnNewButton_2 = new JButton("<- Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VIEW view = new VIEW();
				dispose();
				view.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(10, 10, 93, 26);
		contentPane.add(btnNewButton_2);
		
	}
}
