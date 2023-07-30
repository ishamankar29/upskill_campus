
package bankmanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class Editprofile extends JFrame implements ActionListener {
String AccNo;
JLabel title3;
JLabel title, name , fatherName, dob, gender, email,marital, add, city, pincode, state;
    JTextField nameT,fatherNameT, emailT,addT,pincodeT;
    JRadioButton male,female,Other,Unmarried,Married;
        String nameV,fnameV,dobv,genderV,emailV,maritalV,addV,stateV,pinV,cityV,religionV,categoryV,eduV,occuV,incomeV,seniorV;

    JButton next11,cancle;
    ButtonGroup genderGroup,maritalGroup;
    JComboBox cityT,stateT;
    JDateChooser dobT;
    public Editprofile(String AccNo) {
        this.AccNo=AccNo;
        setLayout(null);
            setSize(900,800);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 50);
            getContentPane().setBackground(Color.WHITE);
            
            title3= new JLabel("Account Number"+" "+AccNo);
            add(title3);
            title3.setBounds(300, 100, 700, 30);
            title3.setFont(new Font("Osward",Font.BOLD, 30));
            
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
            
            
            next11 = new JButton("NEXT");
            next11.setVisible(true);
            next11.setBackground(Color.blue);
            next11.setForeground(Color.WHITE);
            add(next11);
            next11.setBounds(600, 600, 100, 20);
            next11.addActionListener(this);
            
            cancle = new JButton("CANCLE");
            cancle.setVisible(true);
            cancle.setBackground(Color.blue);
            cancle.setForeground(Color.WHITE);
            add(cancle);
            cancle.setBounds(720, 600, 100, 20);
            cancle.addActionListener(this);
            
            
            
            try{
                Conns c= new Conns();
                String getsignup = "select * from signup where Account_no = " + AccNo + "";
                ResultSet signupOne = c.s.executeQuery(getsignup);
                //JOptionPane.showMessageDialog(null, getsignup);
//                ResultSetMetaData rsMetaData = (ResultSetMetaData) signupOne.getMetaData();
//                int columnCount = rsMetaData.getColumnCount();
                
                if (signupOne.next()) {
                    
                    JOptionPane.showMessageDialog(null, "set value ");
                    
                    
                            nameV=signupOne.getString("Name");
                            fnameV=signupOne.getString("Father_Name");
                              nameT.setText(nameV);
                            fatherNameT.setText(fnameV);
                             //JOptionPane.showMessageDialog(null, fnameV);
                             //String getDate = "select DateOfBirth from signup where Account_no = " + AccNo + "";
                             //ResultSet dates = c.s.executeQuery(getsignup);
                            // Date dobv= signupOne.getDate("DateOfBirth");
                            // JOptionPane.showMessageDialog(null, dobv);
                             //dobv=signupOne.getString("DateOfBirth");
                             genderV=signupOne.getString("Gender");
                             emailV=signupOne.getString("Email");
                             maritalV=signupOne.getString("Marital_Status");
                             addV=signupOne.getString("Address");
                             stateV=signupOne.getString("State");
                             pinV=signupOne.getString("Pin_code");
                             cityV=signupOne.getString("City");
                             
                             
                             
                           
                            emailT.setText(emailV);
                            addT.setText(addV);
                            pincodeT.setText(pinV);


                            //dobT.setDate(dobv);
                            //String gender="null";
                            if(genderV.trim().equals("Male")){
                                male.setSelected(true);

                            }
                            else if(genderV.trim().equals("Female")){
                                female.setSelected(true);;

                            }
                            //JOptionPane.showMessageDialog(null, genderV);


                            //String marital="null";
                            if(maritalV.trim().equals("Married")){
                                 Married.setSelected(true);

                            }
                            else if(maritalV.trim().equals("Unmarried")){
                                Unmarried.setSelected(true);

                            }else if(maritalV.trim().equals("Other")){
                                Other.setSelected(true);

                            }


                             cityT.setSelectedItem(cityV);
                             stateT.setSelectedItem(stateV);

                           }

            
        }catch(Exception ee){
            System.err.println(ee);
        }
               
        
            
            
            
    }
 
   
    public static void main(String args[]) {
       new Editprofile("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        //JOptionPane.showMessageDialog(null, "done1 ");
        //String accNumber=""+accNums;
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
        
        
        String marital="Other";
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
        if(e.getSource()==next11){
             try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is required");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            }
            else if(gender.equals("null")){
                JOptionPane.showMessageDialog(null, "Gender is required");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is required");
            }else if(!(email.equals(""))){
                if (matcher.matches()) {
                  //JOptionPane.showMessageDialog(null, "Email is required");
                } else {
                    JOptionPane.showMessageDialog(null, "Email is Invalid");
                }
            }
            else if(marital.equals("null")){
                JOptionPane.showMessageDialog(null, "Marital is required");
            }
            else if(add.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required");
            }else if(state.equals("Select State")){
                JOptionPane.showMessageDialog(null, "State is required");
            }else if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pin-Code is required");
            }else if(!(pincode.equals(""))){

                if(pincode.length()<5){
                    JOptionPane.showMessageDialog(null, "Pin-Code is Invalid");
                }
            }
            
            else if(city.equals("Select City")){
                JOptionPane.showMessageDialog(null, "City is required");
            }
            else{
               
                JOptionPane.showMessageDialog(null, "reset value ");
                Conns c= new Conns();
                String insertSignUp1="UPDATE  signup SET Name='" + name + "', Father_Name='" + fname + "', DateOfBirth='" + dob + "', Gender='" + gender + "', Email='" + email + "', Marital_Status='" + marital + "', Address='" + address + "', State='" + state + "', Pin_code='" + pincode + "', City='" + city +"' where Account_no='"+AccNo+"'";

                c.s.executeUpdate(insertSignUp1);
                JOptionPane.showMessageDialog(null, "Section One Updated ");
                setVisible(false);
                new Editprofiletwo(AccNo).setVisible(true);
                
                
                
            }   
            
            

            }catch(Exception e1){
                 System.err.println(e1);

            }
        }
        else if( e.getSource()==cancle){
            setVisible(false);
            
            new Menu(AccNo).setVisible(true);
        }
       
    }
}
