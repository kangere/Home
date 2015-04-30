import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

/*import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;*/

public class savApp extends JFrame {
	
	Gui cont = new Gui(this);
	Date date = new Date();
	/*public JTextField income = new JTextField(10);
	public JTextField expen = new JTextField(10);
	public JTextField commPrice = new JTextField(10);
	public JTextField dteText = new JTextField(10);
	public JTextField txtinc = new JTextField(7);
	public JTextField txtsave = new JTextField(7);
	public JTextField txtdwm = new JTextField(7);
	public JTextField savreq = new JTextField(10);
	// date picker code
	// not too sure what it means
	// UtilDateModel model = new UtilDateModel();
	// JDatePanelImpl datePanel = new JDatePanelImpl(model);
	// JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
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
	public JButton jbtmonthly = new JButton("Monthly Savings");*/

	public savApp() {
		/*setLayout(new BorderLayout(5, 30));
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
				clear();
				
				dailySaving();
				errorChecking();
			}
		});
		jbtweekly.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clear();
				
				weeklySaving();
				
				
			}
		});
		jbtmonthly.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clear();
				
				monthlySavings();
				errorChecking();
				
			}
		});
		income.setToolTipText("Enter Monthly Income Here");
		expen.setToolTipText("Enter Monthly Expenditure Here");
		commPrice.setToolTipText("Enter Price of commodity You wish to buy");
		txtdays.setToolTipText("Enter Period you require to save in days / weeks / months accordingly");
		*/
	}

	public static void main(String[] args) {
		savApp stuff = null;

		Gui frame = new Gui(stuff);
		frame.setTitle("SAVING APPLICATION");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setResizable(false);
	
		
	}

	public void dailySaving() {
		int daysRequired;
		double realitySavings;
		double savingsDeficiency;
		double dailySavings;
		String temp;
		String tempincome;
		String tempExpenditure;
		String tempCommodity;
		String tempDays;

		tempincome = cont.income.getText();
		double income = Double.parseDouble(tempincome);

		tempDays = cont.txtdays.getText();
		daysRequired = Integer.parseInt(tempDays);

		tempExpenditure = cont.expen.getText();
		double expenditure = Double.parseDouble(tempExpenditure);

		tempCommodity = cont.commPrice.getText();
		double commodityPrice = Double.parseDouble(tempCommodity);

		double savings = income - expenditure;
		realitySavings = Math.ceil(commodityPrice / daysRequired);
		dailySavings = savings / 30;

		if (realitySavings > dailySavings) {
			savingsDeficiency = Math.ceil(realitySavings - dailySavings);
			temp = Double.toString(savingsDeficiency);
			cont.txtinc.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(daysRequired);
			cont.txtdwm.setText(temp);
			cont.txtdec.setText("N / A");
		} else if (realitySavings < dailySavings) {
			savingsDeficiency = Math.ceil(dailySavings - realitySavings);
			temp = Double.toString(savingsDeficiency);
			cont.txtdec.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(daysRequired);
			cont.txtdwm.setText(temp);
			cont.txtinc.setText("N / A");

		} else if (realitySavings == dailySavings) {
			cont.txtinc.setText("Savings are adequate");
			cont.txtdec.setText("Savings are adequate");
			temp = Double.toString(dailySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(daysRequired);
			cont.txtdwm.setText(temp);

		}

	}

	public void clear() {
		cont.txtinc.setText(null);
		cont.txtdec.setText(null);
		cont.txtdwm.setText(null);
		cont.txtsave.setText(null);

	}

	public void weeklySaving() {
		int weeksRequired;
		double savingsDeficiency, realitySavings, weeklySavings;
		String temp;
		String tempincome;
		String tempExpenditure;
		String tempCommodity;
		String tempWeeks;

		tempincome = cont.income.getText();
		double income = Double.parseDouble(tempincome);

		tempWeeks = cont.txtdays.getText();
		weeksRequired = Integer.parseInt(tempWeeks);

		tempExpenditure = cont.expen.getText();
		double expenditure = Double.parseDouble(tempExpenditure);

		tempCommodity = cont.commPrice.getText();
		double commodityPrice = Double.parseDouble(tempCommodity);

		double savings = income - expenditure;
		weeklySavings = Math.ceil(savings / 4);
		realitySavings = Math.ceil(commodityPrice / weeksRequired);

		if (realitySavings > weeklySavings) {
			savingsDeficiency = Math.ceil(realitySavings - weeklySavings);
			temp = Double.toString(savingsDeficiency);
			cont.txtinc.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(weeksRequired);
			cont.txtdwm.setText(temp);
			cont.txtdec.setText("N / A");
		} else if (realitySavings < weeklySavings) {
			savingsDeficiency = weeklySavings - realitySavings;
			temp = Double.toString(savingsDeficiency);
			cont.txtdec.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(weeksRequired);
			cont.txtdwm.setText(temp);
			cont.txtinc.setText("N / A");

		} else if (realitySavings == weeklySavings) {
			cont.txtdec.setText("Savings are adequate");
			cont.txtinc.setText("Savings are adequate");
			temp = Double.toString(weeklySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(weeksRequired);
			cont.txtdwm.setText(temp);
			
		}
	}

	public void monthlySavings() {
		int months;
		double savings, savingsDeficiency, realitySavings, monthlySavings;
		String temp;
		String tempincome;
		String tempExpenditure;
		String tempCommodity;
		String tempMonths;

		tempincome = cont.income.getText();
		double income = Double.parseDouble(tempincome);

		tempExpenditure = cont.expen.getText();
		double expenditure = Double.parseDouble(tempExpenditure);

		tempCommodity = cont.commPrice.getText();
		double commodityPrice = Double.parseDouble(tempCommodity);

		tempMonths = cont.txtdays.getText();
		months = Integer.parseInt(tempMonths);
		realitySavings = Math.ceil(commodityPrice / months);

		savings = income - expenditure;
		monthlySavings = savings;
		
		if (realitySavings > monthlySavings){
			savingsDeficiency = Math.ceil(realitySavings - monthlySavings);
			temp = Double.toString(savingsDeficiency);
			cont.txtinc.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(months);
			cont.txtdwm.setText(temp);
			cont.txtdec.setText("N / A");
		}else if(realitySavings < monthlySavings){
			savingsDeficiency = Math.ceil(monthlySavings - realitySavings);
			temp = Double.toString(savingsDeficiency);
			cont.txtdec.setText(temp);
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(months);
			cont.txtdwm.setText(temp);
			cont.txtinc.setText("N / A");
		}else if(realitySavings == monthlySavings){
			cont.txtinc.setText("Savings are adequate");
			cont.txtdec.setText("Savings are adequate");
			temp = Double.toString(realitySavings);
			cont.txtsave.setText(temp);
			temp = Integer.toString(months);
			cont.txtdwm.setText(temp);
			
		}
		

	}
	public void errorChecking(){
		String tempincome;
		String tempExpenditure;
		String tempCommodity;
		String tempPeriod;
		
		tempincome = cont.income.getText();
		tempExpenditure = cont.expen.getText();
		tempCommodity = cont.commPrice.getText();
		tempPeriod = cont.txtdays.getText();
		if (tempincome == null && tempExpenditure == null && tempCommodity == null && tempPeriod == null){
			cont.income.setText(" Enter Monthly Income ");
			cont.expen.setText(" Enter Monthly Expenditure ");
			cont.commPrice.setText("Enter Price of Commodity");
			cont.txtdays.setText("Enter Amount of days/weeks/months required to save");
			
		}
		
	}
}
