package com.example.Gitdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentAppContoller {
	@GetMapping(path="/payment")
	public String getPaymentDetails()
	{
		return "payment done";
	}

}
