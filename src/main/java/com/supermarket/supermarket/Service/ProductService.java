package com.supermarket.supermarket.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String list(){
        String wireMockUrl = "http://localhost:8081/products";
        ResponseEntity<String> response = restTemplate.getForEntity(wireMockUrl, String.class);
        return response.getBody();
    }

    public String listById(String id){
        String wireMockUrl = "http://localhost:8081/products/" + id;
        ResponseEntity<String> response = restTemplate.getForEntity(wireMockUrl, String.class);
        return response.getBody();
    }

}
