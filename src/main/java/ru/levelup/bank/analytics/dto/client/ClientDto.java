package ru.levelup.bank.analytics.dto.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ClientDto {
    private String firstName;
    private String surName;
    private String middleName;
    private Date birthDate;
    private Integer age;
    private String birthPlace;
    private String sex;
    private String passportNum;
    private String phoneNumber;
    @JsonProperty("accounts")
    private List<AccountDto> accountDtoList;
}
