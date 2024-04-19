package com.vemser.web.data.factory;

import com.github.javafaker.Faker;
import com.vemser.web.dto.UserDto;

import java.util.Locale;

public class UserDataFactory {
    private static final Faker faker = new Faker(new Locale("en"));

    public UserDto userWithValidData() {
        return newUser();
    }

    public UserDto newUser() {
        //personal dats
        UserDto user = new UserDto();
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setName(user.getFirstName() + " " + user.getLastName());
        user.setEmail(faker.internet().emailAddress());
        user.setPassword(faker.internet().password());
        user.setDayOfBirth(String.valueOf(faker.number().numberBetween(1, 31)));
        user.setMonthOfBirth(String.valueOf(faker.number().numberBetween(1, 12)));
        user.setYearOfBirth(String.valueOf(faker.number().numberBetween(1920, 2020)));

        //address
        user.setCompany(faker.company().industry());
        user.setAddress(faker.address().streetAddressNumber());
        user.setState(faker.address().state());
        user.setCity(faker.address().cityName());
        user.setZipCode(faker.address().zipCode());
        user.setMobileNumber(faker.phoneNumber().cellPhone());

        return user;
    }
}
