/**
 * CopyRight(C) doducthuan
 * Calculate.java Jul 20, 2021
 */
package Calculator.BackEnd;
import Calculator.FrontEnd.Gui;
import CheckNumber1.CheckNumber;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Admin
 *
 */
public class Calculate implements ActionListener {
	
	// gọi lại đối tượng để gọi các hàm check số 
	CheckNumber checkNumber = new CheckNumber();
	Gui gui;
	public Calculate(Gui gui){
		this.gui = gui;
	}
	
	/**
	 * check đầu vào xem có bị để trống không
	 * @param number : đầu vào cần kiểm tra
	 * @return nếu không bị để trống thì trả về true , ngược lại trả về false
	 *
	 */
	public boolean checkNumbers(String number) {
		boolean confirm;
		if(checkNumber.checkValue(number, 1) == true && checkNumber.numberConfirm(number) == true) {
			confirm = true;
		}else {
			confirm = false;
		}
		return confirm;
	}
	
	// đầu vào của hai số
	String numberOne;
	String numberTwo;
	public void actionPerformed(ActionEvent e) {
		
		// lấy giá trị đầu vào mà người dùng mới nhấp
		String numberOne = gui.inputNumberOne.getText();
		String numberTwo = gui.inputNumberTwo.getText();
		
		// kiểm tra giá trị đầu vào
		boolean confirmNumberOne = checkNumbers(numberOne);
		boolean confirmNumberTwo = checkNumbers(numberTwo);
		
		// lấy toán tử mà người dùng chọn
		String operator = gui.jComboBox.getSelectedItem().toString();
		
		// kiểm tra
		if(confirmNumberOne == true && confirmNumberTwo == true) { // nếu giá trị nhập vào hợp lệ thì tính toán
			// chuyển đổi về dạng float để thực hiện tính toán
			Float floatNumberOne = Float.parseFloat(numberOne);
			Float floatNumberTwo = Float.parseFloat(numberTwo);
			
			// thực hiện tính toán với các trường hợp riêng biệt
			if(operator.equals("+") == true) {
				gui.returnResultOfTwoNumber.setText(String.valueOf(floatNumberOne + floatNumberTwo));
			}
			if(operator.equals("-") == true) {
				gui.returnResultOfTwoNumber.setText(String.valueOf(floatNumberOne - floatNumberTwo));
			}
			if(operator.equals("*") == true) {
				gui.returnResultOfTwoNumber.setText(String.valueOf(floatNumberOne * floatNumberTwo));
			}
			if(operator.equals("/") == true) {
				if(floatNumberTwo == 0) { // nếu thương == 0 thông báo lỗi
					gui.returnResultOfTwoNumber.setText("Số chia phải khác 0 !");
					gui.returnResultOfTwoNumber.setForeground (Color.red);
				}else { // khác 0 thì thực hiện tính toán
					gui.returnResultOfTwoNumber.setText(String.valueOf(floatNumberOne / floatNumberTwo));
				}	
			}
		}else{ // nếu giá trị nhập vào không hợp lệ thì in ra thông báo cho người dùng
			gui.returnResultOfTwoNumber.setText("Bạn cần phải nhập vào một số !");
			gui.returnResultOfTwoNumber.setForeground (Color.red);

		}
	}
}
