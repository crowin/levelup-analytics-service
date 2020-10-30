package ru.levelup.bank.analytics.external.api.dto.client;

import lombok.Data;

@Data
public class AccountDto {
    private String accNumber;
    private CurrencyCode accCurrency;
}
