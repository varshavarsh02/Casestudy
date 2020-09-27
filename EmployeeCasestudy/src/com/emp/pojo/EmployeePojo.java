package com.emp.pojo;

public class EmployeePojo {
	private int Employee_Id, Experience;
	private String Employee_Name, Employee_Address, Date_of_Joining, Date_of_Birth;

        //Parameterized User Constructor with 5 inputs  to initialize fields

	public EmployeePojo(String employee_Name, String employee_Address, String date_of_Joining, int experience,
			String date_of_Birth) {
		super();
		Experience = experience;
		Employee_Name = employee_Name;
		Employee_Address = employee_Address;
		Date_of_Joining = date_of_Joining;
		Date_of_Birth = date_of_Birth;
	}

	 //Parameterized User Constructor with 6 inputs 

	public EmployeePojo(int employee_Id, int experience, String employee_Name, String employee_Address,
			String date_of_Joining, String date_of_Birth) {
		super();
		Employee_Id = employee_Id;
		Experience = experience;
		Employee_Name = employee_Name;
		Employee_Address = employee_Address;
		Date_of_Joining = date_of_Joining;
		Date_of_Birth = date_of_Birth;
	}

         //Parameterized User Constructor with 1 input

	public EmployeePojo(int employee_Id) {
		super();
		Employee_Id = employee_Id;
	}

	public EmployeePojo() {
		super();
	}

        //getter methods and setter methods

	public int getEmployee_Id() {
		return Employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

	public String getEmployee_Address() {
		return Employee_Address;
	}

	public void setEmployee_Address(String employee_Address) {
		Employee_Address = employee_Address;
	}

	public String getDate_of_Joining() {
		return Date_of_Joining;
	}

	public void setDate_of_Joining(String date_of_Joining) {
		Date_of_Joining = date_of_Joining;
	}

	public String getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}

}
