package mini_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.ImageIcon;

public class Mainframe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainframe window = new Mainframe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("AIRLINE RESERVATION MANAGEMENT SYSTEM");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.setBounds(100, 100,866,452);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAirlineManagementSystem = new JLabel("AIR INDIA");
		lblAirlineManagementSystem.setForeground(new Color(100, 149, 237));
		lblAirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblAirlineManagementSystem.setBounds(345, 32, 180, 35);
		frame.getContentPane().add(lblAirlineManagementSystem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Home\\Pictures\\20171104125839.jpg"));
		lblNewLabel.setBounds(280, 109, 467, 294);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnFlightinfo = new JButton("FLIGHT_INFO");
		btnFlightinfo.setBounds(52, 139, 192, 35);
		frame.getContentPane().add(btnFlightinfo);
		
		JButton btnAddpassengerdetails = new JButton("ADD_PASSENGER_DETAILS");
		btnAddpassengerdetails.setBounds(52, 216, 192, 35);
		frame.getContentPane().add(btnAddpassengerdetails);
		
		JButton btnViewpassenger = new JButton("VIEW_PASSENGER");
		btnViewpassenger.setBounds(39, 300, 205, 35);
		frame.getContentPane().add(btnViewpassenger);
		
		JButton btnJourneydetails = new JButton("JOURNEY_DETAILS");
		btnJourneydetails.setBounds(39, 359, 205, 35);
		frame.getContentPane().add(btnJourneydetails);
		
		JButton btnPaymentDetails = new JButton("PAYMENT DETAILS");
		btnPaymentDetails.setBounds(757, 139, 161, 39);
		frame.getContentPane().add(btnPaymentDetails);
		
		JButton btnCancellation = new JButton("CANCELLATION");
		btnCancellation.setBounds(757, 216, 161, 35);
		frame.getContentPane().add(btnCancellation);
		
		btnFlightinfo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new SecondFrame();
			}
		});
	
		
		btnAddpassengerdetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try {
					new ThirdFrame();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		
		 btnJourneydetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try {
					new FourthFrame();
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		 btnPaymentDetails.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try {
					new FifthFrame();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	});
		
		 btnCancellation.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				new SixthFrame();
			}
	});
		
		btnViewpassenger.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				new SeventhFrame();
			}
		});
		
		frame.setSize(960,590);
		frame.setVisible(true);
	}
}
