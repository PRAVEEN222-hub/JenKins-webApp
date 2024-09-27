package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.rowset.serial.SerialException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wishurl")
public class WishMessageGenerator extends HttpServlet{
	
	public void doGet(HttpServletResponse res, HttpServletRequest req)throws ServletException, IOException{
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		pw.println("<h1 style='color:red;text-align:center'>Good After Noon Body</h1>");
		
		pw.println("<br> <br> <a href='index.jsp'>home</a>");
		pw.close();
		
	}
	public void doPost(HttpServletResponse res, HttpServletRequest req)throws  ServletException, IOException{
		
		doGet(res,req);
		
	}

}
