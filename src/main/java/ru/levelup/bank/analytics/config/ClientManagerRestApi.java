package ru.levelup.bank.analytics.config;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import lombok.experimental.UtilityClass;
import ru.levelup.bank.analytics.dto.client.ClientDto;

@UtilityClass
public class ClientManagerRestApi {
    private final String BASE_URL = "http://localhost:8082/client";

    public HttpResponse<ClientDto> getClient(String clientId) {
        return Unirest.get(BASE_URL + "/{clientId}").queryString("clientId", clientId).asObject(ClientDto.class);
    }
}
