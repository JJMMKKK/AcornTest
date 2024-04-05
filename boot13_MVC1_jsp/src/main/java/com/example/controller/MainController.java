package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//	@GetMapping("/")//get방식
	@RequestMapping(value = "/")   //http://localhost:8090/app/
	public String main() {
		System.out.println("/ 주소 요청///////");
		System.out.println("/ 주소 요청222222222222222  1    ///////");
		System.out.println("/ 주소 요청3333333333333333      ///////");

		return "main";//뷰리졸버 동작
	}
}
