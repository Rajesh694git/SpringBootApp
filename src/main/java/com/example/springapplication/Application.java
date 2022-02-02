package com.example.springapplication;

import com.example.springapplication.Accounts.AccountConfiguration;
import com.example.springapplication.Accounts.AccountPojo;
import com.example.springapplication.Infrastructure.InfraPojo;
import com.example.springapplication.Infrastructure.InfraService;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationContext accountContext = new AnnotationConfigApplicationContext(AccountConfiguration.class);
        AccountPojo accountPojo = accountContext.getBean(AccountPojo.class);
        System.out.print(accountPojo.toString());
        ApplicationContext infraContext = new ClassPathXmlApplicationContext("infra-bean-config.xml");
        InfraService infraService = infraContext.getBean(InfraService.class);
        infraService.setupInfra();
        infraService.displayInfra();

    }

}
