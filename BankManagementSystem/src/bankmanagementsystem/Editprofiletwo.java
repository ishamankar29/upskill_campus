
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Editprofiletwo extends JFrame implements ActionListener{
    String AccNo;
    
    JLabel title2,religion, category , income, eduQ, occupation, pan,aadhar, seniorC, existAcc;
    JTextField panT,aadharT;
    JRadioButton yes1,yes2,no1,no2;
    JButton next2;
    ButtonGroup seniorcGroup,existAccGroup;
    JComboBox religionCB,categoryCB,incomeCB,eduQCB,occupationCB;
    String religionV,categoryV,eduV,occuV,incomeV,seniorV;

    public Editprofiletwo(String AccNo) {
        this.AccNo=AccNo;
        setLayout(null);
            setSize(900,800);
            setVisible(true);
            setTitle("BANK MANAGEMENT SYSTEM");
            setLocation(300, 50);
            getContentPane().setBackground(Color.WHITE);
            //accNum++;
            
            title2= new JLabel("Account No."+" "+AccNo);
            add(title2);
            title2.setBounds(300, 100, 700, 30);
            title2.setFont(new Font("Osward",Font.BOLD, 30));
           
            
            
            religion= new JLabel("Religion:");
            add(religion);
            religion.setBounds(200, 200, 200, 22);
            religion.setFont(new Font("Osward",Font.BOLD, 20));
            
            String religionS[]= {"Select Religion","Hindu","Muslim","Christian","Buddhist","Sikh","Others"};
            religionCB= new JComboBox(religionS);

            add(religionCB);
            religionCB.setBounds(520,200,250,20);
             
            
            
            category= new JLabel("Category:");
            add(category);
            category.setBounds(200, 260, 200, 22);
            category.setFont(new Font("Osward",Font.BOLD, 20));
            String categoriesS[]= {"Select Category","OBC","OPEN","ST","NT","SC","Others"};
            
            categoryCB= new JComboBox(categoriesS);

            add(categoryCB);
            categoryCB.setBounds(520,260,250,20);
            
            
            
            eduQ= new JLabel("Educational Qualification:");
            add(eduQ);
            eduQ.setBounds(200, 320, 300, 20);
            eduQ.setFont(new Font("Osward",Font.BOLD, 20));
            String eduS[]= {"Select Education","Under-Grad","Post-Grad","SSC","HSC","No education"};
            eduQCB= new JComboBox(eduS);

            add(eduQCB);
            eduQCB.setBounds(520,320,250,20);

            
            occupation= new JLabel("Occupation:");
            add(occupation);
            occupation.setBounds(200, 380, 200, 20);
            occupation.setFont(new Font("Osward",Font.BOLD, 20));
            String occuS[]= {"Select Occupation","Business","Employeed","Self-Employed","Unemployed","Student","Retired"};
            occupationCB= new JComboBox(occuS);

            add(occupationCB);
            occupationCB.setBounds(520,380,250,20);
            
            
            
            income= new JLabel("Income:");
            add(income);
            income.setBounds(200, 440, 200, 20);
            income.setFont(new Font("Osward",Font.BOLD, 20));
            
            String incomeS[]= {"Select Income","<1,00,000","< 2,50,000","<7,00,000"};
            incomeCB= new JComboBox(incomeS);

            add(incomeCB);
            incomeCB.setBounds(520,440,250,20);
            
           
         
            pan= new JLabel("PAN:");
            add(pan);
            pan.setBounds(200, 500, 200, 20);
            pan.setFont(new Font("Osward",Font.BOLD, 20));
            
            panT= new JTextField();
            panT.setVisible(true);
            add(panT);
            panT.setBounds(520,500,250,20);
            
            
            
          
            aadhar= new JLabel("Aadhar:");
            add(aadhar);
            aadhar.setBounds(200, 560, 200, 20);
            aadhar.setFont(new Font("Osward",Font.BOLD, 20));
            
            aadharT= new JTextField();
            aadharT.setVisible(true);
            add(aadharT);
            aadharT.setBounds(520,560,250,20);
            
            
            
            
            seniorC= new JLabel("Senior Citizen:");
            add(seniorC);
            seniorC.setBounds(200,620,250,20);
            seniorC.setFont(new Font("Osward",Font.BOLD, 20));
            
            yes1= new JRadioButton("Yes");
            add(yes1);
            yes1.setBounds(520, 620, 90, 20);
            yes1.setBackground(Color.WHITE);

            no1= new JRadioButton("No");
            add(no1);
            no1.setBounds(630, 620, 90, 20);
            no1.setBackground(Color.WHITE);
            
            
            seniorcGroup= new ButtonGroup();
            seniorcGroup.add(yes1);
            seniorcGroup.add(no1);
            
            existAcc= new JLabel("Existing Account");
            existAcc.setVisible(true);
            existAcc.setFont(new Font("Osward",Font.BOLD, 20));
            add(existAcc);
            existAcc.setBounds(200,680,250,20);
            
            
            
            
            yes2= new JRadioButton("Yes");
            add(yes2);
            yes2.setBounds(520, 680, 90, 20);
            yes2.setBackground(Color.WHITE);

            no2= new JRadioButton("No");
            add(no2);
            no2.setBounds(630, 680, 90, 20);
            no2.setBackground(Color.WHITE);
            
            existAccGroup= new ButtonGroup();
            existAccGroup.add(yes2);
            existAccGroup.add(no2);
 
            
            
            
            
            
            next2 = new JButton("NEXT");
            next2.setVisible(true);
            next2.setBackground(Color.blue);
            next2.setForeground(Color.WHITE);
            add(next2);
            next2.setBounds(650, 720, 100, 20);
            next2.addActionListener(this);
            
            
            
            try{
                 Conns c= new Conns();
                String getsignuptwo = "select * from signupTwo where Account_no = " + AccNo + "";
                ResultSet signupTwo = c.s.executeQuery(getsignuptwo);
                //JOptionPane.showMessageDialog(null, getsignup);
//                ResultSetMetaData rsMetaData = (ResultSetMetaData) signupOne.getMetaData();
//                int columnCount = rsMetaData.getColumnCount();
                
                if (signupTwo.next()) {
                    JOptionPane.showMessageDialog(null, "inside signuptwo");
                             religionV=signupTwo.getString("Religion");
                             categoryV=signupTwo.getString("Category");
                             eduV=signupTwo.getString("Education");
                             occuV=signupTwo.getString("Occupation");
                             incomeV=signupTwo.getString("Income");
                             seniorV=signupTwo.getString("Senior_citizen");
                             String panV=signupTwo.getString("Pan");
                             String adharV=signupTwo.getString("Aadhar");
                             String exaccV=signupTwo.getString("Existing_Acc");
                             
                            religionCB.setSelectedItem(religionV);
                            //JOptionPane.showMessageDialog(null, religionV);
                               categoryCB.setSelectedItem(categoryV);
                                eduQCB.setSelectedItem(eduV);
                                occupationCB.setSelectedItem(occuV);
                               incomeCB.setSelectedItem(incomeV);
                               panT.setText(panV);
                                aadharT.setText(adharV);

                                //String seniorC="null";
                               if(seniorV.trim().equals("Yes")){
                                  yes1.setSelected(true);

                               }
                               else if(seniorV.trim().equals("No")){
                                  no1.setSelected(true);

                               }

                               //String exiAcc="null";
                               if(exaccV.trim().equals("Yes")){
                                  yes2.setSelected(true);

                               }
                               else if(exaccV.trim().equals("No")){
                                  no2.setSelected(true);

                               }
                
                }
            }catch(Exception cc){
                System.err.println(cc);
            }
            
           
            
            
            
            
    }
        
    
    

    
    public static void main(String args[]) {
        new Editprofiletwo("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==next2){
             
            String religion= (String) religionCB.getSelectedItem();
         String category = (String) categoryCB.getSelectedItem();
         String edq= (String) eduQCB.getSelectedItem();
         String occup = (String) occupationCB.getSelectedItem();
         String income = (String) incomeCB.getSelectedItem();
         String pan=panT.getText();
         String aadhar=aadharT.getText();
         
         String seniorC="null";
        if(yes1.isSelected()){
            seniorC="Yes";
            
        }
        else if(no1.isSelected()){
            seniorC="No";
            
        }
        
        String exiAcc="null";
        if(yes2.isSelected()){
            exiAcc="Yes";
            
        }
        else if(no2.isSelected()){
            exiAcc="No";
            
        }
         
        try{
            if(religion.equals("Select Religion")){
                JOptionPane.showMessageDialog(null, "Religion is required");
            }else if(category.equals("Select Category")){
                JOptionPane.showMessageDialog(null, "Category  is required");
            }else if(edq.equals("Select Education")){
                JOptionPane.showMessageDialog(null, "Education is required");
            }else if(occup.equals("Select Occupation")){
                JOptionPane.showMessageDialog(null, "Occupation is required");
            }else if(income.equals("Select Income")){
                JOptionPane.showMessageDialog(null, "Income is required");
            }else if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "PAN is required");
            }else if(!(pan.equals(""))){
//                
                if(pan.length()<10){
                    JOptionPane.showMessageDialog(null, "Pin-Code is Invalid");
                }
            }
            
            else if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar is required");
            }else if(!(aadhar.equals(""))){
//                
                if(aadhar.length()<10){
                    JOptionPane.showMessageDialog(null, "Pin-Code is Invalid");
                }
            }
            else if(seniorC.equals("null")){
                JOptionPane.showMessageDialog(null, "Are you senior citizen?");
            }else if(exiAcc.equals("null")){
                JOptionPane.showMessageDialog(null, "Do you already have an account?");
            }
            else{
                Conns c= new Conns();
                String insertSignUp2= "UPDATE signupTwo SET Religion='" + religion + "', Category='" + category + "', Education='" + edq + "', Occupation='" + occup + "', Income='" + income + "', Pan='" + pan + "', Aadhar='" + aadhar + "', Senior_Citizen='" + seniorC + "', Existing_Acc='" + exiAcc + "' where Account_no='"+AccNo+"'";;
                c.s.executeUpdate(insertSignUp2);
                
               setVisible(false);
               new Ediiteprofilethree(AccNo).setVisible(true);
            }   

        }catch(Exception e1){
             System.err.println(e1);
            
        }
        }
    }
}
