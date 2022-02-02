package com.example.springapplication.Accounts;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


public class AccountPojo {

    private String expenseName;
    private Long expenseAmount;
    private Date incurredDate;

    public AccountPojo(String name, Long amount, Date date){
        this.expenseName = name;
        this.expenseAmount = amount;
        this.incurredDate = date;
    }

    public Date getIncurredDate() {
        return incurredDate;
    }

    public Long getExpenseAmount() {
        return expenseAmount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseAmount(Long expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public void setIncurredDate(Date incurredDate) {
        incurredDate = incurredDate;
    }

    @Override
    public String toString(){
        return this.expenseName+" : " + this.expenseAmount + " : " + this.incurredDate.toString();
    }

}
