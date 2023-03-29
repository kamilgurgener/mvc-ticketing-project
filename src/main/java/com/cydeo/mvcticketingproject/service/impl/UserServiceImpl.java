package com.cydeo.mvcticketingproject.service.impl;

import com.cydeo.mvcticketingproject.dto.RoleDTO;
import com.cydeo.mvcticketingproject.dto.UserDTO;
import com.cydeo.mvcticketingproject.service.UserService;

import java.util.List;

public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(), object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public UserDTO findById(String id) {
        return super.findById(id);
    }
}