import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000, 500);

        JLabel Label1 = new JLabel("Hello World");
        Label1.setBounds(10, 10, 100, 50);
        f.add(Label1);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(200, 200, 100, 10);
        progressBar.setValue(10);
        f.add(progressBar);

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
