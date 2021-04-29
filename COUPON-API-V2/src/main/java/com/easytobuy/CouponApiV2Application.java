package com.easytobuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.thoughtworks.xstream.core.util.Pool.Factory;

@SpringBootApplication
@EnableEurekaClient

public class CouponApiV2Application {

	public static void main(String[] args) {
		SpringApplication.run(CouponApiV2Application.class, args);
	}

	
}
