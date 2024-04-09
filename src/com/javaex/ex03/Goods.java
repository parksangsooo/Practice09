package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public Goods(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return String.format("%s(가격:%,d원)이 %d개 입고 되었습니다.", name,price,count);
	}
}
