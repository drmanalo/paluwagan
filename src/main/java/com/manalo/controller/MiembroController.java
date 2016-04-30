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
		return new ModelAndView("miembro/list").addObject("members", miembroService.findAll());
	}

	@RequestMapping("addMember")
	public ModelAndView addMember() {
		return new ModelAndView("miembro/createUpdate").addObject("miembro", new Miembro());
	}

}
