import java.awt.*;
import javax.swing.*;

public class GroupLayoutDemo {
  
    public static void main(String[] args) {  

        JFrame frame = new JFrame("GroupLayoutDemo");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JLabel clickMe = new JLabel("Press");  
        JButton button = new JButton("Login");  
  
        groupLayout.setHorizontalGroup(  
                    groupLayout.createSequentialGroup()  
                                .addComponent(clickMe)  
                                .addGap(10, 20, 100)  
                                .addComponent(button));  
        groupLayout.setVerticalGroup(  
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(clickMe)  
                                .addComponent(button));  
        frame.pack();  
        frame.setVisible(true);  
    }  
}  