package com.atomTechAssig.entries.user.service;

import com.atomTechAssig.entries.user.dto.UserDto;
import com.atomTechAssig.entries.user.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }
}
