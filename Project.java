import javax.swing.*;

class Project
	{
		public static void main(String args[])
			{
				JFrame frame = new JFrame("Project");

				frame.setSize(400,600);
				frame.setLayout(null);
				frame.setVisible(true);

				JButton shufBtn = new JButton("@");
				shufBtn.setBounds(50,460,50,50);
				frame.add(shufBtn);

				JButton prevBtn = new JButton("<");
				prevBtn.setBounds(125,460,50,50);
				frame.add(prevBtn);

				JButton plyBtn = new JButton("|>");
				plyBtn.setBounds(200,460,50,50);
				frame.add(plyBtn);

				JButton nxtBtn = new JButton(">");
				nxtBtn.setBounds(275,460,50,50);
				frame.add(nxtBtn);

				JTextField framelike = new JTextField();
				framelike.setBounds(50,50,300,400);
				frame.add(framelike);

				

			}
	}