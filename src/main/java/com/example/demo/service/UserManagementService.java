package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserManagementService {

    List<User> userList = new ArrayList<>(
            Arrays.asList(
                    new User("Bob", "4532"),
                    new User("Bill", "5678")
            )
    );

    public List<User>getUserList(){
        return userList;
    }

    public void addUserToList(User user){
        userList.add(user);
    }

    public User getUserByUserId(String userId){
        for (User user: userList) {
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public void updateUsernameByUserId(String userId, String username){
        for (User user: userList) {
            if(user.getUserId().equals(userId)){
                user.setUsername(username);
            }
        }
    }

}
