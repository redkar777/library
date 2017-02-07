package team4.library.project.rental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RentalServiceImpl implements RentalService {
	@Autowired
	private RentalDao rentalDao;
	
	@Override
	public int Addrental(Rental rental) {
		// TODO Auto-generated method stub
		return rentalDao.rentalAdd(rental);
	}
	
	public Rental Selectrental(int bookCode) {
		System.out.println("bc �Ѱܹ޾Ҵ��� Ȯ�� : "+ bookCode);
		Rental rent = rentalDao.rentalSelect(bookCode);
		System.out.println("rent Ȯ�� : "+rent.toString());
		String rentalstartDay = rent.getRentalStart();
		System.out.println("startDay"+rentalstartDay);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startDay = null;
		try {
			startDay = format.parse(rentalstartDay);
			System.out.println("startDay :"+startDay);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		Date endDay = new Date();
		System.out.println("endDay Ȯ�� : "+endDay);
		long diff = endDay.getTime() - startDay.getTime();
		long diffday = diff / (24*60*60*1000);
		System.out.println("diff Ȯ�� : "+ diff);
		int rentDay = (int)diffday;
		System.out.println("rentDay Ȯ�� : "+rentDay);
		int levelPrice = rent.getMemberlevelPrice();
		System.out.println("levelPrice Ȯ�� : "+levelPrice);
		int pay = levelPrice*rentDay; 
		System.out.println("pay Ȯ�� : "+ pay);
		rent.setTotalPay(pay);
		int payment = rent.getRentalPayment();
		int getmoney = pay-payment;
		System.out.println(getmoney);
		rent.setGetmoney(getmoney);
		return rent;
	}

	@Override
	public int Returnrental(Rental rental) {
		// TODO Auto-generated method stub
		return rentalDao.rentalReturn(rental);
	}



	

}
