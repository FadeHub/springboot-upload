package com.sl;

import com.sl.config.FileProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/*@EnableConfigurationProperties({
        FileProperty.class
})*/
public class SpringbootUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadApplication.class, args);
    }

}
