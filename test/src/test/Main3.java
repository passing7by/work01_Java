package test;

class PracticeClass<E> {

  private E element;// 제네릭 타입 변수

  void set(E element) {
    this.element = element;
  }
  // 제네릭 파라미터 메소드 - E 타입의 'element' 변수를 인자값으로 받고, 이를 PracticeClass<E>의 필드인 element에 대입

  E get() {
    return element;
  }
  // 제네릭 타입 반환 메소드 - PracticeClass<E>에 대입된 element 필드값 반환
  
  <T> T genericMethod(T o) {	// 타입에 따라 결정됨
    return o;
  }
  // 제네릭 메소드 - <T 타입만 들어갈 수 있음> T 타입이 반환됨 (T 타입의 'o'가 인자값으로 들어감) {'o'가 반환됨} 

  static <E> E genericMethod1(E o) {  // 제네릭 메소드는 제네릭 클래스 타입과 별도로 지정된다
    return o;
  }
  static <T> T genericMethod2(T o) {
    return o;
  }
  // 제네릭 클래스와 별도로 독립적인 제네릭이 사용 (제네릭이 사용되는 메소드를 정적메소드로 두고 싶은 경우)

}//PracticeClass<E>

public class Main3 {
  public static void main(String[] args) {
    PracticeClass<String> a = new PracticeClass<String>(); // String 타입으로 변환
    PracticeClass<Integer> b = new PracticeClass<Integer>();  // Integer 타입으로 변환

    a.set("10");
    b.set(10);

    System.out.println("==================================================================");
    System.out.println("a data : " + a.get());
    System.out.println("a E Type : " + a.get().getClass().getName()); // 반환된 변수의 타입 출력 (String)

    System.out.println("==================================================================");
    System.out.println("b data : " + b.get());
    System.out.println("b E Type : " + b.get().getClass().getName());  // 반환된 변수의 타입 출력 (Integer)

//	    System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
//	    System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
//	    System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());

    System.out.println("==================================================================");
    // 제네릭 클래스와 별도로 제네릭이 사용된 메소드
    // 제네릭 메소드1 Integer
    System.out.println("<E> returnType : " + PracticeClass.genericMethod1(3).getClass().getName());
    // 제네릭 메소드1 String
    System.out.println("<E> returnType : " + PracticeClass.genericMethod1("ABCD").getClass().getName());

    // 제네릭 메소드2 ClassName a
    System.out.println("<T> returnType : " + PracticeClass.genericMethod1(a).getClass().getName());
    // 제네릭 메소드2 Double
    System.out.println("<T> returnType : " + PracticeClass.genericMethod1(3.0).getClass().getName());
  }//main
}//Main3
