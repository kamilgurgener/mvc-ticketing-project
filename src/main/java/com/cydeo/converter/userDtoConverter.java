package com.cydeo.converter;

import com.cydeo.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class userDtoConverter implements Converter<String, UserDTO> {

    UserService userService;

    public userDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO convert(String source) {
        return userService.findById(source);
    }
}
