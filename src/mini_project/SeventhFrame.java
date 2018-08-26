package mini_project;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class SeventhFrame {
	
	static Connection mycon=null;
	static String url="jdbc:mysql://localhost:3306";
	static String dbname="/airline";
	static String driver="com.mysql.jdbc.Driver";
	static String userName="root";
	static String password="kushal";
	
	PreparedStatement pst=null;
	ResultSet rs=null;
	

	private JFrame frame;
	private JTable table;
	private JLabel lblViewPassenger;
	private JButton btnHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeventhFrame window = new SeventhFrame();
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
	public SeventhFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("VIEW_PASSENGER");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 808, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("SHOW PASSENGER");
		btnNewButton.setBounds(54, 107, 199, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(24, 219, 675, 188);
		frame.getContentPane().add(table);
		
		lblViewPassenger = new JLabel("VIEW_PASSENGER");
		lblViewPassenger.setForeground(new Color(0, 153, 204));
		lblViewPassenger.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblViewPassenger.setBounds(237, 35, 295, 34);
		frame.getContentPane().add(lblViewPassenger);
		
		btnHome = new JButton("HOME");
		btnHome.setBounds(56, 34, 112, 28);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Home\\Pictures\\20171109194432.jpeg"));
		lblNewLabel.setBounds(545, 33, 199, 133);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				 
				 
				     
					try {
					
						ResultSet myrs;
						pst=mycon.prepareStatement("select *from passenger ");
						myrs=pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(myrs));
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
			}
		});
		
		btnHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae) 
			{
				frame.dispose();
			}
	});
		
		
		try{
			 Class.forName(driver); 
			 mycon=DriverManager.getConnection(url+dbname,userName,password); 
	
			  
			 
				
			  
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame.setSize(860,486);
		frame.setVisible(true);
	}
}
