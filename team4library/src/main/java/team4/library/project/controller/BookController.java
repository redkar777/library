package team4.library.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team4.library.project.book.Book;
import team4.library.project.book.BookService;
import team4.library.project.book.Disposal;
import team4.library.project.book.Genre;

@Controller
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	@Autowired
	private BookService bookservice;
	
	@RequestMapping(value="/book/bookdistory", method=RequestMethod.GET)
	public String disposal(){
		return "/book/bookdistory";
	}
	@RequestMapping(value="/book/bookdistory", method=RequestMethod.POST)
	public String disposal(Disposal disposal,Book book){
		logger.debug("bookCode : "+disposal);
		bookservice.UpdateState(book);
		bookservice.Adddisposal(disposal);
		return "redirect:/book/bookdistory";
	}
	@RequestMapping(value="/book/bookAdd", method=RequestMethod.GET)
	public String BookAdd(Model model){
		List<Genre> genre = bookservice.selectGenre();
		logger.debug("genre : "+genre.toString());
		model.addAttribute("genre", genre);
		return "/book/bookAdd";
	
	
	}
	@RequestMapping(value="/book/bookAdd", method=RequestMethod.POST)
	public String BookAdd(Book book){
		logger.debug("book °ª :" + book);
		bookservice.AddBooks(book);
		return "redirect:/book/bookAdd";
		
	}
}
