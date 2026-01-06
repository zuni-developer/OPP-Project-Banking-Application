import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;


public class Management extends JFrame implements ActionListener {

    private JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8,jb9,jb10,qb;
    private JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8,jlT,imgl;
    private JTextField jt1, jt2, jt3, jt4, jt5, jt6;
    private JComboBox box1;
    private String[] acc = {"Business", "Student", "Personal"};
    private ArrayList<Account> Bank = new ArrayList();
    private int p=0;
    private int z=1;
    private double acs=0, acr=0, trn=0;
    private String val;
    private Color mc;


    public Management(){
        setTitle("Bank Management System");
        setSize(1200,700);
        setLocation(100,20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);


        mc= new Color(36,47,103);
        ImageIcon img = new ImageIcon("img/background_image.jpg");
        JLabel jb = new JLabel("img",img,JLabel.CENTER);
        jb.setBounds(0,0,1200,700);
        add(jb);


        jlT= new JLabel("BANK MANAGEMENT");
        jlT.setBounds(50,1,1000,300);
        jlT.setForeground(Color.BLACK);
        jlT.setFont(new Font("Comic Sans",Font.BOLD,25));
        jlT.setVisible(true);
        jb.add(jlT);
        jl1 = new JLabel("Select One Of the Following");
        jl1.setBounds(50, 170, 250,30);
        jb.add(jl1);

        jb1 = new JButton("Add Account");
        jb1.setBounds(50,200,200,50);
        jb1.setBackground(mc);
        jb1.setForeground(Color.white);
        jb1.setFont(new Font("Comic Sans",Font.BOLD,25));
        jb1.setOpaque(true);
        jb.add(jb1);

        jb2 = new JButton("Transaction");
        jb2.setBounds(50, 250, 200,50);
        jb2.setFont(new Font("Comic Sans",Font.BOLD,25));
        jb2.setBackground(mc);
        jb2.setForeground(Color.white);
        jb.add(jb2);

        jb3 = new JButton("View Account");
        jb3.setBounds(50, 300, 200,50);
        jb3.setBackground(mc);
        jb3.setFont(new Font("Comic Sans",Font.BOLD,25));
        jb3.setForeground(Color.white);
        jb.add(jb3);

        jb4 = new JButton("Loan");
        jb4.setBounds(50, 350, 200,50);
        jb4.setBackground(mc);
        jb4.setFont(new Font("Comic Sans",Font.BOLD,25));
        jb4.setForeground(Color.white);
        jb.add(jb4);

        jb9=new JButton("Back");
        jb9.setBounds(700,500,150,50);
        jb9.setBackground(mc);
        jb9.setFont(new Font("Comic Sans",Font.BOLD,15));
        jb9.setForeground(Color.white);
        jb9.setVisible(false);
        jb.add(jb9);

        jt1 = new JTextField();
        jt1.setBounds(200, 200, 200, 30);
        jt1.setVisible(false);
        jb.add(jt1);

        jl2 = new JLabel("Please Enter your name: ");
        jl2.setBounds(200,170, 200, 30);
        jl2.setVisible(false);
        jb.add(jl2);

        jt2 = new JTextField();
        jt2.setBounds(200, 290, 200, 30);
        jt2.setVisible(false);
        jb.add(jt2);

        jl3 = new JLabel("Enter Date of Birth DD/MM/YYYY");
        jl3.setBounds(200, 240, 200, 30);
        jl3.setVisible(false);
        jb.add(jl3);

        jt3 = new JTextField();
        jt3.setBounds(200, 360, 200,30);
        jt3.setVisible(false);
        jb.add(jt3);

        jl4 = new JLabel("Enter City:");
        jl4.setBounds(200, 320, 200, 30);
        jl4.setVisible(false);
        jb.add(jl4);

        jt4 = new JTextField();
        jt4.setBounds(200, 420, 200, 30);
        jt4.setVisible(false);
        jb.add(jt4);

        jl5 = new JLabel("Enter Phone Number");
        jl5.setBounds(200, 390, 200, 30);
        jl5.setVisible(false);
        jb.add(jl5);

        jt5 = new JTextField();
        jt5.setBounds(200, 490, 200, 30);
        jt5.setVisible(false);
        jb.add(jt5);

        jl6 = new JLabel("Enter Amount:");
        jl6.setBounds(200, 460, 200, 30);
        jl6.setVisible(false);
        jb.add(jl6);

        jl7 = new JLabel("Please Select the type of account");
        jl7.setBounds(500, 200, 200,30);
        jl7.setVisible(false);
        jb.add(jl7);

        box1 = new JComboBox(acc);
        box1.setBounds(500, 260, 200, 30);
        box1.setVisible(false);
       jb.add(box1);

        jb5 = new JButton("Submit");
        jb5.setBounds(500, 330, 100, 30);
        jb5.setVisible(false);
        jb.add(jb5);

        jt6 = new JTextField();
        jt6.setBounds(300, 300, 200, 30);
        jt6.setVisible(false);
        jb.add(jt6);

        jl8 = new JLabel("Enter name of Person tos search for his account");
        jl8.setBounds(300,260, 300,30);
        jl8.setVisible(false);
        jb.add(jl8);

        jb6 = new JButton("Search");
        jb6.setBounds(350, 360, 100,30);
        jb6.setVisible(false);
        jb.add(jb6);

        jb7 = new JButton("Submit");
        jb7.setBounds(300, 400, 70, 30);
        jb7.setVisible(false);
        jb.add(jb7);

        jb8 = new JButton("Submit");
        jb8.setBounds(300,400,70,30);
        jb8.setVisible(false);
        jb.add(jb8);

        qb= new JButton("Exit");
        qb.setBounds(1000,600,150,50);
        qb.setBackground(mc);
        qb.setForeground(Color.white);
        qb.setFont(new Font("Comic Sans",Font.BOLD,15));
        jb.add(qb);

        jb10= new JButton("View All Accounts");
        jb10.setBounds(50, 400, 200,50);
        jb10.setBackground(mc);
        jb10.setForeground(Color.white);
        jb10.setFont(new Font("Comic Sans",Font.BOLD,18));
        jb10.setVisible(true);
        jb.add(jb10);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb9.addActionListener(this);
        qb.addActionListener(this);
        jb10.addActionListener(this);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)  {
        try {
            FileWriter fw = new FileWriter("data/filename.txt");
        }
        catch (IOException z){
            JOptionPane.showMessageDialog(null,"Ouch");

            z.printStackTrace();
        }


        if(e.getSource() == jb1){
            jb9.setVisible(true);
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(false);
            jl1.setVisible(false);
            jt1.setVisible(true);
            jt2.setVisible(true);
            jt3.setVisible(true);
            jt4.setVisible(true);
            jt5.setVisible(true);
            jl2.setVisible(true);
            jl3.setVisible(true);
            jl4.setVisible(true);
            jl5.setVisible(true);
            jl6.setVisible(true);
            jl7.setVisible(true);
            box1.setVisible(true);
            jb5.setVisible(true);
            jb10.setVisible(false);
        }
        else if(e.getSource()==jb9){
            jb9.setVisible(false);
            jb10.setVisible(true);
            jb1.setVisible(true);
            jb2.setVisible(true);
            jb3.setVisible(true);
            jb4.setVisible(true);
            jl1.setVisible(true);
            jb5.setVisible(false);
            jb6.setVisible(false);
            jb7.setVisible(false);
            jb8.setVisible(false);
            jl1.setVisible(false);
            jl2.setVisible(false);
            jl3.setVisible(false);
            jl4.setVisible(false);
            jl5.setVisible(false);
            jl6.setVisible(false);
            jl7.setVisible(false);
            jl8.setVisible(false);
            jt1.setVisible(false);
            jt2.setVisible(false);
            jt3.setVisible(false);
            jt4.setVisible(false);
            jt5.setVisible(false);
            jt6.setVisible(false);
            box1.setVisible(false);


        }
        else if(e.getSource()==jb2){
            jb9.setVisible(true);
            jb10.setVisible(false);
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(false);
            jl1.setVisible(false);
            jl1.setText("Enter the account number of sender");
            jl1.setVisible(true);
            jt1.setVisible(true);
            jl2.setVisible(true);
            jl2.setLocation(200,270);
            jl2.setText("Enter the account number of receiver");
            jt2.setVisible(true);
            jb7.setVisible(true);


        }
        else if(e.getSource()==jb3){
            jl2.setVisible(false);
            jt1.setVisible(false);
            jt2.setVisible(false);
            val = JOptionPane.showInputDialog(null, "Enter name of person to view it's account");
            for(int i=0; i<Bank.size(); i++){
                if(val.contains(Bank.get(i).name)){
                    JOptionPane.showMessageDialog(null, "Name : " +
                            Bank.get(i).name + "\n" + "Amount : " +  Bank.get(i).amount + "\n"
                    + "Accunt number : " + Bank.get(i).acc_num);
                    break;
                }
            }
            jb1.setVisible(true);
            jb2.setVisible(true);
            jb3.setVisible(true);
            jb4.setVisible(true);
            jl1.setVisible(true);
        }
        else if(e.getSource()== jb4){
            jb9.setVisible(true);
            jb10.setVisible(false);
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(false);
            jl1.setVisible(false);
            jl8.setText("Enter Account Number");
            jl8.setFont(new Font("Comic Sans",Font.BOLD,25));
            jl8.setForeground(Color.magenta);
            jb6.setVisible(true);
            jl8.setVisible(true);
            jt6.setVisible(true);
        }
        else if(e.getSource()==jb5){
            Bank.add(p, new Account(jt1.getText().toString(), jt4.getText().toString(), jt2.getText().toString(), jt3.getText().toString(), Double.parseDouble(jt5.getText()), box1.getSelectedItem().toString(), z));
            p++;
            z++;
            try{
                FileWriter file=new FileWriter("data/Accounts.txt",true);
                BufferedWriter b = new BufferedWriter(file);
                b.append("Name: ");
                b.append(jt1.getText());
                b.append(" ");
                b.append("DOB: ");
                b.append(jt2.getText());
                b.append(" ");
                b.append("City: ");
                b.append(jt3.getText());
                b.append(" ");
                b.append("Phone Number: ");
                b.append(jt4.getText());
                b.append(" ");
                b.append("Amount: ");
                b.append(jt5.getText());
                b.append(" ");



                b.append("\n");
                b.close();
                file.close();


            }
            catch (IOException z){
                JOptionPane.showMessageDialog(null,"Error");

            }




            jb1.setVisible(true);
            jb2.setVisible(true);
            jb3.setVisible(true);
            jb4.setVisible(true);
            jl1.setVisible(true);
            jt1.setVisible(false);
            jt2.setVisible(false);
            jt3.setVisible(false);
            jt4.setVisible(false);
            jt5.setVisible(false);
            jl2.setVisible(false);
            jl3.setVisible(false);
            jl4.setVisible(false);
            jl5.setVisible(false);
            jl6.setVisible(false);
            jl7.setVisible(false);
            box1.setVisible(false);
            jb5.setVisible(false);
            jb10.setVisible(true);
        }
        else if(e.getSource()==jb6){
            int num = Integer.parseInt(jt6.getText());
            double x;
            for(int i=0; i<Bank.size(); i++){
                if(Bank.get(i).acc_num==num){
                    x = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter the amount for Loan"));
                    Bank.get(i).loan = x;
                    Bank.get(i).amount+=x;
                    JOptionPane.showMessageDialog(null, "Loan Provided to " +
                            Bank.get(i).name + " of amount " + Bank.get(i).loan);
                    break;
                }
            }
        }
        else if(e.getSource()==jb7){
            String str;
            jb1.setVisible(true);
            jb2.setVisible(true);
            jb3.setVisible(true);
            jb4.setVisible(true);
            jl1.setVisible(true);
            jb7.setVisible(false);
            jb9.setVisible(false);
            jt1.setVisible(false);
            jt2.setVisible(false);
            jl2.setVisible(false);
            jb10.setVisible(true);

            jl1.setText("Choose any one");
            jl1.setLocation(240,170);
            acs = Double.parseDouble(jt1.getText());
            acr = Double.parseDouble(jt2.getText());
            for (int j=0; j<Bank.size(); j++){
                for(int i=0; i<Bank.size(); i++){
                    if(acs==Bank.get(j).acc_num && acr==Bank.get(i).acc_num){
                        trn = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount to be transferred"));
                        if(trn<=Bank.get(j).amount) {
                            Bank.get(j).amount -= trn;
                            Bank.get(i).amount += trn;
                            i = j = Bank.size();
                            JOptionPane.showMessageDialog(null, "Amount Transferred");

                            break;
                        }
                    }
                    else if (trn>Bank.get(j).amount){
                        JOptionPane.showMessageDialog(null,"Not Enough Amount Avalible in Senders Account");

                    }
                }
            }
            jb7.setVisible(false);
        }
        else if(e.getSource()==jb10){
            try {
                ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "data/Accounts.txt");
                pb.start();
            }
            catch (IOException l){
                System.out.println("Error");
            }
        }

        if(e.getSource()==qb){
            System.exit(0);
        }

    }

}
