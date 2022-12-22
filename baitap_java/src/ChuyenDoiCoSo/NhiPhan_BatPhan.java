package ChuyenDoiCoSo;

import java.util.Scanner;
public class NhiPhan_BatPhan {

	public static void main(String[] args) {
		String number;
		System.out.println("Nhập giá trị nhị phân: ");
		Scanner sc = new Scanner(System.in);
		number = sc.next();
        int bnum = Integer.parseInt(number, 2);
        String ostr = Integer.toOctalString(bnum);
        System.out.println("Giá trị bát phân của "+number+" là:"+ostr);
        System.out.println("----------------------------");
	}

}
