

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fDinhMuc
 */
@WebServlet("/fDinhMuc")
public class fDinhMuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fDinhMuc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maloaicay = request.getParameter("txtMaLoaiCay");
		String tuoicay = request.getParameter("txtTuoiCay");
		String tienchamsoc = request.getParameter("txtTienChamSoc");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<div><p style='font-weight: bold;'>THONG TIN DINH MUC</p></div>");
		pw.write("<div><table border=1>");
		
		pw.write("<tr><td>");
		pw.write("Ma Loai Cay");
		pw.write("</td><td>");
		pw.write(maloaicay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Tuoi cua cay");
		pw.write("</td><td>");
		pw.write(tuoicay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Tien cham soc (VND)");
		pw.write("</td><td>");
		pw.write(tienchamsoc);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("</table></div>");
	}

}
