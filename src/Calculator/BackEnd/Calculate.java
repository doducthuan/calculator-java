/**
 * CopyRight(C) doducthuan
 * Calculate.java Jul 20, 2021
 */
package Calculator.BackEnd;
import Calculator.FrontEnd.Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Admin
 *
 */
public class Calculate implements ActionListener {
	Gui gui;
	public Calculate(Gui gui){
		this.gui = gui;
	}
	String numberOne = gui.inputNumberOne.getText();
	String numberTwo = gui.inputNumberTwo.getText();
	public void actionPerformed(ActionEvent e) {
		//gui.inputNumberTwo.setText(gui.inputNumberOne.getText());
	}
}
