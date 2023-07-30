
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


public class Ministatements extends JFrame implements ActionListener {
    JLabel title,serialNo,amount,action , to ,from,date,serialNoD,amountD,actionD , toD ,fromD,dateD;
    JTextField ammount;
    JButton next,back;
    String transactions;
    String srnoS,amountS,actionS,toS,fromS,dateS;
    int count=0;
    int xval=230;
    String AccNos;

    public Ministatements(String AccNo) {
        this.AccNos=AccNo;
        
        setLayout(null);
            setSize(900,700);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 100);
            getContentPane().setBackground(Color.WHITE);
            
            
            title= new JLabel("Ministatements");
            add(title);
            title.setBounds(350, 50, 500, 30);
            title.setFont(new Font("Osward",Font.BOLD, 30));
            title.setVisible(true);
        
            
            
            
            next= new JButton("Next");
            add(next);
            next.setBounds(300,100,150,30);
            next.setForeground(Color.WHITE);
            next.setBackground(Color.BLUE);
            next.addActionListener(this);
            
            
            back= new JButton("Back");
            add(back);
            back.setBounds(470,100,150,30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLUE);
            back.addActionListener(this);
            
            
            serialNo= new JLabel("SrNo.");
            add(serialNo);
            serialNo.setBounds(50, 200, 100, 20);
            serialNo.setVisible(true);
            
            amount= new JLabel("Amount");
            add(amount);
            amount.setBounds(170, 200, 100, 20);
            //amount.setFont(new Font("Osward",Font.BOLD, 30));
            amount.setVisible(true);
            
            action= new JLabel("Action");
            add(action);
            action.setBounds(290, 200, 100, 20);
            //action.setFont(new Font("Osward",Font.BOLD, 30));
            action.setVisible(true);
            
            to= new JLabel("To");
            add(to);
            to.setBounds(400, 200, 100, 20);
            //to.setFont(new Font("Osward",Font.BOLD, 30));
            to.setVisible(true);
            
            from= new JLabel("From");
            add(from);
            from.setBounds(520, 200, 100, 20);
            //from.setFont(new Font("Osward",Font.BOLD, 30));
            from.setVisible(true);
            
            date= new JLabel("Date");
            add(date);
            date.setBounds(640, 200, 100, 20);
            //date.setFont(new Font("Osward",Font.BOLD, 30));
            date.setVisible(true);
            
            
            try{
                Conns c= new Conns();
        
                String getTrans = "select * from transactionDW where Account_no = " + AccNos + "";
                ResultSet tranDetail = c.s.executeQuery(getTrans);
                //JOptionPane.showMessageDialog(null, getTrans);
                while (tranDetail.next()) {
                       // JOptionPane.showMessageDialog(null, "mini states exist");
                        amountS=tranDetail.getString("Amount");
                        actionS=tranDetail.getString("Actions");
                        dateS=tranDetail.getString("transactio_date");
                        toS=tranDetail.getString("ToAccount");
                        fromS=tranDetail.getString("fromAccount");
                        

                        count++;
                        serialNoD= new JLabel(""+count);
                        add(serialNoD);
                        serialNoD.setBounds(50, xval, 100, 30);
                        serialNoD.setVisible(true);



                        amountD= new JLabel(""+amountS);
                        add(amountD);
                        amountD.setBounds(170, xval, 100, 30);
                        amountD.setVisible(true);



                        actionD= new JLabel(""+actionS);
                        add(actionD);
                        actionD.setBounds(290, xval, 100, 30);
                        actionD.setVisible(true);


                        toD= new JLabel(""+toS);
                        add(toD);
                        toD.setBounds(400, xval, 100, 30);
                        toD.setVisible(true);



                        fromD= new JLabel(""+fromS);
                        add(fromD);
                        fromD.setBounds(520, xval, 100, 30);
                        fromD.setVisible(true);


                        dateD= new JLabel(""+dateS);
                        add(dateD);
                        dateD.setBounds(640, xval, 100, 30);
                        dateD.setVisible(true);

                        xval=xval+20;
            
            
                }
                
            }catch(Exception em){
                System.err.println(em);
            }
            
            //JOptionPane.showMessageDialog(null, "while end");
            
            
    }
    

   
    public static void main(String args[]) {
        new Ministatements("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
            setVisible(false);
            new Menu(AccNos).setVisible(true);
            
        }
        try{
            
            
            
        }catch(Exception ee){
            
        }
    }
         
}   
    
    

