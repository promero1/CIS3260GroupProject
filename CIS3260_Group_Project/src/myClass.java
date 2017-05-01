/**
 * Group Project Jarvis Home systems control 
 * ____________________
 * GROUP6
 * ____________________
 * Patrick Romero
 * Ashley Yonika
 * Waymon Martin, Jr
 * Michael-bret Hodges
 * Michael Bogan
 * ____________________
 * 
 * Currently JARVIS can control via text input:
 * -------------------------------
 * Lights - On/off
 * Toaster - on/off, set level.
 * Camera - on/off, zoom in/out
 * Spotify - play song indicated by user
 * Oven - on/off, set temperature
 * Garage Door - open/close
 *
 *User is prompted window to type in the command.
 *---------------------------------
 */

//import JOptionPane
import javax.swing.JOptionPane;


public class myClass {

	public static void main(String[] args) 
	{
		// calls the menu method
		myClass.menu();
	}
	
	//menu method, prompts the user to enter a command. That command is then passed to the decisions method.
	public static void menu()
	{
		//Main menu display, prompts user to input a command.
		String command =(JOptionPane.showInputDialog(null, "Hello, my name is J.A.R.V.I.S! \nPlease type a command for your home system below:", "Home Systems Menu",JOptionPane.PLAIN_MESSAGE));
		//calls the decisions method, passes command string to it
		myClass.decisions(command);
	}
	// decisions method, takes in a string / command from the user. 
	public static void decisions(String command)
	{
		//takes the command and sets it to lower case for use within this method.
		command = command.toLowerCase();
		
		/*if statements, defined to take words contained within the command to call the proper class/method.
		each if statement, calls the menu method to return to*/
		
		if(command.contains("lights") && command.contains("on"))
		{
			lights.lightSwitch(true);
			myClass.menu();
	    }
		if(command.contains("lights") && command.contains("off"))
		{
			lights.lightSwitch(false);
			myClass.menu();
		}
		if(command.contains("camera") && command.contains("on"))
		{
			camera.cameraSwitch(true);
			myClass.menu();
	    }
		if(command.contains("camera") && command.contains("off"))
		{
			camera.cameraSwitch(false);
			myClass.menu();
	    }
		if(command.contains("camera") && command.contains("zoom") && command.contains("in"))
		{
			camera.zoomIn();
			myClass.menu();
	    }
		if(command.contains("camera") && command.contains("zoom") && command.contains("out"))
		{
			camera.zoomOut();
			myClass.menu();
	    }
		if(command.contains("toaster") && command.contains("on"))
		{
			toaster.toasterSwitch(true);
			myClass.menu();
		}
		if(command.contains("toaster") && command.contains("off"))
		{
			toaster.toasterSwitch(false);
			myClass.menu();
		}
		if(command.contains("play") || command.contains("music") || command.contains("spotify"))
		{
			spotify.spotifySong();
			myClass.menu();
		}
		if(command.contains("garage") && command.contains("open"))
		{
			garage.openClose(true);
			myClass.menu();
		}
		if(command.contains("garage") && command.contains("close"))
		{
			garage.openClose(false);
			myClass.menu();
		}
		if(command.contains("oven") && command.contains("on"))
		{
			oven.onOff(true);
			myClass.menu();
		}
		if(command.contains("oven") && command.contains("off"))
		{
			oven.onOff(false);
			myClass.menu();
		}
		//if none of the commands match then it will output the following message and call the menu class again. 
		else
		{
			JOptionPane.showMessageDialog(null,"Please enter a valid command, try again!");
			myClass.menu();
		}
	}
}
