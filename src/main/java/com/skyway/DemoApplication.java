package com.skyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



    public static void main(String[] args) {
        CodecUtil.main(null);
        SpringApplication.run(DemoApplication.class, args);
    }

}
