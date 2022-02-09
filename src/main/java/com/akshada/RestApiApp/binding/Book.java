package com.akshada.RestApiApp.binding;

public class Book {

	private Integer id;
	private String bName;
	private Double bookPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bName=" + bName + ", bookPrice=" + bookPrice + "]";
	}
	public Book(Integer id, String bName, Double bookPrice) {
		super();
		this.id = id;
		this.bName = bName;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
