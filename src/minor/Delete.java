package minor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel DeletePane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete delete = new Delete();
					delete.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Delete() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 838, 515);
			DeletePane = new JPanel();
			DeletePane.setBackground(new Color(0, 0, 128));
			DeletePane.setForeground(new Color(135, 206, 235));
			DeletePane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(DeletePane);
			DeletePane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("DELETE RECORD");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 37));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(20, 51, 792, 38);
			DeletePane.add(lblNewLabel);
			
			JButton btnNewButton = new JButton("Staff Members");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Staff_del staff_del = new Staff_del();
					dispose();
					staff_del.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(75, 172, 642, 45);
			DeletePane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Residents");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Residents_del residents_del = new Residents_del();
					dispose();
					residents_del.setVisible(true);
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_1.setBounds(75, 251, 642, 45);
			DeletePane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Committee members");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Committee_del committee_del = new Committee_del();
					dispose();
					committee_del.setVisible(true);
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_2.setBounds(75, 329, 642, 45);
			DeletePane.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("<- Back");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RWA rwa = new RWA();
					dispose();
					rwa.setVisible(true);
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_3.setBounds(10, 21, 102, 32);
			DeletePane.add(btnNewButton_3);
		}
	}

	
		
