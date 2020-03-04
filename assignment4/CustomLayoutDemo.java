import java.awt.*;
import javax.swing.*;
 
public class CustomLayoutDemo extends FlowLayout{

    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new FlowLayout());
 
        pane.add(new JButton("Button 1"));
        pane.add(new JButton("Button 2"));
        pane.add(new JButton("Button 3"));
        pane.add(new JButton("Button 4"));
        pane.add(new JButton("Button 5"));
    }
 
    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("CustomLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        addComponentsToPane(frame.getContentPane());
 
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}