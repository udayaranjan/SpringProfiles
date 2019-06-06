package com.app.service.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;

@Component

public class INotificationRunner implements CommandLineRunner{
	
	@Autowired
	private INotificationService service;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.notificate();
	}

}
