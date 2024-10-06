package com.servlets;

import java.io.IOException;

import com.conn.DBConnect;
import com.dao.DAO;
import com.entity.values;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/add_info")
public class insert_info extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String phone = req.getParameter("phone");

		values values = new values(name, address, email, dob, phone);

		DAO dao = new DAO(DBConnect.getConn());

		HttpSession session = req.getSession();

		boolean f = dao.insert_info(values);

		if (f) {
			session.setAttribute("suc", "Student Information Added Successfully...");
			resp.sendRedirect("add_info.jsp");

		} else {
			session.setAttribute("err", "Something Wrong on Server...");
			resp.sendRedirect("add_info.jsp");

		}
	}
	
}
