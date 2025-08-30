package com.atomTechAssig.entries.controller;

import com.atomTechAssig.entries.user.dto.UserDto;
import com.atomTechAssig.entries.user.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }
    @GetMapping("")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
}
