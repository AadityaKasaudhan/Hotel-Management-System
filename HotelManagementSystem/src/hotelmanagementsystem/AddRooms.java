
package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddRooms extends JFrame implements ActionListener {
    
    JButton add,cancel;
    JTextField tfroom,tfprise;
    JComboBox typecombo,availablecombo,cleancombo;
    
    AddRooms(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add ROOMS");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(150,20,200,20);
        add(heading);
        
        
        JLabel lblroomno=new JLabel("ROOM NUMBER");
        lblroomno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblroomno.setBounds(60,80,120,30);
        add(lblroomno);
        
        tfroom=new JTextField();
        tfroom.setBounds(200,80,150,30);
        add(tfroom);
        
        JLabel lblavailable=new JLabel("AVAILABLE");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(60,130,120,30);
        add(lblavailable);
        
        String availableOptions[]={"AVAILABLE","OCCUPIED"};
        availablecombo=new JComboBox(availableOptions);
        availablecombo.setBounds(200,130,150,30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lblclean=new JLabel("Cleaning status");
        lblclean.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblclean.setBounds(60,180,120,30);
        add(lblclean);
        
        String cleanOptions[]={"CLEANED","DIRTY"};
        cleancombo=new JComboBox(cleanOptions);
        cleancombo.setBounds(200,180,150,30);
        cleancombo.setBackground(Color.WHITE);
        add(cleancombo);
        
        JLabel lblprise=new JLabel("PRISE");
        lblprise.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblprise.setBounds(60,230,120,30);
        add(lblprise);
        
        tfprise=new JTextField();
        tfprise.setBounds(200,230,150,30);
        add(tfprise);
        
        
        JLabel lbltype=new JLabel("BED TYPE");
        lbltype.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltype.setBounds(60,280,120,30);
        add(lbltype);
        
        String typeOptions[]={"SINGLE BED","DOUBLE BED"};
        typecombo=new JComboBox(typeOptions);
        typecombo.setBounds(200,280,150,30);
        typecombo.setBackground(Color.WHITE);
        add(typecombo);
        
        add=new JButton("Add ROOMS");
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.setBounds(60,350,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel=new JButton("CANCEL");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.setBounds(220,350,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(400,30,500,300);
        add(image);
        
        setBounds(330,200,940,470);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==add){
            String roomnumber=tfroom.getText();
            String availability=(String) availablecombo.getSelectedItem();
            String status=(String)  cleancombo.getSelectedItem();
            String  price=tfprise.getText();
            String  type=(String)typecombo.getSelectedItem();
                    
               try{
                   Conn conn=new Conn();
                   String str="insert into room values('"+roomnumber+"','"+availability+"','"+status+"','"+price+"','"+type+"')";
                  
                   conn.s.executeUpdate(str);
                   
                   JOptionPane.showMessageDialog(null,"New Rooms Added Successfully");
                    setVisible(false);       
                           
                           
                   
               } catch(Exception e){
                 e.printStackTrace();
               }    
                    
        }else{
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new AddRooms();
    }
    
}