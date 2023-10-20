import javax.swing.*;
import java.awt.event.*;

class GUI
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		
		JTextField t1,t2;
		t1 = new JTextField("");
		t1.setBounds(100,150,400,100);
		frame.add(t1);
		
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);

		
		JButton strtBtn = new JButton("START");
		strtBtn.setBounds(100,300,100,50);
		frame.add(strtBtn);
		strtBtn.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
				{
			t1.setText("Hello Every nyan");
				}
			});

		JButton stpBtn = new JButton("STOP");
		stpBtn.setBounds(250,300,100,50);
		frame.add(stpBtn);

		JButton rstBtn = new JButton("RESET");
		rstBtn.setBounds(400,300,100,50);
		frame.add(rstBtn);
		rstBtn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
					{
						t1.setText("");
					}
			});



		

		
		
		
	}
}