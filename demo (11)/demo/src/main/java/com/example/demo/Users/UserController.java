package com.example.demo.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){ this.userService = userService; }

    @GetMapping
    public List<User> getUsers(@RequestParam(required = false) String filter){
        System.out.println("Hi");
        return userService.getUsers(); }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){ return userService.getUser(id); }

    @PostMapping
    public User addUser(@RequestBody User user){
        System.out.println(user);
        System.out.println("ddddddddddd");
        return userService.addUser(user); }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){ userService.deleteUser(id); }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User data){ userService.updateUser(id, data); }
}