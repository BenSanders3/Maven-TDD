package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.EmpBusinessLogic;
import model.Employee;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class TestEmployeeLogic {
	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee employee = new Employee("Emily");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		employee.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
	
	@Test
	public void testEmployeeIsRetirementAge() {
		employee.setAge(70);
		assertTrue(empBL.isRetirementAge(employee));
	}
	
	@Test
	public void testEmployeeIsNotRetirementAge() {
		employee.setAge(25);
		assertFalse(empBL.isRetirementAge(employee));
	}
}
