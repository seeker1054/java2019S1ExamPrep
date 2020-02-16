import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;


public class PropValidator extends JFrame
{
  private JLabel codeSpecs, codeLabel;

  private JTextField propCode;
  private GridLayout layout;
  private JButton validate;


  private class handyskills implements ActionListener
  {
    public void actionPerformed(ActionEvent btnClick)
    {
      String propertyCode = propCode.getText();
      if(propertyCode.matches("%[a-z]%") == true || propertyCode.length() < 10 || propertyCode.length() > 10 )
      {
        //try again on jLabel
        codeSpecs.setText("Please enter a code that contains no alphabetical characters");
      }
      else
      {
        codeSpecs.setText("Thank you for valid input");
      }

    }
  }

  public PropValidator()
  {
    super("Validate property codes");

    layout = new GridLayout(5, 2);
    setLayout(layout);

    codeSpecs = new JLabel("Property code specification: 10 digits");
    codeLabel = new JLabel("Enter a property code: ");

    propCode = new JTextField("");
    validate = new JButton("Valdate");

    add(codeSpecs);
    add(codeLabel);
    add(propCode);
    add(validate);

    handyskills handyMan = new handyskills();
    validate.addActionListener(handyMan);
  }
  public static void main(String[] args)
  {
      PropValidator pvaliman = new PropValidator();
      pvaliman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pvaliman.setSize(300, 300);
      pvaliman.setVisible(true);
  }

}
