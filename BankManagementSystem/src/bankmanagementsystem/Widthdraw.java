
package bankmanagementsystem;
import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import java.time.LocalDate;
import java.sql.Date;
import java.util.Random;

public class Widthdraw extends JFrame implements ActionListener {
    
    JLabel title;
    JTextField ammount;
    JButton widthdraw,back;
    String AccNo;
    int moneyS;
    int sum;
    int moneyI;
    Widthdraw(String AccNo){
        this.AccNo=AccNo;
        setLayout(null);
            setSize(900,700);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 100);
            getContentPane().setBackground(Color.WHITE);
            
            
            title= new JLabel("Enter Amount To Be Deposited");
            add(title);
            title.setBounds(200, 100, 500, 30);
            title.setFont(new Font("Osward",Font.BOLD, 30));
            title.setVisible(true);
            
            
            ammount= new JTextField();
            add(ammount);
            ammount.setBounds(200, 150, 500, 30);
            ammount.setFont(new Font("Osward",Font.BOLD, 30));
            
            widthdraw= new JButton("Widthdraw");
            add(widthdraw);
            widthdraw.setBounds(300,200,150,30);
            widthdraw.setForeground(Color.WHITE);
            widthdraw.setBackground(Color.BLUE);
            widthdraw.addActionListener(this);
            
            
            back= new JButton("Back");
            add(back);
            back.setBounds(470,200,150,30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLUE);
            back.addActionListener(this);
        
        
    }

   
    public static void main(String args[]) {
        new Widthdraw("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== widthdraw){
            
            int amt= Integer.parseInt(ammount.getText());
            
            try{
                if(ammount.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter The Amount");
                }else{
                        Conns c= new Conns();
                        LocalDate currentDate = LocalDate.now();
                        
                       
                        String getMoney = "SELECT Balance FROM moneyInfo WHERE Account_no = '" + AccNo + "'";
                        ResultSet moneyDetail = c.s.executeQuery(getMoney);
                        if (moneyDetail.next()) {
                             moneyS=moneyDetail.getInt("Balance");
                             
                             //JOptionPane.showMessageDialog(null, moneyS);
                             if(moneyS>amt){
                             String widthdraw= "INSERT INTO transactionDW(account_no, Actions,Amount,transactio_date,ToAccount,fromAccount) VALUES ('" + AccNo + "','" + "Widthdraw" +"','" +amt + "','"+Date.valueOf(currentDate)+"','"+"Nil"+"','"+"Nil"+"')";
                             c.s.executeUpdate(widthdraw);
                            
                            sum=moneyS-amt;
                            String updateMoney = "UPDATE moneyInfo SET Balance = '" + sum + "' WHERE Account_no = '" + AccNo + "'and Balance='"+moneyS+"'";
                            c.s.executeUpdate(updateMoney);
                            ammount.setText("");
                            JOptionPane.showMessageDialog(null, "Amount Successfully widthdrawn");
                            }else{
                                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            }
                            
                            
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "No balance found");
                        }
                        
                        
                        
                        
                            
                        
                }
            }catch(Exception ed){
                System.err.println(ed);
            }
            
            
            
        }else if(e.getSource()== back){
            setVisible(false);
            new Menu(AccNo).setVisible(true);
            
        }
    }
}
