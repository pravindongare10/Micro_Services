package com.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Homecontroller {

		@RequestMapping("/")
		public String prelogin() {
			
			return "Wellcome exam==C2";
		}
		
		@RequestMapping("/getProduceData")
		public String produce() {
			
			return "Wellcome Produce data";
		}
	

}
