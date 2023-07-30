
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;


public class Checkbalance extends JFrame implements ActionListener {
    
    String AccNo;
    JLabel title3,bal;
    

    public Checkbalance(String AccNo) {
        this.AccNo=AccNo;
            //title3.setFont(new Font("Osward",Font.BOLD, 30));
            try{
             Conns c= new Conns();
               
        
                String getBal = "select * from moneyInfo where Account_no = " + AccNo + "";
                ResultSet balVal = c.s.executeQuery(getBal);
                
                if(balVal.next()){
                    String balance= balVal.getString("Balance");

                    JOptionPane.showMessageDialog(null, "your Balance is:"+balance+"");
                    setVisible(false);
                    new Menu(AccNo).setVisible(true);


                }
        }catch(Exception ee){
            System.err.println(ee);
        }
    }
    

   
    public static void main(String args[]) {
        new Checkbalance("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        
    }
}
