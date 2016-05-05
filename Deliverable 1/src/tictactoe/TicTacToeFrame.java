/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

/**
 * @version 1.0
 * @author Dhruv
 */
public class TicTacToeFrame extends JFrame
{
    JPanel panel =new JPanel();
    
    // We need total 9 buttons/cells to make a 3X3 grid for the board
    Cells buttons[]=new Cells[9];
    
    public TicTacToeFrame()
    {
        panel.setLayout(new GridLayout(3,3));
        //Loop for populating panel with grid layout of 3x3 with 9 nine buttons
           for(int i=0;i<9;i++)
                {
                    buttons[i]=new Cells();
                    panel.add(buttons[i]);
		} 
            add(panel);
    }
    
    
}


