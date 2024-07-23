package workshop11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeService {
	EmployeeService(){};
	
	public static void raiseSalary(List<Employee> list, Consumer<Employee> c) {
		for(Employee i : list) {
			if(i!=null) {
				double d = i.getSalary();
				double nd = d+d*0.15;
				i.setSalary(nd);
				c.accept(i);
			}
				
		}
	}


	
	
}
