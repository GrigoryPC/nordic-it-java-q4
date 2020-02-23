package com.inordic.studycloud.services.impl;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.inordic.studycloud.UserFile;
import com.inordic.studycloud.Users;
import com.inordic.studycloud.services.FileService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FileServiceImpl implements FileService {

  @Value("${uploaded.files.path}")
  private String uploadedFilesPath;

  @Autowired
  private JdbcTemplate jdbcTemplate;

  private long userId = 1;

  @PostConstruct
  public void init() {
    log.info(uploadedFilesPath);
  }

  @Override
  public List<UserFile> getList() {
    var sql = "SELECT file_name, path_to_file, type_file, owner_id, id" + "	FROM public.files "
        + " WHERE owner_id = ?;";
    return jdbcTemplate.query(sql, new Object[] {1}, new RowMapper<UserFile>() {

      @Override
      public UserFile mapRow(ResultSet rs, int rowNum) throws SQLException {
        var userFile = new UserFile();
        userFile.setFileName(rs.getString("file_name"));
        userFile.setId(rs.getLong("id"));
        return userFile;
      }
    });
  }

  @Override
  public void addFile(MultipartFile file) {
    var sql = "INSERT INTO public.files(" + " file_name, path_to_file, type_file, owner_id) "
        + " VALUES (?, ?, ?, ?);";
    var nameFile = FilenameUtils.getExtension(file.getOriginalFilename());
    File tempFile;
    try {
      tempFile = File.createTempFile("inordic_", "_temp." + nameFile, new File(uploadedFilesPath));
      log.debug("File upload to: {}", tempFile);
      file.transferTo(tempFile);

      jdbcTemplate.update(sql, new Object[] {file.getOriginalFilename(), tempFile.getAbsolutePath(),
          /* type_file= */ 20, userId});

    } catch (IOException e) {
      log.error("addFile", e);
    }

  }


  @Override
  public List<Users> getUserList() {
    var sql = "SELECT name, login, password, id" + "FROM public.users;";
    return jdbcTemplate.query(sql, new Object[] {1}, new RowMapper<Users>() {

      @Override
      public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        var users = new Users();
        users.setName("name");
        users.setLogin("login");
        users.setPassword("password");
        return users;
      }
    });
  }

  private Object getAbsolutePath() {
    return null;
  }

  @Override
  public void deleteFile(String fileName) {

  }

}
