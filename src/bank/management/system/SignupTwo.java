package bank.management.system;
//jdbc connectivity impt 

import javax.swing.*;   // jframe jlabel setbonfds etc.....
import java.awt.*;    // for color  `
//import java.sql.*;

import java.awt.event.*; // for action listener


public class SignupTwo extends JFrame implements ActionListener{
    
   
    JTextField panTextField,aadharnumber;
    JRadioButton syes,syno,exist,existno;
    JButton next;
    JComboBox religion1,category,income,education,occupation;
    
    String fnumber;
    SignupTwo(String fnumber){
        this.fnumber = fnumber;
        setTitle("New Account Application Form - Page : 2"); // frame title   4
        setLayout(null);
    
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,38));
        AdditionalDetails.setBounds(140, 20, 600, 40);   //set bounds by default null kr diya h
        add(AdditionalDetails);
        
     
        
        
        
        //name 
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Osward",Font.BOLD,20));
        religion.setBounds(100, 140, 100,30);   //set bounds by default null kr diya h
        add(religion);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christan","Other"};
        religion1 = new JComboBox(valReligion);
        religion1.setBounds(300,140,400,30);
        religion1.setBackground(Color.WHITE);
        add(religion1);
        

        
        
        JLabel categ = new JLabel("Category:");
        categ.setFont(new Font("Osward",Font.BOLD,20));
        categ.setBounds(100, 190, 200,30);   //set bounds by default null kr diya h
        add(categ);
        
        String valcategory[] = {"General","OBC","SC","ST","other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel incm = new JLabel("Income:");
        incm.setFont(new Font("Osward",Font.BOLD,20));
        incm.setBounds(100, 240, 200,30);   //set bounds by default null kr diya h
        add(incm);
        
        String incomecategory[] = { "Null", "<1,50,000", "< 2,50,000","< 5,00,000" ,"Upto 10,00,000" };        
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
       
        
        
        JLabel edu = new JLabel("Educational");
        edu.setFont(new Font("Osward",Font.BOLD,20));
        edu.setBounds(100, 290, 200,30);   //set bounds by default null kr diya h
        add(edu);
        String educationcat[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education =  new JComboBox(educationcat);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 310, 200,30); 
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        add(education);

        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Osward",Font.BOLD,20));
        Qualification.setBounds(100, 315, 200,30);   //set bounds by default null kr diya h
        add(Qualification);
        
        
        
        
        JLabel occuptn = new JLabel("Occupation:");
        occuptn.setFont(new Font("Osward",Font.BOLD,20));
        occuptn.setBounds(100, 390, 200,30);   //set bounds by default null kr diya h
        add(occuptn);
        
        String occupation1[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupation1);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300,390,100,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        
      
        
        
        
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Osward",Font.BOLD,20));
        pan.setBounds(100, 440, 200,30);   //set bounds by default null kr diya h
        add(pan);
        panTextField = new JTextField();
        panTextField.setFont(new Font("Ralway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        
        
        JLabel aadhar = new JLabel("Aadhar number:");
        aadhar.setFont(new Font("Osward",Font.BOLD,20));
        aadhar.setBounds(100, 490, 200,30);   //set bounds by default null kr diya h
        add(aadhar);
        aadharnumber = new JTextField();
        aadharnumber.setFont(new Font("Ralway",Font.BOLD,14));
        aadharnumber.setBounds(300,490,400,30);
        add(aadharnumber);
        
        
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Osward",Font.BOLD,20));
        state.setBounds(100, 540, 200,30);   //set bounds by default null kr diya h
        add(state);
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,60,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        
        syno = new JRadioButton("No");
        syno.setBounds(450,540,120,30);
        syno.setBackground(Color.WHITE);
        add(syno);
       
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(syno);
        
       
        
        JLabel Existing = new JLabel("Existing Account:");
        Existing.setFont(new Font("Osward",Font.BOLD,20));
        Existing.setBounds(100, 590, 200,30);   //set bounds by default null kr diya h
        add(Existing);
        
        exist = new JRadioButton("Yes");
        exist.setBounds(300,590,60,30);
        exist.setBackground(Color.WHITE);
        add(exist);
        
        
        existno = new JRadioButton("No");
        existno.setBounds(450,590,120,30);
        existno.setBackground(Color.WHITE);
        add(existno);
       
        ButtonGroup existinaccgroup = new ButtonGroup();
        existinaccgroup.add(exist);
        existinaccgroup.add(existno);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);     
        
        
        getContentPane().setBackground(Color.WHITE); // 11   //import awt.color
        
        setSize(850,800);
        setLocation(350,20);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String religional_status= (String)religion1.getSelectedItem();   //value fetch from drop down this return a obj
        String scategory= (String)category.getSelectedItem();
        String sincome= (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        } else if(syno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String spanTextField = panTextField.getText();
        String saadharnumber = aadharnumber.getText();
        
        
        
        
        String exitaccount = null;
        if(exist.isSelected())
        {
            seniorcitizen = "Yes";
        } else if(existno.isSelected()) {
            seniorcitizen = "No";
        }
        
        
       try{
            if(religional_status.equals("")){
                JOptionPane.showMessageDialog(null, "name is required");    // for validation means (popup/dialog)   when any feild is empty
            } else{
                Conn c  = new Conn();
                String query = "insert into signuptwo values('"+fnumber+"', '"+religional_status+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+seniorcitizen+"', '"+spanTextField+"', '"+saadharnumber+"', '"+exitaccount+"')";
                // for execute this query
                c.s.executeUpdate(query);  
                
                
                // signup3 on=bj for next page
                setVisible(false);
                new SignupThree(fnumber).setVisible(true);
                
                
            }
            
            
        } catch(Exception esignup2) {
            System.out.print(esignup2);
        }
        
        
//        System.out.println("religional is " + religional_status);
//        System.out.println("category is " + scategory);
//        System.out.println("income is " + sincome);
//        System.out.println("educational is " + seducation);
//        System.out.println("occupation is " + soccupation);
//        System.out.println("senior citizen Yes or no :  " + seniorcitizen);
//        System.out.println("pan  is " + spanTextField);
//        System.out.println("aadhar is " + saadharnumber);
//        System.out.println("existing is : " + exitaccount);     
       
        
    }
    
    public static void main(String[] args) {
        
        new SignupTwo("");
    }
}
