import javax.swing.JOptionPane;

public class lights {

	public static void main(String[] args) 
	{
		int lightOption = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like to do?\n" 
						+ "1.Turn lights on\n" + "2.Turn lights off\n" + "3.Return to main menu\n"));
		
		if (lightOption == 1)
		{
		//	lightsOn;
		}
	}
	
	public static boolean lightsOn;
	{
		boolean light = true;
		System.out.println("The light is on");
	}
	
}
