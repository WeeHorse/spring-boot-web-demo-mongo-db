package com.example.demo.rest;

import com.example.demo.model.User;
import com.example.demo.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserManagementController {

    @Autowired
    UserManagementService userManagementService;

    // @RequestMapping(value = "/users", method = RequestMethod.GET)
    // @RequestMapping(value = "/users")
    // @RequestMapping("/users")
    // är alla samma sak som
    // @GetMapping("/users")

    @RequestMapping("/users")
    public User[] getUserList(){
        return userManagementService.getUserList().toArray(new User[0]);
        /*
        List<User> userList = new ArrayList<>();
        userList.add(new User("Helena", "1235"));
        userList.add(new User("Ben", "4567"));
        return userList.toArray(new User[0]);
         */
    }

    // @RequestMapping(value = "/users", method = RequestMethod.POST)
    // är samma sak som
    // @PostMapping("/users")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userManagementService.addUserToList(user);
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        return userManagementService.getUserByUserId(userId);
    }

    @PutMapping("/users/{userId}")
    public void updateUser(@PathVariable("userId") String userId, @RequestBody User user){
        userManagementService.updateUsernameByUserId(userId, user.getUsername());
    }

    @PatchMapping("/users/{userId}")
    public void updateUsername(@PathVariable("userId") String userId, @RequestBody User user){
        userManagementService.updateUsernameByUserId(userId, user.getUsername());
    }

}
