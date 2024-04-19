package com.vemser.web.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private String name;
    private String email;
    private String password;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String mobileNumber;
}
