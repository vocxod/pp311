package ru.odybo.pp311.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RestController;
import ru.odybo.pp311.entity.User;

@RestController
@RequestMapping("/api/users")
public class ApiUsersController {

  private static final Logger logger = LogManager.getLogger(ApiUsersController.class);

  @GetMapping("/")
  public String getUserList() {
    logger.info("GET request to root api");
    return "users";
  }

  @GetMapping("/{id}")
  public String getUserById(@PathVariable Long id) {
    logger.info("GET request to getUserById: {} API", id);
    return "users";
  }

  @PostMapping("/create")
  public String createUser(@RequestBody User user) {
    logger.info("POST request to API createUser: {} ", user);
    return "users";
  }

  @PutMapping("/update/{id}")
  public String updateUser(@PathVariable Long id, @RequestBody User user) {
    logger.info("PUT updateUser: {} API", user);
    return "users";
  }

  @DeleteMapping("/delete/{id}")
  public String deleteUser(@PathVariable Long id) {
    logger.info("DELETE deleteUser: {} API", id);
    return "users";
  }

}
