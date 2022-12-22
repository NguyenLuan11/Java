package get_DateTime;
import java.time.LocalDateTime;

public class DateTime_Default {

	public static void main(String[] args) {
		//khai báo một đổi tượng current thuộc class LocalDateTime
	    LocalDateTime current = LocalDateTime.now();
	    // hiển thị ngày giờ hiện tại ra màn hình
	    System.out.println("\n\nNgày giờ hiện tại: " + current);		
	}

}
