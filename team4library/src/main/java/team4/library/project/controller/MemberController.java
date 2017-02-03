package team4.library.project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team4.library.project.member.Member;
import team4.library.project.member.MemberService;
import team4.library.project.member.Memberlevel;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping(value="/member/memberAdd", method=RequestMethod.POST)
	public String memberAdd(Member member){
		logger.debug("member : " + member);
			memberservice.addMember(member);
		return "redirect:/member/memberAdd";
	}
	@RequestMapping(value="/member/memberAdd", method=RequestMethod.GET)
	public String memberAdd(Model model){
		List<Memberlevel> memberlevel = memberservice.Selectlevel();
		model.addAttribute("memberlevel", memberlevel);		
		return "/member/memberAdd";
		
	}
}
