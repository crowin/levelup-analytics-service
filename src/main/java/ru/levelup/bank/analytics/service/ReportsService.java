package ru.levelup.bank.analytics.service;

import ru.levelup.bank.analytics.common.PeriodType;
import ru.levelup.bank.analytics.dto.reports.OperationHistoryReportDto;

public interface ReportsService {

    OperationHistoryReportDto createHistoryReport(String clientId, PeriodType period);
}
