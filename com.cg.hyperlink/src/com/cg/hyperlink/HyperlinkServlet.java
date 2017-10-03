package com.cg.hyperlink;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.obj")
public class HyperlinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	PrintWriter out=response.getWriter();
	String path=request.getServletPath();
	//sysout for console and out.println for IE
	System.out.println(path);
	String target=null;
	
switch(path){
case "/add.obj":
	target="empform.html";
	break;
}
RequestDispatcher rd=request.getRequestDispatcher(target);
rd.forward(request,response);
	}



}
