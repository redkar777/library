package team4.library.project.rental;

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

	@Override
	public Rental Selectrental(Rental rental) {
		// TODO Auto-generated method stub
		return rentalDao.renatalSelect(rental);
	}

	

}
