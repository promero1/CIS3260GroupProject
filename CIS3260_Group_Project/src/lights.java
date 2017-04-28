import javax.swing.JOptionPane;

public class lights {

	public static void main(String[] args) 
	{
		
	}
	
	public static void lightSwitch(boolean onOff) 
	{
		
		if (onOff == true)
		{
		JOptionPane.showMessageDialog(null,"The lights are on.");
		}
		if (onOff == false)
		{
		JOptionPane.showMessageDialog(null,"The lights are off.");
		}
	}
		
}