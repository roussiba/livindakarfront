package com.qualshore.livindakar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

//@RestController
@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.qualshore"})
public class LivinDakarApplication {

	/*@RequestMapping("/")
	String home(){
		return "Application Liv In Dakar BackEnd";
	}*/
	public static void main(String[] args) {
		SpringApplication.run(LivinDakarApplication.class, args);
	}
}
