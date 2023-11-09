import javax.swing.*;

class Student
	{
		public static void main(String args[])
			{
				JFrame frame = new JFrame("Main");

				JLabel student = new JLabel("Student");
				student.setBounds(10,10,100,50);
				frame.add(student);

				JLabel fstNme = new JLabel("First Name");
				fstNme.setBounds(50,50,100,50);	
				frame.add(fstNme);

				JTextField fstNme1 = new JTextField();
				fstNme1.setBounds(50,90,150,20);
				frame.add(fstNme1);

				JLabel lstNme = new JLabel("Last Name");
				lstNme.setBounds(50, 110, 100,50);
				frame.add(lstNme);

				JTextField lstNme1 = new JTextField();
				lstNme1.setBounds(50, 150,150,20);
				frame.add(lstNme1);

				JButton clear = new JButton("Clear");
				clear.setBounds(150, 200,80,50);
				frame.add(clear);

				JButton submit = new JButton("Submit");
				submit.setBounds(240, 200,80,50);
				frame.add(submit);

				frame.setSize(400, 500);
				frame.setLayout(null);
				frame.setVisible(true);

			}
	}