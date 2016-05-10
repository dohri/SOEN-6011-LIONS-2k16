package tictactoe;

/**
 * @version 2.0
 * @author Dhruv
 */

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cells extends JButton implements ActionListener{
    
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
			break;
		case 1:
                        setIcon(X);
			break;
		case 2:
			setIcon(O);
			break;
	}
    }
    
}



