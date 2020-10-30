package ru.levelup.bank.analytics.dto.reports;

import lombok.Data;
import ru.levelup.bank.analytics.external.api.dto.client.CurrencyCode;

import java.time.LocalDateTime;

@Data
public class AccountTransactionsDto {
    private LocalDateTime timestamp;
    private String accNumber;
    private String operation;
    private Boolean isSuccessful;
    private String sum;
    private CurrencyCode accCurrency;
}
