import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Game {

 JFrame window; // Creates JFrame
 Container con; // Creates Container
 JPanel titleNamePanel; // Creates panel for title text
 JPanel startButtonPanel; // Creates panel for start button
 JPanel mainTextPanel; // Creates panel to display main text in game
 JPanel choiceButtonPanel; // Creates panel for buttons in game
 JPanel playerPanel; // Creates panel for player data 
 JLabel titleNameLabel; // Creates label for title text
 JLabel hpLabel; // Creates label for HP text
 JLabel hpLabelNumber; // Creates label for HP number
 JLabel weaponLabel; // Creates label for weapon text
 JLabel weaponLabelName; // Creates label for weapon number
 JButton startButton; // Creates button for start button
 JButton choice1, choice2, choice3, choice4; // Creates JButton for game buttons
 JTextArea mainTextArea; 
 int playerHp;
 String weapon;
 String position;

 TitleScreenHandler tsHandler = new TitleScreenHandler();
 ChoiceHandler choiceHandler = new ChoiceHandler();

 Font titleFont = new Font("Chiller", Font.PLAIN, 70); // Creates text font
Font startFont = new Font("Chiller", Font.BOLD, 20); // Creates font for start button
Font basicFont = new Font("Times New Roman", Font.PLAIN, 28); // Create basic font

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
        startButton.setFont(startFont); // Font
        startButton.addActionListener(tsHandler); // Add Functionality
        startButton.setFocusPainted(false); // Gets rid of annoying box and text line


        titleNamePanel.add(titleNameLabel); // Add JLabel text to JPanel
        startButtonPanel.add(startButton); // Add JButton to JPanel

        con.add(titleNamePanel);
        con.add(startButtonPanel);    
    }

    public void createGameScreen(){

        // Set previous panels not visable
        titleNameLabel.setVisible(false); 
        startButtonPanel.setVisible(false);

        //Create Panel for text area
        mainTextPanel = new JPanel(); 
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);
        
        // Create text area
        mainTextArea = new JTextArea("This is the main text area"); 
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(basicFont);
        mainTextArea.setLineWrap(true); // set basic text to wrap if too long
        mainTextPanel.add(mainTextArea); // Add text panel to text area

        // Add panel for buttons
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.RED);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        // Add game buttons
        choice1 = new Jbutton("Choice 1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(basicFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new Jbutton("Choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(basicFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new Jbutton("Choice 3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(basicFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new Jbutton("Choice 4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(basicFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        // Adds panel for player info
        playerPanel = newJPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);

        // Add labels for player info
        hpLabel = newJLabel("HP:");
        hpLabel.setFont(basicFont);
        hpLabel.setForeground(Color.WHITE);
        playerPanel.add(hpLabel);
        
        hpLabelNumber = newJLabel();
        hpLabelNumber.setFont(basicFont);
        hpLabelNumber.setForeground(Color.WHITE);
        playerPanel.add(hpLabelNumber);

        weaponLabel = newJLabel("Weapon:");
        weaponLabel.setFont(basicFont);
        weaponLabel.setForeground(Color.White);
        playerPanel.add(weaponLabel);

        weaponLabelName = newJLabel();
        weaponLabelName.setFont(basicFont);
        weaponLabelName.setForeground(Color.WHITE);
        playerPanel.add(weaponLabelName);

        playerSetup;

    }

        public void playerSetup(){

        // Set player info
        playerHp = 15;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabel.setText(" " + playerHp);

        parkGate();

        }

        public void parkGate(){

            position = "parkGate";
            // Add /n for linebreak
            mainTextArea.setText("You are at the entrance to the park. A zombie clown stands blocking the gate. What do you do?");

            choice1.setText("Talk to him.");
            choice2.setText("Attack him!");
            choice3.setText("Leave.");
            choice4.setText("");
            
        }

        public void talkClown(){
            position = "talkClown";
            mainTextArea.setText("Clown: RAHHHH UGHHHH (He's a ZOMBIE clown dummy)");
            choice1.setText("<");
            choice2.setText("");
            choice3.setText("");
            choice4.setText("");

        }

    // Handles start button press
    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            createGameScreen();

        }
    }
    
    // Handles Choice button presses
    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

        String yourChoice = event.getActionCommand();

        // Essentialy like if statements
        switch(position){
            case "parkGate";
            switch(yourChoice){
                case "c1"; talkClown(); break;
                case "c2"; break;
                case "c3"; break;
                case "c4"; break;
            }
            break;
            case "talkClown";
            switch(yourChoice){
                case "c1"; parkGate(); break;
            }
        }

        }
    }

}
