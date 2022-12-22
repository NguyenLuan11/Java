package quanlistore;

import java.util.ArrayList;
import java.util.Scanner;

public class mainrun {	
	ArrayList <tulanh>dstulanh = new ArrayList<tulanh>( );
	ArrayList <maylanh>dsmaylanh = new ArrayList<maylanh>( );
	
	//hàm tính tiền mua cả 2 sản phẩm có sẵn tại cửa hàng
	public void muaca2sp() {
		//tạo danh sách sản phẩm tủ lạnh hiện có
		tulanh tulanh = new tulanh();//sản phẩm 1		
		tulanh.maSP = "tl1";
		tulanh.tenSP = "Tủ lạnh LG";
		tulanh.color ="black";
		tulanh.chisosp = "230l";
		tulanh.gia = 2500000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();//sản phẩm 2
		tulanh.maSP = "tl2";
		tulanh.tenSP = "Tủ lạnh Sony";
		tulanh.color ="white";
		tulanh.chisosp = "360l";
		tulanh.gia = 3700000;
		tulanh.tgbaohanh = 3;
		dstulanh.add(tulanh);
		
		tulanh = new tulanh();//sản phẩm 3
		tulanh.maSP = "tl3";
		tulanh.tenSP = "Tủ lạnh SamSung";
		tulanh.color ="gray";
		tulanh.chisosp = "500l";
		tulanh.gia = 5500000;
		tulanh.tgbaohanh = 4;
		dstulanh.add(tulanh);
		//tạo danh sách sản phẩm máy lạnh hiện có
		maylanh maylanh = new maylanh();//sản phẩm 1	
		maylanh.maSP = "ml1";
		maylanh.tenSP = "Máy lạnh LG";
		maylanh.color ="white";
		maylanh.chisosp = "36000BTU/h";
		maylanh.gia = 21500000;
		maylanh.tgbaohanh = 3;
		dsmaylanh.add(maylanh);
		
		maylanh = new maylanh();//sản phẩm 2	
		maylanh.maSP = "ml2";
		maylanh.tenSP = "Máy lạnh Panasonic";
		maylanh.color ="gray";
		maylanh.chisosp = "9000BTU/h";
		maylanh.gia = 18000000;
		maylanh.tgbaohanh = 3;
		dsmaylanh.add(maylanh);
		
		maylanh = new maylanh();//sản phẩm 3	
		maylanh.maSP = "ml3";
		maylanh.tenSP = "Máy lạnh Retech";
		maylanh.color ="black";
		maylanh.chisosp = "18000BTU/h";
		maylanh.gia = 25800000;
		maylanh.tgbaohanh = 4;
		dsmaylanh.add(maylanh);
		//tính tổng tiền 2 sản phẩm
		int slmuatl, slmuaml;
    	long tongtien2sp=0, tongtientl=0, VATtl=0, tongtienml=0, VATml=0;
		//Mua tủ lạnh
    	System.out.println("Nhập số lượng tủ lạnh bạn muốn mua: ");
		Scanner sc = new Scanner(System.in);
		slmuatl = sc.nextInt();
		for (int i = 0; i < slmuatl; i++) {
			tulanh = dstulanh.get(i);
			VATtl = (long) (VATtl + tulanh.gia*0.1);
			tongtientl = (tongtientl + tulanh.gia)+VATtl;
        }
		//Mua máy lạnh
    	System.out.println("Nhập số lượng máy lạnh bạn muốn mua: ");
		slmuaml = sc.nextInt();
		for (int i = 0; i < slmuaml; i++) {
			maylanh = dsmaylanh.get(i);
			VATml = (long) (VATml + tulanh.gia*0.1);
			tongtienml = (tongtienml + maylanh.gia)+VATml;
        }
		tongtien2sp = tongtientl + tongtienml;
		//in hóa đơn mua 2 loại sản phẩm
		System.out.println("%---------------------------------HOÁ ĐƠN MUA HÀNG--------------------------------%");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
				"Mã SP","Tên SP","Màu","Chỉ số sp","Giá(VND)");
		System.out.println("-----------------------------------------------------------------------------------");
		for (int i = 0; i < slmuatl; i++) {//in hóa đơn tủ lạnh
			tulanh = dstulanh.get(i);
			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
    				tulanh.maSP,tulanh.tenSP,tulanh.color,tulanh.chisosp,tulanh.gia);
    		System.out.println("-----------------------------------------------------------------------------------");
        }
		for (int i = 0; i < slmuaml; i++) {//in hóa đơn máy lạnh
			maylanh = dsmaylanh.get(i);
			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
    				maylanh.maSP,maylanh.tenSP,maylanh.color,maylanh.chisosp,maylanh.gia);
    		System.out.println("-----------------------------------------------------------------------------------");
        }
		System.out.println("VAT: "+ (VATtl+VATml) +"\n"+"Tổng tiền thanh toán: "+ tongtien2sp);
		System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
	}
	public static void main(String[] args) {
		//tạo đối tượng mới để gọi phương thức muaca2sp()
		mainrun mr = new mainrun();
		//tạo đối tượng mới để gọi phương thức inbill() và incatalog()
		tulanh tl1 = new tulanh();
		maylanh ml1 = new maylanh();
		//Hiện catalog sản phẩm hiện có tại cửa hàng điện lạnh	
		ml1.incatalog();
		
		//tạo danh sách tủ lạnh và danh sách máy lạnh
		ArrayList <tulanh>dstulanh = new ArrayList<tulanh>( );
		ArrayList <maylanh>dsmaylanh = new ArrayList<maylanh>( );
		
		//Bảng Menu các chức năng của chương trình
		int a, n=0, m=0;
		do {
			System.out.println("%---------------ĐIỆN LẠNH STORE---------------%\n"+
					"1.Nhập thêm sản phẩm và hiện catalog của cửa hàng điện lạnh\n"+
            		"2.Mua sản phẩm, thanh toán và in hoá đơn\n"+
            		"3.Tìm kiếm sản phẩm\n"+
					"Nhập số khác để thoát");
            System.out.println("Nhập thao tác bạn cần: ");
            Scanner sc = new Scanner(System.in);
            a =sc.nextInt();
            
            switch (a) {
            case 1://Thêm sản phẩm mới cho cửa hàng điện lạnh
            	//Thêm loại tủ lạnh
            	System.out.print("Nhập số lượng loại tủ lạnh cần thêm: ");
                n=sc.nextInt();  
                tulanh tl = new tulanh( );
                for (int i = 0; i < n; i++) {
                    System.out.println("Loại tủ lạnh thứ " + (i+1));                
                    tl.Input();
            		dstulanh.add( tl );
            	}
                //Thêm loại máy lạnh
        		System.out.print("Nhập số lượng loại máy lạnh cần thêm: ");
                m=sc.nextInt(); 
                maylanh ml = new maylanh( );
                for (int i = 0; i < m; i++) {
                    System.out.println("Loại máy lạnh thứ " + (i+1));
                    ml.Input();
            		dsmaylanh.add( ml );
                }               
            	//Hiện catalog sản phẩm của cửa hàng điện lạnh
        		ml1.incatalog();
        		//Hiện danh sách các loại tủ lạnh
        		for (int i = 0; i < dstulanh.size(); i++) {
        			tl = dstulanh.get(i);
                    tl.Output();
                }
        		//Hiện danh sách các loại máy lạnh
                for (int i = 0; i < dsmaylanh.size(); i++) {
                	ml = dsmaylanh.get(i);
                	ml.Output();
                }
                
            	break;
            	
            case 2://Mua các sản phẩm và in hóa đơn mua hàng
            	int luachon, slmuatl, slmuaml;
            	long tongtientl=0, tongtienml=0, VATtl=0, tongtien2sp=0, VATml=0;
            	//Bảng Menu chọn mua sản phẩm
            	System.out.println("=====MUA SẢN PHẨM=====\n"+
            						"1.Mua tủ lạnh\n"+
            						"2.Mua máy lạnh\n"+ 
            						"3.Mua cả 2 loại sản phẩm\n"+
            			"Nhập lựa chọn của bạn: ");
            	luachon = sc.nextInt();           	
            	
            	if(luachon == 1) {//Mua tủ lạnh và in hóa đơn tủ lạnh
            		int muasptl;
            		System.out.println("----------MUA TỦ LẠNH----------\n"+
            							"1.Mua tủ lạnh có sẵn tại cửa hàng (hiện có 3 sản phẩm)\n"+
            							"2.Mua sản phẩm mới cửa hàng vừa nhập(hiện có "+ n +" sản phẩm)\n"+
            				"Nhập lựa chọn: ");
            		muasptl = sc.nextInt();
            		if(muasptl==1) {//Mua tủ lạnh có sẵn tại cửa hàng
            			tl1.muatl();
            		}
            		if(muasptl==2) {//Mua sản phẩm mới cửa hàng vừa nhập
                		System.out.println("Nhập số lượng tủ lạnh bạn muốn mua: ");
                		slmuatl = sc.nextInt();
                		//Tính tiền
                		for (int i = 0; i < slmuatl; i++) {                			
                			tl = dstulanh.get(i);
                			VATtl = (long) (VATtl + tl.gia*0.1);
                			tongtientl = (tongtientl + tl.gia)+VATtl;
                        }               		
                		//In bill tủ lạnh
                		ml1.inbill();
                		for (int i = 0; i < slmuatl; i++) {
                			tl = dstulanh.get(i);
                			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
                    				tl.maSP,tl.tenSP,tl.color,tl.chisosp,tl.gia);
                   			System.out.println("------------------------------------------------------------------------------");
                        }
                		System.out.println("VAT: "+ VATtl +"\n"+"Tổng tiền thanh toán: "+ tongtientl);
                		System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
                	}
            	}            		
            	
            	if(luachon == 2) {//Mua máy lạnh và in hóa đơn máy lạnh
            		int muaspml;
            		System.out.println("----------MUA MÁY LẠNH----------\n"+
										"1.Mua máy lạnh có sẵn tại cửa hàng (hiện có 3 sản phẩm)\n"+
										"2.Mua sản phẩm mới cửa hàng vừa nhập (hiện có "+ m + " sản phẩm)\n"+
            				"Nhập lựa chọn: ");
            		muaspml = sc.nextInt();
            		if(muaspml==1) {//Mua máy lạnh có sẵn tại cửa hàng
            			ml1.muaml();
            		}
            		if(muaspml==2) {//Mua sản phẩm mới cửa hàng vừa nhập
                		System.out.println("Nhập số lượng máy lạnh bạn muốn mua: ");
                		slmuaml = sc.nextInt();
                		//Tính tiền
                		for (int i = 0; i < slmuaml; i++) {
                			ml = dsmaylanh.get(i);
                			VATml = (long) (VATml + ml.gia*0.1);
                			tongtienml = (tongtienml + ml.gia)+VATml;
                        }               		
                		//In bill máy lạnh
                		ml1.inbill();
                		for (int i = 0; i < slmuaml; i++) {
                			ml = dsmaylanh.get(i);
                			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
                    				ml.maSP,ml.tenSP,ml.color,ml.chisosp,ml.gia);
                   			System.out.println("------------------------------------------------------------------------------");
                        }
                		System.out.println("VAT: "+ VATml +"\n"+"Tổng tiền thanh toán: "+ tongtienml);
                		System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
            		}
            	}
            	
            	if(luachon == 3) {//Mua cả 2 sản phẩm: tủ lạnh và máy lạnh + in hóa đơn mua
            		int luachonca2;
            		System.out.println("----------MUA 2 LOẠI SẢN PHẨM----------\n"+
										"1.Mua sản phẩm có sẵn tại cửa hàng (hiện có 3 tủ lạnh và 3 máy lạnh)\n"+
										"2.Mua sản phẩm mới cửa hàng vừa nhập (hiện có "+ n + " tủ lạnh và "+ m + " máy lạnh)\n"+
            				"Nhập lựa chọn: ");
            		luachonca2 = sc.nextInt();
            		if(luachonca2==1) {//Mua sản phẩm có sẵn tại cửa hàng
            			mr.muaca2sp();
            		}
            		if(luachonca2==2) {//Mua sản phẩm mới cửa hàng vừa nhập
            			//Mua tủ lạnh
                		System.out.println("Nhập số lượng tủ lạnh bạn muốn mua: ");
                		slmuatl = sc.nextInt();
                		//Tính tiền tủ lạnh
                		for (int i = 0; i < slmuatl; i++) {
                			tl = dstulanh.get(i);
                			VATtl = (long) (VATtl + tl.gia*0.1);
                			tongtientl = (tongtientl + tl.gia)+VATtl;
                        }
                		//Mua máy lạnh
                		System.out.println("Nhập số lượng máy lạnh bạn muốn mua: ");
                		slmuaml = sc.nextInt();
                		//Tính tiền máy lạnh
                		for (int i = 0; i < slmuaml; i++) {
                			ml = dsmaylanh.get(i);
                			VATml = (long) (VATml + ml.gia*0.1);
                			tongtienml = (tongtienml + ml.gia)+VATml;
                        }
                		// Tính tiền 2 sản phẩm: tủ lạnh và máy lạnh
                		tongtien2sp = tongtientl + tongtienml;
                		
                		//In bill khi mua cả 2 loại sản phẩm
                		ml1.inbill();
                		for (int i = 0; i < slmuatl; i++) {
                			tl = dstulanh.get(i);
                			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
                    				tl.maSP,tl.tenSP,tl.color,tl.chisosp,tl.gia);
                   			System.out.println("------------------------------------------------------------------------------");
                        }
                		for (int i = 0; i < slmuaml; i++) {
                			ml = dsmaylanh.get(i);
                			System.out.format("%-10s %-25s %-15s %-15s %-15s\n",
                   					ml.maSP,ml.tenSP,ml.color,ml.chisosp,ml.gia);
                    		System.out.println("------------------------------------------------------------------------------");
                        }
                		System.out.println("VAT: "+ (VATtl+VATml) +"\n"+"Tổng tiền thanh toán: "+ tongtien2sp);
                		System.out.println("CẢM ƠN QUÝ KHÁCH ĐÃ MUA HÀNG !");
            		}		
            	}
            	
            	break;
            	
            case 3:
            	int luachontk, luachoncn;
            	System.out.println("-----TÌM KIẾM SẢN PHẨM-----\n"+
            						"1.Tủ lạnh\n"+
            						"2.Máy lạnh\n"+
            						"3.Thoát\n"+
            						"Nhập lựa chọn: ");
            	luachontk = sc.nextInt();          	
            	if(luachontk == 1) {
            		tl1.timkiemtl();
            		
            		System.out.println("-----CHỨC NĂNG-----\n"+
    						"1.Sửa\n"+
    						"2.Xóa\n"+
    						"3.Thoát\n"+
    						"Nhập lựa chọn: ");
            		luachoncn = sc.nextInt();
            		if(luachoncn ==1) {
            			tl1.Deletetl();
            		}
            		if(luachoncn == 2) {
                		
                	}
                	if(luachoncn == 3) {
                		break;
                	}
            	}
            	if(luachontk == 2) {
            		ml1.timkiemml();
            		
            		System.out.println("-----CHỨC NĂNG-----\n"+
    						"1.Sửa\n"+
    						"2.Xóa\n"+
    						"3.Thoát\n"+
    						"Nhập lựa chọn: ");
            		luachoncn = sc.nextInt();
            		if(luachoncn ==1) {
            			
            		}
            		if(luachoncn == 2) {
                		
                	}
                	if(luachoncn == 3) {
                		break;
                	}
            	}
            	if(luachontk == 3) {
            		break;
            	}
            	
            	break;
      
            default:
                System.out.println("%---------CHÀO TẠM BIỆT VÀ HẸN GẶP LẠI !---------%");
                System.out.println("%---------%-------------%--------------%---------%");
            	break;
            }
		}
		while(true);
	}
}
