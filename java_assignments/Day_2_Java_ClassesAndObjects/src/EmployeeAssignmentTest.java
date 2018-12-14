import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeAssignmentTest {
	EmployeeAssignment employee;
	@Before
	public void setUp()
	{
		employee=new EmployeeAssignment();
		employee.setId(23456);
		employee.setName("jahnavi");
		employee.setMonthlyBasic(30000);
	}
	@Test
	public void checkAnnualBasic() {
		float result=employee.getAnnualBasic();
		assertEquals(360000,result,10);
	}
	@Test
	public void checkHraCalculation() {
		float result=employee.hraCalculation();
		assertEquals(17050,result,10);
	}
	@Test
	public void checkPf(){
		float result=employee.setGetPf();
	 	assertEquals(6500,result,10);
	}
	@Test
	public void checkEsic(){
		float result=employee.esic();
	 	assertEquals(0,result,10);
	}	
	@Test
	public void checkProfessionalTax(){
		float result=employee.professionalTax();
	 	assertEquals(100,result,10);
	} 
	@Test
	public void checkMonthlyGrossSalary(){
		float result=employee.getMonthlyGrossSalary();
		assertEquals(49100,result,10);
	}
	@Test
	public void checkAnnualGrossSalary(){
		float result=employee.getAnnualGrossSalary();
		assertEquals(589200,result,10);
	}
	@Test
	public void checkMonthlyDeductions(){
		float result=employee.getMonthlyDeductions();
		assertEquals(6600,result,25);
	}
	@Test
	public void checkMonthlyTakeHome(){
		float result=employee.getMonthlyTakeHome();
		assertEquals(42500,result,10);
	}
	@Test
	public void checkAnnualTakeHome(){
		float result=employee.getAnnualTakeHome();
		assertEquals(510000,result,10);
	}
	
}
