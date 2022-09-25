import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator {
    public static void main (String args[]){
    event obj = new event();
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
}

class event extends JFrame {
    JButton b1 = new JButton ("Add");
    JButton b2 = new JButton ("Subtract");
    JButton b3 = new JButton ("Multiply");
    JButton b4 = new JButton ("Divide");
    JButton b5 = new JButton ("Remainder");
    handler handle = new handler();
    
    event() {
        
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        
        b1.addActionListener(handle);
        b2.addActionListener(handle);
        b3.addActionListener(handle);
        b4.addActionListener(handle);
        b5.addActionListener(handle);
        
        this.setSize(400, 400);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
    }
    
    class handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == b1) {
                String s1 = JOptionPane.showInputDialog("Enter first number:");
                String s2 = JOptionPane.showInputDialog("Enter second number:");
                int x = Integer.parseInt(s1);
                int y = Integer.parseInt(s2);
                int z = x + y;
                JOptionPane.showMessageDialog(null,"Result is : " +z);
            }
            
            if (e.getSource() == b2) {
                String s1 = JOptionPane.showInputDialog("Enter first number:");
                String s2 = JOptionPane.showInputDialog("Enter second number:");
                int x = Integer.parseInt(s1);
                int y = Integer.parseInt(s2);
                int z = x - y;
                JOptionPane.showMessageDialog(null,"Result is : " +z);
            }
            
             if (e.getSource() == b3) {
                String s1 = JOptionPane.showInputDialog("Enter first number");
                String s2 = JOptionPane.showInputDialog("Enter second number");
                int x = Integer.parseInt(s1);
                int y = Integer.parseInt(s2);
                int z = x * y;
                JOptionPane.showMessageDialog(null,"Result is : " +z);
            }  
            
            if (e.getSource() == b4) {
                String s1 = JOptionPane.showInputDialog("Enter first number");
                String s2 = JOptionPane.showInputDialog("Enter second number");
                int x = Integer.parseInt(s1);
                int y = Integer.parseInt(s2);
                int z = x / y;
                JOptionPane.showMessageDialog(null,"Result is : " +z);
            }
            
            if (e.getSource() == b5) {
                String s1 = JOptionPane.showInputDialog("Enter first number");
                String s2 = JOptionPane.showInputDialog("Enter second number");
                int x = Integer.parseInt(s1);
                int y = Integer.parseInt(s2);
                int z = x % y;
                JOptionPane.showMessageDialog(null,"Result is : " +z);
            }
        }
    }
}
