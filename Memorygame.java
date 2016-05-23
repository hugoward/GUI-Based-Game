
public class Memorygame {

	public static void main(String[] args)  // main driver method of program 

	{
		GUI newgui =new GUI();
		GameWorks newrun = new GameWorks();
		Board newBoard = new Board();



		newBoard.size(); // calls size method in board
		newgui.createAndShowGUI(); // creates the gui by calling gui class
		newBoard.assign(); // generates random numbers 
		newrun.game(); // runs game



	}

}