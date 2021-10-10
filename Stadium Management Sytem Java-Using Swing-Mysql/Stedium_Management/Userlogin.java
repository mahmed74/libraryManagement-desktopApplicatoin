package Stedium_Management;
/**
 * 
 * @author ahmed 
 * @github mahmed74
 *
 */
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Userlogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogin frame = new Userlogin();
					
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
	public Userlogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblNewLabel.setBounds(373, 42, 273, 93);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(481, 170, 281, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(481, 286, 281, 68);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblUsername.setBounds(204, 178, 193, 52);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblPassword.setBounds(204, 294, 193, 52);
		contentPane.add(lblPassword);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(481, 387, 113, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0,j=0;
				String ustr=textField.getText();
				String pstr=passwordField.getText();
				/**	for(i=0;i<2;i++)
				{
					
					if(pass[i].equals(ustr))
					{
						for(j=0;j<2;j++)
						{
							if(pass[i].equals(pstr))
							{
								JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
								break;
							}
						}
					}
				}
				if(i==2 && j==0)
				{
		
					JOptionPane.showMessageDialog(btnNewButton, "Wrong Username");
				}
				else if(j==2)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Wrong Password");
				}*/
				
				if( ustr.equals("Soumya") && pstr.equals("1234"))
				{
					dispose();
					User_host uh=new User_host();
					uh.setTitle("Stadium Management System");
					uh.setVisible(true);
					JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
				}
			/*	try
				{
					String drivername="com.microsoft.sqlserver.jdbc.SQLServerDriver";//driver name
					Class.forName(drivername);
					String db="jdbc:sqlserver://PERSONAL\\SQLEXPRESS:1433;databaseName=test";//connection string
					String user="sa";
					String pass="1234";
					Connection con=DriverManager.getConnection(db,user,pass);
					
			
					
					
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("SELECT uid,username,password FROM user WHERE username='"+ ustr +"' AND password='"+ pstr +"'");
					while(rs.next())
					{
						dispose();
						AdminLogin al=new AdminLogin();
						al.setVisible(true);
					}
					
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}*.
				
				
				/*try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","soumya","1234");
					String query="select * from tlogin where user_name='"+ustr+"' and password='"+pstr+"'";
					Statement st=con.createStatement();
					int x=st.executeUpdate(query);
					if(x==1)
					{
						JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
					}
					con.close();
				}
				catch(Exception f)
				{
					System.out.println(f);
				}		*/	
			}
		});
	
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin al=new AdminLogin();
				al.setTitle("Stadium Management System");
				al.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(204, 419, 216, 83);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Create new account");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Create_ac ca = new Create_ac();
				ca.setTitle("Stadium Management System");
				ca.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(481, 470, 281, 52);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Reset ");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(649, 387, 113, 52);
		contentPane.add(btnNewButton_3);
	
	
	}

}
