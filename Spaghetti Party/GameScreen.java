//Packages for Menu
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameScreen {
    JFrame      window, gamescreen;
    Container   con;
    JPanel      titleNamePanel, titleNamePanel1, startButtonPanel, mainTextPanel;
    JLabel      titleNameLabel, titleNameLabel1;
    Font titleFont= new Font("Courier New", Font.BOLD, 50);
    Font normalFont = new Font("Courier New", Font.BOLD, 30);
    JButton     startButton;
    JTextArea   mainTextArea;
    
    ButtonStart bs = new ButtonStart();
    public static void main(String[] args){
        new GameScreen();
    }
    public GameScreen(){
        //Add Frame
        window = new JFrame("Spaghetti Menu");
        window.setSize(800,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        
        con = window.getContentPane();
        //Top text
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 50, 600, 70);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("Welcome to Super");
        titleNameLabel.setForeground(Color.GREEN);
        titleNameLabel.setFont(titleFont);
        //LOWER text
        titleNamePanel1 = new JPanel();
        titleNamePanel1.setBounds(100, 120, 600, 70);
        titleNamePanel1.setBackground(Color.BLACK);
        titleNameLabel1 = new JLabel("Spaghetti Party");
        titleNameLabel1.setForeground(Color.BLUE);
        titleNameLabel1.setFont(titleFont);
        //Button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 200, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);
        
        startButton = new JButton("Start");
        startButton.setBackground(Color.RED);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(normalFont);
        startButton.addActionListener(bs);
        
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        titleNamePanel1.add(titleNameLabel1);
        
        con.add(titleNamePanel1);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }    
    public void createGameScreen(){
        gamescreen = new JFrame("Spaghetti board");
        gamescreen.setSize(900, 500);
        gamescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamescreen.getContentPane().setBackground(Color.BLACK);
        gamescreen.setLayout(null);
        gamescreen.setVisible(true);
        gamescreen.setResizable(true);
        con.add(gamescreen);
    }
    public class ButtonStart implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }
}
    