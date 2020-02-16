import javax.swing.*;
import java.awt.*;

public class GUITEST extends JFrame
{
	private JLabel weightL;
	private JTextField weightTF;
	private JLabel heightL;
	private JTextField heightTF;
	private JRadioButton maleSelect;
	private JRadioButton femaleSelect;
	private ButtonGroup genderSelect;
	private int genderValue; // 0 - male, 1 - female
	private JButton calculate;
	private JLabel bmiL;
	private JLabel displayL;
	private GridLayout layout;
	
	public GUITEST()
	{
		super("BMI calculator");
		layout = new GridLayout(5,2);
		setLayout(layout);
		
		weightL = new JLabel("Enter weight in KG:");
		add(weightL);
		
		weightTF = new JTextField("");
		add(weightTF);
		
		TL = new JLabel("Enter age in years:");
		add(weightL);
		
		TF = new JTextField("");
		add(weightTF);
		
	}
	public static void main(String arg[])
	{
		GUITEST gui = new GUITEST();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(250,250);
		gui.setVisible(true);
		/*int firstnumber = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
		int secondnumber = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
		int answer = firstnumber + secondnumber;
		JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.PLAIN_MESSAGE);
		*/
	}
}