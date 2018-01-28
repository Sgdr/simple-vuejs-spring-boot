package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author sgdr
 */
@EnableAutoConfiguration
public class AppConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Class[]{AppConfiguration.class, StrategyService.class}, args);
    }

}
