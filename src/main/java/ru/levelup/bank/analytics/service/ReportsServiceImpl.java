package ru.levelup.bank.analytics.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.levelup.bank.analytics.common.PeriodType;
import ru.levelup.bank.analytics.config.ClientManagerRestApi;
import ru.levelup.bank.analytics.dto.reports.OperationHistoryReportDto;

import java.net.HttpURLConnection;

@Service @Slf4j
public class ReportsServiceImpl implements ReportsService {

    @Override
    public OperationHistoryReportDto createHistoryReport(String clientId, PeriodType period) {
        var report = new OperationHistoryReportDto();
        var resp = ClientManagerRestApi.getClient(clientId);
        if (resp.getStatus() != HttpURLConnection.HTTP_OK) {
            log.error("Client manager service error");
            report.setError("Client manager service error. Try later or contact to support.");
            return report;
        } else {
            //TODO implement logic
            return report;
        }
    }
}
