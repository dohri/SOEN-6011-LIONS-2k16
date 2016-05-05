package tictactoe;

/**
 *
 * @author Dhruv
 */
import javax.swing.JFrame;

public class TicTacToe 
{	
	public static void main(String args[])
        {
		JFrame tic = new TicTacToeFrame();
                //set location of panel to center of the screen
                tic.setLocationRelativeTo(null);
                //set the board size to 400X400 
                tic.setSize(400,400);
                //Player cannot resize the window
                tic.setResizable(false);
                //setting titile for our game
                tic.setTitle("LIONS-TIC-TAC-TOE");
                // to successfully close exit the application
                tic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // To make the panel visible
                tic.setVisible(true);
	}
	
}
