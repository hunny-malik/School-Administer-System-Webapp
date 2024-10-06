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
@WebServlet("/edit_marks")
public class update_marks extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String english = req.getParameter("english");
		String maths = req.getParameter("maths");
		String physics = req.getParameter("physics");
		String chemistry = req.getParameter("chemistry");
		String biology = req.getParameter("biology");
		int id = Integer.parseInt(req.getParameter("id"));

		values1 values1 = new values1(id, name, english, maths, physics, chemistry, biology);

		DAO dao = new DAO(DBConnect.getConn());

		HttpSession session = req.getSession();

		boolean f = dao.update_marks(values1);

		if (f) {
			session.setAttribute("suc", "Student Marks Updated Successfully...");
			resp.sendRedirect("marks.jsp");

		} else {
			session.setAttribute("err", "Something Wrong on Server...");
			resp.sendRedirect("marks_info.jsp");

		}

	}

}
