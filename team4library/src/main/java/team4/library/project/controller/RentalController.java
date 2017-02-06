package team4.library.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.xml.internal.resolver.helpers.Debug;

import team4.library.project.rental.Rental;
import team4.library.project.rental.RentalService;

@Controller
public class RentalController {
	private static final Logger logger = LoggerFactory.getLogger(RentalController.class);

	@Autowired
	private RentalService rentalservice;

	@RequestMapping(value = "/rental/rentalAdd", method = RequestMethod.POST)
	public String rentalAdd(Rental rental) {
		System.out.println("dddddddddddddddddddddd");
		logger.debug("rental : " + rental);
		rentalservice.Addrental(rental);

		return "redirect:/rental/rentalAdd";
	}

	@RequestMapping(value = "/rental/rentalAdd", method = RequestMethod.GET)
	public String rentalAdd() {
		logger.debug("여기까진오는거맞지?");
		return "/rental/rentalAdd";
	}
	@RequestMapping(value="/rental/rentalselect", method= RequestMethod.GET)
	public String rentalSelect(){
		return "/rental/rentalselect";
		
	}
	@RequestMapping(value="rental/rentalselect", method=RequestMethod.POST)
	public String rentalSelect(Rental rental){
		logger.debug("요기에는 뭐가 들었나 rental"+rental);
		rentalservice.Selectrental(rental);
		System.out.println(rental);
		return "redirect:/rental/rentalReturn";
	}
}
