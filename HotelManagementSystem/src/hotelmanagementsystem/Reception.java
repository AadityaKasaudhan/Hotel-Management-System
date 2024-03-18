package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
   
    JButton newCustomer , rooms ,department , allEmployee ,managerInfo ,customers ,searchRoom;
   
    Reception(){
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       newCustomer=new JButton("NEW CUSTOMER FORM");
       newCustomer.setBounds(10,30,200,30);
       newCustomer.setVisible(true);
       newCustomer.setBackground(Color.BLACK);
       newCustomer.setForeground(Color.white);
       newCustomer.addActionListener(this);
       add(newCustomer);
       
       rooms=new JButton("ROOMS");
       rooms.setBounds(10,70,200,30);
       rooms.setVisible(true);
       rooms.setBackground(Color.BLACK);
       rooms.setForeground(Color.white);
       rooms.addActionListener(this);
       add(rooms);
       
       department=new JButton("DEPARTMENT");
       department.setBounds(10,110,200,30);
       department.setVisible(true);
       department.setBackground(Color.BLACK);
       department.setForeground(Color.white);
       department.addActionListener(this);
       add(department);
       
       allEmployee=new JButton("ALL EMPLOYEE");
       allEmployee.setBounds(10,150,200,30);
       allEmployee.setVisible(true);
       allEmployee.setBackground(Color.BLACK);
       allEmployee.setForeground(Color.white);
       allEmployee.addActionListener(this);
       add(allEmployee);
       
       customers=new JButton("CUSTOMER INFO");
       customers.setBounds(10,190,200,30);
       customers.setVisible(true);
       customers.setBackground(Color.BLACK);
       customers.setForeground(Color.white);
       customers.addActionListener(this);
       add(customers);
       
       managerInfo=new JButton("MANAGER INFO");
       managerInfo.setBounds(10,230,200,30);
       managerInfo.setVisible(true);
       managerInfo.setBackground(Color.BLACK);
       managerInfo.setForeground(Color.white);
       managerInfo.addActionListener(this);
       add(managerInfo);
       
       
       JButton chechOut=new JButton("CHECK OUT");
       chechOut.setBounds(10,270,200,30);
       chechOut.setVisible(true);
       chechOut.setBackground(Color.BLACK);
       chechOut.setForeground(Color.white);
       add(chechOut);
       
       JButton updateStatus=new JButton("UPDATE STATUS");
       updateStatus.setBounds(10,310,200,30);
       updateStatus.setVisible(true);
       updateStatus.setBackground(Color.BLACK);
       updateStatus.setForeground(Color.white);
       add(updateStatus);
       
       JButton roomStatus=new JButton("UPDATE ROOM STATUS");
       roomStatus.setBounds(10,350,200,30);
       roomStatus.setVisible(true);
       roomStatus.setBackground(Color.BLACK);
       roomStatus.setForeground(Color.white);
       add(roomStatus);
       
       JButton pickUp=new JButton("PICKUP SERVICE");
       pickUp.setBounds(10,390,200,30);
       pickUp.setVisible(true);
       pickUp.setBackground(Color.BLACK);
       pickUp.setForeground(Color.white);
       add(pickUp);
       
       searchRoom=new JButton("SEARCH ROOM");
       searchRoom.setBounds(10,430,200,30);
       searchRoom.setVisible(true);
       searchRoom.setBackground(Color.BLACK);
       searchRoom.setForeground(Color.white);
       searchRoom.addActionListener(this);
       add(searchRoom);
       
       JButton logout=new JButton("LOG OUT");
       logout.setBounds(10,470,200,30);
       logout.setVisible(true);
       logout.setBackground(Color.BLACK);
       logout.setForeground(Color.white);
       add(logout);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
       JLabel image=new JLabel(i1);
       image.setBounds(250,30,500,470);
       add(image);
       
   setBounds(350,200,800,550);
   setVisible(true);
   
   }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == newCustomer){
           setVisible(false);
           new AddCustomer();
       } else if(ae.getSource()==rooms){
           setVisible(false);
           new Room();
       } else if (ae.getSource() == department){
           setVisible(false);
           new Department();
       }else if(ae.getSource() == allEmployee){
           setVisible(false);
           new EmployeeInfo();
       }else if(ae.getSource() == managerInfo){
           setVisible(false);
           new ManagerInfo();  
       }else if(ae.getSource() == customers){
           setVisible(false);
           new CustomerInfo();
       }else if(ae.getSource() == searchRoom){
           setVisible(false);
           new SearchRoom();
        } 
   }
   public static void main (String[] args){
       new Reception();
   }
 
}
