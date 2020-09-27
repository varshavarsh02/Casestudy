package com.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.emp.pojo.EmployeePojo;

public class Employee {

	public int createEmp(EmployeePojo e) throws Exception {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empcase", "root", "root");
			stmt = con.createStatement();
		} catch (ClassNotFoundException ex) {

			ex.printStackTrace();
		}

		PreparedStatement pt = con.prepareStatement("insert into employee"
				+ "(Employee_Name, Employee_Address, Date_of_Joining, Experience, Date_of_Birth) values \r\n"
				+ "( ?,?,?,?,?)");

		pt.setString(1, e.getEmployee_Name());
		pt.setString(2, e.getEmployee_Address());
		pt.setString(3, e.getDate_of_Joining());
		pt.setInt(4, e.getExperience());
		pt.setString(5, e.getDate_of_Birth());

		int r = pt.executeUpdate();
		stmt.close();
		con.close();
		return r;

	}

	public void readEmp(EmployeePojo x) throws Exception {

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empcase", "root", "root");
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		ResultSet rs = stmt.executeQuery("select * from employee where Employee_Id =" + x.getEmployee_Id());

		if (rs.first()) {
			rs = stmt.executeQuery("select * from employee where Employee_Id =" + x.getEmployee_Id());

			while (rs.next()) {
				System.out.println("Employee Id:" + rs.getInt("Employee_Id"));
				System.out.println("Employee Name:" + rs.getString("Employee_Name"));
				System.out.println("Employee Address:" + rs.getString("Employee_Address"));
				System.out.println("Employee Date of Joining:" + rs.getString("Date_of_Joining"));
				System.out.println("Employee Experience :" + rs.getInt("Experience"));
				System.out.println("Employee Date of Birth:" + rs.getString("Date_of_Birth"));
			}

		} else {
			System.out.println("You entered a wrong Employee Id");
		}
		stmt.close();
		con.close();
	}

	public int updateEmp(EmployeePojo x) throws Exception {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empcase", "root", "root");
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		PreparedStatement pt = con.prepareStatement(" update employee SET Employee_Name = ?,"
				+ "Employee_Address = ?, Date_of_Joining=?, Experience =?,Date_of_Birth=?\r\n"
				+ " where Employee_Id = ?");

		pt.setInt(6, x.getEmployee_Id());
		pt.setString(1, x.getEmployee_Name());
		pt.setString(2, x.getEmployee_Address());
		pt.setString(3, x.getDate_of_Joining());
		pt.setInt(4, x.getExperience());
		pt.setString(5, x.getDate_of_Birth());

		int r = pt.executeUpdate();
		stmt.close();
		con.close();
		return r;

	}

	public int deleteEmp(EmployeePojo x) throws Exception {
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empcase", "root", "root");
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		PreparedStatement pt = con.prepareStatement("delete from employee where Employee_Id = ?");
		pt.setInt(1, x.getEmployee_Id());

		int r = pt.executeUpdate();
		stmt.close();
		con.close();
		return r;

	}

}
