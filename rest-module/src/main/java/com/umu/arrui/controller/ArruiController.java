package com.umu.arrui.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArruiController {
	
//	@Inject
//	private IArruiService arruiService;
	
	@RequestMapping(value="/arrui",method=GET)
	public String listArrui(){
		return "hello world";
	}

}
