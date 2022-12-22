package get_DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime_Locallized {

	public static void main(String[] args) {
		//khai báo đối tượng curent thuộc class LocalDateTime
	    LocalDateTime current = LocalDateTime.now();
	    //sử dụng class DateTimeFormatter và class FormatStyle để định dạng ngày giờ hiện tại theo dạng localized
	    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	    //gán ngày giờ sau khi format cho chuỗi formatted
	    String formatted = current.format(formatter);
	    System.out.println("\n\nNgày giờ hiện tại: " + formatted);
	 
	    System.out.println("\n------------------------------------");
	}

}
