package com.emp.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.emp.jdbc.Employee;
import com.emp.pojo.EmployeePojo;

public class JUnitTestCase {

	Employee emp = new Employee();
	EmployeePojo e = new EmployeePojo("Akshay", "Tiptur", "2017-02-15", 2, "1995-06-18");

	EmployeePojo e1 = new EmployeePojo(1, 4, "Tulsi", "Gulur", "2019-05-15",  "1997-05-21");
	EmployeePojo e2 = new EmployeePojo(3);

	@Test
	void test1() throws Exception {

		int res = emp.createEmp(e); // create and insert operation are same
		assertEquals(1, res);

	}

	@Test
	void test2() throws Exception {
		int res1 = emp.updateEmp(e1); // update the employee details
		assertEquals(1, res1);
	}

	@Test
	void test3() throws Exception {
		int res2 = emp.deleteEmp(e2); // delete the  employee details
		// If we execute it for the second time this results in failure as the employee
		// details in the first execution will be deleted
		assertEquals(1, res2);
	}

}