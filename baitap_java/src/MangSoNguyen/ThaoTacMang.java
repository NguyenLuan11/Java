package MangSoNguyen;
import java.util.Scanner;

public class ThaoTacMang {

	public static void main(String[] args) {
		int n, temp, a, find;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của mảng: ");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Nhập phần tử của mảng: ");
		for(int i=0; i<n; i++) {
			System.out.print("Phần tử thứ "+(i+1)+": ");
			array[i] = sc.nextInt();
		}
		// Bảng Menu các thao tác trên mảng
        do {
			System.out.println("%---------------THAO TÁC MẢNG---------------%\n"+
					"1.Sắp xếp mảng theo thứ tự tăng dần\n"+
            		"2.Sắp xếp mảng theo thứ tự giảm dần\n"+
            		"3.Tìm kiếm giá trị trong mảng\n"+
            		"4.Tổng các giá trị trong mảng\n"+
            		"5.Trung bình cộng các giá trị trong mảng\n"+
            		"6.Kiểm tra số nguyên tố các giá trị trong mảng\n"+
            		"7.Hiện các giá trị chẵn và lẻ trong mảng\n"+
					"Nhập số khác để thoát");
            System.out.println("Nhập thao tác bạn cần: ");
            a =sc.nextInt();
            
            switch (a) {
            case 1:
            	// sắp xếp mảng tăng dần
        		for(int i=0; i<n-1; i++) {
        			for(int j=i+1; j<n; j++) {
        				if(array[i]>array[j]) {
        					temp = array[i];
        					array[i] = array[j];
        					array[j] = temp;
        				}
        			}
        		}
        		System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
                for (int i=0; i<n; i++) {
                    System.out.print(array[i] + "\t");
                }
                System.out.println();
                System.out.println("-------------------------------------------");
            	break;
            case 2:
            	// sắp xếp mảng giảm dần
                for(int i=0; i<n-1; i++) {
        			for(int j=i+1; j<n; j++) {
        				if(array[i]<array[j]) {
        					temp = array[i];
        					array[i] = array[j];
        					array[j] = temp;
        				}
        			}
        		}
        		System.out.println("Kết quả sau khi sắp xếp theo thứ tự giảm dần là: ");
                for (int i=0; i<n; i++) {
                    System.out.print(array[i] + "\t");
                }
                System.out.println();
                System.out.println("-------------------------------------------");
            	break;
            case 3:
            	int i;
            	System.out.println("Nhập giá trị muốn tìm kiếm: ");
            	find = sc.nextInt();
            	for(i=0; i<n; i++) {
            		if(array[i] == find) {
            			System.out.println("Tồn tại giá trị "+find+" trong mảng tại vị trí "+(i+1));
            			break;
            		}
            	}
            	if(i == n) {
            		System.out.println("Không tồn tại giá trị "+find);
            	}
            	System.out.println();
                System.out.println("-------------------------------------------");
            	break;
            case 4:
            	int tong=0;
            	for(i=0; i<n; i++) {
            		tong = tong + array[i];
            	}
            	System.out.println("Tổng các giá trị trong mảng là: "+tong);
                System.out.println("-------------------------------------------");
            	break;
            case 5:
            	double S=0;
            	for(i=0; i<n; i++) {
            		S = S + array[i];
            	}
            	System.out.format("Tổng các giá trị trong mảng là: %.3f",(S/n));
            	System.out.println();
                System.out.println("-------------------------------------------");
            	break;
            case 6:
            	System.out.println("Kiểm tra số nguyên tố các giá trị trong mảng:");
            	for(i=0; i<n; i++) {
            		if(array[i] == 2) {
            			System.out.println(array[i]+" là số nguyên tố");
            		}
            		for(int j=2; j< array[i]/2; j++) {
            			if(array[i]%j == 0) {
            				System.out.println(array[i]+" không phải là số nguyên tố");
            				break;
            			}
            			if(array[i]%j != 0) {
            				System.out.println(array[i]+" là số nguyên tố");
            				break;
            			}
            		}
            	}
                System.out.println("-------------------------------------------");
            	break;
            case 7:
            	System.out.println("Các giá trị chẵn trong mảng:");
            	for(i=0; i<n; i++) {
            		if(array[i]%2 == 0) {
            			System.out.print(array[i]+"\t");
            		}
            	}
            	System.out.println();
                System.out.println("-------------------------------------------");
            	System.out.println("Các giá trị lẻ trong mảng:");
            	for(i=0; i<n; i++) {
            		if(array[i]%2 != 0) {
            			System.out.print(array[i]+"\t");
            		}
            	}
            	System.out.println();
                System.out.println("-------------------------------------------");
            	break;
            default:
            	System.out.println("%--------------------BYE--------------------%");
            	break;
            }
        }
        while(true);
            
	}

}
