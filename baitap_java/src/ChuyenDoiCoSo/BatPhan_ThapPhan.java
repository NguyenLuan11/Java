package ChuyenDoiCoSo;
import java.util.Scanner;

public class BatPhan_ThapPhan {

	public static void main(String[] args) {
		String onum;
		System.out.println("Nhập giá trị bát phân: ");
		Scanner sc = new Scanner(System.in);
		onum = sc.next();
        int num = Integer.parseInt(onum, 8);
        System.out.println("Giá trị thập phân tương đương của "+onum+" là: "+num);
        System.out.println("----------------------------");
	}

}
