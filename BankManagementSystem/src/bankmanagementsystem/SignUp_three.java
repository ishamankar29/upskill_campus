
package bankmanagementsystem;


import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class SignUp_three extends JFrame implements ActionListener{
    JLabel title3,acc_type,card_num,pin, Services,card_num_value,pin_num_value;
    JRadioButton savings,current, fix_Depo, recurr_depo;
    ButtonGroup accountsGroup;
    JCheckBox atm,cheque,email,estatments,agree;
    JButton submit, cancle;
    String accNums;
    long pin_val1,pin_val;
     ButtonGroup buttonGroup = new ButtonGroup();

   SignUp_three(String acc_num){
            accNums=acc_num;
       
            setLayout(null);
            setSize(900,800);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 50);
            getContentPane().setBackground(Color.WHITE);
            
            title3= new JLabel("APPLICATION FORM:"+" "+accNums);
            add(title3);
            title3.setBounds(300, 100, 700, 30);
            title3.setFont(new Font("Osward",Font.BOLD, 30));
            
            acc_type= new JLabel("Account Type:");
            add(acc_type);
            acc_type.setBounds(200, 200, 200, 25);
            acc_type.setFont(new Font("Osward",Font.BOLD, 20));
            
            
            savings=new JRadioButton("Savings");
            add(savings);
            savings.setBounds(200,240,200,25);
//            savings.setFont(new Font("Osward",Font.BOLD, 20));
            savings.setBackground(Color.WHITE);
            
            current=new JRadioButton("Current");
            add(current);
            current.setBounds(440,240,200,25);
//            current.setFont(new Font("Osward",Font.BOLD, 20));
            current.setBackground(Color.WHITE);
            
            fix_Depo=new JRadioButton("Fixed Deposite");
            add(fix_Depo);
            fix_Depo.setBounds(200,275,200,25);
//            fix_Depo.setFont(new Font("Osward",Font.BOLD, 20));
            fix_Depo.setBackground(Color.WHITE);
            
            recurr_depo=new JRadioButton("Recurring Deposite ");
            add(recurr_depo);
            recurr_depo.setBounds(440,275,250,25);
//            recurr_depo.setFont(new Font("Osward",Font.BOLD, 20));
            recurr_depo.setBackground(Color.WHITE);
            
            accountsGroup= new ButtonGroup();
            accountsGroup.add(savings);
            accountsGroup.add(current);
            accountsGroup.add(fix_Depo);
            accountsGroup.add(recurr_depo);
            
            
            card_num= new JLabel("Card Number:");
            add(card_num);
            card_num.setBounds(200,335,200,25);
            card_num.setFont(new Font("Osward",Font.BOLD, 20));
            
            card_num_value= new JLabel(accNums);
            add(card_num_value);
            card_num_value.setBounds(440,335,200,25);
            
            Random pinnum= new Random();
            pin_val= Math.abs((pinnum.nextLong()%9000L)+1000L);
            
            pin= new JLabel("PIN:");
            add(pin);
            pin.setBounds(200,375,200,25);
            pin.setFont(new Font("Osward",Font.BOLD, 20));
            
            pin_num_value= new JLabel(" "+pin_val);
            add(pin_num_value);
            pin_num_value.setBounds(440,375,200,25);
            
            
            
            Services= new JLabel("Services Required");
            add(Services);
            Services.setBounds(200,415,200,25);
            Services.setFont(new Font("Osward",Font.BOLD, 20));
            
            atm=new JCheckBox("ATM Card");
            add(atm);
            atm.setBounds(200,460,200,25);
            atm.setBackground(Color.WHITE);
            
            
            
            
            cheque=new JCheckBox("Cheque Book");
            add(cheque);
            cheque.setBounds(440,460,200,25);
            cheque.setBackground(Color.WHITE);
            
          
            
            email=new JCheckBox("Email Alters");
            add(email);
            email.setBounds(200,480,200,25);
            email.setBackground(Color.WHITE);
            
            estatments=new JCheckBox("E-Statements");
            add(estatments);
            estatments.setBounds(440,480,200,25);
            estatments.setBackground(Color.WHITE);
            
            
//            buttonGroup.add(atm);
//            buttonGroup.add(cheque);
//            buttonGroup.add(email);
//            buttonGroup.add(estatments);
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
   }
    
    public static void main(String args[]) {
        
        new SignUp_three(" ");
        
        
        
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acc_type,card_value,pin_value;
        int  atmS=0,emailS=0,chequeS=0,estateS=0,agreeS=0;
        
        
        
        if(e.getSource()==submit){
                acc_type="null";
                if(savings.isSelected()){
                    acc_type="Savings";
                }else if(current.isSelected()){
                    acc_type="Current";
                }else if(fix_Depo.isSelected()){
                    acc_type="fixed Deposit";
                }else if(recurr_depo.isSelected()){
                    acc_type="Recurring Deposit";
                }


                if(atm.isSelected()){
                    atmS=1;
                }else if(email.isSelected()){
                    emailS=1;
                }else if(cheque.isSelected()){
                    chequeS=1;
                }else if(estatments.isSelected()){
                    estateS=1;
                }

                if(agree.isSelected()){
                    agreeS=1;
                }
            
            
                try{

                    if(acc_type.equals("null")){
                         JOptionPane.showMessageDialog(null, "Account Type is required");
                    }else{
                        Conns c= new Conns();
                        String insertSignUp3= "INSERT INTO signupThree VALUES ('" + accNums + "','" + pin_val +"','" + acc_type + "','" + atmS + "','" + emailS + "','" + chequeS + "','" + estateS + "','" + agreeS + "')";
                        c.s.executeUpdate(insertSignUp3);
                        
                        String insertLogin= "INSERT INTO login VALUES ('" +accNums + "','" + pin_val +"')";
                        c.s.executeUpdate(insertLogin);
                        
                        String insertMoney= "INSERT INTO moneyInfo VALUES ('"+accNums + "','"+100+"')";
                        c.s.executeUpdate(insertMoney);
                        
                        setVisible(false);
                        new Login().setVisible(true);
                    }
                }catch(Exception e3){
                    System.err.println(e3);

                }


               
        }
        else if(e.getSource()==cancle){
            try{
                Conns c= new Conns();
            String delete= "Delete from  signuptwo where   Account_no='"+accNums+"'";
                c.s.executeUpdate(delete);
            setVisible(false);
           
            new SignUp_two(accNums).setVisible(true);
                
            }catch(Exception cancle){
                System.err.println(cancle);
            }
             
        }
        
        
       
    }
}
