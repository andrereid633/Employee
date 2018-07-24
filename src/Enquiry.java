import interfaces.EmployeeServiceInterface;

import java.awt.EventQueue;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

public class Enquiry extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	enquiry frame = new enquiry();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Enquiry(int enquiryID) {
		ResultSet rs = null;
		try {
			Registry r = LocateRegistry.getRegistry(1234);
			EmployeeServiceInterface emp = (EmployeeServiceInterface)r.lookup("Remote");
			
//			Queries q = new Queries();
//			ResultSet rs = q.viewEnquiry(enquiryID);
			rs = emp.viewEnquiry(enquiryID);
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Queries q = new Queries();
//		ResultSet rs = q.viewEnquiry(enquiryID);
//		try {
//			rs.next();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		setBounds(100, 100, 535, 332);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 39, 218, 144);
		getContentPane().add(panel);
		panel.setLayout(new MigLayout("", "[][107.00]", "[][][][][][][]"));
		
		JLabel lblStudentId = new JLabel("Student ID");
		panel.add(lblStudentId, "cell 0 0");
		
		JLabel lbl1;
		try {
			lbl1 = new JLabel(Integer.toString(rs.getInt("ID")));
			panel.add(lbl1, "cell 1 0");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lblNewLabel = new JLabel("First Name");
		panel.add(lblNewLabel, "cell 0 1");
		
		JLabel lbl2;
		try {
			lbl2 = new JLabel(rs.getString("FirstName"));
			panel.add(lbl2, "cell 1 1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lblLastName = new JLabel("Last Name");
		panel.add(lblLastName, "cell 0 2");
		
		JLabel lblNewLabel_1;
		try {
			lblNewLabel_1 = new JLabel(rs.getString("LastName"));
			panel.add(lblNewLabel_1, "cell 1 2,alignx left,aligny bottom");
			
			JLabel lblEmail = new JLabel("Email");
			panel.add(lblEmail, "cell 0 3");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_2;
		try {
			lblNewLabel_2 = new JLabel(rs.getString("Email"));
			panel.add(lblNewLabel_2, "cell 1 3,alignx left,aligny bottom");
			
			JLabel lblTelephoneNumber = new JLabel("Telephone Number");
			panel.add(lblTelephoneNumber, "cell 0 4");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		JLabel lbl5;
		try {
			lbl5 = new JLabel(rs.getString("Cell"));
			panel.add(lbl5, "cell 1 4");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lbl6;
		try {
			
			JLabel lblAccoutBalance = new JLabel("Accout Balance");
			panel.add(lblAccoutBalance, "cell 0 5");
			lbl6 = new JLabel(Integer.toString(rs.getInt("ACC_BAL")));
			panel.add(lbl6, "cell 1 5,alignx left,aligny bottom");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lblReasonForBalance = new JLabel("Reason for Balance");
		panel.add(lblReasonForBalance, "cell 0 6");
		
		JLabel lblNewLabel_3;
		try {
			lblNewLabel_3 = new JLabel(rs.getString("ACC_BAL_DESCRIPTION"));
			panel.add(lblNewLabel_3, "cell 1 6,alignx left,aligny bottom");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(218, 0, 301, 302);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 234, 281, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnRespond = new JButton("Respond");
		btnRespond.setBounds(111, 265, 89, 23);
		panel_1.add(btnRespond);
		
		JLabel lblenquiry;
		try {
			lblenquiry = new JLabel(rs.getString("Enquiry"));
			lblenquiry.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblenquiry.setBounds(10, 11, 281, 68);
			panel_1.add(lblenquiry);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
