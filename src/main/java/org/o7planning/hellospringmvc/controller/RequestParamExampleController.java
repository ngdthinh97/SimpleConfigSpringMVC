package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamExampleController {
	@RequestMapping("/user")
	public String userInfo(Model model, @RequestParam(value ="name",defaultValue = "Guest"  ) String injectParam ) { // request param co value la name thi tren URL phai nhap vao name
		model.addAttribute("name",injectParam);   // (name , gia tri do nguoi dung truyen vao URL) , khi goi key name ${name} thi se goi ra gia tri cua key do
		if("admin".equals(injectParam)) {
			model.addAttribute("userInfor", "admin of page"); // userinfor la element trong file jsp
		}
		else {
			model.addAttribute("userInfor", "not found");  // userinfor la element trong file jsp
		}
		return "userInfo"; // return ve page jsp
	}
	
}

