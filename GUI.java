import java.awt.*;
import javax.swing.*;

public class GUI {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame f = new JFrame("Java Window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setLocation(600, 200);

        //Add the compontents
        f.add(new JLabel("Dog.jpeg"), BorderLayout.LINE_END);
        f.add(new JLabel("Hello World"), BorderLayout.PAGE_START);
        f.add(new JButton("Click Me!"), BorderLayout.CENTER);

        //Display the window.
        f.setSize(500,500);//This is to set size, could use f.pack() instead
        f.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
}}