package com.example.checktomcatornetty.abcd;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

@Component
public class CheckRestTemplateBuilderInjection {
    RestTemplateBuilder restTemplateBuilder;

    public CheckRestTemplateBuilderInjection(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
}
