package com.example.gitdemo_oauth;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgGIt {
	@GetMapping(path="/msg")
	public String getPaymentDetails()
	{
		return "payment done";
	}
	
}