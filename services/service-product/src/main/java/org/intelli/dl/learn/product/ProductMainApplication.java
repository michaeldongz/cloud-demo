package org.intelli.dl.learn.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMainApplication.class, args);
    }
}
