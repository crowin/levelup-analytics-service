package ru.levelup.bank.analytics.external.api.dto.transfer;

import lombok.Data;
import ru.levelup.bank.analytics.dto.BaseResponse;

@Data
public class TransferDto extends BaseResponse {
    private String accNumberSender;
    private String nameReciever;
    private String surNameReciever;
    private String accNumberReciever;
    private Integer transferAmount;
}
