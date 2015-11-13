package com.therealdanvega.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.therealdanvega.domain.User;
import com.therealdanvega.service.NotificationService;

@RestController
public class RegistrationController {
	
	private Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	private NotificationService notificationService;

	@RequestMapping("/signup")
	public String signup(){
		return "Please sign up for our service.";
	}
	
	@RequestMapping("/signup-success")
	public String signupSuccess(){
		
		// create user 
		User user = new User();
		user.setFirstName("Dan");
		user.setLastName("Vega");
		user.setEmailAddress("dan@clecares.org");
		
		// send a notification
		try {
			notificationService.sendNotificaitoin(user);
		}catch( MailException e ){
			// catch error
			logger.info("Error Sending Email: " + e.getMessage());
		}
		
		return "Thank you for registering with us.";
	}
	
}
