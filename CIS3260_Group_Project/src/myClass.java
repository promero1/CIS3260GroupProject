/**
 * Group Project Jarvis Home systems control
 * 
 * Currently Jarvis can control:
 * Lights - On/off
 * Toaster - on/off
 * Camera - on/off, zoom in/out
 * Spotify - play song indicated by user
 *
 *User is prompted window to type in the command.
 *
 */

//import JOptionPane
import javax.swing.JOptionPane;


public class myClass {

	public static void main(String[] args) 
	{
		myClass.menu();
	}
	
	public static void menu()
	{
		String command =(JOptionPane.showInputDialog(null, "Hello, my name is J.A.R.V.I.S! Please type a command for your home system below:", "Home Systems Menu",JOptionPane.PLAIN_MESSAGE));
		myClass.decisions(command);
	}
	
	public static void decisions(String command)
	{
		command = command.toLowerCase();
		
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
		if(command.contains("cameras") && command.contains("on"))
		{
			cameras.cameraSwitch(true);
			myClass.menu();
	    }
		if(command.contains("cameras") && command.contains("off"))
		{
			cameras.cameraSwitch(false);
			myClass.menu();
	    }
		if(command.contains("cameras") && command.contains("zoom") && command.contains("in"))
		{
			cameras.zoomIn();
			myClass.menu();
	    }
		if(command.contains("cameras") && command.contains("zoom") && command.contains("out"))
		{
			cameras.zoomOut();
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
		if(command.contains("play") && command.contains("music") || command.contains("spotify"))
		{
			spotify.spotifySong();
			myClass.menu();
		}
		
	}
}
