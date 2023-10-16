package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;   // for date class and ip /op

public class Withdrawl  extends JFrame implements ActionListener {
    JTextField amount;
    JButton withdrawl,back;
    
    String pinnumber;
    Withdrawl(String pinnumber) {
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);  // setLayout(null) then you see frame 
        add(image);
        
        
        JLabel text = new JLabel("Enter the amount you want to withdrawl");
        text.setBounds(170,300,400,20);   
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16)); // text default size is 12 14
//        add(text);  // does not show any text bcos image ke neche aya h text but hame image ke upr lana h text ko\
        image.add(text); // image ke upr aya h text ese krne pr 
        
        // text field
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 16)); // text default size is 12 14
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        // 2  buttons 
        withdrawl = new JButton("Withdraw"); 
        withdrawl.setBounds(355,485,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back = new JButton("Back"); 
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
         

        
       
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true); // ye full frame show krega  
        setVisible(true); 
}
    
@Override
public void actionPerformed(ActionEvent ae) { 


    if(ae.getSource() == withdrawl){
        // for withdrawl make a table in sql workbanck
        
        String number = amount.getText();
        Date date = new Date();
        System.out.print(pinnumber);
        
        if(number.equals("")  ){
            JOptionPane.showMessageDialog(null, "Please enter the amount you want to Withdrawl");
        } else {

            try{
                Conn conn = new Conn();  
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(balance < Integer.parseInt(number)){
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                
                conn.s.executeUpdate("insert into bank values('"+pinnumber+"','"+date+"','Withdrawl' , '"+number+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+number+" Debited Successfully");
//                Conn conn = new Conn();
//                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl' , '"+number+"')";
                //dml command
//                conn.s.executeUpdate(query);
//                System.out.println(query);
//                JOptionPane.showMessageDialog(null, "Rs. "+number+"Withdrawl Successfully");  
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);

            } catch (Exception ewithdrawl) {
//                 ewithdrawl.printStackTrace();
                System.out.println(ewithdrawl);
            }
            
          } 



        } else if(ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }


    }

    public static void main (String args[]) {
        new Withdrawl("");
    }
    
}
