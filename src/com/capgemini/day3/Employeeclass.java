package com.capgemini.day3;

public class Employeeclass {

	private long empId;
	private String empName;
	private double basicSalary;
	private double grossSalary;
	private double netSalary,hra,pf,medical;
	private static long totalEmployee;
	public static final double PT=200;
		public Employeeclass() {
			
			totalEmployee++;
			
		}
	public Employeeclass(long EmpId,String Empname,double Basicsalary,double medical) {
		this.empId= EmpId;
		this.empName= Empname;
		this.basicSalary= Basicsalary;
		this.medical= medical;
		totalEmployee++;
		}
		
	public double calculateNetSalary()
		{
		hra=0.5*basicSalary;
		pf=0.12*basicSalary;
		grossSalary=hra+basicSalary+medical;
		netSalary=grossSalary-(pf+PT);
		return netSalary;
		}
		public void displayEmpDet()
		{
			System.out.println("Employee Id "+empId);
			System.out.println("Employee Name "+empName);
			System.out.println("Net salary "+netSalary); 
		}
			
			
	
	}
		
	
	

