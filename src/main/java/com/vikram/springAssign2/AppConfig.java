package com.vikram.springAssign2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Sbi getSbiInterest() {
        Sbi b1 = new Sbi();
        b1.setName("SBI");
        b1.setInterestRate(12);
        // Use setter and getter here only is good practice
        return b1;
    }

    @Bean
    public Icici getIciciInterest() {
        Icici b2 = new Icici();
        b2.setName("ICICI");
        b2.setInterestRate(8);
        // Use setter and getter here only is good practice
        return b2;
    }
}

