package com.kaicom.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kaicom.service.IUserService;

@Controller
@RequestMapping(value = "/springmvc",produces = "application/json;charset=utf-8")
public class LoginController {
	@Resource
	private IUserService iUserService ;
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("userName") String userName ,@RequestParam("password") String password){
		ModelAndView mav = new ModelAndView();
		String message = iUserService.login(userName, password);
		if(message.equals("success")){
			mav.setViewName("welcome");
			mav.addObject("userName", userName);
		}else{
			mav.addObject("message", message);
			mav.setViewName("redirect:/login.jsp");
		}
		return mav ;
	}
	
	@RequestMapping("/testTran")
	public ModelAndView testTran(Date ctime){
		System.out.println(ctime.toLocaleString());
		ModelAndView mav = new ModelAndView();
		String message = iUserService.testTran();
		mav.setViewName("welcome");
		mav.addObject("userName", "张三");
		return mav ;
	}
}
