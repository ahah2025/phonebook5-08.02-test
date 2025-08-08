package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/hello",method= {RequestMethod.GET, RequestMethod.POST})
	public String hello() {
		System.out.println("HelloController.hello"); //출력확인
		System.out.println("2025-08-09 1:1"); //출력확인

		return "WEB-INF/views/hello"; //포워드할 jsp파일 위치와 파일명을 문자열로 표현
	}
}
