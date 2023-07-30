
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.*;


public class Ediiteprofilethree extends JFrame implements ActionListener{
    String AccNo;
    JTextField pinT;
     JLabel title3,acc_type,card_num,pin, Services,card_num_value,pin_num_value;
    JRadioButton savings,current, fix_Depo, recurr_depo;
    ButtonGroup accountsGroup;
    JCheckBox atm,cheque,email,estatments,agree;
    JButton submit, cancle;
    //String accNums;
    long pin_val;
    String  emailS,chequeS,atmS,agreeS,statS;
    String pinnn;
    

    public Ediiteprofilethree(String AccNo){
        this.AccNo= AccNo;
        
        
        
        setLayout(null);
            setSize(900,800);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 50);
            getContentPane().setBackground(Color.WHITE);
            
            title3= new JLabel("Account No."+" "+AccNo);
            add(title3);
            title3.setBounds(300, 100, 700, 30);
            title3.setFont(new Font("Osward",Font.BOLD, 30));
            
          
            
            
            
            
            
           
            pin= new JLabel("PIN:");
            add(pin);
            pin.setBounds(200, 200, 200, 25);
            pin.setFont(new Font("Osward",Font.BOLD, 20));
            
//            pin_num_value= new JLabel(" "+pin_val);
//            add(pin_num_value);
//            pin_num_value.setBounds(440,375,200,25);
            
            
            
            Services= new JLabel("Services Required");
            add(Services);
            Services.setBounds(200,240,200,25);
            Services.setFont(new Font("Osward",Font.BOLD, 20));
            
            atm=new JCheckBox("ATM Card");
            add(atm);
            atm.setBounds(200,280,200,25);
            atm.setBackground(Color.WHITE);
            
            
            
            
            cheque=new JCheckBox("Cheque Book");
            add(cheque);
            cheque.setBounds(440,280,200,25);
            cheque.setBackground(Color.WHITE);
            
          
            
            email=new JCheckBox("Email Alters");
            add(email);
            email.setBounds(200,320,200,25);
            email.setBackground(Color.WHITE);
            
            estatments=new JCheckBox("E-Statements");
            add(estatments);
            estatments.setBounds(440,320,200,25);
            estatments.setBackground(Color.WHITE);
            
            agree=new JCheckBox("I agree that above entered details are correct.");
            add(agree);
            agree.setBounds(200,540,400,25);
           agree.setBackground(Color.WHITE);
            
            submit= new JButton("Submit");
            add(submit);
            submit.setBounds(300, 570, 150, 30);
            submit.setBackground(Color.blue);
            submit.setForeground(Color.WHITE);
            submit.addActionListener(this);
            
            
            cancle= new JButton("Cancle");
            add(cancle);
            cancle.setBounds(470, 570, 150, 30);
            cancle.setBackground(Color.blue);
            cancle.setForeground(Color.WHITE);
            cancle.addActionListener(this);
            
            
            try{
                
                 Conns c= new Conns();
                String getsignupthree = "select * from signupThree where Account_no = " + AccNo + "";
                ResultSet signupThree = c.s.executeQuery(getsignupthree);
                //JOptionPane.showMessageDialog(null, getsignup);
//                ResultSetMetaData rsMetaData = (ResultSetMetaData) signupOne.getMetaData();
//                int columnCount = rsMetaData.getColumnCount();
                
                if (signupThree.next()) {
                          pinnn=signupThree.getString("Pin_num");
                             atmS=signupThree.getString("Atm_Ser");
                             emailS=signupThree.getString("Email_ser");
                             chequeS=signupThree.getString("Cheque_ser");
                             statS=signupThree.getString("estatement_ser");
                             agreeS=signupThree.getString("Agree");
                              
            pinT= new JTextField(pinnn);
            pinT.setVisible(true);
            add(pinT);
            pinT.setBounds(440,200,200,25);
                             
                  


             if (atmS.trim().equals("1")) {
                    atm.setSelected(true);
                } else if (emailS.trim().equals("1")) {
                    email.setSelected(true);
                } else if (chequeS.trim().equals("1")) {
                    cheque.setSelected(true);
                } else if (statS.trim().equals("1")) {
                    estatments.setSelected(true);
                }
                if(agreeS.trim().equals("1")){
                   agree.setSelected(true);
                }
            
                            

                }
                
//               
//                
                
            }catch(Exception ee){
                System.err.println(ee);
            }
            
            
        
        
    }

    
    public static void main(String args[]) {
        new Ediiteprofilethree("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
       String acc_type,card_value,pin_value;
        String atmSS="0",emailSS="0",chequeSS="0",estateSS="0",agreeSS="0";
        
        pin_value=pinT.getText();
        
        if(e.getSource()==submit){
               


                if(atm.isSelected()){
                    atmSS="1";
                                           // JOptionPane.showMessageDialog(null, atmSS);

                }else if(email.isSelected()){
                    emailSS="1";
                    // JOptionPane.showMessageDialog(null, emailSS);
                }else if(cheque.isSelected()){
                    chequeSS="1";
                }else if(estatments.isSelected()){
                   // JOptionPane.showMessageDialog(null, chequeSS);
                    estateSS="1";
                }

                if(agree.isSelected()){
                    agreeSS="1";
                }
            
            
                try{

                    if(pinT.equals("null")){
                         JOptionPane.showMessageDialog(null, "Pin Number is required");
                    }else{
                        Conns c= new Conns();
                       
                        
                        String insertSignUp3= "UPDATE signupThree SET Pin_num='" + pin_value + "', Atm_ser='" + atmSS + "', Email_ser='" + emailSS + "', Cheque_ser='" + chequeSS + "', estatement_ser='" + estateSS + "', Agree='" + agreeSS + "'where Account_no='" + AccNo + "'";
                        c.s.executeUpdate(insertSignUp3);
                        
                        String insertLogin= "Update  login SET Pin_num='" + pin_value +"' where Account_num='"+AccNo+"'";
                        c.s.executeUpdate(insertLogin);
                        
                       
                        setVisible(false);
                        JOptionPane.showMessageDialog(null, "Profile Successfully Updated");
                        new Menu(AccNo).setVisible(true);
                    }
                }catch(Exception e3){
                    System.err.println(e3);

                }


               
        }
        else if(e.getSource()==cancle){
            setVisible(false);
            new Menu(AccNo).setVisible(true);
        }
        
        
       
    }
}
