package com.huilong.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ProviderUser {
    public static void main(String[] args){
      SpringApplication.run(ProviderUser.class);
    }
}
