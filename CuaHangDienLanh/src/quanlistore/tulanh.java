package quanlistore;

import java.util.ArrayList;
import java.util.Scanner;

public class tulanh extends sanpham implements quanlihd{
	public String maSP;
	public String tenSP;
	public int tgbaohanh;
	public long gia;
	public String color;
	public String chisosp;
	
	ArrayList <tulanh>dstulanh = new ArrayList<tulanh>( );
	
	tulanh(){
		
	}
	
	public void tulanh(String maSP, String tenSP, int tgbaohanh, long gia, String color,String chisosp){
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.tgbaohanh = tgbaohanh;
		this.color = color;
		this.chisosp = chisosp;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sản phẩm: ");
		this.maSP = sc.nextLine();
		System.out.println("Nhập tên sản phẩm: ");
		this.tenSP = sc.nextLine();
		System.out.println("Nhập màu sản phẩm: ");
		this.color = sc.nextLine();
		System.out.println("Nhập chỉ số sản phẩm: ");
		this.chisosp = sc.nextLine();
		System.out.println("Nhập giá tiền sản phẩm: ");
		this.gia = sc.nextLong();
		System.out.println("Nhập thời gian(năm) bảo hành sản phẩm: ");
		this.tgbaohanh = sc.nextInt();		
	}

	public void Output() {
		System.out.format("%-10s %-25s %-15s %-15s %-15s %-10s\n",
				maSP,tenSP,color,chisosp,gia,tgbaohanh);
		System.out.println("--------------------------------------------------------------------------------------------------");
	}
	
	public void inbill() {
		System.out.println("%--------------------------------HOÁ ĐƠN MUA HÀNG--------------------------------%");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
				"Mã SP","Tên SP","Màu","Chỉ số sp","Giá(VND)");
		System.out.println("----------------------------------------------------------------------------------");
	}
	
	public void indaumucds() {
		System.out.println("%---------------------------------DANH SÁCH SẢN PHẨM ĐIỆN LẠNH-----------------------------------%");
		System.out.format("%-10s %-25s %-15s %-15s %-15s %-10s\n",
				"Mã SP","Tên SP","Màu","Chỉ số sp","Giá(VND)","Bảo hành(năm)");
		System.out.println("--------------------------------------------------------------------------------------------------");
	}
	
	
	public void incatalog() {
		tulanh tulanh = new tulanh();		
		tulanh.maSP = "tl1";
		tulanh.tenSP = "Tủ lạnh LG";
		tulanh.color ="black";
		tulanh.chisosp = "230l";
		tulanh.gia = 2500000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl2";
		tulanh.tenSP = "Tủ lạnh Sony";
		tulanh.color ="white";
		tulanh.chisosp = "360l";
		tulanh.gia = 3700000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl3";
		tulanh.tenSP = "Tủ lạnh SamSung";
		tulanh.color ="gray";
		tulanh.chisosp = "500l";
		tulanh.gia = 5500000;
		tulanh.tgbaohanh = 4;
		dstulanh.add(tulanh);
		
		tulanh.indaumucds();
		for(int i=0; i< dstulanh.size(); i++) {
			tulanh = dstulanh.get(i);
			tulanh.Output();			
		}
	}
	
	public void muatl() {//tính tiền mua tủ lạnh có sẵn tại cửa hàng
		tulanh tulanh = new tulanh();		
		tulanh.maSP = "tl1";
		tulanh.tenSP = "Tủ lạnh LG";
		tulanh.color ="black";
		tulanh.chisosp = "230l";
		tulanh.gia = 2500000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl2";
		tulanh.tenSP = "Tủ lạnh Sony";
		tulanh.color ="white";
		tulanh.chisosp = "360l";
		tulanh.gia = 3700000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl3";
		tulanh.tenSP = "Tủ lạnh SamSung";
		tulanh.color ="gray";
		tulanh.chisosp = "500l";
		tulanh.gia = 5500000;
		tulanh.tgbaohanh = 4;
		dstulanh.add(tulanh);
		
		int slmuatl;
    	long tongtientl=0, VAT=0;
		//Mua tủ lạnh và in hóa đơn tủ lạnh
    	System.out.println("Nhập số lượng tủ lạnh bạn muốn mua: ");
		Scanner sc = new Scanner(System.in);
		slmuatl = sc.nextInt();
		//Tính tiền
		for (int i = 0; i < slmuatl; i++) {
			tulanh = dstulanh.get(i);
			VAT = (long) (VAT + tulanh.gia*0.1);
			tongtientl = (tongtientl + tulanh.gia)+VAT;
        }
		tulanh.inbill();
		for (int i = 0; i < slmuatl; i++) {
			tulanh = dstulanh.get(i);
			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
    				tulanh.maSP,tulanh.tenSP,tulanh.color,tulanh.chisosp,tulanh.gia);
    		System.out.println("----------------------------------------------------------------------------------");
        }
		System.out.println("VAT: "+ VAT +"\n"+"Tổng tiền thanh toán: "+ tongtientl);
		System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
	}	
	
	public void timkiemtl() {
		tulanh tulanh = new tulanh();		
		tulanh.maSP = "tl1";
		tulanh.tenSP = "Tủ lạnh LG";
		tulanh.color ="black";
		tulanh.chisosp = "230l";
		tulanh.gia = 2500000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl2";
		tulanh.tenSP = "Tủ lạnh Sony";
		tulanh.color ="white";
		tulanh.chisosp = "360l";
		tulanh.gia = 3700000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();
		tulanh.maSP = "tl3";
		tulanh.tenSP = "Tủ lạnh SamSung";
		tulanh.color ="gray";
		tulanh.chisosp = "500l";
		tulanh.gia = 5500000;
		tulanh.tgbaohanh = 4;
		dstulanh.add(tulanh);
		
		String nhaptl;	
    	System.out.println("Nhập mã sản phẩm tủ lạnh: ");
    	Scanner sc = new Scanner(System.in);
    	nhaptl = sc.nextLine();
    
    	/*if(nhaptl == tulanh.maSP) {
    		boolean kquatl = dstulanh.contains(tulanh.maSP);
        	if (kquatl == true) {
                System.out.println("Có sản phẩm trong cửa hàng.");
                tulanh.indaumucds();
    			tulanh.Output();
            } 
        	else {
                System.out.println("Không tìm thấy sản phẩm trong cửa hàng.");
            }
    	}
    		
    	*/
    	
    	if(nhaptl == tulanh.maSP) {
    		for(int i=0; 1< dstulanh.size(); i++) {
        		tulanh = dstulanh.get(i);
        		if(nhaptl == dstulanh.get(i).maSP) {
        			System.out.println("Đã tìm thấy sản phẩm!");
        			tulanh.indaumucds();
        			tulanh.Output();
        		}
        	}
    		
		}
		else {
			System.out.println("Không tìm thấy sản phẩm!");
		} 
    	
	}
	
	public void Deletetl() {
		
	}
}

