package employeeidentification;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;


public class EmployeeIdentification extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField employeeName;
	private JTextField HourlySal;
	private JTextField Mon1;
	private JTextField Tue1;
	private JTextField wed1;
	private JTextField Thu1;
	private JTextField Fri1;
	private JTextField Sat1;
	private JTextField Sun1;
	private JTextField Mon2;
	private JTextField Tue2;
	private JTextField Wed2;
	private JTextField Thu2;
	private JTextField Fri2;
	private JTextField Sat2;
	private JTextField Sun2;
	private JTextField RegularHours;
	private JTextField OvertimeHours;
	private JTextField RegularAmount;
	private JTextField OvertimeAmount;
	private JTextField NetPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeIdentification frame = new EmployeeIdentification();
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
	public EmployeeIdentification() {
		setForeground(new Color(0, 64, 128));
		setBackground(new Color(0, 128, 192));
		setTitle("GeorgeTown Cleaning Services-Employee Payroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 430);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Identification");
		lblNewLabel.setBounds(46, 24, 126, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setBounds(31, 49, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		employeeName = new JTextField();
		employeeName.setBounds(150, 49, 111, 14);
		contentPane.add(employeeName);
		employeeName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly salary:");
		lblNewLabel_2.setBounds(271, 49, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		HourlySal = new JTextField("");
		HourlySal.setBounds(353, 49, 94, 14);
		contentPane.add(HourlySal);
		HourlySal.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Time Sheet");
		lblNewLabel_3.setBounds(46, 107, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("First Week:");
		lblNewLabel_4.setBounds(31, 151, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Monday");
		lblNewLabel_5.setBounds(139, 125, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tuesday");
		lblNewLabel_6.setBounds(195, 125, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Wednesday");
		lblNewLabel_7.setBounds(251, 125, 63, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Thursday");
		lblNewLabel_8.setBounds(314, 125, 60, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Friday");
		lblNewLabel_9.setBounds(380, 125, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Saturday");
		lblNewLabel_10.setBounds(434, 125, 60, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Sunday");
		lblNewLabel_11.setBounds(505, 125, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		Mon1 = new JTextField();
		Mon1.setBounds(132, 148, 53, 20);
		contentPane.add(Mon1);
		Mon1.setColumns(10);
		
		Tue1 = new JTextField();
		Tue1.setBounds(195, 148, 46, 20);
		contentPane.add(Tue1);
		Tue1.setColumns(10);
		
		wed1 = new JTextField();
		wed1.setBounds(251, 148, 53, 20);
		contentPane.add(wed1);
		wed1.setColumns(10);
		
		Thu1 = new JTextField();
		Thu1.setBounds(314, 148, 49, 20);
		contentPane.add(Thu1);
		Thu1.setColumns(10);
		
		Fri1 = new JTextField();
		Fri1.setBounds(373, 148, 46, 20);
		contentPane.add(Fri1);
		Fri1.setColumns(10);
		
		Sat1 = new JTextField();
		Sat1.setBounds(444, 148, 46, 20);
		contentPane.add(Sat1);
		Sat1.setColumns(10);
		
		Sun1 = new JTextField();
		Sun1.setBounds(505, 148, 46, 20);
		contentPane.add(Sun1);
		Sun1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Second Week:");
		lblNewLabel_12.setBounds(31, 187, 86, 14);
		contentPane.add(lblNewLabel_12);
		
		Mon2 = new JTextField();
		Mon2.setBounds(132, 184, 53, 20);
		contentPane.add(Mon2);
		Mon2.setColumns(10);
		
		Tue2 = new JTextField();
		Tue2.setBounds(195, 184, 46, 20);
		contentPane.add(Tue2);
		Tue2.setColumns(10);
		
		Wed2 = new JTextField();
		Wed2.setBounds(251, 184, 53, 20);
		contentPane.add(Wed2);
		Wed2.setColumns(10);
		
		Thu2 = new JTextField();
		Thu2.setBounds(314, 184, 46, 20);
		contentPane.add(Thu2);
		Thu2.setColumns(10);
		
		Fri2 = new JTextField();
		Fri2.setBounds(373, 184, 46, 20);
		contentPane.add(Fri2);
		Fri2.setColumns(10);
		
		Sat2 = new JTextField();
		Sat2.setBounds(444, 179, 46, 20);
		contentPane.add(Sat2);
		Sat2.setColumns(10);
		
		Sun2 = new JTextField();
		Sun2.setBounds(505, 184, 46, 20);
		contentPane.add(Sun2);
		Sun2.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Payroll Processing");
		lblNewLabel_13.setBounds(46, 231, 112, 14);
		contentPane.add(lblNewLabel_13);
		
		JButton Process = new JButton("Process It");
		Process.setBounds(56, 256, 102, 102);
		contentPane.add(Process);
		
		JLabel lblNewLabel_14 = new JLabel("Regular:");
		lblNewLabel_14.setBounds(178, 285, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Overtime:");
		lblNewLabel_15.setBounds(178, 323, 53, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Hours");
		lblNewLabel_16.setBounds(251, 256, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Amount");
		lblNewLabel_17.setBounds(324, 256, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		RegularHours = new JTextField();
		RegularHours.setBounds(234, 282, 60, 20);
		contentPane.add(RegularHours);
		RegularHours.setColumns(10);
		
		OvertimeHours = new JTextField();
		OvertimeHours.setBounds(234, 320, 60, 20);
		contentPane.add(OvertimeHours);
		OvertimeHours.setColumns(10);
		
		RegularAmount = new JTextField();
		RegularAmount.setBounds(314, 282, 60, 20);
		contentPane.add(RegularAmount);
		RegularAmount.setColumns(10);
		
		OvertimeAmount = new JTextField();
		OvertimeAmount.setBounds(314, 320, 60, 20);
		contentPane.add(OvertimeAmount);
		OvertimeAmount.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Net Pay:");
		lblNewLabel_18.setBounds(384, 300, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		NetPay = new JTextField();
		NetPay.setBounds(434, 297, 60, 20);
		contentPane.add(NetPay);
		NetPay.setColumns(10);
		
		JButton Close = new JButton("Close");
		Close.setBounds(504, 256, 102, 102);
		contentPane.add(Close);
	}
}
