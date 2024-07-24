package step2;

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
		
		//중간처리 연산자 mapToInt...학생 객체를 점수로 매핑하는 기능
		//ㄴ IntStream(점수만으로 이뤄진 새로운 스트림) 을 반환
		
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

	}
}
