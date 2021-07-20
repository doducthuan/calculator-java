/**
 * CopyRight(C) doducthuan
 * CheckNumber.java Jul 20, 2021
 */
package CheckNumber1;

/**
 * @author Admin
 *
 */
public class CheckNumber {
	public boolean checkValue(String inputStrings, int numberOrChar) {
		boolean checkInputString = true;  // biến kiểm tra để trả v�? trạng thái của chuỗi
		boolean head = true;
		int count = 0;
		if(inputStrings.equals("\n") == true) {     // nếu không nhâp gì
			checkInputString = false;
		}else {                    // nếu chỉ nhập toàn dấu cách
			String[] inputString = inputStrings.split("");
			if(inputStrings.length() == 0) {
				checkInputString = false;
			}else {
				for(int i = 0; i < inputString.length; i++) {
					if(inputString[i].equals(" ") == true) {
						if(i==0) {
							head = false;
						}
						count ++;
					}		
				}
			}
		}
		if(numberOrChar == 0) {
			if(count == inputStrings.length() || head == false) {
				checkInputString = false;
			}
		}
		if(numberOrChar == 1) {
			if(count > 0 || head == false) {
				checkInputString = false;
			}
		}
		return checkInputString;		
	}
	/**
	 * Kiểm tra xem các dữ liệu như ngày, tháng , năm có đúng là số không
	 * @param dates : dữ liệu đầu vào để kiểm tra 
	 * @return : nếu là số trả v�? true còn không thì trả v�? false
	 */
	public boolean numberConfirm(String dates) {
		String confirm = "\\d";
		boolean isNumber;
		int lengthNumber = 0;                       // đếm số lượng số
		String[] date = dates.split("");            // chia nh�? ra để kiểm tra
		for(int i = 0; i < date.length; i++) {
			isNumber = date[i].matches(confirm);       // kiểm tra xem có là số không
			if(isNumber) {
				lengthNumber ++;
			}
		}
		if(lengthNumber == date.length) {    // tất cả đ�?u là số
			isNumber = true;
		}else {
			isNumber = false;               // có tồn tại kí tự là chữ cái
		}
		return isNumber;
	}

}
