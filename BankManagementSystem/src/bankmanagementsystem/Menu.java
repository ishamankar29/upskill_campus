
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    
    JLabel header;
   JButton deposite,widthdraw,transfer,statements,back,My_Profile,Edit_profile,checkBal;
String AccNo;
    public Menu(String AccNo){
        this.AccNo=AccNo;
        setLayout(null);
        setSize(900,800);
        setVisible(true);
        setTitle("BANK MANAGEMENT SYSTEM");
        setLocation(300, 50);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel header= new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
        add(header);
        header.setBounds(100, 100, 700, 30);
        header.setFont(new Font("Osward",Font.BOLD, 30));
        
        
        deposite= new JButton("Deposite");
        add(deposite);
        deposite.setBounds(200,350,200,30);
        deposite.setBackground(Color.BLUE);
        deposite.setForeground(Color.WHITE);
        deposite.setFont(new Font("Osward",Font.BOLD, 20));
        deposite.addActionListener(this);
        
         widthdraw= new JButton("Widthdraw");
        add(widthdraw);
        widthdraw.setBounds(500,350,200,30);
        widthdraw.setBackground(Color.BLUE);
        widthdraw.setForeground(Color.WHITE);
         widthdraw.addActionListener(this);widthdraw.setFont(new Font("Osward",Font.BOLD, 20));
        
        
         transfer= new JButton("Transfer");
        add(transfer);
        transfer.setBounds(200,400,200,30);
        transfer.setBackground(Color.BLUE);
        transfer.setForeground(Color.WHITE);
        transfer.setFont(new Font("Osward",Font.BOLD, 20));
         transfer.addActionListener(this);
        
         statements= new JButton("Mini-Statements");
        add(statements);
        statements.setBounds(500,400,200,30);
        statements.setBackground(Color.BLUE);
        statements.setForeground(Color.WHITE);
        statements.setFont(new Font("Osward",Font.BOLD, 20));
         statements.addActionListener(this);
         
         My_Profile= new JButton("My Profile");
        add(My_Profile);
        My_Profile.setBounds(200,450,200,30);
        My_Profile.setBackground(Color.BLUE);
        My_Profile.setForeground(Color.WHITE);
        My_Profile.setFont(new Font("Osward",Font.BOLD, 20));
         My_Profile.addActionListener(this);
         
         
         Edit_profile= new JButton("Edit Profile");
        add(Edit_profile);
        Edit_profile.setBounds(500,450,200,30);
        Edit_profile.setBackground(Color.BLUE);
        Edit_profile.setForeground(Color.WHITE);
        Edit_profile.setFont(new Font("Osward",Font.BOLD, 20));
         Edit_profile.addActionListener(this);
         
         
         checkBal= new JButton("Check Balance");
        add(checkBal);
        checkBal.setBounds(200,500,200,30);
        checkBal.setBackground(Color.BLUE);
        checkBal.setForeground(Color.WHITE);
        checkBal.setFont(new Font("Osward",Font.BOLD, 20));
         checkBal.addActionListener(this);
          
            back= new JButton("Log Out");
            add(back);
            back.setBounds(600,600,100,30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLUE);
            back.addActionListener(this);
    }
    
    

    
    public static void main(String args[]) {
        new Menu("");
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deposite){
            setVisible(false);
            new Deposite(AccNo).setVisible(true);
            
            
        }else if(e.getSource()==widthdraw){
            setVisible(false);
            new Widthdraw(AccNo).setVisible(true);
            
        }else if(e.getSource()==transfer){
            
            setVisible(false);
            new Transfer(AccNo).setVisible(true);
            
        }else if(e.getSource()==statements){
            setVisible(false);
            new Ministatements(AccNo).setVisible(true);
            
        }    
        else if(e.getSource()==back){
            setVisible(false);
            new Login().setVisible(true);
            
        }
         else if(e.getSource()==My_Profile){
            setVisible(false);
            new Myprofile(AccNo).setVisible(true);
            
        }
        else if(e.getSource()==Edit_profile){
            setVisible(false);
            new Editprofile(AccNo).setVisible(true);
            
        }
        else if(e.getSource()==checkBal){
            setVisible(false);
            new Checkbalance(AccNo).setVisible(true);
            
        }  
    }
}
