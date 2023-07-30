
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.*;


public class Transfer extends JFrame implements ActionListener {
    String AccNo, Recipient;
    int moneyS,moneyR,sumS,sumR;
    JLabel title,title2,title3;
    JButton transfer,back;
    JTextField ammount,recipientAcc;

     Transfer(String AccNo) {
         
         
            this.AccNo=AccNo;
            setLayout(null);
            setSize(900,700);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 100);
            getContentPane().setBackground(Color.WHITE);
            
            
            
            
            title= new JLabel("Transfer Money");
            add(title);
            title.setBounds(300, 100, 300, 30);
            title.setFont(new Font("Osward",Font.BOLD, 30));
            title.setVisible(true);
            
            title2= new JLabel("Enter Amount To Be Transferred:");
            add(title2);
            title2.setBounds(200, 150, 300, 30);
            //title2.setFont(new Font("Osward",Font.BOLD, 30));
            title2.setVisible(true);
            
            ammount= new JTextField();
            add(ammount);
            ammount.setBounds(520, 150, 300, 30);
            ammount.setFont(new Font("Osward",Font.BOLD, 30));
            
            
             title3= new JLabel("Enter Recipient's Account Number:");
            add(title3);
            title3.setBounds(200, 250, 300, 30);
            //title3.setFont(new Font("Osward",Font.BOLD, 30));
            title3.setVisible(true);
           
            
            
            recipientAcc= new JTextField();
            add(recipientAcc);
            recipientAcc.setBounds(520, 250, 300, 30);
            recipientAcc.setFont(new Font("Osward",Font.BOLD, 30));
            
            
            
            transfer= new JButton("Transfer");
            add(transfer);
            transfer.setBounds(300,300,150,30);
            transfer.setForeground(Color.WHITE);
            transfer.setBackground(Color.BLUE);
            transfer.addActionListener(this);
            
            
            back= new JButton("Back");
            add(back);
            back.setBounds(470,300,150,30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLUE);
            back.addActionListener(this);
        
    }
    

    
    public static void main(String args[]) {
        new Transfer("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==transfer){
            
            
            int amt= Integer.parseInt(ammount.getText());
             Recipient =recipientAcc.getText();
            
            try{
                if(ammount.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter The Amount");
                }
                else if(recipientAcc.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter The Recipients Account Number");
                }else{
                        Conns c= new Conns();
                        LocalDate currentDate = LocalDate.now();
                        
                       
//                        String getSenderMoney = "SELECT Balance FROM moneyInfo WHERE Account_no = '" + AccNo + "'";
//                        ResultSet moneySenderDetail = c.s.executeQuery(getSenderMoney);
                        
                        
                       String Recieverdata="SELECT Balance FROM moneyInfo WHERE Account_no = '" + Recipient + "'";
                       ResultSet recieverObj= c.s.executeQuery(Recieverdata);


                        
                        JOptionPane.showMessageDialog(null, "outside if");
                        //JOptionPane.showMessageDialog(null, moneyR);
                        if (recieverObj.next()) {
                             moneyR=recieverObj.getInt("Balance");
                            JOptionPane.showMessageDialog(null, "inside if 1");
                            
                            
                            String getSenderMoney = "SELECT Balance FROM moneyInfo WHERE Account_no = '" + AccNo + "'";
                            ResultSet moneySenderDetail = c.s.executeQuery(getSenderMoney);
                            if(moneySenderDetail.next()){
                                JOptionPane.showMessageDialog(null, "inside if 2");
                                moneyS=moneySenderDetail.getInt("Balance");
                                JOptionPane.showMessageDialog(null, "inside if 31");
                                
                             //JOptionPane.showMessageDialog(null, moneyS);
                             if(moneyS>amt){
                                 JOptionPane.showMessageDialog(null, "inside if 32");
                                
                                
                                 
                             String sent= "INSERT INTO transactionDW(account_no, Actions,Amount,transactio_date,ToAccount,fromAccount) VALUES ('" + AccNo + "','" + "Transfer" +"','" +amt + "','"+Date.valueOf(currentDate)+"','"+Recipient+"','"+AccNo+"')";
                             c.s.executeUpdate(sent);
                             JOptionPane.showMessageDialog(null, "inside if 4");
                             String recieved= "INSERT INTO transactionDW(account_no, Actions,Amount,transactio_date,ToAccount,fromAccount) VALUES ('" + Recipient + "','" + "Recieved" +"','" +amt + "','"+Date.valueOf(currentDate)+"','"+Recipient+"','"+AccNo+"')";
                             c.s.executeUpdate(recieved);
                            
                            sumS=moneyS-amt;
                            sumR=moneyR+amt;
                            String updateSenderMoney = "UPDATE moneyInfo SET Balance = '" + sumS + "' WHERE Account_no = '" + AccNo + "'and Balance='"+moneyS+"'";
                            c.s.executeUpdate(updateSenderMoney);
                            
                            String updateRecieverMoney = "UPDATE moneyInfo SET Balance = '" + sumR + "' WHERE Account_no = '" + Recipient + "'and Balance='"+moneyR+"'";
                            c.s.executeUpdate(updateRecieverMoney);
                            
                              ammount.setText("");
                               recipientAcc.setText("");
                              JOptionPane.showMessageDialog(null, "Amount Successfully Transfered");
                            }
                            
                             
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
            
            
            
            
        }else if(e.getSource()==back){
            setVisible(false);
            new Menu(AccNo).setVisible(true);
        }
    }
}
