
package bankmanagementsystem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import java.util.Random;
public class SignUp_one extends JFrame implements ActionListener{
    JLabel title, name , fatherName, dob, gender, email,marital, add, city, pincode, state;
    JTextField nameT,fatherNameT, emailT,addT,pincodeT;
    JRadioButton male,female,Other,Unmarried,Married;
    JButton next1,cancle;
    ButtonGroup genderGroup,maritalGroup;
    JComboBox cityT,stateT;
    JDateChooser dobT;
    long aacNum;
    long accNums;
    

     SignUp_one() {
            setLayout(null);
            setSize(900,700);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 100);
            getContentPane().setBackground(Color.WHITE);
            Random accNum= new Random();
            accNums= Math.abs((accNum.nextLong()%9000L)+1000L);
            
            title= new JLabel("APPLICATION FORM:"+" "+accNums);
            add(title);
            title.setBounds(300, 100, 700, 30);
            title.setFont(new Font("Osward",Font.BOLD, 30));
           
            
            
            name= new JLabel("Name:");
            add(name);
            name.setBounds(200, 200, 200, 20);
            name.setFont(new Font("Osward",Font.BOLD, 20));
            
            nameT= new JTextField();
            nameT.setVisible(true);
            add(nameT);
            nameT.setBounds(420,200,250,20);
            
            
            
            fatherName= new JLabel("Father's Name:");
            add(fatherName);
            fatherName.setBounds(200, 240, 200, 20);
            fatherName.setFont(new Font("Osward",Font.BOLD, 20));
            
            fatherNameT= new JTextField();
            fatherNameT.setVisible(true);
            add(fatherNameT);
            fatherNameT.setBounds(420,240,250,20);
            
            
            
            dob= new JLabel("Date Of Birth:");
            add(dob);
            dob.setBounds(200, 280, 200, 20);
            dob.setFont(new Font("Osward",Font.BOLD, 20));
            
            dobT= new JDateChooser();
            dobT.setBounds(420, 280, 250, 20);
            dobT.setVisible(true);
            add(dobT);
            dobT.setForeground(Color.BLACK);

            
            gender= new JLabel("Gender:");
            add(gender);
            gender.setBounds(200, 320, 200, 20);
            gender.setFont(new Font("Osward",Font.BOLD, 20));
            

            
            
            male= new JRadioButton("Male");
            add(male);
            male.setBounds(420, 320, 90, 20);
            male.setBackground(Color.WHITE);

            female= new JRadioButton("Female");
            add(female);
            female.setBounds(530, 320, 90, 20);
            female.setBackground(Color.WHITE);
            
            genderGroup= new ButtonGroup();
            genderGroup.add(male);
            genderGroup.add(female);
         
            email= new JLabel("Email Address:");
            add(email);
            email.setBounds(200, 360, 200, 20);
            email.setFont(new Font("Osward",Font.BOLD, 20));
            
            emailT= new JTextField();
            emailT.setVisible(true);
            add(emailT);
            emailT.setBounds(420,360,250,20);
            
            
            
            marital= new JLabel("Marital Status:");
            add(marital);
            marital.setBounds(200, 400, 200, 20);
            marital.setFont(new Font("Osward",Font.BOLD, 20));
            
            
            Married= new JRadioButton("Marrired");
            add(Married);
            Married.setBounds(420, 400, 90, 20);
            Married.setBackground(Color.WHITE);

            Unmarried= new JRadioButton("Unmarried");
            add(Unmarried);
            Unmarried.setBounds(530, 400, 90, 20);
            Unmarried.setBackground(Color.WHITE);
            
            Other= new JRadioButton("Other");
            add(Other);
            Other.setBounds(630, 400, 90, 20);
            Other.setBackground(Color.WHITE);
            maritalGroup= new ButtonGroup();
            maritalGroup.add(Married);
            maritalGroup.add(Unmarried);
            maritalGroup.add(Other);
            
            add= new JLabel("Address:");
            add(add);
            add.setBounds(200, 440, 200, 20);
            add.setFont(new Font("Osward",Font.BOLD, 20));
            
            addT= new JTextField();
            addT.setVisible(true);
            add(addT);
            addT.setBounds(420,440,300,20);
            
            
            state= new JLabel("State:");
            add(state);
            state.setBounds(200, 480, 200, 20);
            state.setFont(new Font("Osward",Font.BOLD, 20));
            
            String states[]= {"Select State","Maharahstra","Assam","Kerla"};
            String cities[]= {"Select city"};
            stateT= new JComboBox(states);
            cityT=new JComboBox(cities);
            add(stateT);
            stateT.setBounds(420,480,250,20);
            add(cityT);
            cityT.setBounds(420,560,250,20);
            
            stateT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stateT.getSelectedItem().equals("Maharahstra")){
                    
                    cityT.removeAllItems();
                    cityT.addItem("M1");
                    cityT.addItem("M2");
                }
            }
        });
            
            
            
            pincode= new JLabel("Pin Code:");
            add(pincode);
            pincode.setBounds(200, 520, 200, 20);
            pincode.setFont(new Font("Osward",Font.BOLD, 20));
            
            pincodeT= new JTextField();
            pincodeT.setVisible(true);
            add(pincodeT);
            pincodeT.setBounds(420,520,250,20);
            
            
            city= new JLabel("City:");
            add(city);
            city.setBounds(200, 560, 200, 20);
            city.setFont(new Font("Osward",Font.BOLD, 20));
            
            
            next1 = new JButton("NEXT");
            next1.setVisible(true);
            next1.setBackground(Color.blue);
            next1.setForeground(Color.WHITE);
            add(next1);
            next1.setBounds(500, 600, 100, 20);
            next1.addActionListener(this);
            
            cancle= new JButton("Cancle");
            add(cancle);
            cancle.setBounds(630, 600, 100, 20);
            cancle.setVisible(true);
            cancle.setBackground(Color.blue);
            cancle.setForeground(Color.WHITE);
            cancle.addActionListener(this);
    }
    

    
    public static void main(String args[]) {
        new SignUp_one();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==next1){
            String accNumber=""+accNums;
        String name=nameT.getText();
        String fname=fatherNameT.getText();
        String email=emailT.getText();
        String address=addT.getText();
        String pincode=pincodeT.getText();
        
        
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

            // Create a Pattern object with the email pattern
            Pattern pattern = Pattern.compile(emailPattern);

            // Create a Matcher object with the email and the Pattern
            Matcher matcher = pattern.matcher(email);
        
        
        String dob= ((JTextField) dobT.getDateEditor().getUiComponent()).getText();
        String gender="null";
        if(male.isSelected()){
            gender="Male";
            
        }
        else if(female.isSelected()){
            gender="Female";
            
        }
        
        
        String marital="null";
        if(Married.isSelected()){
            marital="Married";
            
        }
        else if(Unmarried.isSelected()){
            marital="Unmarried";
            
        }else if(Other.isSelected()){
            marital="Other";
            
        }
        
        
        String city= (String) cityT.getSelectedItem();
        String state= (String) stateT.getSelectedItem();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is required");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            }else if(gender.equals("null")){
                JOptionPane.showMessageDialog(null, "Gender is required");
            }else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is required");
            }else if(!(matcher.matches()))  {
                  //JOptionPane.showMessageDialog(null, "Email is required");
               
                    JOptionPane.showMessageDialog(null, "Email is Invalid");
                
            }
            else if(marital.equals("null")){
                JOptionPane.showMessageDialog(null, "Marital is required");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required");
            }else if(state.equals("Select State")){
                JOptionPane.showMessageDialog(null, "State is required");
            }
            
            else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pin-Code is required");
            } else if(!(pincode.equals(""))){
//                //JOptionPane.showMessageDialog(null, "Pin-Code is required");
//                int count=Integer.parseInt(pincode);
//                int count1=count.length();
                if(pincode.length()<5){
                    JOptionPane.showMessageDialog(null, "Pin-Code is Invalid");
                }
            }
            
            else if(city.equals("Select City")){
                JOptionPane.showMessageDialog(null, "City is required");
            }
            else{
                JOptionPane.showMessageDialog(null, "Trying to insert");
                Conns c= new Conns();
                String insertSignUp1= "INSERT INTO signup VALUES ('" + accNums + "','" + name + "','" + fname + "','" + gender + "','" + marital + "','" + email + "','" + dob + "','" + pincode + "','" + city + "','" + state + "','" + address + "')";
                c.s.executeUpdate(insertSignUp1);
                setVisible(false);
                new SignUp_two(accNumber).setVisible(true);
            }   
//            JOptionPane.showMessageDialog(null, "Trying to insert");
//                Conns c= new Conns();
//                String insertSignUp1= "INSERT INTO signup VALUES ('" + accNums + "','" + name + "','" + fname + "','" + gender + "','" + marital + "','" + email + "','" + dob + "','" + pincode + "','" + city + "','" + state + "','" + address + "')";
//                c.s.executeUpdate(insertSignUp1);
//                setVisible(false);
//                new SignUp_two(accNumber).setVisible(true);

        }catch(Exception e1){
             System.err.println(e1);
            
        }
            
        }
        else if(e.getSource()==cancle){
            
            setVisible(false);
            new Login().setVisible(true);
            
        }
        
        
        
    }
    
    
}
