package com.atomTechAssig.entries.user.service;

import com.atomTechAssig.entries.user.converter.UserConverter;
import com.atomTechAssig.entries.user.domain.User;
import com.atomTechAssig.entries.user.dto.UserDto;
import com.atomTechAssig.entries.user.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userConverter.convertFrom(userDto);

        User savedUser = userRepository.save(user);

        return userConverter.convertTo(savedUser);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAllByOrderByIdDesc().stream()
            .map(userConverter::convertTo)
            .collect(Collectors.toList());
    }
}
