![LayoutManagerJava](https://cdn.educba.com/academy/wp-content/uploads/2020/01/Layout-Manager-in-Java.jpg)

# Java Layout Managers

The LayoutManagers are used to arrange components in a particular manner. LayoutManager is an interface that is implemented by all the classes of layout managers. There are following classes that represents the layout managers:

1. java.awt.BorderLayout
2. java.awt.FlowLayout
3. java.awt.GridLayout
4. java.awt.CardLayout
5. java.awt.GridBagLayout
6. javax.swing.BoxLayout
7. javax.swing.GroupLayout
8. javax.swing.ScrollPaneLayout
9. javax.swing.SpringLayout etc.

## GroupLayout

GroupLayout groups its components and places them in a Container hierarchically. The grouping is done by instances of the Group class.

Group is an abstract class and two concrete classes which implement this Group class are SequentialGroup and ParallelGroup.

SequentialGroup positions its child sequentially one after another where as ParallelGroup aligns its child on top of each other.

The GroupLayout class provides methods such as createParallelGroup() and createSequentialGroup() to create groups.

GroupLayout treats each axis independently. That is, there is a group representing the horizontal axis, and a group representing the vertical axis. Each component must exists in both a horizontal and vertical group, otherwise an IllegalStateException is thrown during layout, or when the minimum, preferred or maximum size is requested.

### Example
```
public class GroupExample {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("GroupLayoutExample");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JLabel clickMe = new JLabel("Click Here");  
        JButton button = new JButton("This Button");  
  
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
```
Output : 
![GroupLayout](https://static.javatpoint.com/java/layout/images/grouplayout1.png)

## Custom Layout

The example CustomLayoutDemo uses a custom layout manager called DiagonalLayout. You can find the layout manager's source code in DiagonalLayout.java. DialogLayout lays out components diagonally, from left to right, with one component per row. Here is a picture of CustomLayoutDemo using DialogLayout to lay out five buttons.

### Example
```
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class CustomLayoutDemo {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new DiagonalLayout());
 
        pane.add(new JButton("Button 1"));
        pane.add(new JButton("Button 2"));
        pane.add(new JButton("Button 3"));
        pane.add(new JButton("Button 4"));
        pane.add(new JButton("Button 5"));
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CustomLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

```

Output:
![CustomLayoutDemo](https://docs.oracle.com/javase/tutorial/figures/uiswing/layout/CustomLayoutDemo.png)

## No Layout Manager

We know earlier in "Java Layout Managers" that two styles of placing components in containers – pixel format and position format. Now let us discuss clearly what pixel format is and how to place a component in terms of pixels.

We also know earlier, the default layout manager for Frame is BorderLayout and for Panel and Applet, it is FlowLayout. To use pixel format, first we must set the default layout manager of the container to null. To give the size and location, setBounds() method is used. But, this style is very rarely used (to avoid the complexity of GridBagLayout).

Following is the method signature as defined in java.awt.Component class.

setBounds(int x, int y, int width, int height): First two coordinates x and y give the position in the container and the last two width and height give the size of the component.

### Example:
```
import java.awt.*;
public class NullLayoutManager extends Frame
{
  Button agreedBut, denyBut;
  Label sign;
  public NullLayoutManager()
  {
    super("No Layout Manager");
    setLayout(null);
 
    sign = new Label("Click Your Acceptance");
    agreedBut = new Button("AGREED");
    denyBut = new Button("DENIED");
 
    sign.setBounds(80, 35, 130, 25);
    agreedBut.setBounds(60, 75, 75, 25);
    denyBut.setBounds(150, 75, 75, 25);
    
    add(sign);   add(agreedBut);  add(denyBut);
 
    setSize(260, 130);
    setVisible(true);
  }
  public static void main(String args[])
  {
    new NullLayoutManager ();
  }
}
```

Output : 
![NoLayoutManager](http://way2java.com/wp-content/uploads/2011/04/ss70.bmp)

