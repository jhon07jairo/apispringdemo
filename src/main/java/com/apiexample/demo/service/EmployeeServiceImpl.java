package com.apiexample.demo.service;

import com.apiexample.demo.model.EmployeeIdResponse;
import com.apiexample.demo.model.EmployeeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Slf4j
@Service
public class EmployeeServiceImpl extends AbstractClient implements EmployeeService{

    public EmployeeServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public EmployeeResponse findAll() {
        String uri = baseUrl + "/employees";
        HttpEntity<Void> requestEntity = new HttpEntity<>(this.buildAuthToken());
        ResponseEntity<EmployeeResponse> response = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity, EmployeeResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("Correcto get: {}", response.getBody());
            return response.getBody();
        }
        log.error("Error get");

        throw new RuntimeException("Error");
    }

    @Override
    public EmployeeIdResponse findById(Integer id){
        String uri = baseUrl + "employee/" + id;
        HttpEntity<Void> requestEntity = new HttpEntity<>(this.buildAuthToken());
        ResponseEntity<EmployeeIdResponse> responseId = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity, EmployeeIdResponse.class);

        if (responseId.getStatusCode().is2xxSuccessful()) {
            log.info("Correcto get: {}", responseId.getBody().getStatus());
            log.info("el response es: " + responseId.toString());
            return responseId.getBody();
        }
        log.error("Error get");

        throw new RuntimeException("Error");
    }
}
