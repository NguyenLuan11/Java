package ChuyenDoiCoSo;
import java.util.Scanner;

public class ThapLucPhan_ThapPhan {

	public static void main(String[] args) {
		String hexnum;
		System.out.println("Nhập giá trị thập lục phân: ");
		Scanner sc = new Scanner(System.in);
		hexnum = sc.next();
        int num = Integer.parseInt(hexnum,16);
        System.out.println("\n" + "Số thập phân tương đương với "+hexnum+" là: "+num);
        System.out.println("----------------------------");
	}

}
