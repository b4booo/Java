import java.awt.*;
import javax.swing.*;

public class Main 
    {
        public static void main(String args[])
            {
                JFrame frame = new JFrame("Book System");
                

                JLabel login = new JLabel("LOGIN");
                login.setBounds(30,30,50,50);
                frame.add(login);

                JLabel userName = new JLabel("USERNAME");
                userName.setBounds(50,100,100,50);
                frame.add(userName);

                JTextField usrNmeTxtFld = new JTextField();
                usrNmeTxtFld.setBounds(50,140,200,20);
                frame.add(usrNmeTxtFld);
                
                JLabel passWord = new JLabel("PASSWORD");
                passWord.setBounds(50, 170, 100,20);
                frame.add(passWord);

                JTextField pssWrdTxtFld = new JTextField();
                pssWrdTxtFld.setBounds(50,190,200,20);
                frame.add(pssWrdTxtFld);

                JButton loginButton = new JButton("LOGIN");
                loginButton.setBounds(100,250,100,20);
                frame.add(loginButton);

                JButton registerButton = new JButton("REGISTER");
                registerButton.setBounds(230,200,100,20);
                frame.add(registerButton);

                frame.setSize(400,500);
                frame.setVisible(true);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                
            }
    }