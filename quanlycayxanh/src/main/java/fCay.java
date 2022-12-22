import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fCay
 */
@WebServlet("/fCay")
public class fCay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fCay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sttcay = request.getParameter("txtSoThuTuCay");
		String maduong = request.getParameter("txtMaDuong");
		String ngaytrong = request.getParameter("txtNgayTrong");
		String tuoicaykhitrong = request.getParameter("txtTuoiCayKhiTrong");
		String ngaychat = request.getParameter("txtNgayChat");
		String maloaicay = request.getParameter("txtMaLoaiCay");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<div><p style='font-weight: bold;'>THONG TIN CAY</p></div>");
		pw.write("<div><table border=1>");
		
		pw.write("<tr><td>");
		pw.write("So thu tu cay");
		pw.write("</td><td>");
		pw.write(sttcay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ma Duong");
		pw.write("</td><td>");
		pw.write(maduong);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ngay Trong");
		pw.write("</td><td>");
		pw.write(ngaytrong);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Tuoi cua cay khi trong");
		pw.write("</td><td>");
		pw.write(tuoicaykhitrong);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ngay chat bo cay");
		pw.write("</td><td>");
		pw.write(ngaychat);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ma Loai Cay");
		pw.write("</td><td>");
		pw.write(maloaicay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("</table></div>");
	}

}
