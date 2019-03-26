package com.huilong.srpingcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerOrder {
    @Bean
    public static RestTemplate getRTEM(){
        RestTemplate restTemplate = new  RestTemplate();
        return restTemplate;
    }
    public static void main(String[] args){
        SpringApplication.run(ConsumerOrder.class);
    }

}
