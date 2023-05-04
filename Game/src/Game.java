import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Game {

 JFrame window; // Creates JFrame
 Container con; // Creates Container
 JPanel titleNamePanel; // Creates panel for title text
 JPanel startButtonPanel; // Creates panel for start button
 JLabel titleNameLabel; // Creates label for title text
 JButton startButton; // Creates button for start button
 Font titleFont = new Font("Chiller", Font.PLAIN, 70); // Creates text font
Font startFont = new Font("Chiller", Font.BOLD, 20); // Creates font for start button
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

        startButtonPanel = new JPanel(); // Set panel for button
        startButtonPanel.setBounds(300, 300, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START GAME"); // Set button
        startButton.setBackground(Color.BLACK); // Button colour
        startButton.setForeground(Color.WHITE); // Text colour
        startButton.setFont(startFont);


        titleNamePanel.add(titleNameLabel); // Add JLabel text to JPanel
        startButtonPanel.add(startButton); // Add JButton to JPanel

        con.add(titleNamePanel);
        con.add(startButtonPanel);    
    }
}
