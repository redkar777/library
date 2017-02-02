package team4.library.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team4.library.project.Library;
import team4.library.project.LibraryService;
import team4.library.project.Local;

@Controller
public class LibraryController {
	private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);
	
	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping(value="/library/libraryLogin", method=RequestMethod.GET)
	public String libraryLogin(){
		
		return "/library/libraryLogin";
		
	}
	@RequestMapping(value="/library/libraryLogin", method=RequestMethod.POST)
	public String libraryLogin(Library library, HttpSession session){
			logger.debug("library�� ��� �� : "+library);
			libraryService.libraryLogin(library);
			session.setAttribute("library_id", libraryService.libraryLogin(library).getLibrary_id());
			
		return "/home";
		
	}
	@RequestMapping(value="/library/libraryAdd", method=RequestMethod.GET)
	public String libraryAdd(Model model){
		System.out.println("�ٹ������ ����");
		List<Local> local = libraryService.selectLocal();
		logger.debug("�����Ȯ���̿�");
		logger.debug("local : "+local.toString());
		model.addAttribute("local", local);
		return "/library/libraryAdd";

	}
	
	@RequestMapping(value="/library/libraryAdd", method=RequestMethod.POST)
	public String libraryAdd(Library library){
		System.out.println("library�� ��������ֳ�?" + library);
		logger.debug("library : "+library.toString());
		libraryService.addLibrary(library);
		return "redirect:/library/libraryLogin";
		
		
	}
	
	
}
