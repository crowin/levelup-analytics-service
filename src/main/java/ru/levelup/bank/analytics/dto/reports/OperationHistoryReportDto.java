package ru.levelup.bank.analytics.dto.reports;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.levelup.bank.analytics.dto.BaseResponse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class OperationHistoryReportDto extends BaseResponse {
    private LocalDateTime timestamp;
    private Map<String, List<AccountTransactionsDto>> accountTransactions;
}
