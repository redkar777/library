package team4.library.project.rental;

public interface RentalService {
	int Addrental(Rental rental);
	Rental Selectrental(int bookCode);
	int Returnrental(Rental rental);
}
