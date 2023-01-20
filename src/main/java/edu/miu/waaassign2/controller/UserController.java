package edu.miu.waaassign2.controller;

import edu.miu.waaassign2.entity.Users;
import edu.miu.waaassign2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

  @PostMapping
    public void save(@RequestBody Users users){
      userService.save(users);
  }

  @GetMapping("/{id}")
  public Users getUserById(@PathVariable long id){
      return userService.getById(id);
  }

  @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
      userService.delete(id);
  }
}
