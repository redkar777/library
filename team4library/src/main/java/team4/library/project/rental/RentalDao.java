package team4.library.project.rental;

public interface RentalDao {
	int rentalAdd(Rental rental);
	Rental rentalSelect(int bookCode);
	int rentalReturn(Rental rental);

	
}
