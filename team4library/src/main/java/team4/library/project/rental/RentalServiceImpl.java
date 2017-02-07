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
		System.out.println("bc 넘겨받았는지 확인 : "+ bookCode);
		Rental rent = rentalDao.rentalSelect(bookCode);
		System.out.println("rent 확인 : "+rent.toString());
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
		System.out.println("endDay 확인 : "+endDay);
		long diff = endDay.getTime() - startDay.getTime();
		long diffday = diff / (24*60*60*1000);
		System.out.println("diff 확인 : "+ diff);
		int rentDay = (int)diffday;
		System.out.println("rentDay 확인 : "+rentDay);
		int levelPrice = rent.getMemberlevelPrice();
		System.out.println("levelPrice 확인 : "+levelPrice);
		int pay = levelPrice*rentDay; 
		System.out.println("pay 확인 : "+ pay);
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
