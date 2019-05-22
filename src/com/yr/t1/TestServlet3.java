package com.yr.t1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String mobile = request.getParameter("mobile");
		String sel = request.getParameter("sel");
		String[] subject = request.getParameterValues("subject");
		Enumeration<String> names = request.getParameterNames();
		
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		
		
		System.out.println(id);
		System.out.println(mobile);
		System.out.println(sel);
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h1> id : " + id + "</h1>");
		out.println("<h1> mobile : " + mobile + "</h1>");

		for(String s : subject) {
			out.println("<h1>" +s + "</h1>");
		}
		out.println("</body>");
		out.println("</html>");
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
