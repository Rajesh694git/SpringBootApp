package com.example.springapplication.Accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class AccountConfiguration {

    @Bean
    public AccountService accountService(AccountPojo accountPojo){
        return new AccountService(accountPojo());
    }

    @Bean
    public AccountPojo accountPojo(){
        return new AccountPojo("Travel",25000L,new Date());
    }
}
