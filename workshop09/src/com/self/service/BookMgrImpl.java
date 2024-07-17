package com.self.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.self.vo.Book;
import com.self.vo.Magazine;

public class BookMgrImpl implements BookMgr{
	private ArrayList<Book> books = null;
	//싱글톤
	private static BookMgrImpl mgr = new BookMgrImpl();
	private BookMgrImpl() {
		books = new ArrayList<Book>();
	}
	
	public static BookMgrImpl getInstance() {
		return  mgr;
	}
	
	
	//"1:데이터 입력 기능\t"
	@Override
	public void addBook(Book b) {
		books.add(b);
	}
	
	//"2:데이터 전체 검색기능\n"
	@Override
	public ArrayList<Book> getAllBook() {
		return books;
	}
	
	//"3:isbn으로 정보를 검색하는 기능\t"
	@Override
	public Book searchBookByIsbn(String isbn) {
		Book book = null;
		for(Book o : books) {
			if(o==null) continue;
			else if(o.getIsbn().equals(isbn))
				book = o;
		}
		return book;
	}
	
	//"4:Title로 정보를 검색하는 기능(파라메터로 주어진 제목을 포함하는 모든 정보)\n"
	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for(Book o : books) {
			if(o==null) continue;
			else if(o.getTitle().equals(title))
				temp.add(o);
		}
		return temp;
	}
	
	//"5:Book만 검색하는 기능\t"
	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> temp = new ArrayList<>();
		for(Book o : books) {
			if(o==null) continue;
			else if(o)
				temp.add(o);
		}
		
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagazin() {
		ArrayList<Book> temp = new ArrayList<>();
		//
		
		return temp;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> temp = new ArrayList<>();
		//
		
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPublish(String publish) {
		ArrayList<Book> temp = new ArrayList<>();
		//
		
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> temp = new ArrayList<>();
		//
		
		return temp;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		//
		
		return total;
	}
	@Override
	public int getAvgPrice() {		
		//
		return 0;
	}
}
