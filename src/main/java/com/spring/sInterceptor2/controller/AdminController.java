package com.spring.sInterceptor2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String getBoardList(Model model) {
		System.out.println("이곳은 admin컨트롤러의 boardList메소드 입니다.");
		
		model.addAttribute("data", "admin컨트롤러의 boardList메소드에서 보냅니다.");
		
		return "admin/boardList";
	}
	
	@RequestMapping(value = "/guestList", method = RequestMethod.GET)
	public String getGuestList(Model model) {
		System.out.println("이곳은 admin컨트롤러의 guestList메소드 입니다.");
		
		model.addAttribute("data", "admin컨트롤러의 guestList메소드에서 보냅니다.");
		
		return "admin/guestList";
	}
	
	@RequestMapping(value = "/pdsList", method = RequestMethod.GET)
	public String getPdsList(Model model) {
		System.out.println("이곳은 admin컨트롤러의 pdsList메소드 입니다.");
		
		model.addAttribute("data", "admin컨트롤러의 pdsList메소드에서 보냅니다.");
		
		return "admin/pdsList";
	}

	
}
