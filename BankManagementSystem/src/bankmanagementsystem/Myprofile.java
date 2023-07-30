
package bankmanagementsystem;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;

public class Myprofile extends JFrame implements ActionListener{
    String AccNo;
    JLabel name,fname,dob,gender,email,marital,add,state,pin,city,religion,category,edu,occu,income,senior,card,title3;
    JLabel nameS,fnameS,dobS,genderS,emaiS,maritalS,addS,stateS,pinS,cityS,religionS,categoryS,eduS,occuS,incomeS,seniorS,cardS,pinNS,foor_loop;
    String nameV,fnameV,dobv,genderV,emailV,maritalV,addV,stateV,pinV,cityV,religionV,categoryV,eduV,occuV,incomeV,seniorV;
    JButton back;

    public Myprofile(String AccNo) {
        this.AccNo=AccNo;
        
            setLayout(null);
            setSize(900,800);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 50);
            getContentPane().setBackground(Color.WHITE);
            
            title3= new JLabel("My Profile"+" "+AccNo);
            add(title3);
            title3.setBounds(300, 100, 700, 30);
            title3.setFont(new Font("Osward",Font.BOLD, 30));
            
            card= new JLabel("Card No.:");
            add(card);
            card.setBounds(100, 200, 100, 20);
            card.setVisible(true);
            
         
            
            pin= new JLabel("PIN:");
            add(pin);
            pin.setBounds(100, 230, 100, 20);
            pin.setVisible(true);
            
            name= new JLabel("Name:");
            add(name);
            name.setBounds(100, 260, 100, 20);
            name.setVisible(true);
            
            fname= new JLabel("Father's Name:");
            add(fname);
            fname.setBounds(100, 290, 100, 20);
            fname.setVisible(true);
            
            dob= new JLabel("Date Of Birth:");
            add(dob);
            dob.setBounds(100, 320, 100, 20);
            dob.setVisible(true);
            
            gender= new JLabel("Gender:");
            add(gender);
            gender.setBounds(100, 350, 100, 20);
            gender.setVisible(true);
            
            email= new JLabel("Email:");
            add(email);
            email.setBounds(100, 380, 100, 20);
            email.setVisible(true);
            
            marital= new JLabel("Martial Status:");
            add(marital);
            marital.setBounds(100, 410, 100, 20);
            marital.setVisible(true);
            
            add= new JLabel("Address:");
            add(add);
            add.setBounds(100, 440, 100, 20);
            add.setVisible(true);
            
            state= new JLabel("State:");
            add(state);
            state.setBounds(100, 470, 100, 20);
            state.setVisible(true);
            
           
            
            city= new JLabel("City:");
            add(city);
            city.setBounds(100, 500, 100, 20);
            city.setVisible(true);
            
            religion= new JLabel("Religion:");
            add(religion);
            religion.setBounds(100, 530, 100, 20);
            religion.setVisible(true);
            
            
            category= new JLabel("Category:");
            add(category);
            category.setBounds(100, 560, 100, 20);
            category.setVisible(true);
            
            
            edu= new JLabel("Education:");
            add(edu);
            edu.setBounds(100, 590, 100, 20);
            edu.setVisible(true);
            
            occu= new JLabel("Occupation:");
            add(occu);
            occu.setBounds(100, 620, 100, 20);
            occu.setVisible(true);
            
            income= new JLabel("Income:");
            add(income);
            income.setBounds(100, 650, 100, 20);
            income.setVisible(true);
            
            senior= new JLabel("Senior Citizen:");
            add(senior);
            senior.setBounds(100, 680, 100, 20);
            senior.setVisible(true);
            
            
            
            back= new JButton("Back");
            add(back);
            back.setBounds(600,700,150,30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLUE);
            back.addActionListener(this);
             try{
            
                Conns c= new Conns();
                ArrayList<String> formlist= new ArrayList<>();
        
                String getsignup = "select * from signup where Account_no = " + AccNo + "";
                ResultSet signupOne = c.s.executeQuery(getsignup);
                //JOptionPane.showMessageDialog(null, getsignup);
//                ResultSetMetaData rsMetaData = (ResultSetMetaData) signupOne.getMetaData();
//                int columnCount = rsMetaData.getColumnCount();
                
                if (signupOne.next()) {
                    
                    //JOptionPane.showMessageDialog(null, "inside ");
                    
                    
                            nameV=signupOne.getString("Name");
                             fnameV=signupOne.getString("Father_Name");
                             dobv=signupOne.getString("DateOfBirth");
                             genderV=signupOne.getString("Gender");
                             emailV=signupOne.getString("Email");
                             maritalV=signupOne.getString("Marital_Status");
                             addV=signupOne.getString("Address");
                             stateV=signupOne.getString("State");
                             pinV=signupOne.getString("Pin_code");
                             cityV=signupOne.getString("City");
                             
                             
                
                             
                             
                             formlist.add(AccNo);
                             formlist.add(pinV);
                             formlist.add(nameV);
                             formlist.add(fnameV);
                             formlist.add(dobv);
                             formlist.add(genderV);
                             formlist.add(emailV);
                             formlist.add(maritalV);
                             formlist.add(addV);
                             formlist.add(stateV);
                             formlist.add(cityV);
                            
                             
                             
                             
                             
                }
                String getsignuptwo = "select * from signupTwo where Account_no = " + AccNo + "";
                ResultSet signuptwo = c.s.executeQuery(getsignuptwo);
                //JOptionPane.showMessageDialog(null, getsignuptwo);
                
                
                if (signuptwo.next()) {
                    //JOptionPane.showMessageDialog(null, "inside ");
                             religionV=signuptwo.getString("Religion");
                             categoryV=signuptwo.getString("Category");
                             eduV=signuptwo.getString("Education");
                             occuV=signuptwo.getString("Occupation");
                             incomeV=signuptwo.getString("Income");
                             seniorV=signuptwo.getString("Senior_citizen");
                             
                              formlist.add(religionV);
                             formlist.add(categoryV);
                             formlist.add(eduV);
                             formlist.add(occuV);
                             formlist.add(incomeV);
                             formlist.add(seniorV);
                             
                }
                                    int xval=200;
                                    for(String str: formlist){
                                  //JOptionPane.showMessageDialog(null, "for ");
                                    foor_loop= new JLabel(str);
                                    add(foor_loop);
                                    foor_loop.setBounds(250, xval, 100, 20);
                                    foor_loop.setVisible(true);
                                    xval=xval+30;
                             }
                
            
        }catch(Exception mp){
            System.err.println(mp);
        }
        
            
            
            
            
        
    }
    

 
    public static void main(String args[]) {
        new Myprofile("");
        
        
        
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Menu(AccNo).setVisible(true);
        }
        
    }
}


        
                             