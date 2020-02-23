package com.inordic.studycloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.inordic.studycloud.services.FileService;

@Controller
public class ViewerContrloller {
  @Autowired
  private FileService fileService;

  @GetMapping("/studyCloud.html")
  public String list(Model model) {
    model.addAttribute("files", fileService.getList());
    return "studyCloud";
  }

}
