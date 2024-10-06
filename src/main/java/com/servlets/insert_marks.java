package com.servlets;

import java.io.IOException;

import com.conn.DBConnect;
import com.dao.DAO;
import com.entity.values1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/add_marks")
public class insert_marks extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String english = req.getParameter("english");
		String maths = req.getParameter("maths");
		String physics = req.getParameter("physics");
		String chemistry = req.getParameter("chemistry");
		String biology = req.getParameter("biology");
		
		values1 values1 = new values1(name, english, maths, physics, chemistry, biology);

		DAO dao = new DAO(DBConnect.getConn());
		
		HttpSession session = req.getSession();

		boolean f = dao.insert_marks(values1);

		if (f) {
			session.setAttribute("suc", "Marks Added Successfully...");
			resp.sendRedirect("add_marks.jsp");

		} else {
			session.setAttribute("err", "Something Wrong on Server...");
			resp.sendRedirect("add_marks.jsp");

		}

 		
	}
	
}
