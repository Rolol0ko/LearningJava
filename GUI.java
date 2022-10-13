import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame f = new JFrame("Java Window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setLocation(0,0);

        //Dog Image
        JLabel DogImage = new JLabel(new ImageIcon("Dog.jpeg"));
        f.add(DogImage, BorderLayout.PAGE_START);

        //Text Label
        JLabel Label = new JLabel("Pre-Button");
        f.add(Label, BorderLayout.PAGE_END);

        //Button 1
        JButton Button = new JButton("Dog 1");
        Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Label.setText("Post-Button");
                DogImage.setIcon(new ImageIcon("Dog2.jpeg"));
            }});
        f.add(Button, BorderLayout.EAST);

        //Button 2
        JButton Button2 = new JButton("Dog 2");
        Button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Label.setText("Pre-Button");
                DogImage.setIcon(new ImageIcon("Dog.jpeg"));
            }});
        f.add(Button2, BorderLayout.WEST);

        //Display the window.
        f.setSize(500,500);
        //f.pack();
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