package com.vikram.springAssign2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Sbi b1 = (Sbi) context.getBean("getSbiInterest");
        Icici b2 = (Icici) context.getBean("getIciciInterest");
        
        String b1BankName = b1.getName();
        String b2BankName = b2.getName();
        
        int b1InterestRate = b1.getInterestRate();
        int b2InterestRate = b2.getInterestRate();
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        System.out.println("*******************************************************");
        if (b1InterestRate < b2InterestRate) {
            System.out.println("Bank with highest interest rate is " + b2BankName + " and interest rate is: " + b2InterestRate + "%");
        } else {
            System.out.println("Bank with highest interest rate is " + b1BankName + " and interest rate is " + b1InterestRate + "%");
        }
        System.out.println("*******************************************************");
    }
}

