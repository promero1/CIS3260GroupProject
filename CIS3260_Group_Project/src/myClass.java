/**
 * This class will is where the objects are created by commands and calls to the other classes. 
 * From the command line / JOptionPane window. 
 * 
 * Possibly an option menu will be displayed asking what Home System the user would like to control.
 * That will then send a call to one of the classes to enable another menu for that class.
 * 
 * A loop should be put here, to return to the main menu until the user exits the program completely. 
 * 
 * Ex: 
 * 
 * What home system would you like to control?
 * 1.Lights
 * 2.Doors
 * 3.Spotify
 * 4... so on
 * 7. Exit Program (ends main option loop / program)
 * @author promero
 * 
 *
 */

//import JOptionPane
import javax.swing.JOptionPane;

public class myClass {

	public static void main(String[] args) 
	{
		//Presents window to display the user options, stores in a 'UserOption' string variable
		int userOption = Integer.parseInt(JOptionPane.showInputDialog(null, "What home system would you like to control?\n"
				+ "1.Lights\n" + "2.Doors\n" + "3.Spotify\n" + "4.Cameras\n" + " 5.Toaster\n" + "6.Oven\n" + "7.Exit\n"));
		
		if (userOption == 1)
		{
		lights.main(args);
		}
		if (userOption == 2)
		{
			
		}
		if (userOption == 3)
		{
			
		}
	}

}
