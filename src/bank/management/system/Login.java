package bank.management.system;  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField  cardTextField;
    JPasswordField pinTextField; //for hiding over password 
    
    Login() {         // constructor
        setTitle("ATM"); // frame title   4
        setLayout(null);    // 11
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  //5  // pick up our image from pc 
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);    //  6 for scalling over image on frame
        ImageIcon i3 = new ImageIcon(i2);                                     // 7 this is trick for set scalong image in frame
//        icon size change using scaling
        JLabel label = new JLabel(i3);  // 8
        label.setBounds(70,10,100,100);  // 9 frame m image ke location ko chnage krna by defaullt does not show any thing   this is custum layout
        add(label);   // 10
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);   //set bounds by default null kr diya h
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);   //set bounds by default null kr diya h
        add(cardno);
        // card filed
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,20));
        add(cardTextField);
      
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120, 220, 150, 30);   //set bounds by default null kr diya h
        add(pin);
          // pin text field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,20));   // for text field text size 
        add(pinTextField);
        
        //login functionallity
        login = new JButton("Login IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        
        
        // sign up  data
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);
        
        getContentPane().setBackground(Color.white); // 11
        
        // Initial framing
        setSize(800,480);  // frame size    1
        setVisible(true);    // true for visible over frame   2
        setLocation(1000,200); // pop up image set location  3
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
//        i have 3 button but we have 3 buyttons but kkonsa hua h konse component pr hua h 
        if(e.getSource() == clear) {
            cardTextField.setText(" ");
            pinTextField.setText("");
            
        }else if(e.getSource() == login) {
            
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();  // ye cross esleai  h password ke sath get text work ne krta but chl jaiga
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' " ;
            
            try{
                Conn conn = new Conn();
                ResultSet rs = conn.s.executeQuery(query);  // for searching db from db my sql return type is resultset thats why we use this class
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card number or pin");
                }
            } catch (Exception elogin){
                System.out.println(elogin);
            }
            
        }else if(e.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
 
    
    public static void main(String[] args) {
        new Login();
    }
}
