package team4.library.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		logger.debug("����������°Ÿ���?");
		return "/rental/rentalAdd";
	}
	@RequestMapping(value="/rental/rentalselect", method= RequestMethod.GET)
	public String rentalSelect(){
		logger.debug("������� �ԇ�?");
		return "/rental/rentalselect";
		
	}
	@RequestMapping(value="/rental/rentalselect", method=RequestMethod.POST)
	public String rentalSelect(RedirectAttributes redirectAttributes,int bookCode){
		redirectAttributes.addAttribute("bookCode", bookCode);
		//logger.debug("���ڵ� Ȯ�� : "+bookCode);		 
		//Model a = model.addAttribute("bookCode", bookCode);
		//logger.debug("�� ����! model : "+a.toString());
		return "redirect:/rental/rentalReturn";
		//get��û���� ����
	}
	@RequestMapping(value="/rental/rentalReturn", method=RequestMethod.GET)
	public String rentalReturn(@RequestParam("bookCode") int bookCode, Model model){
		model.addAttribute("rental",rentalservice.Selectrental(bookCode));
		//logger.debug("rental ������� : "+rental);
		return "/rental/rentalReturn";
		
	}
	@RequestMapping(value="/rental/rentalReturn", method=RequestMethod.POST)
	public String rentalReturn(Rental rental){
		
		rentalservice.Returnrental(rental);
		return "redirect:/rental/rentalselect";
	}
	
}
