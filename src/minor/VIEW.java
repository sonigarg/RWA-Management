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

public class VIEW extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel ViewPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIEW view = new VIEW();
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VIEW() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 913, 528);
			ViewPane = new JPanel();
			ViewPane.setBackground(new Color(0, 0, 128));
			ViewPane.setForeground(new Color(135, 206, 235));
			ViewPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(ViewPane);
			ViewPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("VIEW RECORD");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 37));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(176, 52, 521, 38);
			ViewPane.add(lblNewLabel);
			
			JButton btnNewButton = new JButton("Staff Members");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					View_Staff1 view_staff1 = new View_Staff1();
					dispose();
					view_staff1.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton.setBounds(84, 169, 702, 45);
			ViewPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Residents");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					View_residents view_residents = new View_residents();
					dispose();
					view_residents.setVisible(true);
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_1.setBounds(84, 250, 702, 45);
			ViewPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Committee members");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					View_committee view_committee = new View_committee();
					dispose();
					view_committee.setVisible(true);
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNewButton_2.setBounds(84, 327, 702, 45);
			ViewPane.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("<- Back");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RWA rwa = new RWA();
					dispose();
					rwa.setVisible(true);
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_3.setBounds(10, 10, 96, 29);
			ViewPane.add(btnNewButton_3);
		}
	}

