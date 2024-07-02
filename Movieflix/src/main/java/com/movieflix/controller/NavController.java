package com.movieflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NavController {
		
			@GetMapping("map-register")
			public String mapRegister()
			{
				return "register";
			}
				@GetMapping("map-login")
				public String mapLogin()
			{
				return"login";
			}
				
				@GetMapping("map-addmovie")
				public String mapAddMovie()
			{
				return"addmovie";
			}
			
			@PostMapping("updateuser")
			public String updateUser()
			{
				
				return"userupdate";
			}
			
			@GetMapping("deleteuser")
			public String deleteUser()
			{
				return"deleteuser";
			}
			
}
