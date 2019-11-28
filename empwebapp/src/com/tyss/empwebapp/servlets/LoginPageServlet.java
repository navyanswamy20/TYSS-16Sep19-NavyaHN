package com.tyss.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.jsp")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<legend align='center'>Login Page</legend>");
		out.println("<form action ='./login' method='post'>");
		out.println("<form action ='./login' method='post'>");
		out.println("<table align='center'><tr><td>");
		out.println("Id:<input type='number' name='id' value='" + id + "'><br><br></td></tr>");
		out.println("<tr><td>");
		out.println("Password:<input type='password' name='password'></td></tr>");
		out.println("<tr><td>");
		out.println("<input type='checkbox' name='RememberMe' value='checked'>Remember Me");
		out.println("</td></tr>");
		out.println("<tr><td><input type='submit' name='login'value='login'></td></tr>");
		out.println("<tr><td><input type='reset' name='reset'value='reset'></td></tr>\r\n" + "");
		out.println("</table>");
		out.println("</form>");
		out.println("</fieldset>");
		out.println("<a href='./register.html' align='center'>Register</a>");
		out.println("</html>");

	}//doGet()
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}//end of doPost
}
