package com.cydeo.mvcticketingproject.entity;

import com.cydeo.mvcticketingproject.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private boolean enabled;
    private String userName;
    private String phoneNumber;
    private String password;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateTime, Long lastUpdateUserId, String firstName, String lastName, boolean enabled, String userName, String phoneNumber, String password, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }
}
