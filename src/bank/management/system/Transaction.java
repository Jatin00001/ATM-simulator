package bank.management.system;
import javax.swing.*;
import java.awt.*; //  for image and color objects
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceEnq ,exit;
    String pinnumber;
    Transaction (String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select Your Transaction");
        text.setBounds(235,300,700,35);   
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 10));
//        add(text);  // does not show any text bcos image ke neche aya h text but hame image ke upr lana h text ko\
       image.add(text); // image ke upr aya h text ese krne pr 
        
       
       
       // atm buttons
       
       deposit = new JButton("Deposit"); 
       deposit.setBounds(170,395,150,25);
//       deposit.setBackground(Color.WHITE);
//       deposit.setBorder(null);
//       deposit.setBorder(Color.BLACK);
//       deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
       image.add(deposit);
       
       withdrawl = new JButton("Cash Withdrawl"); 
       withdrawl.setBounds(355,395,150,25);
       withdrawl.addActionListener(this);
       image.add(withdrawl);
       
        fastcash = new JButton("Fast Cash"); 
       fastcash.setBounds(170,430,150,25);
       fastcash.addActionListener(this);
       image.add(fastcash);
       
       ministatement = new JButton("Mini Statement"); 
       ministatement.setBounds(355,430,150,25);
       ministatement.addActionListener(this);
       image.add(ministatement);
       
       pinchange = new JButton("Pin change"); 
       pinchange.setBounds(170,465,150,25);
       pinchange.addActionListener(this);
       image.add(pinchange);
       
       balanceEnq = new JButton("Balance Enquiry"); 
       balanceEnq.setBounds(355,465,150,25);
       balanceEnq.addActionListener(this);
       image.add(balanceEnq);
       
       exit = new JButton("Exit"); 
       exit.setBounds(355,495,150,25);
       exit.addActionListener(this);
       image.add(exit);
       
       
       
       
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true); // ye full frame show krega  
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) { 
    
        if(ae.getSource() == exit) {
            System.exit(0);
        } else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl) {
            setVisible(false); // current frame 
            new Withdrawl(pinnumber).setVisible(true); 
        } else if(ae.getSource()== fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() == pinchange) {
             setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balanceEnq) {
             setVisible(false);
             new BalanceEnqire(pinnumber). setVisible(true);
        } else if (ae.getSource() == ministatement) {
            new MiniStatement(pinnumber).setVisible(true);
        }
        
    }
    public static void main(String args[] ) {
        new Transaction("");
    }
}
