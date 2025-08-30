package com.atomTechAssig.entries.user.service;

import com.atomTechAssig.entries.user.dto.UserDto;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
