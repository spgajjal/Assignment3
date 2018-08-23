package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day3.Employeeclass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class EmployeeclassTest {
	Employeeclass s;
	@BeforeEach
	void setUp() {
		s=new Employeeclass(234,"spandhu",300000,1000);
	}
@Test
void testCalculateNetSalary() {
	assertEquals(414800,s.calculateNetSalary());
}
@AfterEach
void tearDown() {
	s=null;
}
	
		

	}