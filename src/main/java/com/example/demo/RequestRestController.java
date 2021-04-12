package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class RequestRestController {

	@RequestMapping(value= "/")
	@HystrixCommand(fallbackMethod = "defaultRequestHandler_fallback", commandProperties= {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	})
	public String defaultRequestHandler() throws InterruptedException {
		Thread.sleep(3000);
	 return "Welcome Hysrix";	
	}
	
	private String defaultRequestHandler_fallback() {
		return "Request fails. It takes long time to response.";
	}
}
