package team4.library.project.rental;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Rental {
	private String rentalCode;
	private int bookCode;
	private String bookName;
	private String memberName;
	private int memberlevelPrice;
	private Date rentalStart;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rentalEnd;
	private String memberId;
	private int rentalPayment;
	private int rentalStateNo;
	
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
	public Date getRentalStart() {
		return rentalStart;
	}
	public void setRentalStart(Date rentalStart) {
		this.rentalStart = rentalStart;
	}
	public Date getRentalEnd() {
		return rentalEnd;
	}
	public void setRentalEnd(Date rentalEnd) {
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
