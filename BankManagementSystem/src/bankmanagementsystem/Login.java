/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bankmanagementsystem;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener{
    
    JButton sign_in,sign_up,reset;
    JTextField accText;
    JPasswordField pinText;
    Login(){
            setLayout(null);
            setSize(1000,600);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 100);
            getContentPane().setBackground(Color.WHITE);
            
            JLabel header= new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
            add(header);
            header.setBounds(200, 100, 700, 30);
            header.setFont(new Font("Osward",Font.BOLD, 30));
            
            JLabel accno= new JLabel("Account No:");
            add(accno);
            accno.setBounds(200, 200, 200, 20);
            accno.setFont(new Font("Osward",Font.BOLD, 20));
            
             accText= new JTextField();
            accText.setVisible(true);
            add(accText);
            
            accText.setBounds(420,200,250,20);
            
            
            JLabel pin= new JLabel("PIN:");
            add(pin);
            pin.setBounds(200, 250, 200, 20);
            pin.setFont(new Font("Osward",Font.BOLD, 20));
            
            pinText= new JPasswordField();
            pinText.setVisible(true);
            add(pinText);
            pinText.setBounds(420,250,250,20);
            
            
            
            sign_in = new JButton("SIGN IN");
            sign_in.setVisible(true);
            sign_in.setBackground(Color.blue);
            sign_in.setForeground(Color.WHITE);
            add(sign_in);
            sign_in.setBounds(300, 300, 150, 30);
            sign_in.addActionListener(this);
            
            
            reset = new JButton("RE-SET");
            reset.setVisible(true);
            reset.setBackground(Color.blue);
            reset.setForeground(Color.WHITE);
            add(reset);
            reset.setBounds(470, 300, 150, 30);
            reset.addActionListener(this);
            
             sign_up = new JButton("SIGN UP");
            sign_up.setVisible(true);
            sign_up.setBackground(Color.blue);
            sign_up.setForeground(Color.WHITE);
            add(sign_up);
            sign_up.setBounds(300, 350, 300, 30);
            sign_up.addActionListener(this);
            
           

            
            
    }
    
    
    public static void main(String args[]) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sign_in){
            
            String Acc_num=accText.getText();
            String pin_num=pinText.getText();
            
            
            try{
                
                if(Acc_num.equals("")){
                JOptionPane.showMessageDialog(null, "Enter Account Number");
                }else if(pin_num.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter Pin");
                }else{
                    Conns c= new Conns();
                    String loginDetails= "Select * from login where Account_num='"+Acc_num+"'and Pin_num= '"+pin_num+"'";
                    ResultSet logindata=c.s.executeQuery(loginDetails);
                    
                    if(logindata.next()){
                        setVisible(false);
                        new Menu(Acc_num).setVisible(true);
                        
                          //JOptionPane.showMessageDialog(null, "Successfully logged in");
                    }else{
                        JOptionPane.showMessageDialog(null, "Wrong Credentials");
                    }
                
               
                    
                }
                
            
                
            }catch(Exception el){
                System.err.println(el);
            
            }
        }
        else if(e.getSource()==sign_up){
            setVisible(false);
            new SignUp_one().setVisible(true);
            
        }
        else if(e.getSource()==reset){
            accText.setText("");
            pinText.setText("");
        }
    }

    
}
