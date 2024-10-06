package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.values;
import com.entity.values1;

public class DAO {
	private Connection conn;

	public DAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean insert_info(values val) {
		boolean f = false;

		try {

			String sql = "insert into info(name,address,email,dob,phone) values (?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, val.getName());
			ps.setString(2, val.getAddress());
			ps.setString(3, val.getEmail());
			ps.setString(4, val.getDob());
			ps.setString(5, val.getPhone());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return f;
	}

	public List<values> showAllInformation() {
		List<values> list = new ArrayList<values>();
		values val = null;

		try {
			String sql = "select * from info";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				val = new values();
				val.setId(rs.getInt(1));
				val.setName(rs.getString(2));
				val.setAddress(rs.getString(3));
				val.setEmail(rs.getString(4));
				val.setDob(rs.getString(5));
				val.setPhone(rs.getString(6));

				list.add(val);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public values getInformationById(int id) {
		values val = null;

		try {
			String sql = "select * from info where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				val = new values();
				val.setId(rs.getInt(1));
				val.setName(rs.getString(2));
				val.setAddress(rs.getString(3));
				val.setEmail(rs.getString(4));
				val.setDob(rs.getString(5));
				val.setPhone(rs.getString(6));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return val;
	}

	public boolean update_info(values val) {
		boolean f = false;

		try {
			String sql = "update info set name=?,address=?,email=?,dob=?,phone=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, val.getName());
			ps.setString(2, val.getAddress());
			ps.setString(3, val.getEmail());
			ps.setString(4, val.getDob());
			ps.setString(5, val.getPhone());
			ps.setInt(6, val.getId());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean delete_info(int id) {
		boolean f = false;
		try {

			String sql = "delete from info where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean insert_marks(values1 val1) {
		boolean f = false;

		try {

			String sql = "insert into marks(name,english,maths,physics,chemistry,biology) values (?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, val1.getName());
			ps.setString(2, val1.getEnglish());
			ps.setString(3, val1.getMath());
			ps.setString(4, val1.getPhysics());
			ps.setString(5, val1.getChemistry());
			ps.setString(6, val1.getBiology());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return f;
	}

	public List<values1> showAllMarks() {
		List<values1> list = new ArrayList<values1>();
		values1 val1 = null;

		try {
			String sql = "select * from marks";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				val1 = new values1();
				val1.setId(rs.getInt(1));
				val1.setName(rs.getString(2));
				val1.setEnglish(rs.getString(3));
				val1.setMath(rs.getString(4));
				val1.setPhysics(rs.getString(5));
				val1.setChemistry(rs.getString(6));
				val1.setBiology(rs.getString(7));

				list.add(val1);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public values1 getMarksById(int id) {
		values1 val1 = null;

		try {
			String sql = "select * from marks where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				val1 = new values1();
				val1.setId(rs.getInt(1));
				val1.setName(rs.getString(2));
				val1.setEnglish(rs.getString(3));
				val1.setMath(rs.getString(4));
				val1.setPhysics(rs.getString(5));
				val1.setChemistry(rs.getString(6));
				val1.setBiology(rs.getString(7));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return val1;
	}

	public boolean update_marks(values1 val1) {
		boolean f = false;

		try {
			String sql = "update marks set name=?,english=?,maths=?,physics=?,chemistry=?,biology=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, val1.getName());
			ps.setString(2, val1.getEnglish());
			ps.setString(3, val1.getMath());
			ps.setString(4, val1.getPhysics());
			ps.setString(5, val1.getChemistry());
			ps.setString(6, val1.getBiology());
			ps.setInt(7, val1.getId());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public boolean delete_marks(int id) {
		boolean f = false;
		try {

			String sql = "delete from marks where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	

}
