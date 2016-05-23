import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class GameWorks extends User{

	public boolean gameInProgress=true;
	int score=0;


	public void gameRun(){

		if(Board.board[guess1x][guess1y]==Board.board[guess2x][guess2y]){ // checks if guess are equal to each other 

			score++;
			JOptionPane.showMessageDialog(null, "Your score is: "+ score, "NEW SCORE", JOptionPane.ERROR_MESSAGE); // prints out score after each correct guess
			//System.out.println("That is a match, your score is: "+ score);
			System.out.println(score); // prints score in console too

			if(Board.board[guess1x][guess1y]!=Board.board[guess2x][guess2y]) //checks if guess is not correct
			{
				JOptionPane.showMessageDialog(null, "The cards did not match, guess again.", "WHOOPS", JOptionPane.ERROR_MESSAGE);
			}

			else if(score==(Board.getRow()*Board.getCol())/2){ // check if all cards and their matches have been found
				JOptionPane.showMessageDialog(null, "You Won!, you found all "+ score + " matches", "YOU WON!!!", JOptionPane.ERROR_MESSAGE);
				gameInProgress=false;

			}

		}

	}

	public void game(){ // runs game and takes in guesses from user class
		while(gameInProgress){
			User newPlayer= new User();
			newPlayer.guess1();
			newPlayer.guess2();
			gameRun();
		}
	}

}

