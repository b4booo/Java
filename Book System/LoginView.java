package book.login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginView{
  public LoginView(){
        JFrame frame = new JFrame("Book System");
        
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(194,109,223));
        panel.setBounds(0,0,400,400);
        frame.add(panel);

        JLabel login = new JLabel("Login");
        Font lgnfnt = new Font("Arial",Font.BOLD, 30);
        login.setBounds (25,25,100,20);
        panel.add(login);

        JLabel usrnme = new JLabel("Username:");
        usrnme.setBounds(75,100,100,20);
        panel.add(usrnme);

        JTextField usrnmetxtfld = new JTextField();
        usrnmetxtfld.setBounds(75,120,200,20);
        panel.add(usrnmetxtfld);

        JLabel psswrd = new JLabel("Password:");
        psswrd.setBounds(75,150,100,20);
        panel.add(psswrd);

        JTextField psswrdtxtfld = new JTextField();
        psswrdtxtfld.setBounds(75,170,200,20);
        panel.add(psswrdtxtfld);

        JButton loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(150,200,100,20);
        panel.add(loginbtn);

        JButton rgstrbtn = new JButton("REGISTER");
        rgstrbtn.setBounds(150,230,100,20);
        panel.add(rgstrbtn);
    }
}