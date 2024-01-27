package com.apiexample.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;



public abstract class AbstractClient {
    @Value("${api.base-url}")
    protected String baseUrl;

    protected final RestTemplate restTemplate;

    public AbstractClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected HttpHeaders buildAuthToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content.Type", "application/json");
        headers.set("Authorization", "No Auth");
        return headers;
    }
}
