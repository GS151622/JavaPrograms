package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	private List<Book> books = new ArrayList<Book>();
	
	
	public void LoadData() {
		for(int i = 1; i<=10; i++) {
			Book b = new Book();
			b.setBookId(i);
			b.setBookName("Book "+i);
			books.add(b);
		}
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs = new BookShop();
		for (Book b: this.books) {
			bs.getBooks().add(b);
		}
		return bs;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
