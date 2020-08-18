package com.designpatterns.creational.prototype;

public class BookDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookShop1 = new BookShop();
		bookShop1.setShopName("Learning Store1");
		bookShop1.LoadData();
		
		BookShop bookShop2 = bookShop1.clone();
		bookShop2.setShopName("Learning Store2");
		
		bookShop1.getBooks().remove(1);
		
		System.out.println(bookShop1);
		System.out.println(bookShop2);
	}
}
