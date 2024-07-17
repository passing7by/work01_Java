package com.kosta.service;

import com.kosta.vo.Movie;

public class MovieMgr {
	private Movie[ ] movies = new Movie[10]; //[Movie 클래스 타입의 movies 배열 선언&생성]
	private int index; //[Movie 배열의 인덱스번호로 쓰기 위해 필드 선언]
	
	//싱글톤...MovieMgr을 mgr이름으로 객체 생성...getInstance로 생성한 객체를 받아온다.
	private static MovieMgr mgr = new MovieMgr();
	//[private static: 다른 클래스에서는 접근할 수 없으나, 전역에 영향을 미침]
	//[MovieMgr 클래스 타입의 'mgr'이라는 이름의 객체(인스턴스) 생성]
	private MovieMgr() {}
	//[MovieMgr 기본 생성자 - 필드(movies 배열, index)에 대해 기본값 생성]
	public static MovieMgr getInstance() {
		return mgr;
	}
	//[MovieMgr 클래스 타입의 값을 리턴하는 getInstance() 생성, return값은 'mgr']
	
	//1. 영화를 추가하는 기능
	public void add(Movie m) {
		movies[index++] = m;
	}
	/*
	 * [배열이름[인덱스에 값을 대입한 후 1 증가시켜라] = 증가시킨 인덱스의 value값;]
	 * [index 값은 0부터 시작하며, 0에 최초에 입력한 m이 대입된 다음에 index에는 1이 증가된 값인 1이 저장됨]
	 * [movies[index++] = m; // movies[0] = m, index = 1
	 * movies[++index] = n; // movies[1] = n, index = 2]
	 */	
	
	//2. 모든 영화를 다 가져오는 기능
	public Movie[] search() {
	//[리턴타입: Movie 클래스 타입의 배열]
		Movie[] nMovies = new Movie[index];
		//[Movie 클래스 타입의 'nMovies'라는 배열 선언&생성,index만큼의 길이를 가짐]
		for(int i=0; i<index; i++) {
		//[i가 0일 때부터 1씩 증가시켜가며 {}를 실행하라. 단, i가 index보다 작을 때까지만]
			nMovies[i]=movies[i];
			//[nMovies 배열의 값에 movies 배열의 값을 대입해라]
		}
		return nMovies;
		//[movies 배열의 값을 대입시킨 nMovies 배열을 리턴해라]
	}
	
	//3. title로 영화를 검색하는 기능
	public Movie[] search(String title) {
	//[입력값: String 타입의 'title'(지역변수), 출력값: Movie 클래스 타입의 배열]
		int temp = 0;
		//[int 타입의 temp라는 지역변수 선언 & 값을 0으로 초기화]
		Movie[] nMovies = new Movie[index];
		//[Movie 클래스 타입의 nMovie라는 배열 선언 & 생성 (배열 길이는 index(MovieMgr의 필드값))]
		
		for(Movie m : movies) {
		//[for(배열에서 꺼낸 항목을 저장할 변수 : 배열)]
		//[Movie 클래스 타입의 지역변수 m에 movies 배열에서 꺼낸 항목을 저장하고 {}을 실행한 후, 다시 앞의 내용을 반복할거임]
			if(m==null) break;
			//[만약 movies에서 꺼낸 값이 기본값이면 반복문 for를 중단하라]
			if(m.getTitle().contains(title)) {
			//[만약 movies에서 꺼낸 값(m)을 참조하여 getTitle()을 실행하여 얻어낸 String 타입의 title 필드가
			//입력된 값(String 타입의 'title'이라는 이름을 가진 지역변수)을 포함하고 있다면 {}를 실행하라]
				nMovies[temp++] = m;
				//[nMovies 배열(메소드 안에서 선언한 배멸)의 인덱스인 temp(메소드 안에서 선언한 지역변수)를 1씩 증가시켜가며 m에 대입하라]
			}
		}
		
		//null값을 추리기 위해서 다시 for문을 동작시킴 -->어떤 null값? 어느 과정에서 발생하는 null값을 추린다는 것???
		//ㄴ 메소드의 리턴타입은 배열 > 배열을 리턴해야 함 > but nMovies 배열의 길이는 index이므로 위의 for문을 동작시켜 추린 값의 갯수보다 많음
		// > (index - 추린 값)만큼 배열에 null값이 존재함
		// > 새로운 배열 realMovies(길이: 아까 추린 값의 갯수인 temp)를 생성하여 nMovies의 값을 넣어줌 > realMovies 배열을 리턴
		
		Movie[] realMovies = new Movie[temp];
		//[Movie 클래스 타입을 가지는 realMovies 라는 배열 선언 & 생성,
		//길이는 temp(int 타입의 지역변수)]
		for(int i=0; i<temp; i++)
		//[i가 0일 때부터 시작하여 i를 하나씩 증가시켜가며 {}를 실행하라. 단, i가 temp보다 작을 때까지만]
			realMovies[i] = nMovies[i];
			//[realMovies 배열의 i 인덱스가 붙은 값에 nMovies 배열의 i 인덱스가 붙은 값을 대입하라]
		return realMovies;
		//[Movie 클래스 타입의 배열 realMovies를 리턴해라]
	}
	
	//4. 감독 이름으로 영화를 검색하는 기능
	public Movie[] searchDirector(String name) {
	//[반환타입: Movie 클래스 타입의 배열, 입력값: String 타입의 'name'이라는 이름의 지역변수]
		int size = 0;
		//[int 타입의 'size'라는 이름의 지역변수 선언 & 값을 0으로 초기화]
		for(int i=0; i<index ; i++) {
		//[i가 0일 때부터 i를 하나씩 증가시켜가며 {}를 반복해라. 단, i가 index보다 작을 때까지만]
			if(movies[i].getDirector().contains(name)) size++; //2
		}//[만약 movies 배열의 값을 참조하여 얻은 director 필드의 값이 입력값을 포함하고 있다면, size를 하나씩 증가시켜라]
		//[i는 0일 떄, size는 1이 됨]
		
		Movie[] nMovies = new Movie[size];
		//[Movie 클래스 타입의 nMovies 배열 선언 & 생성, 길이는 size(위의 for문에서 증가시킨 만큼의 값)]
		for(int i=0; i<index; i++) {
		//[i가 0일때부터 {}을 실행하고, 실행이 끝나면 i를 하나 증가시켜 {}를 실행한다. 단, i가 index보다 작을 때까지만 {}를 실행한다]
			if(movies[i].getDirector().contains(name))
			//[만약 movies 배열의 값을 참조하여 얻은 director 필드의 값이 입력값을 포함하고 있다면 {}를 실행해라]
				nMovies[--size] = movies[i]; //뒤에서 앞으로 입력된다.
				/*
				 * [nMovies 배열의 인덱스(size)가 하나 감소된 값에 movies의 값을 대입해라]
				 * [ex. size = 2이면
				 * i=0일 때, movie[0]의 value가 nMovies[1]에 대입되며
				 * i=1일 때, movie[1]의 value가 nMovies[0]에 대입됨
				 */			
		
		}
		return nMovies;
		//[nMovies 배열을 반환해라]
	}

	//5. 장르로 영화를 검색하는 기능
	public Movie[] searchGenre(String genre) {
	//[반환타입: Movie 클래스 타입의 배열, 입력값: String 타입의 'genre'라는 지역변수]
		int temp = 0;
		//[int 타입의 'temp'라는 지역변수 선언 & 값을 0으로 초기화]
		for(Movie m : movies) {
		//[for(배열에서 꺼낸 항목을 저장할 변수 : 배열)]
			if(m==null)
				break;
			//[만약 m이 null이면 for문을 빠져나온다]
			if(m.getGenre().equals(genre)) {
			//[만약 m을 참조하여 getGenre()를 통해 얻은 genre 필드가 입력값과 같다면 {}를 실행해라]
				temp ++;
				//[temp를 1씩 증가시켜라]
			}

		}
		
		Movie[] rearMovies = new Movie[temp];
		//[Movie class type 'rearMovies' array 선언 & 생성(길이는 'temp'(아까 증가시킨만큼의 값)]
		for(int i = 0; i<temp;) {
		//[i가 0일 때부터 i가 temp보다 작을 때까지 {}을 실행하라]
			for(Movie m : movies) {
			//[for(배열에서 꺼낸 항목을 저장할 변수 : 배열)]
				if(m==null)
				//[만약 m이 null이라면 {}을 실행해라]
					return rearMovies;
					//[rearMovies 배열을 반환해라]
				if(m.getGenre().equals(genre)) 
				//[만약 m을 참조하여 getGenre()를 통해 얻은 genre 필드의 값이 입력값과 같다면 {}를 실행]
					rearMovies[i++] = m;
					//[rearMovies[i]에 i를 1씩 증가시켜가며 m을 대입해라]
			}
		}
		return rearMovies;
		//[rearMovies 배열을 반환해라]
	}

	//6. 제목으로 영화를 검색하여 삭제하는 기능
	public void delete(String title) {
	//[반환타입: 없음, 입력값: String 타입의 'title'이라는 지역변수]
			for(int i =1; i<index; i++) {
			//[i가 1일 때부터 i가 index보다 작을 때까지만 i를 1씩 증가시켜가며 {}를 실행하라]
				if(movies[i].getTitle().equals(title)) {
				//[만약 movies[i]의 값을 참조하여 getTitle()을 통해 얻은 title 필드가 입력값과 같다면 {}를 실행]
					for(int j = i; j<index; j++) {
					//[j가 i일 때부터, index보다 작을 때까지만 1씩 증가시켜가며 {}를 실행하라]
						movies[j] = movies[j+1];
						//[movies[j]의 값에 movies[j+1]의 값을 대입하라]
						//[movie의 값을 한 칸씩 앞으로 이동시킴]
					}
					movies[index] = null;
					//[배열의 마지막 값을 null로 처리]
					
					index--;
					//[배열의 길이를 1 줄임]
					
					break;
					//[맨 바깥쪽 for문을 빠져나옴]
				}
			}
	}
	
	public int getSize() {
		return index;
	}
}







