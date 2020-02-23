package com.inordic.studycloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @GetMapping(path = "/login.html")
  public String loginPage() {
    return "login";
  }


//  @PostMapping(path = "/login.html")
//  public String login(@RequestParam(name = "login") String login,
//      @RequestParam(name = "password") String password, Model model) {
//    var user = users.get(login.toLowerCase());
//    if (user == null) {
//      model.addAttribute("error", true);
//      return "login";
//    }
//    if (!user.getPassword().equals(password)) {
//      model.addAttribute("error", true);
//      return "login";
//    }
//
//    model.addAttribute("user", user);
//    return "login";
//  }


}
