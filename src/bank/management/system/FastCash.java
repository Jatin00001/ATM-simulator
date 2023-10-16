package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;   // for date class and ip /op

public class FastCash  extends JFrame implements ActionListener {
    JTextField amount;
    JButton hund,back,fivehun,oneTho,twoTho,fiveTho,tenTho;
    
    String pinnumber;
    FastCash(String pinnumber) {
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);  // setLayout(null) then you see frame 
        add(image);
        
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(170,300,400,20);   
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16)); // text default size is 12 14
//        add(text);  // does not show any text bcos image ke neche aya h text but hame image ke upr lana h text ko\
        image.add(text); // image ke upr aya h text ese krne pr 
        
        // text field
//        amount = new JTextField();
//        amount.setFont(new Font("Raleway", Font.BOLD, 16)); // text default size is 12 14
//        amount.setBounds(170,350,320,25);
//        image.add(amount);
        
        // 2  buttons 
        hund = new JButton("Rs 100"); 
        hund.setBounds(170,395,150,25);
        hund.addActionListener(this);
        image.add(hund);
        
        
        fivehun = new JButton("Rs 500"); 
        fivehun.setBounds(355,395,150,25);        
        fivehun.addActionListener(this);
        image.add(fivehun);
        
        
        
        oneTho = new JButton("Rs 1000"); 
        oneTho.setBounds(170,430,150,25);        
        oneTho.addActionListener(this);
        image.add(oneTho);
        
        
        twoTho = new JButton("Rs 2000"); 
        twoTho.setBounds(355,430,150,25);        
        twoTho.addActionListener(this);
        image.add(twoTho);
        
        
        fiveTho = new JButton("Rs 5000"); 
        fiveTho.setBounds(170,465,150,25);        
        fiveTho.addActionListener(this);
        image.add(fiveTho);
        
        tenTho = new JButton("Rs 10000"); 
        tenTho.setBounds(355,465,150,25);        
        tenTho.addActionListener(this);
        image.add(tenTho);
        
        back = new JButton("Back"); 
        back.setBounds(355,495 ,150,30);        
        back.addActionListener(this);
        image.add(back);
//        back.setBounds(355,520,150,30);
         

        
       
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true); // ye full frame show krega  
        setVisible(true); 
}
    
@Override
public void actionPerformed(ActionEvent ae) { 


    if(ae.getSource() == back){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    } else{
            String amount = ((JButton)ae.getSource()).getText().substring(3);  // type cast karege ae ek button h and button kla text uthana hai  rs.500
            Conn c = new Conn();
            
            try{
                // we check how money user have // check krna h ke money hai bhi ya nahi
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()) { // for loop one one row
                    if(rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                    
                }
                if(ae.getSource() != back && balance < Integer.parseInt(amount) ) {  //button amount hai ye
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return ;
                }
                Date date = new Date(); //sql and utils and have date type compiler confuse
                String query = "insert into bank values('"+pinnumber+"', '"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs. "+amount + " Debited Succesfully" ); 
                
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
            } catch (Exception e) {
                System.out.print(e);
            }
        }

}

    public static void main (String args[]) {
        new FastCash("");
    }
    
}

