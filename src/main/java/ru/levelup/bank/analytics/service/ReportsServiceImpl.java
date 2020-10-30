package ru.levelup.bank.analytics.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.levelup.bank.analytics.common.PeriodType;
import ru.levelup.bank.analytics.dto.reports.OperationHistoryReportDto;
import ru.levelup.bank.analytics.external.api.ClientManagerApi;

@Service @Slf4j
public class ReportsServiceImpl implements ReportsService {
    private ClientManagerApi clientManagerApi;

    @Autowired
    public ReportsServiceImpl(ClientManagerApi clientManagerApi) {
        this.clientManagerApi = clientManagerApi;
    }

    @Override
    public OperationHistoryReportDto createHistoryReport(String clientId, PeriodType period) {
        return clientManagerApi.getClient(clientId);
    }
}
