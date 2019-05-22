package com.yr.t1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet4
 */
@WebServlet("/TestServlet4")
public class TestServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String r = request.getParameter("r");
		String c = request.getParameter("c");
		int row = Integer.parseInt(r);
		int col = Integer.parseInt(c);
	
		PrintWriter table = response.getWriter();
		table.println("<html>");
		table.println("<head>");
		table.println("<style type=\"text/css\">");
		table.println("table { width:100%; border:1px solid pink; }");
		table.println("td { border:1px solid gray; }");
		table.println("</style>");
		table.println("</head>");
		table.println("<body>");
		table.println("<table>");
		for(int i=0; i<row; i++) {
			table.println("<tr>");
			for(int j=0;j<col; j++) {
				table.println("<td>1234</td>");
			}
			table.println("</tr>");
		}
		table.println("</table>");
		table.println("</body>");
		table.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
