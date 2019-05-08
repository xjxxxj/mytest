package com.xjx.test.crossdomain;

import com.xjx.test.crossdomain.dao.Depository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CrossDomainApplication {

    static {
        Depository.init(100);
    }
    public static void main(String[] args) {
        SpringApplication.run(CrossDomainApplication.class, args);
    }

}
