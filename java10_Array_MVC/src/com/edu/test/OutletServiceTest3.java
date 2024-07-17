package com.edu.test;

import com.edu.service.OutletService;
import com.edu.vo.Customer;
import com.edu.vo.Product;

public class OutletServiceTest3 {

	public static void main(String[] args) {
		Product[] products1 = {
				new Product("신라면", 1200, 5, "농심"),
				new Product("삼다수 생수", 1000, 10, "농심"),	
				new Product("하이타이", 14000, 1, "엘지"),
				new Product("짐빔", 130000, 1, "JIM")
		};
		
		Product[] products2 = {
				new Product("Terra", 2200, 1, "농심"),
				new Product("맥심커피", 20000, 1, "농심"),	
				new Product("휘센 에어콘", 3340000, 1, "대우")
		};
		
		Customer c1 = new Customer(111, "이정재", "방배동");
		Customer c2 = new Customer(222, "정우성", "신사동");
		Customer c3 = new Customer(333, "제니", "방배동");
		
		Customer[] customers = {c1, c2, c3};
		
		//has a relation...
		customers[0].buyProducts(products1);
		customers[1].buyProducts(products2);

		
		OutletService service = new OutletService();
		
		//1.
		System.out.println("===="+customers[0].getName()+" 님이 구매하신 상품정보입니다====\n");
		Product[] pros = service.getAllProduct(customers[0]);
		for(Product product : pros) System.out.println(product.getDetails());
		
		//2.
		System.out.println("===="+customers[0].getName()+" 님이 구매하신 상품 Maker입니다====\n");
		String[] makers = service.getAllProductMaker(customers[0]);
		for(String maker : makers) System.out.println(maker);
		
		//3.
		System.out.println("==== 222 고객님 검색 결과입니다 ====\n");
		Customer customer = service.findCustomer(customers, 222);
		System.out.println(customer.getCustomerInfo());
		
		//4. 
		System.out.println("==== 같은 동네 거주하는 고객 정보입니다 ====\n");
		Customer[] addrCustomers = service.findCustomer(customers, "방배동");
		for(Customer c : addrCustomers)	{
			if(c==null) break;
			System.out.println(c.getCustomerInfo());
			
		//6. 
		System.out.println("======== 고객들이 구입한 물품 중 1만원 이상에 해당하는 제품 정보입니다 =========");
		Product[] pros2 = service.getMorePriceProduct(customers, 10_000);
		for(Product p: pros2) {
			if(p == null) break;
			System.out.println(p.getDetails());
		}
	}
	}
}
