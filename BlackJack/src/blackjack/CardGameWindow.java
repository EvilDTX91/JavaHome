/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Tomi
 */
import java.awt.*; //Layouts
import javax.swing.*; // JFrames

import javax.swing.border.LineBorder;
//import java.util.*;
public class CardGameWindow extends JFrame {
    
    private JPanel startScreen = new JPanel();
    private JPanel gameScreen = new JPanel();
    private JPanel copyRScreen = new JPanel();
    
    private JTextField startText = new JTextField("Black Jack! Játék mindenkinek!");
    private JButton startButton = new JButton("Start");
    private JButton optionsButton = new JButton("Options");
    private JButton scoreButton = new JButton("Score");
    private JButton exitButton = new JButton("Exit");
    
    
    private JLabel dealer = new JLabel("Dealer Score:");
    private JLabel dealerScore = new JLabel("0");
    
    private JLabel player = new JLabel("Player Score:");
    private JLabel playerScore = new JLabel("0");
    
    private JLabel copyR = new JLabel("Black Jack all rights reserved. C.");
    
    private void StartScreen()
    {
        startScreen.setLayout(new BoxLayout(startScreen, BoxLayout.PAGE_AXIS));
        startScreen.setBorder(BorderFactory.createEmptyBorder(100,10,10,10));
        startScreen.setBackground(Color.green);
        
        startButton.setAlignmentX(startButton.CENTER_ALIGNMENT);
        startButton.setPreferredSize(new Dimension(50, 50));
        startButton.setFont(new Font("Arial", 1, 20));
        startButton.setBorder(new LineBorder(Color.BLACK));
        startScreen.add(startButton);
        
        optionsButton.setAlignmentX(optionsButton.CENTER_ALIGNMENT);
        optionsButton.setPreferredSize(new Dimension(50, 50));
        optionsButton.setFont(new Font("Arial", 1, 20));
        optionsButton.setBorder(new LineBorder(Color.BLACK));
        startScreen.add(optionsButton);
        
        scoreButton.setAlignmentX(scoreButton.CENTER_ALIGNMENT);
        scoreButton.setPreferredSize(new Dimension(50, 50));
        scoreButton.setFont(new Font("Arial", 1, 20));
        scoreButton.setBorder(new LineBorder(Color.BLACK));
        startScreen.add(scoreButton);
        
        exitButton.setAlignmentX(exitButton.CENTER_ALIGNMENT);
        exitButton.setPreferredSize(new Dimension(50, 50));
        exitButton.setFont(new Font("Arial", 1, 20));
        exitButton.setBorder(new LineBorder(Color.BLACK));
        startScreen.add(exitButton);
        
        
        startScreen.add(copyR);
        
        add(startScreen, BorderLayout.CENTER);
        startScreen.setVisible(true);
        
    }
    private void GameScreen()
    {
        gameScreen.setLayout(new FlowLayout());
        gameScreen.setBorder(BorderFactory.createEmptyBorder(100,10,10,10));
        gameScreen.setBackground(Color.yellow);
        
        gameScreen.add(dealer);
        gameScreen.add(dealerScore);
        gameScreen.add(player);
        gameScreen.add(playerScore);
        
        add(gameScreen, BorderLayout.PAGE_START);
        gameScreen.setVisible(true);        
    }
    
    private void CopyRScreen()
    {
        copyRScreen.setLayout(new FlowLayout());
        copyRScreen.setBackground(Color.CYAN);
        
        copyRScreen.add(copyR);
        
        add(copyRScreen);
        copyRScreen.setVisible(true);
    }
    
    public CardGameWindow()
    {
        super("BlackJack");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int axis = BoxLayout.Y_AXIS;
        super.setLayout(new BoxLayout(this, axis));
        
        setBackground(Color.BLACK);
        setVisible(true);
        GameScreen();
        StartScreen();
        CopyRScreen();
    }
    
}
