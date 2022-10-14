import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DogWindow {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame f = new JFrame("Java Window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Doggo Window");
        f.setResizable(false);
        f.setLocation(0,0);
        f.setLayout(null);

        //Dog Image
        JLabel DogImage = new JLabel(new ImageIcon("DogImages/Dog.jpeg"));
        DogImage.setBounds(40, 70, 260, 194);
        f.add(DogImage);

        //Button 1
        JButton Button = new JButton("Dog 1");
        Button.setBounds(10, 10, 100, 50);
        Button.setBackground(Color.LIGHT_GRAY);
        Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DogImage.setIcon(new ImageIcon("DogImages/Dog.jpeg"));
        }});
        f.add(Button);

        //Button 2
        JButton Button2 = new JButton("Dog 2");
        Button2.setBounds(120, 10, 100, 50);
        Button2.setBackground(Color.LIGHT_GRAY);
        Button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DogImage.setIcon(new ImageIcon("DogImages/Dog2.jpeg"));
        }});
        f.add(Button2);

        //Button 3
        JButton Button3 = new JButton("Dog 3");
        Button3.setBounds(230,10,100,50);
        Button3.setBackground(Color.LIGHT_GRAY);
        Button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DogImage.setIcon(new ImageIcon("DogImages/Dog3.jpg"));
        }});
        f.add(Button3);

        //Display the window.
        f.setSize(345,304);
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