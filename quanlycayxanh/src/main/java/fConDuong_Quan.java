import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fConDuong_Quan
 */
@WebServlet("/fConDuong_Quan")
public class fConDuong_Quan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fConDuong_Quan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String maduong = request.getParameter("txtMaDuong");
		String tenquan = request.getParameter("txtTenQuan");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<div><p style='font-weight: bold;'>THONG TIN CON DUONG QUAN</p></div>");
		pw.write("<div><table border=1>");
		
		pw.write("<tr><td>");
		pw.write("Ma Duong");
		pw.write("</td><td>");
		pw.write(maduong);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ten Duong");
		pw.write("</td><td>");
		pw.write(tenquan);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("</table></div>");
	}

}
