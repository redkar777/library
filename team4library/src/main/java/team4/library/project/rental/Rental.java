package team4.library.project.rental;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Rental {
	private String rentalCode;
	private int bookCode;
	private String bookName;
	private String memberName;
	private int memberlevelPrice;
	private String rentalStart;
	private String rentalEnd;
	private String memberId;
	private int rentalPayment;
	private int rentalStateNo;
	private int totalPay;
	private int getmoney;
	
	
	public int getGetmoney() {
		return getmoney;
	}
	public void setGetmoney(int getmoney) {
		this.getmoney = getmoney;
	}
	public int getTotalPay() {
		return totalPay;
	}
	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberlevelPrice() {
		return memberlevelPrice;
	}
	public void setMemberlevelPrice(int memberlevelPrice) {
		this.memberlevelPrice = memberlevelPrice;
	}
	public String getRentalCode() {
		return rentalCode;
	}
	public void setRentalCode(String rentalCode) {
		this.rentalCode = rentalCode;
	}

	
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	
	public String getRentalStart() {
		return rentalStart;
	}
	public void setRentalStart(String rentalStart) {
		this.rentalStart = rentalStart;
	}
	public String getRentalEnd() {
		return rentalEnd;
	}
	public void setRentalEnd(String rentalEnd) {
		this.rentalEnd = rentalEnd;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getRentalPayment() {
		return rentalPayment;
	}
	public void setRentalPayment(int rentalPayment) {
		this.rentalPayment = rentalPayment;
	}
	public int getRentalStateNo() {
		return rentalStateNo;
	}
	public void setRentalStateNo(int rentalStateNo) {
		this.rentalStateNo = rentalStateNo;
	}
	
	
	
}
