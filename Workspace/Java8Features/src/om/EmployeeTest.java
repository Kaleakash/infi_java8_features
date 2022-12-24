package om;

import com.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		Employee emp1 = Employee.instanceOf();
		emp1.display();
		
		Employee emp2 = Employee.instanceOf();
		emp1.display();
	}

}
