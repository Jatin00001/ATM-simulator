
package bank.management.system;
import javax.swing.*;   // jframe jlabel setbonfds etc.....
import java.awt.*; // for color editing in label things and much more
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton savingacc,Fixeddacc,currentacc,recuringdacc;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String fnumber ;
    
    SignupThree (String fnumber) {
        this.fnumber = fnumber;
        setTitle("New Account Application Form - Page : 3"); // frame title   4
        setLayout(null);

        JLabel Account_Details = new JLabel("Page 3: Account Details");
        Account_Details.setFont(new Font("Raleway",Font.BOLD,30));
        Account_Details.setBounds(280, 40, 400, 40);   //set bounds by default null kr diya h
        add(Account_Details);
        
        
        
        
        
        JLabel account_Type = new JLabel("Account Type ");
        account_Type.setFont(new Font("Osward",Font.BOLD,20));
        account_Type.setBounds(100, 140, 200,30);   //set bounds by default null kr diya h
        add(account_Type);
        
        
        savingacc = new JRadioButton("Saving Account");
        savingacc.setBounds(100,180,180,20);
        savingacc.setBackground(Color.WHITE);
        add(savingacc);
        
        Fixeddacc = new JRadioButton("Fixed Deposit Account");
        Fixeddacc.setBounds(350,180,180,20);
        Fixeddacc.setBackground(Color.WHITE);
        add(Fixeddacc);
        
        currentacc = new JRadioButton("Current Account");
        currentacc.setBounds(100,220,180,20);
        currentacc.setBackground(Color.WHITE);
        add(currentacc);
        
        recuringdacc = new JRadioButton("Recuring Deposit Account");
        recuringdacc.setBounds(350,220,180,20);
        recuringdacc.setBackground(Color.WHITE);
        add(recuringdacc);
        
        ButtonGroup accgrp = new ButtonGroup();
        accgrp.add(savingacc);
        accgrp.add(Fixeddacc);
        accgrp.add(currentacc);
        accgrp.add(recuringdacc);
        
        
        
        JLabel card_number = new JLabel("Card Number ");
        card_number.setFont(new Font("Osward",Font.BOLD,20));
        card_number.setBounds(100, 300, 200,30);   //set bounds by default null kr diya h
        add(card_number);
        
        JLabel dummynumber = new JLabel("XXXX-XXXX-XXXX-XXXX");
        dummynumber.setFont(new Font("Osward",Font.BOLD,20));
        dummynumber.setBounds(330, 300, 300,30);   //set bounds by default null kr diya h
        add(dummynumber);
        
        JLabel digital_c_number = new JLabel("Your 10 Digit Card Number :");
        digital_c_number.setFont(new Font("Osward",Font.BOLD,10));
        digital_c_number.setBounds(100, 320, 150,30);   //set bounds by default null kr diya h
        add(digital_c_number);
        
        
        
        // pin section
        JLabel pin = new JLabel("Pin :");
        pin.setFont(new Font("Osward",Font.BOLD,20));
        pin.setBounds(100, 370, 150,30);   //set bounds by default null kr diya h
        add(pin);
        JLabel dummypin = new JLabel("XXXX-XXXX-XXXX-4104");
        dummypin.setFont(new Font("Osward",Font.BOLD,20));
        dummypin.setBounds(330, 370, 300,30);   //set bounds by default null kr diya h
        add(dummypin);
        JLabel digiital_p_num = new JLabel("Your 4 Digit Password :");
        digiital_p_num.setFont(new Font("Osward",Font.BOLD,10));
        digiital_p_num.setBounds(100, 390, 150,30);   //set bounds by default null kr diya h
        add(digiital_p_num);
        
        
        
         JLabel servicereq = new JLabel("Service Required: ");
         servicereq.setFont(new Font("Osward",Font.BOLD,20));
        servicereq.setBounds(100, 430, 250,30);   //set bounds by default null kr diya h
        add(servicereq);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,470,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
         c2.setBounds(350,470,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
         c3.setBounds(100,520,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,520,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
         c5.setBounds(100,570,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
         c6.setBounds(350,570,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,620,600,20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 12));
        submit.setBounds(250,680,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 12));
        cancel.setBounds(420,680,100,30);
        cancel.addActionListener(this);
        add(cancel);

        
        getContentPane().setBackground(Color.WHITE); // 11   //import awt.color

        setSize(850,800);
        setLocation(350,20);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String accountType = null;
        if(ae.getSource() == submit) {
            if(savingacc.isSelected()) {
                accountType = "Saving Account";
            }else if(Fixeddacc.isSelected()) {
                accountType= "Fixed Deposit Account";
            }else if(currentacc.isSelected()) {
                accountType= "Current Account";
            }else if(recuringdacc.isSelected()) {
                accountType= "Recuring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = ""+Math.abs((random.nextLong() % 90000000L) +5040936000000000L);
            
            String pinnumber = ""+ Math.abs((random.nextLong()%9000L ) + 1000L);
            
            String facility = "";
//            if(c1.isSelected()) {
//                facility = facility + " ATM Card";
//            } else if(c2.isSelected()) {
//                facility = facility + " Internet Banking";
//            }else if(c3.isSelected()) {
//                facility = facility + " Mobile Banking";
//            }else if(c4.isSelected()) {
//                facility = facility + " EMAIL & SMS Alert ";
//            }else if(c5.isSelected()) {
//                facility = facility + " Cheque Book";
//            }else if(c6.isSelected()) {
//                facility = facility + " E-Statement ";
//            }
//            
            if(c1.isSelected()) {
                facility = facility + " ATM Card,";
            }  if(c2.isSelected()) {
                facility = facility + " Internet Banking,";
            } if(c3.isSelected()) {
                facility = facility + " Mobile Banking,";
            } if(c4.isSelected()) {
                facility = facility + " EMAIL & SMS Alert,";
            } if(c5.isSelected()) {
                facility = facility + " Cheque Book,";
            } if(c6.isSelected()) {
                facility = facility + " E-Statement.";
            }
//            System.out.print(facility);
            
            try{
                
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "name is required");    // for validation means (popup/dialog)   when any feild is empty
                } else{
                    Conn c  = new Conn();
                    String query1 = "insert into signupthree values('"+fnumber+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+fnumber+"', '"+cardnumber+"', '"+pinnumber+"')";
                    // for execute this query
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number " + cardnumber + "\n Pin: " + pinnumber);
                    System.out.println("Card Number " + cardnumber + "\n Pin: " + pinnumber);
                }
                // after submit form then add some amount 
                setVisible(false);
                new Deposit(pinnumber).setVisible(true);
                
                
            } catch(Exception esignup3){
                System.out.println(esignup3);
            }
//            
            
            
        } else if(ae.getSource() == cancel) {
            setVisible(false);  // for close means cancel button
            new Login().setVisible(true);   // forward to login page()  ;            
        }
        
    }
    
    public static void main (String args[] ) {
        new SignupThree("");
    }
}
