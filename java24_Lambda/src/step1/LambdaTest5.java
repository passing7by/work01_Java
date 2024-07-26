package step1;

@FunctionalInterface
interface Attackable{
	void attack(); //인자값 없음, 반환타입 없음
}//interface Attackable

@FunctionalInterface
interface Movable{
	void move(int right, int left); //인자값 2개, 반환타입 없음
}//interface Movable

class Fighter{
	//메소드 오버로딩
	public void action(Attackable a) {
		a.attack();
	}
	public void action(Movable m) {
		m.move(100,200);
	}
}//class Fighter

public class LambdaTest5 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		//1. Attackable을 람다식으로 구현
		f.action(()->System.out.println("드론을 이용해서 공중공격 합니다..."));
		
		//2. Movable을 람다식으로 구현
		//오른쪽으로 100, 왼쪽으로 200
		f.action((a,b)->{
			int right = a+100;
			int left = b+200;
			System.out.println("오른쪽으로 "+right+", "+"왼쪽으로 "+left+"km 이동합니다");
		});
	
	}//main
}//class LambdaTest5
