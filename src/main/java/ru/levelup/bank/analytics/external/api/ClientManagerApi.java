package ru.levelup.bank.analytics.external.api;

import kong.unirest.Unirest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.levelup.bank.analytics.external.api.dto.client.ClientDto;
import ru.levelup.bank.analytics.dto.reports.OperationHistoryReportDto;

import java.net.HttpURLConnection;

@Slf4j @Component
public class ClientManagerApi {
    private final String BASE_URL = "http://localhost:8082/client";

    public OperationHistoryReportDto getClient(String clientId) {
        var resp = Unirest.get(BASE_URL + "/{clientId}").queryString("clientId", clientId).asObject(ClientDto.class);
        var report = new OperationHistoryReportDto();
        if (resp.getStatus() != HttpURLConnection.HTTP_OK) {
            log.error("Client manager service error");
            report.setError("Client manager service error. Try later or contact to support.");
        } else {

        }
        return report;
    }

    public OperationHistoryReportDto getMockClient(String clientId) {
        return new OperationHistoryReportDto();
    }
}
