import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class serviceDashboard  extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					serviceDashboard frame = new serviceDashboard();
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
	public serviceDashboard() {
		setRootPaneCheckingEnabled(false);
		setMaximizable(true);
		ButtonGroup bg = new ButtonGroup();
		Queries q = new Queries();
		String[] count = q.countServices();
		System.out.println("this is count"+count[4]);
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 587, 291);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][][][][][][][]"));
		
		JRadioButton rdbtn1 = new JRadioButton("");
		bg.add(rdbtn1);
		getContentPane().add(rdbtn1, "cell 0 1");
		
		JLabel label = new JLabel("Applying for Refunds");
		label.setForeground(Color.WHITE);
		label.setBackground(Color.WHITE);
		getContentPane().add(label, "cell 1 1");
		
		JLabel label_5 = new JLabel("Resolved");
		label_5.setForeground(Color.WHITE);
		getContentPane().add(label_5, "cell 3 1");
		
		JLabel lblResolvedApplyingForRefunds = new JLabel(count[0]);
		lblResolvedApplyingForRefunds.setForeground(Color.WHITE);
		getContentPane().add(lblResolvedApplyingForRefunds, "cell 5 1");
		
		JLabel label_10 = new JLabel("Unresolved");
		label_10.setForeground(Color.WHITE);
		getContentPane().add(label_10, "cell 7 1");
		
		JLabel lblUnesolvedApplyingForRefunds = new JLabel(count[1]);
		lblUnesolvedApplyingForRefunds.setForeground(Color.WHITE);
		getContentPane().add(lblUnesolvedApplyingForRefunds, "cell 9 1");
		
		JRadioButton radioButton2 = new JRadioButton("");
		bg.add(radioButton2);
		getContentPane().add(radioButton2, "cell 0 2");
		
		JLabel label_1 = new JLabel("Applying for Financial Clearance ");
		label_1.setForeground(Color.WHITE);
		getContentPane().add(label_1, "cell 1 2");
		
		JLabel label_6 = new JLabel("Resolved");
		label_6.setForeground(Color.WHITE);
		getContentPane().add(label_6, "cell 3 2");
		
		JLabel lblresolvedApplyingforFinancialClearance = new JLabel(count[2]);
		lblresolvedApplyingforFinancialClearance.setForeground(Color.WHITE);
		getContentPane().add(lblresolvedApplyingforFinancialClearance, "cell 5 2");
		
		JLabel label_11 = new JLabel("Unresolved");
		label_11.setForeground(Color.WHITE);
		getContentPane().add(label_11, "cell 7 2");
		
		JLabel lblunresolvedApplyingforFinancialClearance = new JLabel(count[3]);
		lblunresolvedApplyingforFinancialClearance.setForeground(Color.WHITE);
		getContentPane().add(lblunresolvedApplyingforFinancialClearance, "cell 9 2");
		
		JRadioButton radioButton3 = new JRadioButton("");
		bg.add(radioButton3);
		getContentPane().add(radioButton3, "cell 0 3");
		
		JLabel label_2 = new JLabel("Generation of Semester Fee Statement");
		label_2.setForeground(Color.WHITE);
		getContentPane().add(label_2, "cell 1 3");
		
		JLabel label_7 = new JLabel("Resolved");
		label_7.setForeground(Color.WHITE);
		getContentPane().add(label_7, "cell 3 3");
		
		JLabel lblresolvedGenerationofSemesterFeeStatement = new JLabel(count[4]);
		lblresolvedGenerationofSemesterFeeStatement.setForeground(Color.WHITE);
		getContentPane().add(lblresolvedGenerationofSemesterFeeStatement, "cell 5 3");
		
		JLabel label_12 = new JLabel("Unresolved");
		label_12.setForeground(Color.WHITE);
		getContentPane().add(label_12, "cell 7 3");
		
		JLabel lblunresolvedGenerationofSemesterFeeStatement = new JLabel(count[5]);
		lblunresolvedGenerationofSemesterFeeStatement.setForeground(Color.WHITE);
		getContentPane().add(lblunresolvedGenerationofSemesterFeeStatement, "cell 9 3");
		
		JRadioButton radioButton_4 = new JRadioButton("");
		bg.add(radioButton_4);
		getContentPane().add(radioButton_4, "cell 0 4");
		
		JLabel label_3 = new JLabel("Monies owed ");
		label_3.setForeground(Color.WHITE);
		getContentPane().add(label_3, "cell 1 4");
		
		JLabel label_8 = new JLabel("Resolved");
		label_8.setForeground(Color.WHITE);
		getContentPane().add(label_8, "cell 3 4");
		
		JLabel lblresolvedMoniesowed = new JLabel(count[6]);
		lblresolvedMoniesowed.setForeground(Color.WHITE);
		getContentPane().add(lblresolvedMoniesowed, "cell 5 4");
		
		JLabel label_13 = new JLabel("Unresolved");
		label_13.setForeground(Color.WHITE);
		getContentPane().add(label_13, "cell 7 4");
		
		JLabel lblunresolvedMoniesowed = new JLabel(count[7]);
		lblunresolvedMoniesowed.setForeground(Color.WHITE);
		getContentPane().add(lblunresolvedMoniesowed, "cell 9 4");
		
		JRadioButton radioButton_5 = new JRadioButton("");
		bg.add(radioButton_5);
		getContentPane().add(radioButton_5, "cell 0 5");
		
		JLabel label_4 = new JLabel("Account balance");
		label_4.setForeground(Color.WHITE);
		getContentPane().add(label_4, "cell 1 5");
		
		JLabel label_9 = new JLabel("Resolved");
		label_9.setForeground(Color.WHITE);
		getContentPane().add(label_9, "cell 3 5");
		
		JLabel lblresolvedAccountbalance = new JLabel(count[8]);
		lblresolvedAccountbalance.setForeground(Color.WHITE);
		getContentPane().add(lblresolvedAccountbalance, "cell 5 5");
		
		JLabel label_14 = new JLabel("Unresolved");
		label_14.setForeground(Color.WHITE);
		getContentPane().add(label_14, "cell 7 5");
		
		JLabel lblunresolvedAccountbalance = new JLabel(count[9]);
		lblunresolvedAccountbalance.setForeground(Color.WHITE);
		getContentPane().add(lblunresolvedAccountbalance, "cell 9 5");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn1.isSelected()){
					service s = new service("Applying for Refunds");
					getDesktopPane().add(s);
					s.setVisible(true);
				}
				if (radioButton2.isSelected()){
					service s = new service("Applying for Financial Clearance");
					getDesktopPane().add(s);
					s.setVisible(true);
				}
				if (radioButton3.isSelected()){
					service s = new service("Generation of Semester Fee Statement");
					getDesktopPane().add(s);
					s.setVisible(true);
				}
				if (radioButton_4.isSelected()){
					service s = new service("Monies owed");
					getDesktopPane().add(s);
					s.setVisible(true);
				}
				if (radioButton_5.isSelected()){
					service s = new service("Account balance");
					getDesktopPane().add(s);
					s.setVisible(true);
				}
			}
		});
		getContentPane().add(btnNewButton, "cell 3 11");

		this.setIconifiable(true);
		this.setClosable(true);
	this.setBounds(0, 0, 500, 250);
	}

}
