package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * @version 2.0
 * @author Dhruv
 */
public class TicTacToeFrame extends JFrame
{
    JPanel panel =new JPanel();
    
    // We need total 9 buttons/cells to make a 3X3 grid for the board
    Cells buttons[]=new Cells[9];
    JLabel jlbstatus = new JLabel("X' turn");
/**
 * No-argument constructor used to generate the game board using grid layout
 */
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
            
        jlbstatus.setBorder(new LineBorder(Color.yellow,1));
        add(jlbstatus, BorderLayout.SOUTH);
    }
    
    public class Cells extends JButton implements ActionListener
    {
    
    ImageIcon X,O;
    byte value=0;
/**
 * No-argument constructor used to load the images from resource
 * Used to trigger the action on click event
 */	
    public Cells()
       {
	X=new ImageIcon(this.getClass().getResource("X.png"));
	O=new ImageIcon(this.getClass().getResource("O.png"));
        // Player or us is the one trigerring the action and listening to it
        // thus we use this
	this.addActionListener(this);
        }

/**
 * This main purpose of this function is  to perform the action, based on the 
 * click event
 * @param e 
 */
    public void actionPerformed(ActionEvent e)
    
    {
        
        /* X is assinged value = 1
           O is assinged value = 2
           null is assinged value = 0
           That is for click one value is 1 and click 2 value is 2
           Therefore for single click value X will be entered by the user
           and when user clicks twice in the cell value will be O
        */
	value++;
        // Following will reset value to 0 if it is greater than or equal to 3
	value%=3;
	switch(value)
        {
                
		case 0:
			setIcon(null);
                        jlbstatus.setText("Value of the cell has been reset");
			break;
		case 1:
                        setIcon(X);
                        jlbstatus.setText("Player X made a move");
			break;
		case 2:
			setIcon(O);
                        jlbstatus.setText("Player O made a move");
			break;
	}
    }
    
}

    
}


