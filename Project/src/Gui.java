import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui extends JFrame{
	
	savApp saver = new savApp();
	public JTextField income = new JTextField(10);
	public JTextField expen = new JTextField(10);
	public JTextField commPrice = new JTextField(10);
	public JTextField dteText = new JTextField(10);
	public JTextField txtinc = new JTextField(7);
	public JTextField txtsave = new JTextField(7);
	public JTextField txtdwm = new JTextField(7);
	public JTextField savreq = new JTextField(10);
	public JTextField txtdays = new JTextField(10);
	public JTextField txtdec = new JTextField(7);

	public JLabel labinc = new JLabel("Income");
	public JLabel labExpenditure = new JLabel("Expenditure");
	public JLabel labPrice = new JLabel("Commodity Price");
	public JLabel choose = new JLabel("Enter days/weeks/months To Save:");
	public JLabel increase = new JLabel("Increase savings by");
	public JLabel dwm = new JLabel("Daily / Weekly / Monthly");
	public JLabel dwmm = new JLabel("Daily / Weekly / Monthly");
	public JLabel dwmm1 = new JLabel("Daily / Weekly / Monthly");
	public JLabel lblsave = new JLabel("Save");
	public JLabel lblfor = new JLabel("For");
	public JLabel dayweek = new JLabel("Days / Weeks / Months");
	public JLabel savingsreq = new JLabel("Savings Required");
	public JLabel lbldec = new JLabel("Decrease savings by;");

	public JButton jbtdaily = new JButton("Daily Savings");
	public JButton jbtweekly = new JButton("Weekly Savings");
	public JButton jbtmonthly = new JButton("Monthly Savings");
	
	
	public Gui(savApp stuff) {
		this.saver = stuff;
		setLayout(new BorderLayout(5, 30));
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		// Contains two panels
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel4.setLayout(new GridLayout(2, 1, 15, 50));

		panel1.setLayout(new GridLayout(3, 2, 5, 10));
		panel1.add(labinc);
		panel1.add(income);
		panel1.add(labExpenditure);
		panel1.add(expen);
		panel1.add(labPrice);
		panel1.add(commPrice);

		panel2.setLayout(new GridLayout(1, 2, 10, 10));
		panel2.add(choose);
		panel2.add(txtdays);

		panel3.setLayout(new GridLayout(1, 3, 10, 10));
		panel3.add(jbtdaily);
		panel3.add(jbtweekly);
		panel3.add(jbtmonthly);

		panel4.add(panel2);
		panel4.add(panel3);

		panel5.setLayout(new GridLayout(4, 3, 10, 10));
		panel5.add(increase);
		panel5.add(txtinc);
		panel5.add(dwm);
		panel5.add(lbldec);
		panel5.add(txtdec);
		panel5.add(dwmm1);
		panel5.add(lblsave);
		panel5.add(txtsave);
		panel5.add(dwmm);
		panel5.add(lblfor);
		panel5.add(txtdwm);
		panel5.add(dayweek);

		add(panel1, BorderLayout.NORTH);
		add(panel4, BorderLayout.CENTER);
		add(panel5, BorderLayout.SOUTH);

		jbtdaily.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saver.clear();
				
				saver.dailySaving();
				saver.errorChecking();
			}
		});
		jbtweekly.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saver.clear();
				
				saver.weeklySaving();
				
				
			}
		});
		jbtmonthly.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saver.clear();
				
				saver.monthlySavings();
				saver.errorChecking();
				
			}
		});
		income.setToolTipText("Enter Monthly Income Here");
		expen.setToolTipText("Enter Monthly Expenditure Here");
		commPrice.setToolTipText("Enter Price of commodity You wish to buy");
		txtdays.setToolTipText("Enter Period you require to save in days / weeks / months accordingly");
	}
	

}
