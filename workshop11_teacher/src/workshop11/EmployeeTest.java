package workshop11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeTest {

	public static void main(String[] args) {
		Consumer<Employee> c = i->System.out.println(i+" ");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "SCOTT", 30000.0));
		employees.add(new Employee(2, "ADAMS", 25000.0));
		employees.add(new Employee(3, "SMITH", 21000.0));
		employees.add(new Employee(4, "KING", 50000.0));
		
		
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("\n=============== 1. 직원들 급여 인상 정보 출력 ================");
		employees. forEach(x->{
//			x.setSalary(x.getSalary()+x.getSalary()*0.15);
			x.setSalary(Math.round(x.getSalary()*1.5));
			System.out.println(x);
		});
		
		System.out.println("\n=============== 2. 직원들 급여 인상 정보 출력 ================");
		Consumer<Employee> consumer = x->{
			x.setSalary(Math.round(x.getSalary()*1.5)); //직원들의 급여가 15% 인상된 급여로 수정

		};
		
		
	}

}
