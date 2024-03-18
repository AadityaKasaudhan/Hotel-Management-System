package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HotelManagementSystem extends JFrame implements ActionListener{

    HotelManagementSystem(){
   //   setSize(1366,565);
   //   setLocation(100,100);
    setBounds(100,100,1366,565);
      setLayout(null);
      
      ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
      JLabel image=new JLabel(i);
      image.setBounds(0,0,1366,565);
      add (image);
      
      JLabel text=new JLabel("Hotel Management System");
      text.setBounds(20,430,1000,90);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("Serif",Font.PLAIN,50));
      image.add(text);
      
      JButton next= new JButton("Next");
       next.setBounds(1150,450,150,50);
       next.setBackground(Color.white);
      next.setForeground(Color.MAGENTA);
      next.addActionListener(this);
      next.setFont(new Font("Serif",Font.PLAIN,24));
      image.add(next);
      
      setVisible(true);
      
      while(true){
          text.setVisible(false);
          try{
              Thread.sleep(500);
          } 
          catch(Exception e){
          e.printStackTrace();
          
          }
          text.setVisible(true);
          try{
              Thread.sleep(500);
             } 
          catch(Exception e)
          {
          e.printStackTrace();
          
          }

      }
    }
    
        public void actionPerformed(ActionEvent ae){
          setVisible(false);
          new Login();
        }
 
         public static void main(String[] args) {  
            new HotelManagementSystem();
        
    }    
    
}
    