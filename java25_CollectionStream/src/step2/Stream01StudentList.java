package step2;
/*
   중간처리 연산자
   map
   mapToInt | mapToDouble
   peek...
   distinct
   filter
   limit
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	
	String name;
	int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}

public class Stream01StudentList {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("SCOTT", 90),
				new Student("SMITH", 83),
				new Student("BLAKE", 92)

				);
		
		Stream<Student> studnetStream = students.stream();
		
		//중간처리 연산자 mapToInt...학생 객체를 점수로 매핑하는 기능 (객체가 가지고 있는 정보 중 숫자 정보를 뽑아내서 매핑함)
		//ㄴ IntStream(점수만으로 이뤄진 새로운 스트림) 을 반환
		//ㄴ 숫자가 아닌 것은? -> map() 사용
		
		//중간처리
		IntStream scoreStream = studnetStream.mapToInt(student->student.getScore());
		
		//최종처리
		double avg = scoreStream.average().getAsDouble();
		System.out.println("Result Avg 1 "+avg);
		
		//람다에서는 코드 패턴을 달리 가져가는 게ㅣ 좋음...
		System.out.println("====================== Method Chaining ======================");
		avg=students.stream()
			    .mapToInt(student->student.getScore())
			    .average()
			    .getAsDouble();
		System.out.println("Result Avg 2 "+avg);
		
		System.out.println("\n------------------- map ----------------------");
		//[map] : Stream 내 값들을 변환해서 새로운 스트림을 생성하는 기능
		long count = students.stream()
							.map(student->student.getName())
							.peek(System.out::print)
							.count();
		
		long count1 = students.stream()
							.filter(i -> true)
							.map(student->student.getName())
							.peek(System.out::print)
							.count();
		
		System.out.println("학생 수 : "+count);
		
		System.out.println("\n------------------- anymatch(최종연산) | filter(중간연산) ----------------------");
		boolean find=students.stream()
							.anyMatch(s->s.getName().equals("KING"));
		System.out.println("KING이 메버로 존재합니까?"+find);
	}
}
