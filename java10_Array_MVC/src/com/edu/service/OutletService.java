package com.edu.service;

import com.edu.vo.Customer;
import com.edu.vo.Product;

//아울렛에서 상품을 구매하는 고객의 기능을 정의하고 있는 클래스
//서비스 클래스는 기능만으로 이루어지는 클래스
//vo, test, service 클래스를 작성하게 되면 드디어 구조적인 어플리케이션을 자바 SE 기반으로 작성할 수 있게 됨
public class OutletService {
	
	private Product[] products;
	
	public Product[] get() {
		
		return null;
	}
	
	//1. 특정 고객이 구입한 모든 상품을 반환하는 기능
	public Product[] getAllProduct(Customer vo) { //*vo...임의로 지은 이름 --> 맘대로 바꿔도 됨
		return vo.getProducts();
	}
	
	//2. 특정 고객이 구입한 상품의 Maker들 만을 반환하는 기능
	public String[] getAllProductMaker(Customer vo) { //return 타입은 메소드 중복에서 신경쓰지 않음, 일관된 메소드 이름을 사용하면 가독성이 좋아짐
		//리턴 타입이 컨테이너(배열 등)일 경우 생성을 먼저 해주어야 함
		String[] temp = new String[vo.getProducts().length];
		int idx = 0;
		for(Product p : vo.getProducts())
			temp[idx++] = p.getMaker();
		//temp: 임시로 만들때 사용
		//사이즈 명시는 어떻게? -> 배열 길이로
		//스테이트먼트가 한 줄일 때는 {} 생략 가능
		return temp;
	}
	//3. Outlet 안에 있는 고객 중에서 특정한 고객을 검색하는 기능
	public Customer findCustomer(Customer[] customers, int ssn) {
		Customer customer = null;
		for(Customer c : customers) {
			if(c.getSsn() == ssn)
			customer = c;
		}
		return customer;
	}
	
	//4. Outlet 안에 있는 고객 중에서 동일한 주소를 가지고 있는 고객들을 반환하는 기능
	public Customer[] findCustomer(Customer[] customers, String addr) {
	//***메소드 오버로딩*** : 크게 보면 같은 기능을 하지만, 인자값이 다른(처리하는 데이터가 다른) 메소드 - 서비스 클래스에서 기능의 일관성을 보장하는 가장 좋은 기능, 리턴 타입은 상관 없음
		//By인자값 - 넓은 의미의 오버로딩
		Customer[] temp = new Customer[customers.length]; //사이즈는?
		int idx = 0;
		for(Customer c : customers) {
			if(c.getAddress().equals(addr))
				temp[idx++] = c;
		}
		return temp;
	}
	
	
	//5. 특정 고객이 구입한 물건 중에서 최고가에 해당하는 물건의 가격을 리턴하는 기능
	public int maxPrice(Customer vo) {
		int max = 0;	//*max 지역변수 선언, 초기화(0)	
		Product[ ] pros = vo.getProducts(); //*프로덕트 클래스 타입의 pros 배열 선언, 이 배열의 value: vo를 참조하여 vo가 구입한 물건을 불러옴
		for(Product p : pros) {
			if(p.getPrice()>max) max = p.getPrice();
		}
		return max;
	}
	
	//6. 모든 고객이 구입한 물건 중, 특정 가격 이상이 되는 제품들을 반환하는 기능
	public   Product[ ] getMorePriceProduct(Customer[ ] customers, int price){
		int size = 0;
		for(Customer c : customers) {
			if(c.getProducts() !=null)
				size += c.getProducts().length;
		}
		
		Product[] temp = new Product[size];
		int idx = 0;
		//상품을 구매하지않은 제니를 위한 구문
		for(Customer c : customers) {
			if(c.getProducts() == null) continue;
			
			for(Product p : c.getProducts()) {
				if( p.getPrice() >= price)
					temp[idx++] = p;
			}
		}
		
		return temp;
	}
	
}
