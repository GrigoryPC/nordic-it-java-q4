package com.inordic.studycloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.inordic.studycloud.services.FileService;

public class DeleteController {

  @Autowired
  private FileService fileService;

  @GetMapping("/delete_file.html")
  public String deleteFile(@RequestParam(name = "file_delete") String fileName) throws Exception {
    fileService.deleteFile(fileName);

    return "redirect:/studyCloud.html";
  }


//   @PostMapping("studyCloud")
//   public String deleteFile(@RequestParam(name = "file_delete") String fileName) throws Exception
//   {
//   fileService.deleteFile(fileName);
//  
//   return "studyCloud";
//  
//   }
}
