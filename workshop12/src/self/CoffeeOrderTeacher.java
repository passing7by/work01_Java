package self;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrderTeacher {

	public static void main(String[] args) {
		List<String> coffees=  List.of(
									"Cappuccino",
									"Americano",
									"Espresso",
									"Caramel Macchiato",
									"Mocha",
									"Cappuccino",
									"Espresso",
									"Latte"				
								);
		List<String> coffeeEndingIn = coffees.stream()
									.filter(s->s.endsWith("o"))
									.sorted()
									.distinct()
									.collect(Collectors.toList());
		System.out.println(coffeeEndingIn);

	}

}
