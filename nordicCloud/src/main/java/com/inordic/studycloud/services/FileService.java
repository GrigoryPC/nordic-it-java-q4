package com.inordic.studycloud.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import com.inordic.studycloud.UserFile;
import com.inordic.studycloud.Users;

public interface FileService {
  /**
   * Получить список всех файлов и папок
   * 
   * @return
   */
  List<UserFile> getList();

  /**
   * Добавляет файл в систему
   * 
   * @param name
   */
  void addFile(MultipartFile file);

  /**
   * удаляет файл
   * 
   * @param fileName
   */
  void deleteFile(String fileName);
  
  /**
   * Получить список всех пользователей
   * 
   * @return
   */
  List<Users> getUserList();
  
  
}
