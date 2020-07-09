package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReponseBodyExampleController {
	
	@RequestMapping(value = "/response")
	@ResponseBody   // tra ve return ma ko can file view cu the
	public String responseBody(Model model) {
		return "hello ^^";
	}
}
