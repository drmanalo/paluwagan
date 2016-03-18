package com.manalo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manalo.entity.Miembro;
import com.manalo.service.MiembroService;

@Controller
public class MiembroController {
	
	@Autowired
	private MiembroService miembroService;
	
	@RequestMapping("listMembers")
	public ModelAndView listMembers() {
		ModelAndView mav = new ModelAndView("miembro/list");
		mav.addObject("members", miembroService.findAll());
		return mav;
	}
	
	@RequestMapping("addMember")
	public ModelAndView addMember() {
		ModelAndView mav = new ModelAndView("miembro/createUpdate");
		mav.addObject("miembro", new Miembro());
		return mav;
	}

}
