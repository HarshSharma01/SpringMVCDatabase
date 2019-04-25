package com.io.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.io.model.CustomerDetails;

public interface BankService {
	public CustomerDetails register(@RequestBody CustomerDetails cd);

	public int login(CustomerDetails c);
}
