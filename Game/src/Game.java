import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {

 JFrame window; // Creates JFrame
 Container con; // Creates Container
 JPanel titleNamePanel; // Creates panel for title text
 JLabel titleNameLabel; // Creates label for title text
 Font titleFont = new Font("Chiller", Font.PLAIN, 70); // Creates text font

    public static void main(String[] args){

       new Game();
    }

    public Game(){

        window = new JFrame(); // Create JFrame
        window.setSize(800, 600); // Set size of JFrame
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        window.getContentPane().setBackground(Color.BLACK); // Set background colour
        window.setLayout(null); // Set layout (Change later)
        window.setVisible(true); // Make window visable
        con = window.getContentPane();

        titleNamePanel = new JPanel(); // Set text background JPanel
        titleNamePanel.setBounds(100, 75, 600, 150); // Set size 
        titleNamePanel.setBackground(Color.BLACK); // Set text background colour
       
        titleNameLabel = new JLabel("Terror in the Themepark"); // Set Text JLabel
        titleNameLabel.setForeground(Color.RED); // Set text colour
        titleNameLabel.setFont(titleFont); // Set Font

        titleNamePanel.add(titleNameLabel); // Add JLabel text to JPanel
        con.add(titleNamePanel);
    }
}
