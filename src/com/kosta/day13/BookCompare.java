package com.kosta.day13;

import java.util.Comparator;

public class BookCompare implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.price - o2.price;
	}

}
