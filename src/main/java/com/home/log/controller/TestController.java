package com.home.log.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.log.annotation.Logable;

@RestController
public class TestController {

	@Logable("执行方法一")
	@GetMapping("/one")
	public void methodOne(String name) {
		
	}

	@Logable("执行方法二")
	@GetMapping("/two")
	public void methodTwo() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Logable("执行方法三")
	@GetMapping("/three")
	public void methodThree(String name, String age) {
		
	}
}
