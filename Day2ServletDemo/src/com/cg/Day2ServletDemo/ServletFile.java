package com.cg.Day2ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletFile")
public class ServletFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user=request.getParameter("uname");
		/*String password=request.getParameter("pwd");
		Enumeration<String>a=request.getParameterNames();
		//String n[]=request.getParameterValues("pwd");*/
		
		
		//ServletContext context=getServletContext();
		//use set attribute
		//context.setAttribute("username",user);	//username is the key which is used in the 
		//another servlet
		
		//PrintWriter out=response.getWriter(); 
		//response.setContentType("text/html");//printwriter is a class
		
		//RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		//rd.forward(request,response);
		
		response.sendRedirect("SecondServlet");
		
		/*out.println(user);
		out.println("<br/>");
		out.println(password);
		out.println("<br/>");
		out.println(n);
		out.println(a);
		out.println("<br/>");
		
		while(a.hasMoreElements()){
			String par=(String)a.nextElement();
			out.println(par);
		}
		
		out.println("<html><body>");
		out.println("<b>Hi </b>"+name+"<br/>");
		out.println("<b>your password is </b>"+password+"<br/>");
		out.println("</body></html>");*/
		
		
		
	}

}
