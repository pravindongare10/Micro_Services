package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Homecontroller {
		@Autowired
		RestTemplate rt;
	
		@RequestMapping("/")
		public String prelogin() {
			
			return "Wellcome Add==C1";
		}
	
		@RequestMapping("/getcondata")
		public String grtcon() {
			String url="http://zuul/getexam/getProduceData";
			//String url="http://localhost:9092/getProduceData";
			String msg=rt.getForObject(url, String.class);
			return msg;
		}

}
