package quanlistore;

import java.util.ArrayList;
import java.util.Scanner;

public class maylanh extends tulanh implements quanlihd {
	
	ArrayList <maylanh>dsmaylanh = new ArrayList<maylanh>( );
	
		maylanh(){
			
		}
		
		public void maylanh(String maSP, String tenSP, int tgbaohanh, long gia, String color,String chisosp) {
			this.maSP = maSP;
			this.tenSP = tenSP;
			this.gia = gia;
			this.tgbaohanh = tgbaohanh;
			this.color = color;
			this.chisosp = chisosp;
		}
		
		public void Input() {
			super.Input();
		}
		
		public void Output() {
			super.Output();
		}
		
		public void inbill() {
			super.inbill();
		}
		
		public void incatalog() {
			super.incatalog();
			maylanh maylanh = new maylanh();		
			maylanh.maSP = "ml1";
			maylanh.tenSP = "Máy lạnh LG";
			maylanh.color ="white";
			maylanh.chisosp = "36000BTU/h";
			maylanh.gia = 21500000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml2";
			maylanh.tenSP = "Máy lạnh Panasonic";
			maylanh.color ="gray";
			maylanh.chisosp = "9000BTU/h";
			maylanh.gia = 18000000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml3";
			maylanh.tenSP = "Máy lạnh Retech";
			maylanh.color ="black";
			maylanh.chisosp = "18000BTU/h";
			maylanh.gia = 25800000;
			maylanh.tgbaohanh = 4;
			dsmaylanh.add(maylanh);
		
			for(int i=0; i< dsmaylanh.size(); i++) {
				maylanh = dsmaylanh.get(i);
				maylanh.Output();
			}
		}
		
		public void muaml() {//tính tiền mua máy lạnh có sẵn tại cửa hàng
			maylanh maylanh = new maylanh();		
			maylanh.maSP = "ml1";
			maylanh.tenSP = "Máy lạnh LG";
			maylanh.color ="white";
			maylanh.chisosp = "36000BTU/h";
			maylanh.gia = 21500000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml2";
			maylanh.tenSP = "Máy lạnh Panasonic";
			maylanh.color ="gray";
			maylanh.chisosp = "9000BTU/h";
			maylanh.gia = 18000000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml3";
			maylanh.tenSP = "Máy lạnh Retech";
			maylanh.color ="black";
			maylanh.chisosp = "18000BTU/h";
			maylanh.gia = 25800000;
			maylanh.tgbaohanh = 4;
			dsmaylanh.add(maylanh);
			
			int slmuaml;
	    	long tongtienml=0, VAT=0;
			//Mua máy lạnh và in hóa đơn máy lạnh
	    	System.out.println("Nhập số lượng máy lạnh bạn muốn mua: ");
			Scanner sc = new Scanner(System.in);
			slmuaml = sc.nextInt();
			//Tính tiền
			for (int i = 0; i < slmuaml; i++) {
				maylanh = dsmaylanh.get(i);
				VAT = (long) (VAT + maylanh.gia*0.1);
				tongtienml = (tongtienml + maylanh.gia)+VAT;
	        }
			maylanh.inbill();
			for (int i = 0; i < slmuaml; i++) {
				maylanh = dsmaylanh.get(i);
				System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
	    				maylanh.maSP,maylanh.tenSP,maylanh.color,maylanh.chisosp,maylanh.gia);
	    		System.out.println("-----------------------------------------------------------------------------------");
	        }
			System.out.println("VAT: "+ VAT +"\n"+"Tổng tiền thanh toán: "+ tongtienml);
			System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
		}
		
		public void timkiemml() {
			ArrayList <maylanh>dsmaylanh = new ArrayList<maylanh>( );
			maylanh maylanh = new maylanh();		
			maylanh.maSP = "ml1";
			maylanh.tenSP = "Máy lạnh LG";
			maylanh.color ="white";
			maylanh.chisosp = "36000BTU/h";
			maylanh.gia = 21500000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml2";
			maylanh.tenSP = "Máy lạnh Panasonic";
			maylanh.color ="gray";
			maylanh.chisosp = "9000BTU/h";
			maylanh.gia = 18000000;
			maylanh.tgbaohanh = 3;
			dsmaylanh.add(maylanh);
			
			maylanh = new maylanh();		
			maylanh.maSP = "ml3";
			maylanh.tenSP = "Máy lạnh Retech";
			maylanh.color ="black";
			maylanh.chisosp = "18000BTU/h";
			maylanh.gia = 25800000;
			maylanh.tgbaohanh = 4;
			dsmaylanh.add(maylanh);
			
			String nhapml;		
	    	System.out.println("Nhập mã sản phẩm máy lạnh: ");
	    	Scanner sc = new Scanner(System.in);
	    	nhapml = sc.nextLine();
	    	
	    	if(nhapml == maylanh.maSP) {
	    		for(int i=0; 1< dsmaylanh.size(); i++) {
	        		maylanh = dsmaylanh.get(i);
	        		if(nhapml == dsmaylanh.get(i).maSP) {
	        			System.out.println("Đã tìm thấy sản phẩm!");
	        			maylanh.indaumucds();
	        			maylanh.Output();
	        		}
	        	}
			}
			else {
				System.out.println("Không tìm thấy sản phẩm!");
			}	
		}
		
		public void Deleteml() {
			
		}
}
