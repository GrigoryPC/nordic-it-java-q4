package com.petclinic.PetClinic;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebClinicController {
	private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<String, User>();

	@GetMapping(path = "/new_user.html")
	public String newUserPage() {
		return "new_user";
	}

	@PostMapping(path = "/new_user.html")
	public String newUser(@RequestParam(name = "name") String name,
			@RequestParam(name = "login") String login,
			@RequestParam(name = "password") String password, Model model) {

		var user = users.get(login.toLowerCase());

		if (user == null) {
			users.put(login.toLowerCase(), new User(name, login, password));
			model.addAttribute("user", user);
			return "new_user";
		}
		model.addAttribute("error", true);
		return "new_user";
	}
}
