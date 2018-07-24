import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class service extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//service frame = new service();
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
	public service(String service) {
		int enquiryID[] = new int[10];
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb[] = new JRadioButton[10];
		Queries q = new Queries();
		setBounds(100, 100, 615, 336);
		getContentPane().setLayout(new MigLayout("", "[][151.00][169.00][128.00]", "[][][][][][][][][][]"));
		ResultSet rs = q.viewService(service);
		
		JLabel lblStudentId = new JLabel("STUDENT ID");
		getContentPane().add(lblStudentId, "cell 1 1");
		
		JLabel lblEnquiry = new JLabel("ENQUIRY");
		getContentPane().add(lblEnquiry, "cell 2 1");
		
		JLabel lblStatus = new JLabel("STATUS");
		getContentPane().add(lblStatus, "cell 3 1");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
									if (rb[0].isSelected()){
						Enquiry s = new Enquiry(enquiryID[2]);
						System.out.print(enquiryID[2]);
						System.out.print("ggg");
						getDesktopPane().add(s);
						s.setVisible(true);
					
					}
			
				
				
			}
		});
		getContentPane().add(btnNewButton, "cell 2 9");

		JLabel lbl[] = new JLabel[30];
		int i =0;
		int row = 2;
	
		int n = 0;
		
		try {
			while(rs.next()){
				enquiryID[n] = rs.getInt("id");
				System.out.print(enquiryID[n]);
				int column = 0;
				rb[n] = new JRadioButton("");
				getContentPane().add(rb[n], "cell "+column+" "+row+",alignx left,aligny center");
				bg.add(rb[n]);
				i++;
				column++;
				
				System.out.print("this works");
				lbl[i]= new JLabel(rs.getString("studentid"));
				getContentPane().add(lbl[i], "cell "+column+" "+row+",alignx left,aligny top");
				i++;
				column++;
				lbl[i]= new JLabel(rs.getString("enquiry"));
				getContentPane().add(lbl[i], "cell "+column+" "+row+",alignx left,aligny top");
				i++;
				column++;
				lbl[i]= new JLabel(rs.getString("status"));
				getContentPane().add(lbl[i], "cell "+column+" "+row+",alignx left,aligny top");
				
				
				    
				row++;
				i++;
				column++;
				
				
				this.setIconifiable(true);
				this.setClosable(true);
			this.setBounds(0, 0, 500, 250);
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
