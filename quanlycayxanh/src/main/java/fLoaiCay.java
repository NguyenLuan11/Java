import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fLoaiCay
 */
@WebServlet("/fLoaiCay")
public class fLoaiCay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fLoaiCay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String image = request.getParameter("txtImage");
		String maloaicay = request.getParameter("txtMaLoaiCay");
		String tenloaicay = request.getParameter("txtTenLoaiCay");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		//pw.write("<h3> Image: " + image + "</h3>");
		pw.write("<div><p style='font-weight: bold;'>THONG TIN LOAI CAY</p></div>");
		pw.write("<div><table border=1>");
		
		pw.write("<tr><td>");
		pw.write("Ma Loai Cay");
		pw.write("</td><td>");
		pw.write(maloaicay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("<tr><td>");
		pw.write("Ten loai cay");
		pw.write("</td><td>");
		pw.write(tenloaicay);
		pw.write("</td></tr>");
		pw.write("</td></tr>");
		
		pw.write("</table></div>");
	}

}
