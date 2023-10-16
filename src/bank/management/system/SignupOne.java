package bank.management.system;
//jdbc connectivity impt 

import javax.swing.*;   // jframe jlabel setbonfds etc.....
import java.awt.*;    // for color  `
//import java.sql.*;
import java.util.*; //for random values
import com.toedter.calendar.JDateChooser;  // for date and cal
import java.awt.event.*; // for action listener


public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fatherTextField ,emailTextField,addrressTextField ,cityTextField ,stateTextField,pincodeTextField;
    JRadioButton male,female,maritalmarried,maritalunmarried,maritalother;
    ButtonGroup gendergroup,meritalgroup;
    JDateChooser dateChooser;
    JButton next;
    
    SignupOne(){
        
        setTitle("Automatic Teller Machine"); // frame title   4
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs( ( ran.nextLong() %9000L) + 1000L);
        JLabel formno = new JLabel("Application Form No." + random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);   //set bounds by default null kr diya h
        add(formno);
        
        // personal details
        
        JLabel personalDetails = new JLabel("Page-1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290, 80, 400,30);   //set bounds by default null kr diya h
        add(personalDetails);
        
        
        
        //name 
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Osward",Font.BOLD,20));
        name.setBounds(100, 140, 100,30);   //set bounds by default null kr diya h
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Ralway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        
        JLabel fname = new JLabel("Father;s Name:");
        fname.setFont(new Font("Osward",Font.BOLD,20));
        fname.setBounds(100, 190, 200,30);   //set bounds by default null kr diya h
        add(fname);
        fatherTextField = new JTextField();
        fatherTextField.setFont(new Font("Ralway",Font.BOLD,14));
        fatherTextField.setBounds(300,190,400,30);
        add(fatherTextField);
        
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Osward",Font.BOLD,20));
        dob.setBounds(100, 240, 200,30);   //set bounds by default null kr diya h
        add(dob);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
//        dateChooser.setForeground(new Color(105,105,105));   // FOR RGB COLORS
        dateChooser.setForeground(Color.WHITE);
        add(dateChooser);
        
        
       
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Osward",Font.BOLD,20));
        gender.setBounds(100, 290, 200,30);   //set bounds by default null kr diya h
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
        
        
        
        
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Osward",Font.BOLD,20));
        email.setBounds(100, 340, 200,30);   //set bounds by default null kr diya h
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Ralway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Osward",Font.BOLD,20));
        marital.setBounds(100, 390, 200,30);   //set bounds by default null kr diya h
        add(marital);
        
        maritalmarried = new JRadioButton("married");
        maritalmarried.setBounds(300,390,100,30);
        maritalmarried.setBackground(Color.WHITE);
        add(maritalmarried);
        
        
        maritalunmarried=  new JRadioButton("unmarried");
        maritalunmarried.setBounds(450,390,100,30);
        maritalunmarried.setBackground(Color.WHITE);
        add(maritalunmarried);
        
        maritalother =  new JRadioButton("other");
        maritalother.setBounds(630,390,100,30);
        maritalother.setBackground(Color.WHITE);
        add(maritalother);
        
        
        meritalgroup = new ButtonGroup();
        meritalgroup.add(maritalmarried);
        meritalgroup.add(maritalunmarried);
        meritalgroup.add(maritalother);

        
      
        
        
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Osward",Font.BOLD,20));
        address.setBounds(100, 440, 200,30);   //set bounds by default null kr diya h
        add(address);
        addrressTextField = new JTextField();
        addrressTextField.setFont(new Font("Ralway",Font.BOLD,14));
        addrressTextField.setBounds(300,440,400,30);
        add(addrressTextField);
        
        
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Osward",Font.BOLD,20));
        city.setBounds(100, 490, 200,30);   //set bounds by default null kr diya h
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Ralway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Osward",Font.BOLD,20));
        state.setBounds(100, 540, 200,30);   //set bounds by default null kr diya h
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Ralway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Osward",Font.BOLD,20));
        pincode.setBounds(100, 590, 200,30);   //set bounds by default null kr diya h
        add(pincode);
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Ralway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);     
        
        
        getContentPane().setBackground(Color.white); // 11   //import awt.color
        
        setSize(850,800);
        setLocation(350,20);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String  formno = "" + random; // "" + krne s concate ho jata h     (long number into string)
        String name = nameTextField.getText(); // setText nekalna and get s lena 
        String fname = fatherTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        }else if (female.isSelected()) {
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
        String marital = null;
        if(maritalmarried.isSelected()) {
            marital = "Married";
        }else if(maritalunmarried.isSelected()) {
            marital = "Unmarried";
        }else if(maritalother.isSelected()){
            marital = "Other";
        }
        
        String address = addrressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        // check kreke sab thiik h ya ne kyuke mysql ek external entitiy h esleai runtime pr error a sakta hai
         // exceptional handeling krne h 
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "name is required");    // for validation means (popup/dialog)   when any feild is empty
            } else{
                Conn c  = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                // for execute this query
                c.s.executeUpdate(query);
//                System.out.println("Form no is " + query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
            
            
        } catch(Exception esignup1) {
            System.out.print(esignup1);
        }

        
        // check over data using sout
        System.out.println("Form no is " + formno);
        System.out.println("Name is " + name);
        System.out.println("fname is " + fname);
        System.out.println("dob is " + dob);
        System.out.println("gender is " + gender);
        System.out.println("email is " + email);
        System.out.println("marital is " + marital);
        System.out.println("address is " + address);
        System.out.println("city is " + city);
        System.out.println("state is " + state);
        System.out.println("pin is " + pin);      
        
    }
    
    public static void main(String[] args) {
        
        new SignupOne();
    }
}
