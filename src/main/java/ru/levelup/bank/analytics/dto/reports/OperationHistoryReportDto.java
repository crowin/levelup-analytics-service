package ru.levelup.bank.analytics.dto.reports;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ru.levelup.bank.analytics.dto.BaseResponse;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class OperationHistoryReportDto extends BaseResponse {
    private LocalDateTime timestamp;
}
