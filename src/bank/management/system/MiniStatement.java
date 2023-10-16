package bank.management.system;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.*;


public class MiniStatement extends JFrame implements ActionListener{
    String pinnumber;
    JButton b1;
    JLabel mini;
    MiniStatement(String pinnumber) {
        this.pinnumber = pinnumber; 
        setTitle("Mini Statement");
        setLayout(null);
        
        
        // in this jlabel we add dynamic values direct from db
        mini = new JLabel();
        add(mini);
        
        
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);        
        
        
        JLabel cardno =new  JLabel();
        cardno.setBounds(20,80,300,20);
        add(cardno);
        
        JLabel bal = new JLabel();
        bal.setBounds(20, 400, 300, 20);
        add(bal);
        // fetch from card number   
        
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
//            ResultSet rs = conn.s.executeQuery("select * from login where pin = '1234'");
            while(rs.next()) {
                cardno.setText("card Number: "+rs.getString("cardnumber").substring(0,4) + "xxxxxxx" + rs.getString("cardnumber").substring(12)  );
                
            }
            
        }catch(Exception etrans) {
            System.out.println(etrans);
        }
        
        
        // for how many transaction 
        try{
             int balance = 0;
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rs.next()) {
                mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
                
            }
            bal.setText("Your Current account Balance is Rs "+balance);
            
        }catch(Exception emini) {
            System.out.println(emini);
        }
        mini.setBounds(20, 140, 400, 200);
        
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(20, 500, 100, 25);
        b1.addActionListener(this);
        

        setSize(400,600);
        setLocation(20,20);
//        setUndecorated(true); // ye full frame show  krega 
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String args[] ) {
        new MiniStatement("");
    }
}
