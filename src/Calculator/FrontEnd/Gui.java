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

/**
 * 
 * @author doducthuan
 *
 */


public class Gui {
	public JTextField  inputNumberOne;
	public JTextField  inputNumberTwo;
	public JLabel returnResultOfTwoNumber;
	public JComboBox<String> jComboBox;
	/**
	 * Hàm khởi tạo , thêm các giao diện của máy tính đơn giản
	 *
	 */
	public void guiBo() {
		
		// gọi đến lớp Calculate để truy cập đến các hàm xử lí tính toán
		Calculate gui = new Calculate(this);
		
		
		// gọi đối tượng JFrame để tạo ra khung bao bọc
		JFrame jFrame = new JFrame("Welcome to Luvina");
		//setTitle("Welcome to Luvina");
		jFrame.setSize(500,400);
		
		// nút để khi click vào thực hiện các thao tác tính toán
		JButton returnResult = new JButton("Click here");
		returnResult.setBounds(150,230,100,30);
		returnResult.addActionListener(gui);
		
		// đầu vào của số thứ nhất
		inputNumberOne = new JTextField();
		inputNumberOne.setBounds(150,20,100,30);
		
		// đầu vào của số thứ 2
		inputNumberTwo = new JTextField();
		inputNumberTwo.setBounds(150,125,100,30);
		
		// nhãn cho người dùng biết cần nhâp số thứ nhất
		JLabel numberOne = new JLabel("Number 1", JLabel.CENTER);
		numberOne.setBounds(25, 20, 100, 30);
		
		// nhãn cho người dùng biết cần nhập số thứ hai
		JLabel numberTwo = new JLabel("Number 2", JLabel.CENTER);
		numberTwo.setBounds(25, 125, 100, 30);
		
		// nhãn cho người dùng biết kết quả sẽ trả về đâu
		JLabel result = new JLabel("Result", JLabel.CENTER);
		result.setBounds(25,175,100,30);
		
		// trả về kết quả đã được tính toán
		returnResultOfTwoNumber = new JLabel();
		returnResultOfTwoNumber.setBounds(150,175,200,30);
		
		
		// chuỗi chứa các phép tính toán để hiện trên ComboBox
		String[] calcu = {"+","-","/","*" };
		jComboBox = new JComboBox<String>(calcu);
		jComboBox.setBounds(150,75,100,30);
		
		// nhãn thông báo chỗ chọn lựa các toán tử
		JLabel operator = new JLabel("Operator", JLabel.CENTER);
	    operator.setBounds(25, 75, 100, 30);
		
		// thêm tất cả các đối tượng vào trong JFrame
		jFrame.add(result);
		jFrame.add(numberOne);
		jFrame.add(numberTwo);
		jFrame.add(inputNumberOne);
		jFrame.add(jComboBox);
		jFrame.add(operator);
		jFrame.add(returnResult);
		jFrame.add(returnResultOfTwoNumber);
		jFrame.add(inputNumberTwo);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}
	
	/**
	 * hiển thị giao diện và thực hiện tính toán khi người dùng thao tác
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		Gui viewGui = new Gui();
		viewGui.guiBo();
	}
}
