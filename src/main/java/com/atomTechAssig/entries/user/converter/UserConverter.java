package com.atomTechAssig.entries.user.converter;

import com.atomTechAssig.entries.user.domain.User;
import com.atomTechAssig.entries.user.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class UserConverter {
    public User convertFrom(UserDto source){
        if(ObjectUtils.isEmpty(source)) {
            return null;
        }

        return User.Builder.user()
            .withFirstName(source.getFirstName())
            .withLastName(source.getLastName())
            .build();
    }

    public UserDto convertTo(User source){
        if(ObjectUtils.isEmpty(source)) {
            return null;
        }

        return UserDto.Builder.userDto()
            .withFirstName(source.getFirstName())
            .withLastName(source.getLastName())
            .build();
    }
}
