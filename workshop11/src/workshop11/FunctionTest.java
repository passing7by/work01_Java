package workshop11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionTest {

	public static void main(String[] args) {
		EmployeeService e = new EmployeeService();
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "SCOTT", 30000.0));
		employees.add(new Employee(2, "ADAMS", 25000.0));
		employees.add(new Employee(3, "SMITH", 21000.0));
		employees.add(new Employee(4, "KING", 50000.0));
		
		Consumer<Employee> c = i->System.out.println(i+" ");
		
		e.raiseSalary(employees, c);
		
		System.out.println(employees);
	}

}
