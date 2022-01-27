package com.hjfu2.k8s_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class K8sProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sProjectApplication.class, args);
    }

}
