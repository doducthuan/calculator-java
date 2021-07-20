/**
 * CopyRight(C) doducthuan
 * Gui.java Jul 19, 2021
 */
package Calculator.FrontEnd;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import Calculator.BackEnd.Calculate;
//import java.awt.event.ActionListener;
//import java.awt.Frame;
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.TextField;

//import java.awt.Button;
/**
 * @author Admin
 *
 */


public class Gui {
	public JTextField  inputNumberOne;
	public JTextField  inputNumberTwo;
	/**
	 * @param args
	 * 
	 */
	public void guiBo() {
		Calculate gui = new Calculate(this);
		// 
		JFrame jFrame = new JFrame("Welcome to Luvina");
		//setTitle("Welcome to Luvina");
		jFrame.setSize(400,400);
		
		//
		//Controller obj = new Controller(this);
		JButton returnResult = new JButton("Click here");
		returnResult.setBounds(150,230,100,30);
		//Calculate obj = new Calculate(this);
		returnResult.addActionListener(gui);
		
		//
		inputNumberOne = new JTextField();
		inputNumberOne.setBounds(150,20,100,30);
		
		//
		inputNumberTwo = new JTextField();
		inputNumberTwo.setBounds(150,125,100,30);
		
		//
		JLabel numberOne = new JLabel("Number 1", JLabel.CENTER);
		numberOne.setBounds(25, 20, 100, 30);
		
		//
		JLabel numberTwo = new JLabel("Number 2", JLabel.CENTER);
		numberTwo.setBounds(25, 125, 100, 30);
		
		//
		JLabel result = new JLabel("Result", JLabel.CENTER);
		result.setBounds(25,175,100,30);
		
		//
		String[] calcu = {"+","-","/","*" };
		JComboBox<String> jComboBox = new JComboBox<String>(calcu);
		jComboBox.setBounds(150,75,100,30);
		
		
		jFrame.add(result);
		jFrame.add(numberOne);
		jFrame.add(numberTwo);
		jFrame.add(inputNumberOne);
		jFrame.add(jComboBox);
		jFrame.add(returnResult);
		jFrame.add(inputNumberTwo);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}
	public static void main(String[] args) {
		Gui viewGui = new Gui();
		viewGui.guiBo();
	}
}
