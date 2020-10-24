package ru.levelup.bank.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.levelup.bank.analytics.common.PeriodType;
import ru.levelup.bank.analytics.dto.reports.OperationHistoryReportDto;
import ru.levelup.bank.analytics.service.ReportsService;

@RestController("/analytics/report")
public class ReportsController {

    @Autowired
    private ReportsService reportsService;

    @GetMapping("/")
    public OperationHistoryReportDto createOperationHistoryReport(@RequestParam(name = "client_id") String clientId,
                                                                  @RequestParam(name = "period_type") PeriodType period) {
        return reportsService.createHistoryReport(clientId, period);
    }
}
