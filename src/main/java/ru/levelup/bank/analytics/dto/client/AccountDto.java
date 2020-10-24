package ru.levelup.bank.analytics.dto.client;

import lombok.Data;

@Data
public class AccountDto {
    private String accNumber;
    private CurrencyCode accCurrency;
}
